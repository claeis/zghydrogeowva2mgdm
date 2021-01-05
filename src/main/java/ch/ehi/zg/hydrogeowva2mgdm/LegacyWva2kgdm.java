package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage_Art;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art;
import ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab;
import ch.interlis.models.ZG_hydrogeo_wva_V1.DruckRedTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart;
import ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart;
import ch.interlis.models.ZG_hydrogeo_wva_V1.ResSymbTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage_FoerderanlageArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung_LeitArt;

public class LegacyWva2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    private Map<String,String> laufBrunnen2oid=new HashMap<String,String>();
    private Map<String,String> wasserversorgung2oid=new HashMap<String,String>();
    private Map<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage> weitereAnlagen=new HashMap<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage>();
    private int errc=0;
    private void logError(String msg) {
        EhiLogger.logError(msg);
        errc++;
    }
    /** report error, but ignore it for now
     */
    private void logDelayedError(String msg) {
        EhiLogger.logAdaption(msg);
    }
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject obj=((ObjectEvent)event).getIomObject();
            if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse(uuid);
                mappedObj.setName(srcObj.getName()); 
                mappedObj.setVorname(srcObj.getVorname()); 
                mappedObj.setAdresse(srcObj.getAdresse());  
                mappedObj.setPLZ(srcObj.getPLZ());  
                mappedObj.setOrt(srcObj.getOrt());  
                mappedObj.setTelefonP(srcObj.getTelefonP());  
                mappedObj.setTelefonG(srcObj.getTelefonG()); 
                mappedObj.setEmail(srcObj.getEmail());
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer(uuid);
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setNummer(srcObj.getNummer());
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                //mappedObj.setTyp(mapAufbWkrTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setFilterLeist(srcObj.getFilterLeist());
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Reservoir: OPTIONAL -> Reservoir;
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setTyp(mapDruckRedTyp(srcObj.getTyp()));
                mappedObj.setLeitungsart(mapLeitungsArt(srcObj.getLeitungsart()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setDruckeingang(srcObj.getDruckeingang());  
                mappedObj.setDruckausgang(srcObj.getDruckausgang()); 
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setEntnahmebrunnenTyp(mapEntnahmebrunnenTyp(srcObj.getTyp()));
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapEntnahmebrunnenTyp2Fassungsart(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setTechdata1(srcObj.getTechdata1());
                mappedObj.setTechdata2(srcObj.getTechdata2());
                mappedObj.setTechdata3(srcObj.getTechdata3());
                mappedObj.setTechdata4(srcObj.getTechdata4());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                    MutatPerson: OPTIONAL -> MutatPerson;
                */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage(uuid);
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt())); 
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanBz(srcObj.getDetailplanBz());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setKontaktDatum(LegacyUtil.mapDate(srcObj.getKontaktDatum()));
                /*
                    KontaktPerson: OPTIONAL -> Adresse;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie(uuid);
                mappedObj.setSymbolGeo(LegacyUtil.mapPolyline(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.HydWidder);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setArt(Foerderanlage_Art.hydraulischer_Widder);
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                      Grundlage: OPTIONAL -> Grundlage;
                      MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setWeitereAnlageArt(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage_WeitereAnlageArt.Kaliberwechsel);
                IomObject symbolGeo=LegacyUtil.mapCoord(srcObj.getattrobj(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_SymbolGeo, 0));
                mappedObj.setSymbolGeo(symbolGeo);
                mappedObj.setGeometrie(symbolGeo);
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setSymbolTyp(mapKaliberTyp(srcObj.getSymbolTyp()));
                mappedObj.setLeitungsart(mapLeitungsArt(srcObj.getLeitungsart()));
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung notversorgung = mapNotversorgung(srcObj.getNotversorgung());
                if(notversorgung!=null)mappedObj.setNotversorgung(notversorgung);
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton kanton = mapKanton(srcObj.getKanton());
                if(kanton!=null)mappedObj.setKanton(kanton);
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_GdeNrBFS)==1) {
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                }
                final ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung maxDarst = mapDarstellung(srcObj.getMaxDarst());
                if(maxDarst!=null)mappedObj.setMaxDarst(maxDarst);
                final String mutatDatum = LegacyUtil.mapDate(srcObj.getMutatDatum());
                if(mutatDatum!=null)mappedObj.setMutatDatum(mutatDatum);
                final String mutatBemerk = srcObj.getMutatBemerk();
                if(mutatBemerk!=null)mappedObj.setMutatBemerk(mutatBemerk);
                /*
                      Grundlage: OPTIONAL -> Grundlage ;
                      MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                final ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart nutzungsart = srcObj.getNutzungsart();
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
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg)obj;
                final String weitereAnlageOid = laufBrunnen2oid.get(srcObj.getLaufBrunnen());
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=weitereAnlagen.remove(weitereAnlageOid);
                if(mappedObj==null) {
                    logError("LaufBrunnen "+srcObj.getLaufBrunnen()+" mehr als einer Wasserversorgung zugeordnet");
                }else {
                    mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                    events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV)obj;
                String guid = srcObj.getGUID();
                if(guid==null) {
                    guid=LegacyUtil.newUUID();
                }
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator("ZG-"+guid);
                IomObject geom = srcObj.getGeometrie();
                if(geom!=null) {
                    mappedObj.setGeometrie(LegacyUtil.mapPolyline(geom));
                }
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt typ = srcObj.getTyp();
                if(typ!=null) {
                    mappedObj.setTyp(mapLeitungsArt(typ));
                }
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                final Double dimension = srcObj.getDimension();
                if(dimension!=null) {
                    mappedObj.setNennweite(dimension);
                }
                mappedObj.setLeitArt(Leitung_LeitArt.LeitungsnetzWV);
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson(uuid);
                mappedObj.setMutatPerson(srcObj.getMutatPerson()); 
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapOberflaeGewFassungTyp2Fassungsart(srcObj.getTyp()));
                mappedObj.setTiefe(srcObj.getTiefe());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                    MutatPerson: OPTIONAL -> MutatPerson;
                */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung)obj;
                String guid = srcObj.getGUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator("ZG-"+guid);
                final IomObject geom = LegacyUtil.mapPolyline(srcObj.getSymbolGeo());
                mappedObj.setSymbolGeo(geom);
                mappedObj.setGeometrie(geom);
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitArt(Leitung_LeitArt.OberflGewFsgLeitung);
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  MutatPerson: OPTIONAL -> MutatPerson; 
                 */
                
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(Foerderanlage_Art.hydraulischer_Widder);
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.OberflGewRohwaPW);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setTechdata(srcObj.getTechData());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Aufbereitungswerk: OPTIONAL -> Aufbereitungswerk;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.Pumpwerk);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setArt(mapPWTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setTotFoerdermenge(srcObj.getTotFoerdermenge());
                mappedObj.setTechdata1(srcObj.getTechdata1());
                mappedObj.setTechdata2(srcObj.getTechdata2());
                mappedObj.setTechdata3(srcObj.getTechdata3());
                mappedObj.setTechdata4(srcObj.getTechdata4());
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapQWFSchachtTyp(srcObj.getTyp()));
                mappedObj.setErtragBrst(srcObj.getEtragBrst());
                mappedObj.setErtragGrp(srcObj.getErtragGrp());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                Sammelschacht: OPTIONAL -> Sammelschacht; 
                Reservoir: OPTIONAL -> Reservoir;
                HydWidder: OPTIONAL -> HydWidder;
                Pumpwerk: OPTIONAL -> Pumpwerk;
                LaufBrunnen: OPTIONAL -> LaufBrunnen;
                MutatPerson: OPTIONAL -> MutatPerson;
                */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.ReinwasserPW);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setArt(Foerderanlage_Art.Pumpwerk);
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setTotFoerdermenge(srcObj.getTotFoerdermenge());
                mappedObj.setTechdata1(srcObj.getTechData1());
                mappedObj.setTechdata2(srcObj.getTechData2());
                mappedObj.setTechdata3(srcObj.getTechData3());
                mappedObj.setTechdata4(srcObj.getTechData4());
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                      Aufbereitungswerk: OPTIONAL -> Aufbereitungswerk;
                      Grundlage: OPTIONAL -> Grundlage;
                      MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir)obj;
                String guid = srcObj.getGUID();
                if(guid==null) {
                    guid=LegacyUtil.newUUID();
                }
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator("ZG-"+guid);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setSymbolTyp(mapResSymbTyp(srcObj.getSymbolTyp()));
                mappedObj.setName(srcObj.getName());
                Double wspHoehe = srcObj.getWspHoehe();
                if(wspHoehe==null) {
                    wspHoehe=-1.0; 
                }
                mappedObj.setWasserspiegel_max(wspHoehe);
                String brauchreserveTxt = srcObj.getBrauchreserve();
                int brauchreserve=-1;
                if(brauchreserveTxt==null) {
                }else {
                    try {
                        brauchreserve=Integer.parseInt(brauchreserveTxt);
                    } catch (NumberFormatException e) {
                        logDelayedError("unerwartete Brauchreserve <"+brauchreserveTxt+">");
                    }
                }
                mappedObj.setBrauchreserve(brauchreserve);
                String loeschreserveTxt = srcObj.getLoeschreserve();
                int loeschreserve=-1;
                if(loeschreserveTxt==null) {
                }else {
                    try {
                        loeschreserve=Integer.parseInt(loeschreserveTxt);
                    } catch (NumberFormatException e) {
                        logDelayedError("unerwartete Loeschreserve <"+loeschreserveTxt+">");
                    }
                }
                mappedObj.setLoeschreserve(loeschreserve);
                mappedObj.setGesamtinhalt(srcObj.getGesamtinhalt());
                mappedObj.setTechdata(srcObj.getTechdata());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Stufenpumpwerk: OPTIONAL -> Pumpwerk;
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitungsart(mapLeitungsArt(srcObj.getLeitungsart()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setTrinkwasser(mapNutzungsart2Trinkwasser(srcObj.getNutzungsart()));
                mappedObj.setTechData(srcObj.getTechData());
                mappedObj.setNotwasserversorgung(mapNotversorgung2Notwasserversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitungsart(mapLeitungsArt(srcObj.getLeitungsart()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArt(WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setBaujahr(srcObj.getBaujahr()); 
                mappedObj.setTurbine(srcObj.getTurbine());
                mappedObj.setDurchfluss(srcObj.getDurchfluss());
                mappedObj.setBruttofallhoehe(srcObj.getBruttofallhoehe());
                mappedObj.setNettofallhoehe(srcObj.getNettofallhoehe());
                mappedObj.setTurbinenleistung(srcObj.getTurbinenleistung());
                mappedObj.setJahresproduktion(srcObj.getJahresproduktion());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  Grundlage: OPTIONAL -> Grundlage;
                  MutatPerson: OPTIONAL -> MutatPerson;
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg) {
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(java.util.UUID.randomUUID().toString());
                mappedObj.setWVName(srcObj.getWVName());
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung.tag_Nummer)==1)mappedObj.setNummer(srcObj.getNummer());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                wasserversorgung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung)obj;
                String guid = srcObj.getGUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator("ZG-"+guid);
                mappedObj.setGeometrie(LegacyUtil.mapPolyline(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitArt(Leitung_LeitArt.WVAFassungsleitung);
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setErfGenauigkeit(mapWVAFassungsleitung_Genauigkeit(srcObj.getGenauigkeit()));
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDate(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                /*
                  MutatPerson: OPTIONAL -> MutatPerson; 
                 */
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else {
                logError("unexpected object TID="+obj.getobjectoid()+": "+obj.getobjecttag());
            }
        }
        
    }
    private ErfVorlBemerk mapErfVorlBemerk(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk src) {
        if(src==null) {
            return null;
        } else if (src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.GPS_0_01m)) {
            return ErfVorlBemerk.GPS_0_01m;
        } else if (src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.GPS_0_10m)) {
            return ErfVorlBemerk.GPS_0_10m;
        } else if (src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.GPS_1_00m)) {
            return ErfVorlBemerk.GPS_1_00m;
        } else if (src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.GPS_10_00m)) {
            return ErfVorlBemerk.GPS_10_00m;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.Grundbuchplan_Papier)) {
            return ErfVorlBemerk.Grundbuchplan_Papier;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.keine_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.keine_Einpassmoeglichkeit;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.nach_muendlicher_Angabe)) {
            return ErfVorlBemerk.nach_muendlicher_Angabe;
        } else if (src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.Schematisch)) {
            return ErfVorlBemerk.Schematisch;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.schlechte_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.schlechte_Einpassmoeglichkeit;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung)) {
            return ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung;
        } else if (src.equals(
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.Vorlage_unzuverlaessig)) {
            return ErfVorlBemerk.Vorlage_unzuverlaessig;
        }
        throw new IllegalArgumentException();
    }
    private Herkunftsart mapHerkunftsart(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.Aufnahme)){
        return Herkunftsart.Aufnahme;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.UebernahmeKoordinaten)){
            return Herkunftsart.UebernahmeKoordinaten;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.Planabgriff)){
            return Herkunftsart.Planabgriff;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.konstruktiv)){
            return Herkunftsart.konstruktiv;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.geschaetzt)){
            return Herkunftsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.unbekannt)){
            return Herkunftsart.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.andere)){
            return Herkunftsart.andere;
        }
        throw new IllegalArgumentException();
    }
    private ErfGenauigkeit mapErfGenauigkeit(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.AV_gerechnet)) {
            return ErfGenauigkeit.AV_gerechnet;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.Detailplan)) {
            return ErfGenauigkeit.Detailplan;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.andere)) {
            return ErfGenauigkeit.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.unbekannt)) {
            return ErfGenauigkeit.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private ErfVorlHerkunft mapErfVorlHerkunft(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.Amt_fuer_Umweltschutz)) {
            return ErfVorlHerkunft.Amt_fuer_Umwelt;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.Kant_Vermessungsamt)) {
            return ErfVorlHerkunft.Amt_fuer_Grundbuch_und_Geoinformation;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.privater_Betreiber)) {
            return ErfVorlHerkunft.privater_Betreiber;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.Schutzzonen_Bearbeiter)) {
            return ErfVorlHerkunft.Schutzzonen_Bearbeiter;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.Wasserversorgung)) {
            return ErfVorlHerkunft.Wasserversorgung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.Eigentuemer)) {
            return ErfVorlHerkunft.Eigentuemer;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.unbekannt)) {
            return ErfVorlHerkunft.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.andere)) {
            return ErfVorlHerkunft.andere;
        }
        throw new IllegalArgumentException();
    }
    private DetailplanMstab mapDetailplanMstab(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_200)) {
            return DetailplanMstab.M_1_200;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_500)) {
            return DetailplanMstab.M_1_500;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_1000)) {
            return DetailplanMstab.M_1_1000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_2000)) {
            return DetailplanMstab.M_1_2000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_5000)) {
            return DetailplanMstab.M_1_5000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_10000)) {
            return DetailplanMstab.M_1_10000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.M_1_25000)) {
            return DetailplanMstab.M_1_25000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.andere)) {
            return DetailplanMstab.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.unbekannt)) {
            return DetailplanMstab.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private DetailplanArt mapDetailplanArt(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.Plan_digital)){
            return DetailplanArt.Plan_digital;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.Plan_analog)){
            return DetailplanArt.Plan_analog;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.Uebersichtsplan)){
            return DetailplanArt.Uebersichtsplan;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.Landeskarte)){
            return DetailplanArt.Landeskarte;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.Skizze)){
            return DetailplanArt.Skizze;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.andere)){
            return DetailplanArt.andere;
        }
        throw new IllegalArgumentException();
    }
    private DruckRedTyp mapDruckRedTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckRedTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckRedTyp.Druckbrecherschacht)) {
            return DruckRedTyp.Druckbrecherschacht;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckRedTyp.Druckreduzierventil)) {
            return DruckRedTyp.Druckreduzierventil;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckRedTyp.unbekannt)) {
            return DruckRedTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private ResSymbTyp mapKaliberTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_1)) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_2)) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_3)) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_4)) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_5)) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.Kaliber_6)) {
            return null;
        }
        throw new IllegalArgumentException();
    }
    private ResSymbTyp mapResSymbTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp.Vol_5_29)) {
            return ResSymbTyp.Vol_5_29;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp.Vol_30_1000)){
            return ResSymbTyp.Vol_30_1000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp.Vol_1001_5000)){
            return ResSymbTyp.Vol_1001_5000;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp.Vol_5001_9999)){
            return ResSymbTyp.Vol_5001_9999;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResSymbTyp.Vol_10000)){
            return ResSymbTyp.Vol_10000;
        }            
        throw new IllegalArgumentException();
    }
    private ErfGenauigkeit mapWVAFassungsleitung_Genauigkeit(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung_Genauigkeit src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung_Genauigkeit.stark_generalisiert)) {
            return ErfGenauigkeit.andere;
        }
        throw new IllegalArgumentException();
    }
    private Foerderanlage_Art mapPWTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTyp.Stufenpumpwerk)) {
            return Foerderanlage_Art.Stufenpumpwerk;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTyp.QuellwasserbehaelterMitStufenpumpwerk)){
            return Foerderanlage_Art.Stufenpumpwerk_mit_Behaelter;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTyp.Druckerhoehungspumpwerk)){
            return Foerderanlage_Art.Druckerhoehungspumpwerk;
        }
        throw new IllegalArgumentException();
    }
    private Oberflaechengewaesserfassung_Fassungsart mapOberflaeGewFassungTyp2Fassungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflaeGewFassungTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflaeGewFassungTyp.Seewasserfassung)) {
            return Oberflaechengewaesserfassung_Fassungsart.Seewasserfassung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflaeGewFassungTyp.Fliessgewaesserfassung)){
            return Oberflaechengewaesserfassung_Fassungsart.Fliessgewaesserfassung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflaeGewFassungTyp.Bachwasserfassung)){
            return Oberflaechengewaesserfassung_Fassungsart.Fliessgewaesserfassung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflaeGewFassungTyp.andere)){
            return Oberflaechengewaesserfassung_Fassungsart.Fliessgewaesserfassung;
        }
        throw new IllegalArgumentException();
    }
    private EntnahmebrunnenTyp mapEntnahmebrunnenTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.einfacheGWFassung)) {
            return EntnahmebrunnenTyp.einfacheGWFassung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.HorizontalfilterBrunnen)){
            return EntnahmebrunnenTyp.HorizontalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.VertikalfilterBrunnen)){
            return EntnahmebrunnenTyp.VertikalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.Sodbrunnen)){
            return EntnahmebrunnenTyp.Sodbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.GW_Notbrunnen)){
            return EntnahmebrunnenTyp.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.Rohr)){
            return EntnahmebrunnenTyp.Rohr;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.unbekannt)){
            return EntnahmebrunnenTyp.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.andere)){
            return EntnahmebrunnenTyp.andere;
        }
        throw new IllegalArgumentException();
    }
    private Grundwasserfassung_Fassungsart mapEntnahmebrunnenTyp2Fassungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.einfacheGWFassung)) {
            return Grundwasserfassung_Fassungsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.HorizontalfilterBrunnen)){
            return Grundwasserfassung_Fassungsart.Horizontalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.VertikalfilterBrunnen)){
            return Grundwasserfassung_Fassungsart.Vertikalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.Sodbrunnen)){
            return Grundwasserfassung_Fassungsart.Sod_Schachtbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.GW_Notbrunnen)){
            return Grundwasserfassung_Fassungsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.Rohr)){
            return Grundwasserfassung_Fassungsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.unbekannt)){
            return Grundwasserfassung_Fassungsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.andere)){
            return Grundwasserfassung_Fassungsart.andere;
        }
        throw new IllegalArgumentException();
    }
    private LeitungsArt mapLeitungsArt(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.Notverbindung_temporaer)) {
            return LeitungsArt.Notverbindung_temporaer;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.Quellwasserableitung)){
            return LeitungsArt.Quellwasserableitung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.Versorgungsleitung)){
            return LeitungsArt.Versorgungsleitung;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.Rueckgabeleitung)){
            return LeitungsArt.Rueckgabeleitung;
        }
        throw new IllegalArgumentException();
    }
    private BetriebsArt mapBetriebsArt(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.ausser_Betrieb)) {
            return BetriebsArt.ausser_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.im_Bau)){
            return BetriebsArt.im_Bau;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.in_Betrieb)){
            return BetriebsArt.in_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.projektiert)){
            return BetriebsArt.projektiert;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.stillgelegt)){
            return BetriebsArt.stillgelegt;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.unbekannt)){
            return BetriebsArt.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private Brunnenstube_Fassungsart mapQWFSchachtTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Brunnenstube)) {
            return Brunnenstube_Fassungsart.Brunnenstube;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Sammelschacht)){
            return Brunnenstube_Fassungsart.Sammelschacht;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Reservoir)){
            return Brunnenstube_Fassungsart.Sammelschacht;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Quellwasser_Pumpwerk)){
            return Brunnenstube_Fassungsart.Sammelschacht;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Laufender_Brunnen)){
            return Brunnenstube_Fassungsart.Brunnenstube;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.Hyraulischer_Widder)){
            return Brunnenstube_Fassungsart.Sammelschacht;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.kein_Schacht)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private EigentumArt mapEigentumArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt eigentumArt) {
        if(eigentumArt==null)return null;
        // Werteliste ist identisch
        return EigentumArt.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt.toXmlCode(eigentumArt));
    }
    private Nutzungsart mapNutzungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart nutzungsart) {
        if(nutzungsart==null)return null;
        // Werteliste ist identisch
        return Nutzungsart.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.toXmlCode(nutzungsart));
    }
    private JaNein mapNutzungsart2Trinkwasser(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart src) {
        if(src==null) {
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Brauchwasser)) {
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Laufender_Brunnen)){
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.ungenutzt)){
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Trinkwasser)){
            return JaNein.ja;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.unbekannt)){
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Viehtraenke)){
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Waschwasser_Milch)){
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.Turbine)){
            return JaNein.nein;
        }
        throw new IllegalArgumentException();
    }
    
    private Notversorgung mapNotversorgung(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung notversorgung) {
        if(notversorgung==null)return null;
        // Werteliste ist identisch
        return Notversorgung.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.toXmlCode(notversorgung));
    }
    private JaNeinUnbestimmt mapNotversorgung2Notwasserversorgung(
            ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung src) {
        if(src==null) {
            return JaNeinUnbestimmt.unbestimmt;
        }if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.Normalversorgung)) {
            return JaNeinUnbestimmt.nein;
        }if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.nur_Notversorgung)){
            return JaNeinUnbestimmt.ja;
        }if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.Not_und_Normalversorgung)){
            return JaNeinUnbestimmt.ja;
        }if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.unbekannt)){
            return JaNeinUnbestimmt.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton mapKanton(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton kanton) {
        if(kanton==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.toXmlCode(kanton));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung mapDarstellung(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung maxDarst) {
        if(maxDarst==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung.toXmlCode(maxDarst));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe mapFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.parseXmlCode(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(src));
    }
    public IomObject getMappedObject() {
        if(events.isEmpty()) {
            return null;
        }
        IoxEvent front=events.remove(0);
        return ((ObjectEvent)front).getIomObject();
    }

}
