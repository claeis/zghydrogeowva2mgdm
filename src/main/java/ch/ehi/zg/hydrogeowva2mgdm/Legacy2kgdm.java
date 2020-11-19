package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vividsolutions.jts.geom.Coordinate;

import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.iom.IomConstants;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.itf.impl.jtsext.geom.ArcSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CurveSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.StraightSegment;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart;

public class Legacy2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    private Map<String,String> laufBrunnen2oid=new HashMap<String,String>();
    private Map<String,String> wasserversorgung2oid=new HashMap<String,String>();
    private Map<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage> weitereAnlagen=new HashMap<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage>();
    private int errc=0;
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject obj=((ObjectEvent)event).getIomObject();
            if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen brunnen=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(stripUUID(brunnen.getGUID()));
                mappedObj.setIdentifikator("ZG-"+brunnen.getGUID());
                final Nutzungsart nutzungsart = brunnen.getNutzungsart();
                if(nutzungsart!=null && nutzungsart.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Trinkwasser)) {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Trinkwasserbrunnen_unabhaengig);
                }else {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                }
                IomObject coord=mapCoord(brunnen.getRealY(),brunnen.getRealX());
                mappedObj.addattrobj(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage.tag_Geometrie, coord);
                IomObject symbolGeo=mapCoord(brunnen.getattrobj(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_SymbolGeo, 0));
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage.tag_SymbolGeo, symbolGeo);
                mappedObj.setSymbolRot(brunnen.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(brunnen.getFarbe()));
                // TODO Beziehungen im KGDM? Quellschacht, Datei, Grundlage, MutatPerson, 
                /*
                KGDM:
                WeitereAnlageArt : (Laufbrunnen, Kaliberwechsel, RWZisterne);
                Betriebsart : BetriebsArt;      

                
                ILI1:
                Grundlage: OPTIONAL -> Grundlage;
                MutatPerson: OPTIONAL -> MutatPerson;
                */
                if(nutzungsart!=null) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart nutzungsartKgdm=mapNutzungsart(nutzungsart);
                    mappedObj.setNutzungsart(nutzungsartKgdm);
                }
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung notversorgung = mapNotversorgung(brunnen.getNotversorgung());
                if(notversorgung!=null)mappedObj.setNotversorgung(notversorgung);
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton kanton = mapKanton(brunnen.getKanton());
                if(kanton!=null)mappedObj.setKanton(kanton);
                if(brunnen.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_GdeNrBFS)==1) {
                    mappedObj.setGdeNrBFS(brunnen.getGdeNrBFS());
                }
                final String lokalitaet = brunnen.getLokalitaet();
                if(lokalitaet!=null)mappedObj.setLokalitaet(lokalitaet);
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung maxDarst = mapDarstellung(brunnen.getMaxDarst());
                if(maxDarst!=null)mappedObj.setMaxDarst(maxDarst);
                final String mutatDatum = mapDate(brunnen.getMutatDatum());
                if(mutatDatum!=null)mappedObj.setMutatDatum(mutatDatum);
                final String mutatBemerk = brunnen.getMutatBemerk();
                if(mutatBemerk!=null)mappedObj.setMutatBemerk(mutatBemerk);
                laufBrunnen2oid.put(brunnen.getobjectoid(),mappedObj.getobjectoid());
                weitereAnlagen.put(mappedObj.getobjectoid(),mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung) {
                    ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung wasserversorgung=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung)obj;
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(java.util.UUID.randomUUID().toString());
                    mappedObj.setWVName(wasserversorgung.getWVName());
                    if(wasserversorgung.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung.tag_Nummer)==1)mappedObj.setNummer(wasserversorgung.getNummer());
                    mappedObj.setEigentumArt(mapEigentumArt(wasserversorgung.getEigentumArt()));
                    wasserversorgung2oid.put(wasserversorgung.getobjectoid(),mappedObj.getobjectoid());
                    events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg laufBruWasservsg=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg)obj;
                final String weitereAnlageOid = laufBrunnen2oid.get(laufBruWasservsg.getLaufBrunnen());
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=weitereAnlagen.remove(weitereAnlageOid);
                if(mappedObj==null) {
                    EhiLogger.logError("LaufBrunnen "+laufBruWasservsg.getLaufBrunnen()+" mehr als einer Wasserversorgung zugeordnet");
                    errc++;
                }else {
                    mappedObj.setWasserversorgung(wasserversorgung2oid.get(laufBruWasservsg.getWasserversorgung()));
                    events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }
                    
                    
            /*
             * Hydrogeo        
             */
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf gwf=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung(stripUUID(gwf.getGUID()));
                mappedObj.setIdentifikator("ZG-"+gwf.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Gwf);
                IomObject geom=gwf.getattrobj(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf.tag_Geometrie, 0);
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung.tag_Geometrie, geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp(gwf.getTyp()));
                
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }
        }
        
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt mapEigentumArt(EigentumArt eigentumArt) {
        if(eigentumArt==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.parseXmlCode(EigentumArt.toXmlCode(eigentumArt));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart mapNutzungsart(Nutzungsart nutzungsart) {
        if(nutzungsart==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart.parseXmlCode(Nutzungsart.toXmlCode(nutzungsart));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung mapNotversorgung(Notversorgung notversorgung) {
        if(notversorgung==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.parseXmlCode(Notversorgung.toXmlCode(notversorgung));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton mapKanton(Kanton kanton) {
        if(kanton==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(Kanton.toXmlCode(kanton));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung mapDarstellung(Darstellung maxDarst) {
        if(maxDarst==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.parseXmlCode(Darstellung.toXmlCode(maxDarst));
    }
    private String mapDate(String datum) {
        if(datum!=null) {
            return datum.substring(0,4)+"-"+datum.substring(4,6)+"-"+datum.substring(6,8);
        }
        return null;
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ mapSammeleinrichtungTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp typ) {
        
        //Typ Sickerleitung, Horizontal_Filterstrecke = Typ Fassungsstrang;
        //Typ Sickerleitung, Sammelstollen, Fassungsleitung_Allgemein, Fassungsleitung_Vollrohr = Typ Fassungsstollen; 
        //Typ Fassungsleitung_Vollrohr Fassungsleitung_Allgemein Punktfassung. Bohrung, andere, unbekannt = Typ unbestimmt
        if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sickerleitung.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sammelstollen.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstollen;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Allgemein.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Vollrohr.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Punktfassung.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Bohrung.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.andere.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.unbekannt.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Horizontal_Filterstrecke.equals(typ)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }
        throw new IllegalArgumentException("unexpected SammeleinrichtungTyp <"+typ+">");
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe mapFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe farbe) {
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(farbe));
    }
    private String stripUUID(String guid) {
        if(guid.startsWith("{")) {
            return guid.substring(1,guid.length()-1);
        }
        return guid;
    }
    private IomObject mapCoord(IomObject coord) {
        return mapCoord(Double.parseDouble(coord.getattrprim("C1",0)), Double.parseDouble(coord.getattrprim("C2",0)));
    }
    private IomObject mapPolyline(IomObject polylineObj) {
        IomObject destPoly=new ch.interlis.iom_j.Iom_jObject(polylineObj.getobjecttag(), null);
        for(int sequencei=0;sequencei<polylineObj.getattrvaluecount("sequence");sequencei++){
            IomObject sequence=polylineObj.getattrobj("sequence",sequencei);
            IomObject destSeq=new ch.interlis.iom_j.Iom_jObject(sequence.getobjecttag(), null);
            destPoly.addattrobj("sequence", destSeq);
            for(int segmenti=0;segmenti<sequence.getattrvaluecount("segment");segmenti++){
                IomObject segment=sequence.getattrobj("segment",segmenti);
                if(segment.getobjecttag().equals("COORD")){
                    // COORD
                    IomObject destSeg=mapCoord(segment);
                    destSeq.addattrobj("segment",destSeg);
                }else if(segment.getobjecttag().equals("ARC")){
                    // ARC
                    throw new IllegalArgumentException("ARC line form not supported");
                }else{
                    // custum line form
                    throw new IllegalArgumentException("custom line form not supported");
                    //out.startElement(segment->getTag(),0,0);
                    //writeAttrs(out,segment);
                    //out.endElement(/*segment*/);
                }
            }
        }
        return destPoly;
    }
    private IomObject mapCoord(double y,double x) 
    {
        IomObject coord=new ch.interlis.iom_j.Iom_jObject("COORD", null);
        coord.setattrvalue("C1", Double.toString(y+2000000.0));
        coord.setattrvalue("C2", Double.toString(x+1000000.0));
        return coord;
    }

    public IomObject getMappedObject() {
        if(events.isEmpty()) {
            return null;
        }
        IoxEvent front=events.remove(0);
        return ((ObjectEvent)front).getIomObject();
    }

}
