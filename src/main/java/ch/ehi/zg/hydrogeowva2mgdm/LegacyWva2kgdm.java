package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.EndTransferEvent;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Brunnenstube;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage_Art;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art;
import ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter;
import ch.interlis.models.ZG_hydrogeo_wva_V1.*;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.*;

public class LegacyWva2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    private Map<String,IomObject> uuid2srcObj=new HashMap<String,IomObject>();
    private Map<String,IomObject> mappedObjs=new HashMap<String,IomObject>();
    private boolean mappingComplete=false;
    
    private Map<String,String> adresse2oid=new HashMap<String,String>();
    private Map<String,String> aufbereitungswerk2oid=new HashMap<String,String>();
    private Map<String,String> druckreduktion2oid=new HashMap<String,String>();
    private Map<String,String> entnahmebrunnen2oid=new HashMap<String,String>();
    private Map<String,String> grundlage2oid=new HashMap<String,String>();
    private Map<String,String> hydwidder2oid=new HashMap<String,String>();
    private Map<String,String> kaliberwechsel2oid=new HashMap<String,String>();
    private Map<String,String> laufbrunnen2oid=new HashMap<String,String>();
    private Map<String,String> leitungsnetzwv2oid=new HashMap<String,String>();
    private Map<String,String> mutatperson2oid=new HashMap<String,String>();
    private Map<String,String> oberflgewfassung2oid=new HashMap<String,String>();
    private Map<String,String> oberflgewfsgleitung2oid=new HashMap<String,String>();
    private Map<String,String> oberflgewrohwapw2oid=new HashMap<String,String>();
    private Map<String,String> pumpwerk2oid=new HashMap<String,String>();
    private Map<String,String> quellschacht2oid=new HashMap<String,String>();
    private Map<String,String> reservoir2oid=new HashMap<String,String>();
    private Map<String,String> reinwasserpw2oid=new HashMap<String,String>();
    private Map<String,String> rwzisterne2oid=new HashMap<String,String>();
    private Map<String,String> sammelschacht2oid=new HashMap<String,String>();
    private Map<String,String> schieberschacht2oid=new HashMap<String,String>();
    private Map<String,String> twturbine2oid=new HashMap<String,String>();
    private Map<String,String> wasserversorgung2oid=new HashMap<String,String>();
    private Map<String,String> wvafassungsleitung2oid=new HashMap<String,String>();
    private Set<String> linkedToWasservsg=new HashSet<String>();
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
            if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle(LegacyUtil.stripUUID(srcObj.getGUID()));
                // TODO
                throw new IllegalStateException("keine Abgabestelle erwartet");
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse) {
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
                adresse2oid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer(uuid);
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setNummer(srcObj.getNummer());
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Aufbereitungswerk aufbereitungswerk=(Aufbereitungswerk)mappedObjs.get(aufbereitungswerk2oid.get(srcObj.getAufbereitungswerk()));
                aufbereitungswerk.setFilterLeistTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Aufbereitungswerk aufbereitungswerk=(Aufbereitungswerk)mappedObjs.get(aufbereitungswerk2oid.get(srcObj.getAufbereitungswerk()));
                aufbereitungswerk.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(aufbereitungswerk2oid.get(srcObj.getAufbereitungswerk()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk)obj;
                Aufbereitungswerk mappedObj=new Aufbereitungswerk(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setArt(WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                mappedObj.setFilterLeist(srcObj.getFilterLeist());
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                final String reservoirTid = srcObj.getReservoir();
                if(reservoirTid!=null) {
                    AufbWrkRes aufbWrkRes=new AufbWrkRes(null);
                    aufbWrkRes.setAufbereitungswerk(mappedObj.getobjectoid());
                    aufbWrkRes.setReservoir(reservoir2oid.get(reservoirTid));
                    addCreatedObj(aufbWrkRes);
                }
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                aufbereitungswerk2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(druckreduktion2oid.get(srcObj.getDruckreduktion()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion)obj;
                Druckreduktion mappedObj=new Druckreduktion(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                druckreduktion2oid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                entnahmebrunnen.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                entnahmebrunnen.setTechdata1TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                entnahmebrunnen.setTechdata2TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                entnahmebrunnen.setTechdata3TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                entnahmebrunnen.setTechdata4TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setEntnahmebrunnenTyp(mapEntnahmebrunnenTyp(srcObj.getTyp()));
                mappedObj.setFoerdermethode(Entnahmebrunnen_Foerdermethode.unbestimmt);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapEntnahmebrunnenTyp2Fassungsart(srcObj.getTyp()));
                if(mappedObj.getattrvaluecount(Entnahmebrunnen.tag_Fassungsart)==0) {
                    mappedObj.setFassungsart(Grundwasserfassung_Fassungsart.andere);
                }
                mappedObj.setAufbereitung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setName(srcObj.getName());
                mappedObj.setTechdata1(srcObj.getTechdata1());
                mappedObj.setTechdata2(srcObj.getTechdata2());
                mappedObj.setTechdata3(srcObj.getTechdata3());
                mappedObj.setTechdata4(srcObj.getTechdata4());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                entnahmebrunnen2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage(uuid);
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt())); 
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanBz(srcObj.getDetailplanBz());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setAdresse(adresse2oid.get(srcObj.getKontaktPerson()));
                grundlage2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie(uuid);
                mappedObj.setSymbolGeo(LegacyUtil.mapPolyline(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant(LegacyUtil.stripUUID(srcObj.getGUID()));
                // TODO
                throw new IllegalStateException("kein Hydrant erwartet");
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.HydWidder);
                mappedObj.setFoerdermenge(-1);
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                hydwidder2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg(null);
                mappedObj.setFoerderanlage(hydwidder2oid.get(srcObj.getHydWidder()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage_Art.Brunnen_unabh_TWQualitaet_unbest);
                mappedObj.setWeitereAnlageArt(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage_WeitereAnlageArt.Kaliberwechsel);
                IomObject symbolGeo=LegacyUtil.mapCoord(srcObj.getattrobj(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen.tag_SymbolGeo, 0));
                mappedObj.setSymbolGeo(symbolGeo);
                mappedObj.setGeometrie(symbolGeo);
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                // TODO mappedObj.setSymbolTyp(mapKaliberTyp(srcObj.getSymbolTyp()));
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
                final String mutatDatum = LegacyUtil.mapDateFromITF(srcObj.getMutatDatum());
                if(mutatDatum!=null)mappedObj.setMutatDatum(mutatDatum);
                final String mutatBemerk = srcObj.getMutatBemerk();
                if(mutatBemerk!=null)mappedObj.setMutatBemerk(mutatBemerk);
                kaliberwechsel2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(kaliberwechsel2oid.get(srcObj.getKaliberwechsel()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
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
                /*
                KGDM:
                WeitereAnlageArt : (Laufbrunnen, Kaliberwechsel, RWZisterne);
                Betriebsart : BetriebsArt;      
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
                final String mutatDatum = LegacyUtil.mapDateFromITF(srcObj.getMutatDatum());
                if(mutatDatum!=null)mappedObj.setMutatDatum(mutatDatum);
                final String mutatBemerk = srcObj.getMutatBemerk();
                if(mutatBemerk!=null)mappedObj.setMutatBemerk(mutatBemerk);
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                laufbrunnen2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(laufbrunnen2oid.get(srcObj.getLaufBrunnen()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV)obj;
                String guid = srcObj.getGUID();
                if(guid==null) {
                    guid=LegacyUtil.newUUID();
                }
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+guid);
                IomObject geom = srcObj.getGeometrie();
                if(geom!=null) {
                    mappedObj.setGeometrie(LegacyUtil.mapPolyline(geom));
                }
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt typ = srcObj.getTyp();
                if(typ!=null) {
                    mappedObj.setTyp(mapLeitungsArt(typ));
                }else {
                    logError("kein LeitungsnetzWV.Typ "+srcObj.getobjectoid());
                }
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                final Double dimension = srcObj.getDimension();
                if(dimension!=null) {
                    mappedObj.setNennweite(dimension);
                }
                if(mappedObj.getattrvaluecount(Leitung.tag_Nennweite)==0) {
                    mappedObj.setNennweite(-1.0);
                }
                mappedObj.setLeitArt(Leitung_LeitArt.LeitungsnetzWV);
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGeometrieHerkunft(Herkunftsart.unbekannt);
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                leitungsnetzwv2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson)obj;
                String uuid=LegacyUtil.newUUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson(uuid);
                mappedObj.setMutatPerson(srcObj.getMutatPerson()); 
                mutatperson2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung(LegacyUtil.stripUUID(srcObj.getGUID()));
                // TODO
                throw new IllegalStateException("keine NotLeitung erwartet");
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Leitung leitung=(Leitung)mappedObjs.get(oberflgewfsgleitung2oid.get(srcObj.getOberflGewFsgLeitung()));
                leitung.setLeitTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                OberflGewRohwaPW oberflgewrohwapw=(OberflGewRohwaPW)mappedObjs.get(oberflgewrohwapw2oid.get(srcObj.getOberflGewRohwaPW()));
                oberflgewrohwapw.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                OberflGewRohwaPW oberflgewrohwapw=(OberflGewRohwaPW)mappedObjs.get(oberflgewrohwapw2oid.get(srcObj.getOberflGewRohwaPW()));
                oberflgewrohwapw.setTechdataTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapOberflaeGewFassungTyp2Fassungsart(srcObj.getTyp()));
                mappedObj.setAufbereitung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setNotwasserversorgung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setTrinkwasser(JaNein.nein);
                mappedObj.setTiefe(srcObj.getTiefe());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                oberflgewfassung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung)obj;
                String guid = srcObj.getGUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+guid);
                mappedObj.setTyp(LeitungsArt.Versorgungsleitung);
                final IomObject geom = LegacyUtil.mapPolyline(srcObj.getSymbolGeo());
                if(mappedObj.getattrvaluecount(Leitung.tag_Nennweite)==0) {
                    mappedObj.setNennweite(-1.0);
                }
                mappedObj.setSymbolGeo(geom);
                mappedObj.setGeometrie(geom);
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitArt(Leitung_LeitArt.OberflGewFsgLeitung);
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setNetzteilident(LegacyUtil.mapNetzteilident(mappedObj.getFarbe()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGeometrieHerkunft(Herkunftsart.unbekannt);
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                oberflgewfsgleitung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setArt(Foerderanlage_Art.hydraulischer_Widder);
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.OberflGewRohwaPW);
                mappedObj.setFoerdermenge(-1);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setTechdata(srcObj.getTechData());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                oberflgewrohwapw2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
                final String aufbereitungswerkTid = srcObj.getAufbereitungswerk();
                if(aufbereitungswerkTid!=null) {
                    FoerderanlageAufbereitungswerk foerderanlageAufbereitungswerk=new FoerderanlageAufbereitungswerk(null);
                    foerderanlageAufbereitungswerk.setAufbereitungswerk(aufbereitungswerk2oid.get(aufbereitungswerkTid));
                    foerderanlageAufbereitungswerk.setFoerderanlage(mappedObj.getobjectoid());
                    addCreatedObj(foerderanlageAufbereitungswerk);
                }
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                OberflaechenGewFassung oberflgewfassung=(OberflaechenGewFassung)mappedObjs.get(oberflgewfassung2oid.get(srcObj.getOberflGewFsg()));
                oberflgewfassung.setObflGewFsgTiefeText(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge)obj;
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                addEinzelFoerdermenge(foerderanlage,srcObj.getFoerdermenge());
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                foerderanlage.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                foerderanlage.setTechdata1TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                foerderanlage.setTechdata2TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                foerderanlage.setTechdata3TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getPumpwerk()));
                foerderanlage.setTechdata4TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg(null);
                mappedObj.setFoerderanlage(pumpwerk2oid.get(srcObj.getPumpwerk()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.Pumpwerk);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setArt(mapPWTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));;
                mappedObj.setNutzungsart(mapNutzungsart(srcObj.getNutzungsart()));
                final Integer totFoerdermenge = srcObj.getTotFoerdermenge();
                mappedObj.setTotFoerdermenge(totFoerdermenge);
                if(totFoerdermenge!=null) {
                    mappedObj.setFoerdermenge(totFoerdermenge);
                }else {
                    mappedObj.setFoerdermenge(-1);
                }
                mappedObj.setTechdata1(srcObj.getTechdata1());
                mappedObj.setTechdata2(srcObj.getTechdata2());
                mappedObj.setTechdata3(srcObj.getTechdata3());
                mappedObj.setTechdata4(srcObj.getTechdata4());
                mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                pumpwerk2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Quellschacht quellschacht=(Quellschacht)mappedObjs.get(quellschacht2oid.get(srcObj.getQuellschacht()));
                quellschacht.setErtragBrstTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Quellschacht quellschacht=(Quellschacht)mappedObjs.get(quellschacht2oid.get(srcObj.getQuellschacht()));
                quellschacht.setErtragGrpTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setFassungsart(mapQWFSchachtTyp(srcObj.getTyp()));
                if(mappedObj.getattrvaluecount(mappedObj.tag_Fassungsart)==0) {
                    mappedObj.setFassungsart(Brunnenstube_Fassungsart.unbestimmt);
                }
                mappedObj.setErtrag_minimal(-1);
                mappedObj.setAufbereitung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setNotwasserversorgung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setErtragBrst(srcObj.getEtragBrst());
                mappedObj.setErtragGrp(srcObj.getErtragGrp());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                final String sammelschachtTid = srcObj.getSammelschacht();
                if(sammelschachtTid!=null) {
                    QueSchaSaScha queSchaSaScha=new QueSchaSaScha(null);
                    queSchaSaScha.setQuellschacht(mappedObj.getobjectoid());
                    queSchaSaScha.setSammelschacht(sammelschacht2oid.get(sammelschachtTid));
                    addCreatedObj(queSchaSaScha);
                }
                final String reservoirTid = srcObj.getReservoir();
                if(reservoirTid!=null) {
                    QueSchaRes queSchaRes=new QueSchaRes(null);
                    queSchaRes.setQuellschacht(mappedObj.getobjectoid());
                    queSchaRes.setReservoir(reservoir2oid.get(reservoirTid));
                    addCreatedObj(queSchaRes);
                }
                final String hydWidderTid = srcObj.getHydWidder();
                if(hydWidderTid!=null){
                    QueSchaFoerderanlage queSchaFoerderanlage=new QueSchaFoerderanlage(null);
                    queSchaFoerderanlage.setQuellschacht(mappedObj.getobjectoid());
                    queSchaFoerderanlage.setFoerderanlage(hydwidder2oid.get(hydWidderTid));
                    addCreatedObj(queSchaFoerderanlage);
                }
                final String pumpwerkTid = srcObj.getPumpwerk();
                if(pumpwerkTid!=null){
                    QueSchaFoerderanlage queSchaFoerderanlage=new QueSchaFoerderanlage(null);
                    queSchaFoerderanlage.setQuellschacht(mappedObj.getobjectoid());
                    queSchaFoerderanlage.setFoerderanlage(pumpwerk2oid.get(pumpwerkTid));
                    addCreatedObj(queSchaFoerderanlage);
                }
                if(srcObj.getLaufBrunnen()!=null) {
                    WeitereAnlage laufBrunnen=(WeitereAnlage)mappedObjs.get(laufbrunnen2oid.get(srcObj.getLaufBrunnen()));
                    if(laufBrunnen.getQuellschacht()!=null) {
                        logError("Quellschacht "+laufBrunnen.getobjectoid()+": mehr als ein Quelleschacht"+mappedObj.getobjectoid()+","+laufBrunnen.getQuellschacht());
                    }else {
                        laufBrunnen.setQuellschacht(mappedObj.getobjectoid());
                    }
                }
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                quellschacht2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge)obj;
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(reinwasserpw2oid.get(srcObj.getReinwasserPW()));
                addEinzelFoerdermenge(foerderanlage,srcObj.getFoerdermenge());
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(reinwasserpw2oid.get(srcObj.getReinwasserPW()));
                foerderanlage.setTechdata1TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(reinwasserpw2oid.get(srcObj.getReinwasserPW()));
                foerderanlage.setTechdata2TextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg(null);
                mappedObj.setFoerderanlage(reinwasserpw2oid.get(srcObj.getReinwasserPW()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setFoerderanlageArt(Foerderanlage_FoerderanlageArt.ReinwasserPW);
                mappedObj.setFoerdermenge(-1);
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                reinwasserpw2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
                FoerderanlageAufbereitungswerk foerderanlageAufbereitungswerk=new FoerderanlageAufbereitungswerk(null);
                foerderanlageAufbereitungswerk.setAufbereitungswerk(aufbereitungswerk2oid.get(srcObj.getAufbereitungswerk()));
                foerderanlageAufbereitungswerk.setFoerderanlage(mappedObj.getobjectoid());
                addCreatedObj(foerderanlageAufbereitungswerk);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Reservoir reservoir=(Reservoir)mappedObjs.get(reservoir2oid.get(srcObj.getReservoir()));
                reservoir.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Reservoir reservoir=(Reservoir)mappedObjs.get(reservoir2oid.get(srcObj.getReservoir()));
                reservoir.setTechdataTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg(null);
                mappedObj.setReservoir(reservoir2oid.get(srcObj.getReservoir()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                final Reservoir reservoir = (Reservoir) mappedObjs.get(reservoir2oid.get(srcObj.getReservoir()));
                final Wasserversorgung wasserversorgung = (Wasserversorgung) mappedObjs.get(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                reservoir.setNetzteilident(LegacyUtil.mapNetzteilident(wasserversorgung.getNummer(),reservoir.getFarbe()));
                linkedToWasservsg.add(reservoir.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir)obj;
                String guid = srcObj.getGUID();
                if(guid==null) {
                    guid=LegacyUtil.newUUID();
                }
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+guid);
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
                        logDelayedError("unerwartete Brauchreserve <"+brauchreserveTxt+"> "+srcObj.getName()+"; "+guid);
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
                        logDelayedError("unerwartete Loeschreserve <"+loeschreserveTxt+"> "+srcObj.getName()+"; "+guid);
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                if(srcObj.getStufenpumpwerk()!=null) {
                    Foerderanlage foerderanlage=(Foerderanlage)mappedObjs.get(pumpwerk2oid.get(srcObj.getStufenpumpwerk()));
                    if(foerderanlage.getReservoir()!=null) {
                        logError("Pumpwerk "+foerderanlage.getobjectoid()+": mehr als ein Reservoir "+mappedObj.getobjectoid()+","+foerderanlage.getReservoir());
                    }else {
                        foerderanlage.setReservoir(mappedObj.getobjectoid());
                    }
                }
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                reservoir2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                rwzisterne2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Sammelschacht sammelschacht=(Sammelschacht)mappedObjs.get(sammelschacht2oid.get(srcObj.getSammelschacht()));
                sammelschacht.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Sammelschacht sammelschacht=(Sammelschacht)mappedObjs.get(sammelschacht2oid.get(srcObj.getSammelschacht()));
                sammelschacht.setTechDataTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg(null);
                mappedObj.setQuellschacht(sammelschacht2oid.get(srcObj.getSammelschacht()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setTyp(QWFSchachtTyp.Sammelschacht);
                mappedObj.setSymbolGeo(LegacyUtil.mapCoord(srcObj.getSymbolGeo()));
                mappedObj.setSymbolRot(srcObj.getSymbolRot());
                mappedObj.setGeometrie(LegacyUtil.mapCoord(srcObj.getRealY(),srcObj.getRealX()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitungsart(mapLeitungsArt(srcObj.getLeitungsart()));
                if(mappedObj.getattrvaluecount(mappedObj.tag_Fassungsart)==0) {
                    mappedObj.setFassungsart(Brunnenstube_Fassungsart.unbestimmt);
                }
                mappedObj.setName(srcObj.getName());
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebsart()));
                mappedObj.setTrinkwasser(mapNutzungsart2Trinkwasser(srcObj.getNutzungsart()));
                mappedObj.setErtrag_minimal(-1);
                mappedObj.setAufbereitung(JaNeinUnbestimmt.unbestimmt);
                mappedObj.setTechData(srcObj.getTechData());
                mappedObj.setNotwasserversorgung(mapNotversorgung2Notwasserversorgung(srcObj.getNotversorgung()));
                if(mappedObj.getattrvaluecount(Sammelschacht.tag_Notwasserversorgung)==0) {
                    mappedObj.setNotwasserversorgung(JaNeinUnbestimmt.unbestimmt);
                }
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGeometrieHerkunft(Herkunftsart.unbekannt);
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                sammelschacht2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(schieberschacht2oid.get(srcObj.getSchieberschacht()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                schieberschacht2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
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
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGrundlage(grundlage2oid.get(srcObj.getGrundlage()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                twturbine2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(null);
                mappedObj.setWeitereAnlage(twturbine2oid.get(srcObj.getTWTurbine()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                TWTurbine twturbine=(TWTurbine)mappedObjs.get(twturbine2oid.get(srcObj.getTWTurbine()));
                twturbine.setNameTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle(LegacyUtil.stripUUID(srcObj.getGUID()));
                // 20210924 keine Daten vorhanden
                throw new IllegalStateException("keine Uebergabestelle erwartet");
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter(LegacyUtil.stripUUID(srcObj.getGUID()));
                // 20211028 keine Daten vorhanden
                throw new IllegalStateException("keine Versorgungsperimeter erwartet");
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText) {
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
                mappedObj.setPos(LegacyUtil.mapCoord(srcObj.getPos()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setOri(srcObj.getOri());
                mappedObj.setHali(srcObj.getHAli());
                mappedObj.setVali(srcObj.getVAli());
                mappedObj.setSize(mapSizeType(srcObj.getSize()));
                Leitung leitung=(Leitung)mappedObjs.get(leitungsnetzwv2oid.get(srcObj.getLeitungsnetzWV()));
                leitung.setLeitTextPos(mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg) {
                // nur WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg(null);
                mappedObj.setLeitung(leitungsnetzwv2oid.get(srcObj.getLeitungsnetzWV()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                final Leitung leitung = (Leitung) mappedObjs.get(leitungsnetzwv2oid.get(srcObj.getLeitungsnetzWV()));
                final Wasserversorgung wasserversorgung = (Wasserversorgung) mappedObjs.get(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                leitung.setNetzteilident(LegacyUtil.mapNetzteilident(wasserversorgung.getNummer(),leitung.getFarbe()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(java.util.UUID.randomUUID().toString());
                mappedObj.setWVName(srcObj.getWVName());
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung.tag_Nummer)==1)mappedObj.setNummer(srcObj.getNummer());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                wasserversorgung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung) {
                // Hydro und WVA
                ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung srcObj=(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung)obj;
                String guid = srcObj.getGUID();
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(guid));
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+guid);
                mappedObj.setTyp(LeitungsArt.Quellwasserableitung);
                mappedObj.setGeometrie(LegacyUtil.mapPolyline(srcObj.getSymbolGeo()));
                mappedObj.setFarbe(mapFarbe(srcObj.getFarbe()));
                mappedObj.setLeitArt(Leitung_LeitArt.WVAFassungsleitung);
                if(mappedObj.getattrvaluecount(Leitung.tag_Nennweite)==0) {
                    mappedObj.setNennweite(-1.0);
                }
                mappedObj.setLeitText(srcObj.getLeitText());
                mappedObj.setErfGenauigkeit(mapWVAFassungsleitung_Genauigkeit(srcObj.getGenauigkeit()));
                mappedObj.setNetzteilident(LegacyUtil.mapNetzteilident(mappedObj.getFarbe()));
                mappedObj.setMaxDarst(mapDarstellung(srcObj.getMaxDarst()));
                mappedObj.setMutatDatum(LegacyUtil.mapDateFromITF(srcObj.getMutatDatum()));
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setGeometrieHerkunft(Herkunftsart.unbekannt);
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                wvafassungsleitung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else {
                logError("unexpected object TID="+obj.getobjectoid()+": "+obj.getobjecttag());
            }
        }else if(event instanceof EndTransferEvent) {
            mappingComplete=true;
        }
        
    }
    private void addEinzelFoerdermenge(Foerderanlage foerderanlage, int foerdermenge) {
        Zahlen zahlen = foerderanlage.getEinzelFoerdermenge();
        if(zahlen==null) {
            zahlen=new Zahlen();
            foerderanlage.setEinzelFoerdermenge(zahlen);
        }
        Zahl zahl=new Zahl();
        zahl.setZahl(foerdermenge);
        zahlen.addZahlen(zahl);
    }
    private void addCreatedObj(IomObject mappedObj) {
        events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
    }
    
    private void addMappedObj(IomObject mappedObj,IomObject srcObj) {
        String uuid=mappedObj.getobjectoid();
        if(uuid==null) {
            // link obj
        }else {
            if(uuid2srcObj.containsKey(uuid)){
                logDelayedError("duplicate UUID "+uuid+"; "+srcObj.toString()+"; "+uuid2srcObj.get(uuid));
            }else {
                uuid2srcObj.put(uuid, srcObj);
            }
            mappedObjs.put(uuid, mappedObj);
        }
        events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
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
    private SizeTyp mapSizeType(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.kleinst)) {
            return SizeTyp.kleinst;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.klein)) {
            return SizeTyp.klein;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.mittel)) {
            return SizeTyp.mittel;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.gross)) {
            return SizeTyp.gross;
        }else if(src.equals(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.unterdrueckt)) {
            return SizeTyp.unterdrueckt;
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
        if(!mappingComplete) {
            return null;
        }
        if(events.isEmpty()) {
            return null;
        }
        IoxEvent front=events.remove(0);
        IomObject ret=((ObjectEvent)front).getIomObject();
        if(ret instanceof Reservoir) {
            Reservoir reservoir=(Reservoir)ret;
            reservoir.setNetzteilident(LegacyUtil.mapNetzteilident(reservoir.getFarbe()));
        }
        return ret;
    }
    public static boolean isOnlyWvaObj(IomObject obj) {
        if(obj instanceof AnschriftNummer
        || obj instanceof Abgabestelle
        || obj instanceof WeitereAnlage
        || obj instanceof WeitereAnlageWasservsg
        || obj instanceof Hydrant
        || obj instanceof NotLeitung
        || obj instanceof Uebergabestelle
        || obj instanceof Aufbereitungswerk
        || obj instanceof Druckreduktion
        || obj instanceof Grundlage
        || obj instanceof Hilfslinie
        || obj instanceof NotLeitung
        || (obj instanceof Foerderanlage && !(obj instanceof OberflGewRohwaPW))
        || obj instanceof FoerderanlageWasservsg
        || obj instanceof ResWasservsg
        || obj instanceof Reservoir
        || obj instanceof Sammelschacht
        || obj instanceof Schieberschacht
        || obj instanceof TWTurbine
        || obj instanceof LeitWasservsg
        || obj instanceof Versorgungsperimeter) {
            return true;
        }
        if(obj instanceof Leitung) {
            Leitung leitung=(Leitung)obj;
            Leitung_LeitArt leitArt = leitung.getLeitArt();
            if(Leitung_LeitArt.LeitungsnetzWV.equals(leitArt) || Leitung_LeitArt.WVAFassungsleitung.equals(leitArt)) {
                return true;
            }
        }
        return false;
    }

}
