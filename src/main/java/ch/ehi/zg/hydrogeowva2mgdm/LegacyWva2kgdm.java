package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnreicherungsanlageTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung_Typ;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart;
import ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab;
import ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben;
import ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge;
import ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart;
import ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung;
import ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage_Qualitaet;

public class LegacyWva2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    private Map<String,String> laufBrunnen2oid=new HashMap<String,String>();
    private Map<String,String> wasserversorgung2oid=new HashMap<String,String>();
    private Map<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage> weitereAnlagen=new HashMap<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage>();
    private int errc=0;
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject obj=((ObjectEvent)event).getIomObject();
            if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                final Nutzungsart nutzungsart = srcObj.getNutzungsart();
                if(nutzungsart!=null && nutzungsart.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Trinkwasser)) {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Trinkwasserbrunnen_unabhaengig);
                }else {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                }
                IomObject coord=LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX());
                mappedObj.addattrobj(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage.tag_Geometrie, coord);
                IomObject symbolGeo=LegacyUtil.mapCoord(srcObj.getattrobj(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_SymbolGeo, 0));
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage.tag_SymbolGeo, symbolGeo);
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
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
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung notversorgung = mapNotversorgung(srcObj.getNotversorgung());
                if(notversorgung!=null)mappedObj.setNotversorgung(notversorgung);
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton kanton = mapKanton(srcObj.getKanton());
                if(kanton!=null)mappedObj.setKanton(kanton);
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_GdeNrBFS)==1) {
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                }
                final String lokalitaet = srcObj.getLokalitaet();
                if(lokalitaet!=null)mappedObj.setLokalitaet(lokalitaet);
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung maxDarst = mapDarstellung(srcObj.getMaxDarst());
                if(maxDarst!=null)mappedObj.setMaxDarst(maxDarst);
                final String mutatDatum = LegacyUtil.mapDate(srcObj.getMutatDatum());
                if(mutatDatum!=null)mappedObj.setMutatDatum(mutatDatum);
                final String mutatBemerk = srcObj.getMutatBemerk();
                if(mutatBemerk!=null)mappedObj.setMutatBemerk(mutatBemerk);
                laufBrunnen2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                weitereAnlagen.put(mappedObj.getobjectoid(),mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung) {
                    ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung)obj;
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(java.util.UUID.randomUUID().toString());
                    mappedObj.setWVName(srcObj.getWVName());
                    if(srcObj.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung.tag_Nummer)==1)mappedObj.setNummer(srcObj.getNummer());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    wasserversorgung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg)obj;
                final String weitereAnlageOid = laufBrunnen2oid.get(srcObj.getLaufBrunnen());
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=weitereAnlagen.remove(weitereAnlageOid);
                if(mappedObj==null) {
                    EhiLogger.logError("LaufBrunnen "+srcObj.getLaufBrunnen()+" mehr als einer Wasserversorgung zugeordnet");
                    errc++;
                }else {
                    mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                    events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }
            }
        }
        
    }
    private EigentumArt mapEigentumArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt eigentumArt) {
        if(eigentumArt==null)return null;
        // Werteliste ist identisch
        return EigentumArt.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt.toXmlCode(eigentumArt));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart mapNutzungsart(Nutzungsart nutzungsart) {
        if(nutzungsart==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart.parseXmlCode(Nutzungsart.toXmlCode(nutzungsart));
    }
    private Notversorgung mapNotversorgung(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung notversorgung) {
        if(notversorgung==null)return null;
        // Werteliste ist identisch
        return Notversorgung.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.toXmlCode(notversorgung));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton mapKanton(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton kanton) {
        if(kanton==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.toXmlCode(kanton));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung mapDarstellung(Darstellung maxDarst) {
        if(maxDarst==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.parseXmlCode(Darstellung.toXmlCode(maxDarst));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe mapFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe farbe) {
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(farbe));
    }
    public IomObject getMappedObject() {
        if(events.isEmpty()) {
            return null;
        }
        IoxEvent front=events.remove(0);
        return ((ObjectEvent)front).getIomObject();
    }

}
