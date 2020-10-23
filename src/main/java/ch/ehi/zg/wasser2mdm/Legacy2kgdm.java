package ch.ehi.zg.wasser2mdm;

import java.util.ArrayList;
import java.util.List;

import com.vividsolutions.jts.geom.Coordinate;

import ch.interlis.iom.IomConstants;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.itf.impl.jtsext.geom.ArcSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CurveSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.StraightSegment;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.ObjectEvent;

public class Legacy2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject obj=((ObjectEvent)event).getIomObject();
            if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen brunnen=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen)obj;
                ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.WeitereAnlage(stripUUID(brunnen.getGUID()));
                mappedObj.setIdentifikator("ZG-"+brunnen.getGUID());
                if(brunnen.getNutzungsart().equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Trinkwasser)) {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Trinkwasserbrunnen_unabhaengig);
                }else {
                    mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                }
                IomObject coord=mapCoord(brunnen.getRealY(),brunnen.getRealX());
                mappedObj.addattrobj(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage.tag_Geometrie, coord);
                IomObject symbolGeo=mapCoord(brunnen.getattrobj(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_SymbolGeo, 0));
                mappedObj.addattrobj(ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.WeitereAnlage.tag_SymbolGeo, symbolGeo);
                mappedObj.setSymbolRot(brunnen.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(brunnen.getFarbe()));
                // TODO Beziehungen im KGDM? Quellschacht, Datei, Grundlage, MutatPerson, Wasserversorgung
                // TODO other attributes
                /*
                WeitereAnlageArt : (Laufbrunnen, Kaliberwechsel, RWZisterne);
                SymbolGeo: MANDATORY GeometryCHLV95_V1.Coord2;
                SymbolRot: MANDATORY 0.000 .. 399.999 [Grads];
                Farbe : MANDATORY Farbe;
                Betriebsart : BetriebsArt;      
                Nutzungsart : Nutzungsart;
                Notversorgung : Notversorgung;
                Kanton : Kanton;
                GdeNrBFS : 0 .. 9999;
                Lokalitaet : TEXT*100;
                MaxDarst : Darstellung; 
                MutatBemerk : TEXT*240;
                MutatDatum : INTERLIS.XMLDate;

                
                
                SymbolGeo: CHLKoord;
                SymbolRot: OrientierungsTyp;
                RealY: [480000.00..850000.00];
                RealX: [ 60000.00..320000.00];
                GUID: TEXT*38;
                Farbe: Farbe;
                Nutzungsart: OPTIONAL Nutzungsart;
                Notversorgung: OPTIONAL Notversorgung;
                Kanton: OPTIONAL Kanton;
                GdeNrBFS: OPTIONAL [0..9999];
                Lokalitaet: OPTIONAL TEXT*100;
                Grundlage: OPTIONAL -> Grundlage;
                MaxDarst: OPTIONAL Darstellung;
                MutatPerson: OPTIONAL -> MutatPerson;
                MutatDatum: OPTIONAL DATE;
                MutatBemerk: OPTIONAL TEXT*240;
                */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf gwf=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf)obj;
                ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung mappedObj=new ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung(stripUUID(gwf.getGUID()));
                mappedObj.setIdentifikator("ZG-"+gwf.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Gwf);
                IomObject geom=gwf.getattrobj(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf.tag_Geometrie, 0);
                mappedObj.addattrobj(ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung.tag_Geometrie, geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp(gwf.getTyp()));
                
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }
        }
        
    }
    private ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ mapSammeleinrichtungTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp typ) {
        
        //Typ Sickerleitung, Horizontal_Filterstrecke = Typ Fassungsstrang;
        //Typ Sickerleitung, Sammelstollen, Fassungsleitung_Allgemein, Fassungsleitung_Vollrohr = Typ Fassungsstollen; 
        //Typ Fassungsleitung_Vollrohr Fassungsleitung_Allgemein Punktfassung. Bohrung, andere, unbekannt = Typ unbestimmt
        if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sickerleitung.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sammelstollen.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstollen;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Allgemein.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Vollrohr.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Punktfassung.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Bohrung.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.andere.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.unbekannt.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Horizontal_Filterstrecke.equals(typ)) {
            return ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }
        throw new IllegalArgumentException("unexpected SammeleinrichtungTyp <"+typ+">");
    }
    private ch.interlis.models.ZG_Wasser_V1.Farbe mapFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe farbe) {
        // Werteliste ist identisch
        return ch.interlis.models.ZG_Wasser_V1.Farbe.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(farbe));
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
