package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.ehi.basics.settings.Settings;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.*;
import ch.interlis.models.GRUNDWASSERAUSTRITTE_LV95_V1;
import ch.interlis.models.ZG_HYDROGEOLOGISCHEOBJEKTE_2_3;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsstrang_Stollen_Typ;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet;
import ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung_LeitArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht;

public class Kgdm2LegacyHydro {

    private Map<String,IomObject> mappedObjs=new HashMap<String,IomObject>();
    private String appName;
    private boolean collectObjects=false;
    private boolean mappingComplete=false;
    private long nextTid=1;
 
    private Map<String,String> wasserversorgung2tid=new HashMap<String,String>();
    private Map<String,String> pumpanlage2tid=new HashMap<String,String>();
    private Map<String,String> adresse2tid=new HashMap<String,String>();
    private Map<String,String> mutatperson2tid=new HashMap<String,String>();
    private Map<String,String> anreicherungsanlage2tid=new HashMap<String,String>();
    private Map<String,String> entnahmebrunnen2tid=new HashMap<String,String>();
    private Map<String,String> fassungseinzugsgebiet2tid=new HashMap<String,String>();
    private Map<String,String> oberflgewrohwapw2tid=new HashMap<String,String>();
    private Map<String,String> oberflaechengewfassung2tid=new HashMap<String,String>();
    private Map<String,String> quellschacht2tid=new HashMap<String,String>();
    //private Map<String,String> quellschacht2tid=new HashMap<String,String>();
    
    
    public Kgdm2LegacyHydro(Settings settings) {
        appName=settings.getValue(Converter.SETTING_APPNAME);

    }

    public void addInput(IoxEvent event) throws IoxException {
        if(event instanceof StartTransferEvent) {
        }else if(event instanceof StartBasketEvent) {
            if(((StartBasketEvent) event).getType().equals(ZG_HYDROGEO_WVA_V1.Wasserversorgung_Zug)) {
                collectObjects=true;
            }
        }else if(event instanceof ObjectEvent) {
            if(collectObjects) {
                IomObject iomObj=((ObjectEvent) event).getIomObject();
                if(false) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse(newTid());
                    mappedObj.setName(srcObj.getName()); 
                    mappedObj.setVorname(srcObj.getVorname()); 
                    mappedObj.setAdresse(srcObj.getAdresse());  
                    mappedObj.setPLZ(srcObj.getPLZ());  
                    mappedObj.setOrt(srcObj.getOrt());  
                    mappedObj.setTelefonP(srcObj.getTelefonP());  
                    mappedObj.setTelefonG(srcObj.getTelefonG()); 
                    mappedObj.setEmail(srcObj.getEmail());
                    adresse2tid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    IomObject lage=srcObj.getGeometriePunkt();
                    mappedObj.setLage(lage);
                    // TODO mappedObj.setTyp(mapAnreicherungsanlageTyp(srcObj.getTyp());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setBewilligungsdatum(LegacyUtil.mapDateToITF(srcObj.getBewilligungsdatum()));
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebsart()));
                    mappedObj.setAnreicherungsmenge((int)(srcObj.getMax_Versickerung()*1000.0));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getTyp_Bemerkung());
                    mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                    mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                    mappedObj.setLokalitaet(srcObj.getLokalitaet());
                    mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                    mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    // TODO mappedObj.setMutatPerson(mutatperson2tid.get(srcObj.getMutatPerson()));
                    anreicherungsanlage2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnrNrAfu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes) {

                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Flaeche) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Punkt) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BgwNrAfuIntranet) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitNrAfuIntranet) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setLage(srcObj.getGeometrie());
                    mappedObj.setTyp(mapEntnahmebrunnenTyp(srcObj.getEntnahmebrunnenTyp()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    mappedObj.setPrivaterNutzer(srcObj.getPrivatNutzer());
                    mappedObj.setBetriebArt(mapGrundwasserfassung_Nutzungszustand2BetriebArt(srcObj.getNutzungszustand()));
                    mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotwasserversorgung()));
                    final Double filterrohrDimension = srcObj.getDurchmesser();
                    mappedObj.setFilterrohrDimension(filterrohrDimension==null ? null : new Integer(filterrohrDimension.intValue()));
                    mappedObj.setTiefeTerrAbstich(srcObj.getTiefeTerrAbstich());
                    mappedObj.setWspHoeheTiefst(srcObj.getWspHoeheTiefst());
                    mappedObj.setK_Wert(srcObj.getK_Wert());
                    mappedObj.setWqualiBemerkung(mapWasserQualitaet(srcObj.getTrinkwasser()));
                    mappedObj.setSchzNr(srcObj.getSchzNr());
                    mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                    mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                    mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                    mappedObj.setSchzGutDatum(LegacyUtil.mapDateToITF(srcObj.getSchzGutDatum()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkung());
                    mappedObj.setAuskunftsStelle(srcObj.getAuskunftsstelle());
                    mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                    mappedObj.setLokalitaet(srcObj.getLokalitaet());
                    mappedObj.setHoeheTerrAbstich(srcObj.getHoeheTerrAbstich());
                    mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                    mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setPumpenAnlage(pumpanlage2oid.get(srcObj.getPumpenanlage()));
                    // TODO mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    entnahmebrunnen2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet(newTid());
                    mappedObj.setGUID(srcObj.getGUID());
                    IomObject geometrie=srcObj.getGeometrie();
                    mappedObj.setGeometrie(geometrie);
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                    mappedObj.setBewilligungsdatum(LegacyUtil.mapDateToITF(srcObj.getBewilligungsdatum()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
                    fassungseinzugsgebiet2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung)iomObj;
                    if(Leitung_LeitArt.OberflGewFsgLeitung.equals(srcObj.getLeitArt())){
                        ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung(newTid());
                        mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                        final IomObject geometrie = srcObj.getGeometrie();
                        if(geometrie!=null) {
                            mappedObj.setGeometrie(geometrie);
                        }
                        mappedObj.setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung_Typ.Fassungsleitung);
                        mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                        if(srcObj.getattrvaluecount(srcObj.tag_Nennweite)>0) {
                            mappedObj.setLtgDimension(srcObj.getNennweite());
                        }
                        mappedObj.setBemerkungen(srcObj.getBemerkung());
                        mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                        mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                        mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                        mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                        mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                        mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                        mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                        mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                        mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                        // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                        // TODO mappedObj.setOberflGewRohwaPW(oberflgewrohwapw2oid.get(srcObj.getOberflGewRohwPW()));
                        // TODO mappedObj.setOberflaechenGewFassung(oberflaechengewfassung2oid.get(srcObj.getOberflaechenGewFassung()));
                        addMappedObj(mappedObj,srcObj);
                    }

                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson(newTid());
                    mappedObj.setMutatPerson(srcObj.getMutatPerson());
                    mutatperson2tid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setTyp(mapOberflaeGewFassungTyp(srcObj.getFassungsart()));
                    mappedObj.setLage(srcObj.getGeometrie());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    mappedObj.setPrivaterNutzer(srcObj.getPrivatNutzer());
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebsart()));
                    mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotwasserversorgung()));
                    mappedObj.setTiefe(srcObj.getTiefe());
                    mappedObj.setSchzNr(srcObj.getSchzNr());
                    mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                    mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                    mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                    mappedObj.setSchzGutDatum(LegacyUtil.mapDateToITF(srcObj.getSchzGutDatum()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkung());
                    mappedObj.setAuskunftsStelle(srcObj.getAuskunftsstelle());
                    mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                    mappedObj.setLokalitaet(srcObj.getLokalitaet());
                    mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                    mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    mappedObj.setGewAbschnittCode(srcObj.getGewAbschnittCode());
                    mappedObj.setGewAbschnittKm(srcObj.getGewAbschnittKm());
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    oberflaechengewfassung2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW) { // instanceof Foerderanlage
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW_Typ.RohwasserPW);
                    mappedObj.setLage(srcObj.getGeometrie());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebsart()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkung());
                    mappedObj.setAuskunftsStelle(srcObj.getAuskunftsstelle());
                    mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                    mappedObj.setLokalitaet(srcObj.getLokalitaet());
                    mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                    mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    final ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart geometrieHerkunft = srcObj.getGeometrieHerkunft();
                    if(geometrieHerkunft!=null) {
                        mappedObj.setGeometrieHerkunft(mapHerkunftsart(geometrieHerkunft));
                    }
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setPumpenAnlage(pumpanlage2oid.get(srcObj.getPumpenanlage()));
                    // TODO mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    oberflgewrohwapw2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage) { 
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage(newTid());
                    mappedObj.setAnzahlPumpen(srcObj.getAnzahlPumpen());
                    mappedObj.setPumpmenge(srcObj.getPumpmenge());
                    mappedObj.setPumpenBetrieb(srcObj.getPumpenBetrieb());
                    pumpanlage2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe(newTid());
                    mappedObj.setPumpeNummer(srcObj.getPumpeNummer());
                    mappedObj.setFoerdermenge(srcObj.getFoerdermenge());
                    mappedObj.setMotorLeistung(srcObj.getMotorLeistung());
                    // TODO mappedObj.setPumpenanlage(pumpanlage2tid.get(srcObj.getPumpenAnlage()));
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht) { // instanceof Sammelschacht
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setLage(srcObj.getGeometrie());
                    final ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp typ = srcObj.getTyp();
                    if(typ!=null) {
                        mappedObj.setTyp(mapQWFSchachtTyp(typ));
                    }
                    mappedObj.setFassungsart(mapBrunnenstube_Fassungsart2QWFassungsArt(srcObj.getFassungsart()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    mappedObj.setPrivaterNutzer(srcObj.getPrivatNutzer());
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebsart()));
                    mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotwasserversorgung()));
                    if(srcObj.getattrvaluecount(srcObj.tag_Ertrag_minimal)>0) {
                        mappedObj.setSchuettmengeMin(srcObj.getErtrag_minimal());
                    }
                    mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                    mappedObj.setSchuettmengeMax(srcObj.getErtrag_maximal());
                    mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                    mappedObj.setSchuettmengeMittl(srcObj.getErtrag_mittel());
                    mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                    mappedObj.setWqualiBemerkung(mapWasserQualitaet(srcObj.getTrinkwasser()));
                    mappedObj.setSchzNr(srcObj.getSchzNr());
                    mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                    mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                    mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                    mappedObj.setSchzGutDatum(LegacyUtil.mapDateToITF(srcObj.getSchzGutDatum()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkung());
                    mappedObj.setAuskunftsStelle(srcObj.getAuskunftsstelle());
                    mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                    mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                    mappedObj.setLokalitaet(srcObj.getLokalitaet());
                    mappedObj.setHoeheTerrain(srcObj.getHoeheTerrain());
                    mappedObj.setHoeheAuslauf(srcObj.getHoeheAuslauf());
                    mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                    mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                    mappedObj.setDetailplanDatum(LegacyUtil.mapDateToITF(srcObj.getDetailplanDatum()));
                    mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                    mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                    mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                    mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                    final ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart geometrieHerkunft = srcObj.getGeometrieHerkunft();
                    if(geometrieHerkunft!=null) {
                        mappedObj.setGeometrieHerkunft(mapHerkunftsart(geometrieHerkunft));
                    }
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    quellschacht2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellScha_SaSchaText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt 
                        || iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung 
                        || iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerNrAfuIntranetPos) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerPerNameText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung(newTid());
                    mappedObj.setWVName(srcObj.getWVName());
                    wasserversorgung2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg) {
                }else {
                    throw new IllegalArgumentException();
                    
                }
                
                // TODO Verwendungszweck
                // TABLE AnranlWasservsg =
                // TABLE AnranlDatei =
                // TABLE AnrNrAfu_Intranet2Pos =
                // TABLE AnrNrAfu_Intranet5Pos =
                // TABLE EntbruWasservsg =
                // TABLE EntbruVerZweck =
                // TABLE EntbruBewiReg
                // TABLE EntbruZsBeZu =
                // TABLE EntbruGWSZone =
                // TABLE EntbruGSBAoTw =
                // TABLE GwfNrAfu_Intranet2Pos =
                // TABLE GwfNrAfu_Intranet5Pos =
                // TABLE EntbruDatei =
                // TABLE FassgebWasservsg =
                // TABLE ObFasVerZweck =
                // TABLE ObFasWasservsg =
                // TABLE ObFasBewiReg =
                // TABLE ObFasZsBeZu =
                // TABLE ObFasGSBAoTw =
                // TABLE ObFasGWSZone =
                // TABLE OwfNrAfu_Intranet2Pos =
                // TABLE OwfNrAfu_Intranet5Pos =
                
            }
        }else if(event instanceof EndBasketEvent) {
            if(collectObjects) {
                collectObjects=false;
            }
        }else if(event instanceof EndTransferEvent) {
            mappingComplete=true;
        }
        return;
    }
    private QWFassungsArt mapBrunnenstube_Fassungsart2QWFassungsArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart src) {
       if(src==null) {
           return null;
       }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart.Brunnenstube)) {
           return QWFassungsArt.Felsspalt;
       }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart.Quellschacht)) {
           return QWFassungsArt.Schacht;
       }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart.Sammelschacht)) {
           return QWFassungsArt.Sickerleitung;
       }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart.unbestimmt)) {
           return QWFassungsArt.unbekannt;
       }
       throw new IllegalArgumentException();
    }

    private QWFSchachtTyp mapQWFSchachtTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return QWFSchachtTyp.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp.toXmlCode(src));
    }

    private ErtragAngaben mapErtragAngaben(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return ErtragAngaben.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(src));
    }

    private OberflaeGewFassungTyp mapOberflaeGewFassungTyp(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart.Seewasserfassung)) {
            return OberflaeGewFassungTyp.Seewasserfassung;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart.Fliessgewaesserfassung)){
            return OberflaeGewFassungTyp.Fliessgewaesserfassung;
        }
        throw new IllegalArgumentException();
    }

    private BetriebArt mapGrundwasserfassung_Nutzungszustand2BetriebArt(
            ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.genutzt)) {
            return BetriebArt.in_Betrieb;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.aufgehoben)) {
            return BetriebArt.stillgelegt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.ungenutzt)) {
            return BetriebArt.ungenutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.unbestimmt)) {
            return BetriebArt.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private Notversorgung mapNotversorgung(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.nein)) {
            return Notversorgung.nicht_geeignet;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.ja)) {
            return Notversorgung.nur_Notversorgung;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.unbestimmt)) {
            return Notversorgung.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private BOOLEAN_Typ mapBOOLEAN_Typ(Boolean src) {
        if(src==null) {
            return null;
        }else if(src==true) {
            return BOOLEAN_Typ.ja;
        }else if(src==false) {
            return BOOLEAN_Typ.nein;
        }
        throw new IllegalArgumentException();
    }

    private WasserQualitaet mapWasserQualitaet(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.ja)) {
            return WasserQualitaet.ohne_Aufbereitung_als_Trinkwasser_nutzbar;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.nein)) {
            return WasserQualitaet.kein_Trinkwasser;
        }
        throw new IllegalArgumentException();
    }

    private EigentumArt mapEigentumArt(ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return EigentumArt.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.toXmlCode(src));
    }

    private EntnahmebrunnenTyp mapEntnahmebrunnenTyp(
            ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.einfacheGWFassung)) {
            return EntnahmebrunnenTyp.einfacheGWFassung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.HorizontalfilterBrunnen)){
            return EntnahmebrunnenTyp.HorizontalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.VertikalfilterBrunnen)){
            return EntnahmebrunnenTyp.VertikalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.Sodbrunnen)){
            return EntnahmebrunnenTyp.Sodbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.Rohr)){
            return EntnahmebrunnenTyp.Rohr;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.andere)){
            return EntnahmebrunnenTyp.andere;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.unbekannt)){
            return EntnahmebrunnenTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private ErfVorlBemerk mapErfVorlBemerk(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.GPS_0_01m)) {
            return ErfVorlBemerk.GPS_0_01m;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.GPS_0_10m)) {
            return ErfVorlBemerk.GPS_0_10m;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.GPS_1_00m)) {
            return ErfVorlBemerk.GPS_1_00m;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.Grundbuchplan_Papier)) {
            return ErfVorlBemerk.Grundbuchplan_Papier;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.keine_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.keine_Einpassmoeglichkeit;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.nach_muendlicher_Angabe)) {
            return ErfVorlBemerk.nach_muendlicher_Angabe;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.Schematisch)) {
            return ErfVorlBemerk.schematisch;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.schlechte_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.schlechte_Einpassmoeglichkeit;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung)) {
            return ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.Vorlage_unzuverlaessig)) {
            return ErfVorlBemerk.Vorlage_unzuverlaessig;
        }
        throw new IllegalArgumentException();
    }

    private Herkunftsart mapHerkunftsart(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.Aufnahme)) {
            return Herkunftsart.Aufnahme;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.UebernahmeKoordinaten)) {
            return Herkunftsart.UebernahmeKoordinaten;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.Planabgriff)) {
            return Herkunftsart.Planabgriff;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.konstruktiv)) {
            return Herkunftsart.konstruktiv;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.geschaetzt)) {
            return Herkunftsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.unbekannt)) {
            return Herkunftsart.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.andere)) {
            return Herkunftsart.andere;
        }
        throw new IllegalArgumentException();
    }

    private ErfGenauigkeit mapErfGenauigkeit(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return ErfGenauigkeit.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.toXmlCode(src));
    }

    private ErfVorlHerkunft mapErfVorlHerkunft(
            ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.Amt_fuer_Umwelt)) {
            return ErfVorlHerkunft.Amt_fuer_Umweltschutz;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.Amt_fuer_Grundbuch_und_Geoinformation)) {
            return ErfVorlHerkunft.Kant_Vermessungsamt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.privater_Betreiber)) {
            return ErfVorlHerkunft.privater_Betreiber;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.Schutzzonen_Bearbeiter)) {
            return ErfVorlHerkunft.Schutzzonen_Bearbeiter;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.Wasserversorgung)) {
            return ErfVorlHerkunft.Wasserversorgung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.Eigentuemer)) {
            return ErfVorlHerkunft.Eigentuemer;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.unbekannt)) {
            return ErfVorlHerkunft.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.andere)) {
            return ErfVorlHerkunft.andere;
        }
        throw new IllegalArgumentException();
    }

    private DetailplanMstab mapDetailplanMstab(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return DetailplanMstab.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.toXmlCode(src));
    }

    private DetailplanArt mapDetailplanArt(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return DetailplanArt.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.toXmlCode(src));
    }

    private Kanton mapKanton(ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return Kanton.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.toXmlCode(src));
    }

    private BetriebArt mapBetriebsArt(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.in_Betrieb)) {
            return BetriebArt.in_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.ausser_Betrieb)) {
            return BetriebArt.ausser_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.stillgelegt)) {
            return BetriebArt.stillgelegt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.ungenutzt)) {
            return BetriebArt.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.zerstoert)) {
            return BetriebArt.zerstoert;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt)) {
            return BetriebArt.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.im_Verwurf)) {
            return BetriebArt.im_Verwurf;
        }
        throw new IllegalArgumentException();
    }
    private Fassungsstrang_Stollen_Typ mapSammeleinrichtung_Typ(Sammeleinrichtung_Typ typ) {
        // Werteliste ist identisch
        return Fassungsstrang_Stollen_Typ.parseXmlCode(Sammeleinrichtung_Typ.toXmlCode(typ));
    }

    private String stripZG(String src) {
        if(src.startsWith(LegacyUtil.ZG_PREFIX)) {
            return src.substring(LegacyUtil.ZG_PREFIX.length());
        }
        return src;
    }
    
    private String newTid() {
        return Long.toString(nextTid++);
    }


    private void addMappedObj(IomObject mappedObj,IomObject srcObj) {
        String tid=mappedObj.getobjectoid();
        mappedObjs.put(tid, mappedObj);
        addAnchorObj(mappedObj);
    }
    private void addAnchorObj(IomObject mappedObj) {
        String uuid=mappedObj.getobjectoid();
        if(uuid!=null) {
        }
    }
    private IomObject getMappedObject() {
        if(mappingComplete) {
            if(!mappedObjs.isEmpty()) {
                return mappedObjs.remove(mappedObjs.keySet().iterator().next());
            }
        }
        return null;
    }
    private IoxEvent lastEvent=null;
    public IoxEvent getMappedEvent() {
        if(lastEvent==null) {
            if(mappingComplete) {
                lastEvent=new ch.interlis.iox_j.StartTransferEvent(appName);
            }
        }else if(lastEvent instanceof ch.interlis.iox_j.StartTransferEvent) {
            lastEvent=new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEOLOGISCHEOBJEKTE_2_3.HydrogeologischeObjekte,"b1");
        }else if(lastEvent instanceof ch.interlis.iox_j.StartBasketEvent
                || lastEvent instanceof ch.interlis.iox_j.ObjectEvent) {
            IomObject mappedObj=getMappedObject();
            if(mappedObj!=null) {
                lastEvent=new ch.interlis.iox_j.ObjectEvent(mappedObj);
            }else {
                lastEvent=new ch.interlis.iox_j.EndBasketEvent();
            }
        }else if(lastEvent instanceof ch.interlis.iox_j.EndBasketEvent) {
            lastEvent=new ch.interlis.iox_j.EndTransferEvent();
        }else if(lastEvent instanceof ch.interlis.iox_j.EndTransferEvent) {
            return null;
        }
        return lastEvent;
    }

}
