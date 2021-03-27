package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.Iom_jObject;
import ch.interlis.iox.EndTransferEvent;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.iox.StartBasketEvent;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand;
import ch.interlis.models.ZG_hydrogeo_wva_V1.*;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.*;

public class LegacyHydro2kgdm  {
    
    private Map<String,IomObject> readObjs=new HashMap<String,IomObject>();
    private List<IomObject> readOnlyWvaObjs=new ArrayList<IomObject>();
    private Map<String,Wasserversorgung> readWasserversorgung=new HashMap<String,Wasserversorgung>();
    private Map<AdressKey,Adresse> readAdresse=new HashMap<AdressKey,Adresse>();
    private Map<String,MutatPerson> readMutatPerson=new HashMap<String,MutatPerson>();
    private Map<String,FoerderanlageAufbereitungswerk> readFoerderanlageAufbereitungswerk=new HashMap<String,FoerderanlageAufbereitungswerk>();
    private List<QueSchaFoerderanlage> readQueSchaFoerderanlage=new ArrayList<QueSchaFoerderanlage>();
    private List<QueSchaRes> readQueSchaRes=new ArrayList<QueSchaRes>();
    private List<QueSchaSaScha> readQueSchaSaScha=new ArrayList<QueSchaSaScha>();

    private Map<String,Foerderanlage> mappedFoerderanlage=new HashMap<String,Foerderanlage>();
    private Map<String,Quellschacht> mappedQuellschacht=new HashMap<String,Quellschacht>();
    private Map<String,Sammelschacht> mappedSammelschacht=new HashMap<String,Sammelschacht>();
    private Map<String,Reservoir> mappedReservoir=new HashMap<String,Reservoir>();
    
    private Map<String,IomObject> mappedObjs=new HashMap<String,IomObject>();
    private List<IomObject> mappedLinkObjs=new ArrayList<IomObject>();
    private Map<String,IomObject> uuid2srcObj=new HashMap<String,IomObject>();
    
    
    private Map<String,String> adresse2oid=new HashMap<String,String>();
    private Map<String,String> abwaeinleit2oid=new HashMap<String,String>();
    private Map<String,String> anreicherungsanlage2oid=new HashMap<String,String>();
    private Map<String,String> bautengw2oid=new HashMap<String,String>();
    private Map<String,String> entnahmebrunnen2oid=new HashMap<String,String>();
    private Map<String,String> fassungseinzugsgebiet2oid=new HashMap<String,String>();
    private Map<String,String> mutatperson2oid=new HashMap<String,String>();
    private Map<String,String> oberflgewrohwapw2oid=new HashMap<String,String>();
    private Map<String,String> oberflaechengewfassung2oid=new HashMap<String,String>();
    private Map<String,String> pumpanlage2oid=new HashMap<String,String>();
    private Map<String,String> quellschacht2oid=new HashMap<String,String>();
    private Map<String,String> qwfsgendpunkt2oid=new HashMap<String,String>();
    private Map<String,String> rueckgabebrunnen2oid=new HashMap<String,String>();
    private Map<String,String> saubwaeinleit2oid=new HashMap<String,String>();
    private Map<String,String> versickerungsanlage2oid=new HashMap<String,String>();
    private Map<String,ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck> verwendungszwecke=new HashMap<String,ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck>();
    private Map<String,String> wasserversorgung2oid=new HashMap<String,String>();
    private boolean mappingComplete=false;
    private boolean isHydrogeo=false;
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
            if(obj.getobjecttag().startsWith(ZG_HYDROGEO_WVA_V1.Wasserversorgung_Zug)) {
                if(LegacyWva2kgdm.isOnlyWvaObj(obj)) {
                    // "nur WVA"-Objekte merken, damit sie nicht verlorengehen
                    addWvaObj(obj);
                }else {
                    String uuid=obj.getobjectoid();
                    if(obj instanceof Wasserversorgung) {
                        Wasserversorgung srcObj=(Wasserversorgung)obj;
                        readWasserversorgung.put(srcObj.getWVName(),srcObj);
                    }else if(obj instanceof MutatPerson) {
                        MutatPerson srcObj=(MutatPerson)obj;
                        readMutatPerson.put(srcObj.getMutatPerson(),srcObj);
                    }else if(obj instanceof Adresse) {
                        Adresse srcObj=(Adresse)obj;
                        readAdresse.put(new AdressKey(srcObj),srcObj);
                    }else if(obj instanceof FoerderanlageAufbereitungswerk) {
                        readFoerderanlageAufbereitungswerk.put(((FoerderanlageAufbereitungswerk) obj).getFoerderanlage(),(FoerderanlageAufbereitungswerk)obj);
                    }else if(obj instanceof QueSchaFoerderanlage) {
                        readQueSchaFoerderanlage.add((QueSchaFoerderanlage)obj);
                    }else if(obj instanceof QueSchaRes) {
                        readQueSchaRes.add((QueSchaRes)obj);
                    }else if(obj instanceof QueSchaSaScha) {
                        readQueSchaSaScha.add((QueSchaSaScha)obj);
                    }else if(uuid!=null) {
                        readObjs.put(uuid, obj);
                    }else {
                        // andere Linkobjekte ignorieren
                        // entweder es gibt die Beziehung noch, dann entsteht sie wieder
                        // oder es gibt sie nicht mehr, dann muss sie geloescht werden und 
                        // kann hier somit ignoriert werden
                    }
                }
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                AbWaEinleit mappedObj=(AbWaEinleit)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new AbWaEinleit(uuid);
                }
                mappedObj.setGUID(srcObj.getGUID());
                mappedObj.setLage(srcObj.getLage());
                mappedObj.setTyp(mapAbWaEinleitTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBetriebArt(mapBetriebArt(srcObj.getBetriebArt()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                abwaeinleit2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse mappedObj=readAdresse.get(new AdressKey(srcObj.getName(),srcObj.getVorname(),srcObj.getAdresse(),srcObj.getPLZ()));
                if(mappedObj==null) {
                    String uuid=LegacyUtil.newUUID();
                    mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse(uuid);
                }
                mappedObj.setName(srcObj.getName()); 
                mappedObj.setVorname(srcObj.getVorname()); 
                mappedObj.setAdresse(srcObj.getAdresse());  
                mappedObj.setPLZ(srcObj.getPLZ());  
                mappedObj.setOrt(srcObj.getOrt());  
                mappedObj.setTelefonP(srcObj.getTelefonP());  
                mappedObj.setTelefonG(srcObj.getTelefonG()); 
                mappedObj.setEmail(srcObj.getEmail());
                adresse2oid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                // not yet mapped?
                IomObject exstObj = mappedObjs.get(mappedObj.getobjectoid());
                if(exstObj==null) {
                    addMappedObj(mappedObj,srcObj);
                }else if(!(exstObj instanceof Adresse)) {
                    logError("Adresse expected but other type found "+exstObj.toString());
                }
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Anreicherungsanlage mappedObj=(Anreicherungsanlage)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Anreicherungsanlage(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                IomObject lage=srcObj.getLage();
                mappedObj.setGeometriePunkt(lage);
                // TODO mappedObj.setTyp(mapAnreicherungsanlageTyp(srcObj.getTyp());
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBewilligungsdatum(LegacyUtil.mapDateFromITF(srcObj.getBewilligungsdatum()));
                mappedObj.setBetriebsart(mapBetriebArt(srcObj.getBetriebArt()));
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage.tag_Anreicherungsmenge)>0) {
                    mappedObj.setMax_Versickerung(srcObj.getAnreicherungsmenge()/1000.0);
                }
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setTyp_Bemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                anreicherungsanlage2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                BautenGW_Punkt mappedObj=(BautenGW_Punkt)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new BautenGW_Punkt(uuid);
                }
                mappedObj.setGUID(srcObj.getGUID());
                mappedObj.setLage(srcObj.getLage());
                mappedObj.setTyp(mapBauenGWTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontakPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                bautengw2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche)obj;
                // change BautenGW_Punkt to BautenGW_Flaeche
                IomObject mappedObj=new Iom_jObject(mappedObjs.get(bautengw2oid.get(srcObj.getBautenGW())));
                mappedObj.setobjecttag(BautenGW_Flaeche.tag);
                mappedObj.changeattrobj(BautenGW_Flaeche.tag_Lage, 0, srcObj.getGeometrie());
                mappedObjs.put(mappedObj.getobjectoid(), mappedObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu(null);
                mappedObj.setEntbru(srcObj.getEntbruGUID());
                mappedObj.setGSBAoTw_ZsBeZu(srcObj.getGSBAoTwGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone(null);
                mappedObj.setEntbru(srcObj.getEntbruGUID());
                mappedObj.setGWSZone(srcObj.getGWSZoneGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck)obj;
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck verwendungszweck=verwendungszwecke.get(srcObj.getVerwendungszweck());
                HilfsText text=new HilfsText();
                text.setText(verwendungszweck.getZweck());
                Entnahmebrunnen entnahmebrunnen=(Entnahmebrunnen)mappedObjs.get(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                Texte texte=entnahmebrunnen.getVerwendungszweck();
                if(texte==null) {
                    texte=new Texte();
                    entnahmebrunnen.setVerwendungszweck(texte);
                }
                texte.addTexte(text);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg(null);
                mappedObj.setEntnahmebrunnen(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu(null);
                mappedObj.setEntbru(srcObj.getEntbruGUID());
                mappedObj.setGSBAoTw_ZsBeZu(srcObj.getZsBeZuGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Entnahmebrunnen mappedObj=(Entnahmebrunnen)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Entnahmebrunnen(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setEntnahmebrunnenTyp(mapEntnahmebrunnenTyp(srcObj.getTyp()));
                mappedObj.setFoerdermethode(Entnahmebrunnen_Foerdermethode.unbestimmt);
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                mappedObj.setNutzungszustand(mapBetriebArt2Grundwasserfassung_Nutzungszustand(srcObj.getBetriebArt()));
                mappedObj.setNotwasserversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                final Integer filterrohrDimension = srcObj.getFilterrohrDimension();
                mappedObj.setDurchmesser(filterrohrDimension==null ? null : new Double(filterrohrDimension));
                mappedObj.setTiefeTerrAbstich(srcObj.getTiefeTerrAbstich());
                mappedObj.setWspHoeheTiefst(srcObj.getWspHoeheTiefst());
                mappedObj.setK_Wert(srcObj.getK_Wert());
                mappedObj.setTrinkwasser(mapWasserQualitaet(srcObj.getWqualiBemerkung()));
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDateFromITF(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setHoeheTerrAbstich(srcObj.getHoeheTerrAbstich());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setPumpenAnlage(pumpanlage2oid.get(srcObj.getPumpenanlage()));
                mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                entnahmebrunnen2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Fassungseinzugsgebiet mappedObj=(Fassungseinzugsgebiet)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Fassungseinzugsgebiet(uuid);
                }
                mappedObj.setGUID(srcObj.getGUID());
                IomObject geometrie=srcObj.getattrobj(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet.tag_Geometrie, 0);
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet.tag_Geometrie, geometrie);
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setBewilligungsdatum(LegacyUtil.mapDateFromITF(srcObj.getBewilligungsdatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                fassungseinzugsgebiet2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson)obj;
                MutatPerson mappedObj=readMutatPerson.get(srcObj.getMutatPerson());
                if(mappedObj==null) {
                    String uuid=LegacyUtil.newUUID();
                    mappedObj=new MutatPerson(uuid);
                }
                mappedObj.setMutatPerson(srcObj.getMutatPerson()); 
                mutatperson2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu(null);
                mappedObj.setObFas(srcObj.getObGewFasGUID());
                mappedObj.setGSBAoTw_ZsBeZu(srcObj.getGSBAoTwGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck)obj;
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck verwendungszweck=verwendungszwecke.get(srcObj.getVerwendungszweck());
                HilfsText text=new HilfsText();
                text.setText(verwendungszweck.getZweck());
                String oid=oberflaechengewfassung2oid.get(srcObj.getOberflaechenGewFassung());
                IomObject destObj=mappedObjs.get(oid);
                if(!(destObj instanceof OberflaechenGewFassung)) {
                    logDelayedError("unerwartetes Objekt (OberflaechenGewFassung erwartet) "+destObj.toString());
                }else {
                    OberflaechenGewFassung oberflaechengewfassung=(OberflaechenGewFassung)destObj;
                    Texte texte=oberflaechengewfassung.getVerwendungszweck();
                    if(texte==null) {
                        texte=new Texte();
                        oberflaechengewfassung.setVerwendungszweck(texte);
                    }
                    texte.addTexte(text);
                }
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg(null);
                mappedObj.setOberflGewFassung(oberflaechengewfassung2oid.get(srcObj.getOberflaechenGewFassung()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Leitung mappedObj=(Leitung)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Leitung(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                final IomObject geometrie = srcObj.getGeometrie();
                if(geometrie!=null) {
                    mappedObj.setGeometrie(geometrie);
                }
                mappedObj.setTyp(LeitungsArt.Versorgungsleitung);
                mappedObj.setLeitArt(Leitung_LeitArt.OberflGewFsgLeitung);
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                final Double ltgDimension = srcObj.getLtgDimension();
                if(ltgDimension!=null) {
                    mappedObj.setNennweite(ltgDimension);
                }
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setOberflGewRohwaPW(oberflgewrohwapw2oid.get(srcObj.getOberflGewRohwPW()));
                mappedObj.setOberflaechenGewFassung(oberflaechengewfassung2oid.get(srcObj.getOberflaechenGewFassung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                OberflGewRohwaPW mappedObj=(OberflGewRohwaPW)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new OberflGewRohwaPW(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setName(srcObj.getName());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setBetriebsart(mapBetriebArt(srcObj.getBetriebArt()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setPumpenAnlage(pumpanlage2oid.get(srcObj.getPumpenanlage()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                oberflgewrohwapw2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
                // FoerderanlageAufbereitungswerk in Ausgabe auch uebertragen
                FoerderanlageAufbereitungswerk f2a=readFoerderanlageAufbereitungswerk.get(mappedObj.getobjectoid());
                if(f2a!=null) {
                    addWvaObj(f2a);
                }
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                OberflaechenGewFassung mappedObj=(OberflaechenGewFassung)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new OberflaechenGewFassung(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setFassungsart(mapOberflaeGewFassungTyp(srcObj.getTyp()));
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                mappedObj.setBetriebsart(mapBetriebArt(srcObj.getBetriebArt()));
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung notversorgung = srcObj.getNotversorgung();
                if(notversorgung!=null) {
                    mappedObj.setNotwasserversorgung(mapNotversorgung(notversorgung));
                }
                mappedObj.setTiefe(srcObj.getTiefe());
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDateFromITF(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setGewAbschnittCode(srcObj.getGewAbschnittCode());
                mappedObj.setGewAbschnittKm(srcObj.getGewAbschnittKm());
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                oberflaechengewfassung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe)obj;
                String uuid=LegacyUtil.newUUID();
                // TODO merge?
                Pumpe mappedObj=new Pumpe(uuid);
                mappedObj.setPumpeNummer(srcObj.getPumpeNummer());
                mappedObj.setFoerdermenge(srcObj.getFoerdermenge());
                mappedObj.setMotorLeistung(srcObj.getMotorLeistung());
                mappedObj.setPumpenAnlage(pumpanlage2oid.get(srcObj.getPumpenanlage()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage)obj;
                String uuid=LegacyUtil.newUUID();
                // TODO merge?
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage(uuid);
                mappedObj.setAnzahlPumpen(srcObj.getAnzahlPumpen());
                mappedObj.setPumpmenge(srcObj.getPumpmenge());
                mappedObj.setPumpenBetrieb(srcObj.getPumpenBetrieb());
                pumpanlage2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu(null);
                mappedObj.setQuellSch(srcObj.getQuellSchGUID());
                mappedObj.setGSBAoTw_ZsBeZu(srcObj.getGSBAoTwGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone(null);
                mappedObj.setQuellSch(srcObj.getQuellSchGUID());
                mappedObj.setGWSZone(srcObj.getGWSZoneGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck)obj;
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck verwendungszweck=verwendungszwecke.get(srcObj.getVerwendungszweck());
                HilfsText text=new HilfsText();
                text.setText(verwendungszweck.getZweck());
                Quellschacht quellschacht=(Quellschacht)mappedObjs.get(quellschacht2oid.get(srcObj.getQuellschacht()));
                Texte texte=quellschacht.getVerwendungszweck();
                if(texte==null) {
                    texte=new Texte();
                    quellschacht.setVerwendungszweck(texte);
                }
                texte.addTexte(text);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg(null);
                mappedObj.setQuellschacht(quellschacht2oid.get(srcObj.getQuellschacht()));
                mappedObj.setWasserversorgung(wasserversorgung2oid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu(null);
                mappedObj.setQuellSch(srcObj.getQuellSchGUID());
                mappedObj.setGSBAoTw_ZsBeZu(srcObj.getZsBeZuGUID());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Quellschacht mappedObj=(Quellschacht)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Quellschacht(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp typ = srcObj.getTyp();
                if(typ!=null) {
                    mappedObj.setTyp(mapQWFSchachtTyp(typ));
                }
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt fassungsart = srcObj.getFassungsart();
                if(fassungsart!=null) {
                    mappedObj.setFassungsart(mapQWFassungsArt2Brunnenstube_Fassungsart(fassungsart));
                    mappedObj.setQWFassungsArt(mapQWFassungsArt(fassungsart));
                }
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                mappedObj.setBetriebsart(mapBetriebArt(srcObj.getBetriebArt()));
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung notversorgung = srcObj.getNotversorgung();
                if(notversorgung!=null) {
                    mappedObj.setNotwasserversorgung(mapNotversorgung(notversorgung));
                }
                final Integer schuettmengeMin = srcObj.getSchuettmengeMin();
                if(schuettmengeMin!=null) {
                    mappedObj.setErtrag_minimal(schuettmengeMin);
                }
                mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                mappedObj.setErtrag_maximal(srcObj.getSchuettmengeMax());
                mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                mappedObj.setErtrag_mittel(srcObj.getSchuettmengeMittl());
                mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                mappedObj.setTrinkwasser(mapWasserQualitaet(srcObj.getWqualiBemerkung()));
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDateFromITF(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setHoeheTerrain(srcObj.getHoeheTerrain());
                mappedObj.setHoeheAuslauf(srcObj.getHoeheAuslauf());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                quellschacht2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                QwFsgEndpunkt mappedObj=(QwFsgEndpunkt)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new QwFsgEndpunkt(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setFassungsart(mapQWFassungsArt2Quelle_Fassungsart(srcObj.getFassungsart()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjektNummer(srcObj.getObjektNummer());
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                mappedObj.setNutzungszustand(mapBetriebArt2Quelle_Nutzungszustand(srcObj.getBetriebArt()));
                mappedObj.setNotwasserversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                final Integer schuettmengeMin = srcObj.getSchuettmengeMin();
                mappedObj.setSchuettung_minimal(schuettmengeMin==null ? -1 : schuettmengeMin);
                mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                mappedObj.setSchuettung_maximal(srcObj.getSchuettmengeMax());
                mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                mappedObj.setSchuettung_mittel(srcObj.getSchuettmengeMittl());
                mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                mappedObj.setTrinkwasser(mapWasserQualitaet(srcObj.getWqualiBemerkung()));
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDateFromITF(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setHoeheTerrain(srcObj.getHoeheTerrain()); 
                mappedObj.setHoeheAuslauf(srcObj.getHoeheAuslauf()); 
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setQuellschacht(quellschacht2oid.get(srcObj.getQuellschacht()));
                mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                qwfsgendpunkt2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Leitung mappedObj=(Leitung)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Leitung(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                final IomObject geometrie = srcObj.getGeometrie();
                if(geometrie!=null) {
                    mappedObj.setGeometrie(geometrie);
                }
                mappedObj.setTyp(mapRueckgabeLeitungTyp(srcObj.getTyp()));
                mappedObj.setLeitArt(Leitung_LeitArt.RueckgabeLeitung);
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                final Double ltgDimension = srcObj.getLtgDimension();
                if(ltgDimension!=null) {
                    mappedObj.setNennweite(ltgDimension);
                }
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart geometrieHerkunft = srcObj.getGeometrieHerkunft();
                if(geometrieHerkunft!=null) {
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(geometrieHerkunft));
                }
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Rueckgabebrunnen mappedObj=(Rueckgabebrunnen)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Rueckgabebrunnen(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt betriebArt = srcObj.getBetriebArt();
                mappedObj.setBetriebsArt(mapBetriebArt(betriebArt));
                if(betriebArt==null) {
                    mappedObj.setNutzungszustand(Rueckgabebrunnen_Nutzungszustand.unbestimmt);
                }else {
                    mappedObj.setNutzungszustand(mapBetriebArt2Rueckgabebrunnen_Nutzungszustand(betriebArt));
                }
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                rueckgabebrunnen2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Sammeleinrichtung mappedObj=(Sammeleinrichtung)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Sammeleinrichtung(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Gwf);
                IomObject geom=srcObj.getGeometrie();
                mappedObj.setGeometrie(geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp2mapSammeleinrichtung_Typ(srcObj.getTyp()));
                mappedObj.setSammeleinrichtungTyp(mapSammeleinrichtungTyp(srcObj.getTyp()));
                mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                mappedObj.setLtgDimension(srcObj.getLtgDimension());
                mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                addMappedObj(mappedObj,srcObj);
                SammeleinrichtungEntBru sammeleinrichtungEntBru=new SammeleinrichtungEntBru(null);
                sammeleinrichtungEntBru.setEntnahmebrunnen(entnahmebrunnen2oid.get(srcObj.getEntnahmebrunnen()));
                sammeleinrichtungEntBru.setSammeleinrichtung(mappedObj.getobjectoid());
                addCreatedObj(sammeleinrichtungEntBru);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                SammeleinrichtungQwf mappedObj=(SammeleinrichtungQwf)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new SammeleinrichtungQwf(uuid);
                }
                mappedObj.setIdentifikator(LegacyUtil.ZG_PREFIX+srcObj.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Qwf);
                IomObject geom=srcObj.getGeometrie();
                mappedObj.setGeometrie(geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp2mapSammeleinrichtung_Typ(srcObj.getTyp()));
                mappedObj.setSammeleinrichtungTyp(mapSammeleinrichtungTyp(srcObj.getTyp()));
                mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                mappedObj.setLtgDimension(srcObj.getLtgDimension());
                mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                mappedObj.setBetriebsArt(mapBetriebArt(srcObj.getBetriebArt()));
                mappedObj.setSchuettmengeMin(srcObj.getSchuettmengeMin());
                mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                mappedObj.setSchuettmengeMax(srcObj.getSchuettmengeMax());
                mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                mappedObj.setSchuettmengeMittl(srcObj.getSchuettmengeMittl());
                mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setQuellschacht(quellschacht2oid.get(srcObj.getQuellschacht()));
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                SaubWaEinleit mappedObj=(SaubWaEinleit)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new SaubWaEinleit(uuid);
                }
                mappedObj.setGUID(srcObj.getGUID());
                mappedObj.setLage(srcObj.getLage());
                mappedObj.setTyp(mapSaubWaEinleitTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBetriebArt(mapBetriebArt(srcObj.getBetriebArt()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                saubwaeinleit2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg){
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage)obj;
                final String uuid = LegacyUtil.stripUUID(srcObj.getGUID());
                Versickerungsanlage mappedObj=(Versickerungsanlage)readObjs.get(uuid);
                if(mappedObj==null) {
                    mappedObj=new Versickerungsanlage(uuid);
                }
                mappedObj.setGUID(srcObj.getGUID());
                mappedObj.setLage(srcObj.getLage());
                mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                mappedObj.setArt(mapVersickerungArt(srcObj.getArt()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBetriebsArt(mapBetriebArt(srcObj.getBetriebArt()));
                mappedObj.setQualitaet(mapVersickerungsanlage_Qualitaet(srcObj.getQualitaet()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateFromITF(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDateFromITF(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDateFromITF(srcObj.getKontaktDatum()));
                mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                versickerungsanlage2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck){
                // nur Hydro
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck)obj;
                verwendungszwecke.put(srcObj.getobjectoid(),srcObj);
                // als Strukturattribut bei den einzelnen Klassen abbilden
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung){
                // Hydro und WVA
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=readWasserversorgung.get(srcObj.getWVName());
                if(mappedObj==null) {
                    mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(LegacyUtil.newUUID());
                }
                mappedObj.setWVName(srcObj.getWVName());
                wasserversorgung2oid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                addMappedObj(mappedObj,srcObj);
            }
        }else if(event instanceof StartBasketEvent) {
            if(((StartBasketEvent) event).getType().equals(ch.interlis.models.ZG_HYDROGEOLOGISCHEOBJEKTE_2_3.HydrogeologischeObjekte)) {
                isHydrogeo=true;
            }
        }else if(event instanceof EndTransferEvent) {
            if(isHydrogeo) {
                mappingComplete=true;
            }
        }
        
    }
    private Oberflaechengewaesserfassung_Fassungsart mapOberflaeGewFassungTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp.Seewasserfassung)) {
            return Oberflaechengewaesserfassung_Fassungsart.Seewasserfassung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp.Fliessgewaesserfassung)){
            return Oberflaechengewaesserfassung_Fassungsart.Fliessgewaesserfassung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp.andere)){
            return null;
        }
        throw new IllegalArgumentException();
    }
    private Brunnenstube_Fassungsart mapQWFassungsArt2Brunnenstube_Fassungsart(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Schacht)) {
            return Brunnenstube_Fassungsart.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Sickerleitung)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Stollen)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Felsspalt)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.unbekannt)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.andere)){
            return Brunnenstube_Fassungsart.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private Quelle_Fassungsart mapQWFassungsArt2Quelle_Fassungsart(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt src) {
        if(src==null) {
            return Quelle_Fassungsart.ungefasst;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Schacht)) {
            return Quelle_Fassungsart.gefasst_direkt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Sickerleitung)){
            return Quelle_Fassungsart.gefasst_Fassungsstrang;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Stollen)){
            return Quelle_Fassungsart.gefasst_Fassungsstollen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Felsspalt)){
            return Quelle_Fassungsart.gefasst_direkt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.unbekannt)){
            return Quelle_Fassungsart.gefasst_unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.andere)){
            return Quelle_Fassungsart.ungefasst;
        }
        throw new IllegalArgumentException();
    }
    private QWFassungsArt mapQWFassungsArt(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Schacht)) {
            return QWFassungsArt.Schacht;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Sickerleitung)){
            return QWFassungsArt.Sickerleitung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Stollen)){
            return QWFassungsArt.Stollen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.Felsspalt)){
            return QWFassungsArt.Felsspalt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.unbekannt)){
            return QWFassungsArt.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt.andere)){
            return QWFassungsArt.andere;
        }
        throw new IllegalArgumentException();
    }
    private JaNein mapWasserQualitaet(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet src) {
        if(src==null) {
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet.ohne_Aufbereitung_als_Trinkwasser_nutzbar)) {
            return JaNein.ja;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet.kein_Trinkwasser)) {
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet.Aufbereitung_vorhanden)) {
            return JaNein.nein;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet.unbekannt)) {
            return JaNein.nein;
        }
        throw new IllegalArgumentException();
    }
    private Grundwasserfassung_Nutzungszustand mapBetriebArt2Grundwasserfassung_Nutzungszustand(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.in_Betrieb)) {
            return Grundwasserfassung_Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ausser_Betrieb)) {
            return Grundwasserfassung_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.stillgelegt)) {
            return Grundwasserfassung_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ungenutzt)) {
            return Grundwasserfassung_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.zerstoert)) {
            return Grundwasserfassung_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.unbekannt)) {
            return Grundwasserfassung_Nutzungszustand.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.im_Verwurf)) {
            return Grundwasserfassung_Nutzungszustand.ungenutzt;
        }
        throw new IllegalArgumentException();
    }
    private Quelle_Nutzungszustand mapBetriebArt2Quelle_Nutzungszustand(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.in_Betrieb)) {
            return Quelle_Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ausser_Betrieb)) {
            return Quelle_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.stillgelegt)) {
            return Quelle_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ungenutzt)) {
            return Quelle_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.zerstoert)) {
            return Quelle_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.unbekannt)) {
            return Quelle_Nutzungszustand.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.im_Verwurf)) {
            return Quelle_Nutzungszustand.ungenutzt;
        }
        throw new IllegalArgumentException();
    }
    private EntnahmebrunnenTyp mapEntnahmebrunnenTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.einfacheGWFassung)) {
            return EntnahmebrunnenTyp.einfacheGWFassung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.HorizontalfilterBrunnen)){
            return EntnahmebrunnenTyp.HorizontalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.VertikalfilterBrunnen)){
            return EntnahmebrunnenTyp.VertikalfilterBrunnen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.Sodbrunnen)){
            return EntnahmebrunnenTyp.Sodbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.Rohr)){
            return EntnahmebrunnenTyp.Rohr;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.andere)){
            return EntnahmebrunnenTyp.andere;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp.unbekannt)){
            return EntnahmebrunnenTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private BautenGWTyp mapBauenGWTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Bauten)) {
            return BautenGWTyp.Bauten;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Bohrung)) {
            return BautenGWTyp.Bohrung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Spundwand_Schlitzwand)) {
            return BautenGWTyp.Spundwand_Schlitzwand;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Leitung)) {
            return BautenGWTyp.Leitung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Pfahlung)) {
            return BautenGWTyp.Pfahlung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.Sonstige)) {
            return BautenGWTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp.unbekannt)) {
            return BautenGWTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private SaubWaEinleitTyp mapSaubWaEinleitTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp.Meteorwasser)) {
            return SaubWaEinleitTyp.Meteorwasser;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp.Strassenabwasser)) {
            return SaubWaEinleitTyp.Strassenabwasser;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp.landwirtschaftliche_Drainagen)) {
            return SaubWaEinleitTyp.landwirtschaftliche_Drainagen;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp.Sonstige)) {
            return SaubWaEinleitTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp.unbekannt)) {
            return SaubWaEinleitTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private AbWaEinleitTyp mapAbWaEinleitTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.SABA)) {
            return AbWaEinleitTyp.SABA;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.Industrie)) {
            return AbWaEinleitTyp.Industrie;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.ARA)) {
            return AbWaEinleitTyp.ARA;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.KLARA)) {
            return AbWaEinleitTyp.KLARA;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.Mischwasserentlastung)) {
            return AbWaEinleitTyp.Mischwasserentlastung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.Sonstige)) {
            return AbWaEinleitTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp.unbekannt)) {
            return AbWaEinleitTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }
    private Rueckgabebrunnen_Nutzungszustand mapBetriebArt2Rueckgabebrunnen_Nutzungszustand(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.in_Betrieb)) {
            return Rueckgabebrunnen_Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ausser_Betrieb)) {
            return Rueckgabebrunnen_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.stillgelegt)) {
            return Rueckgabebrunnen_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ungenutzt)) {
            return Rueckgabebrunnen_Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.zerstoert)) {
            return Rueckgabebrunnen_Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.unbekannt)) {
            return Rueckgabebrunnen_Nutzungszustand.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.im_Verwurf)) {
            return Rueckgabebrunnen_Nutzungszustand.ungenutzt;
        }
        throw new IllegalArgumentException();
    }
    private QWFSchachtTyp mapQWFSchachtTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return QWFSchachtTyp.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp.toXmlCode(src));
    }
    private Versickerungsanlage_Qualitaet mapVersickerungsanlage_Qualitaet(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage_Qualitaet src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return Versickerungsanlage_Qualitaet.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage_Qualitaet.toXmlCode(src));
    }
    private VersickerungArt mapVersickerungArt(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungArt src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return VersickerungArt.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungArt.toXmlCode(src));
    }
    private VersickerungTyp mapVersickerungTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp src) {
        if(src==null)return null;
        // Werteliste ist (fast) identisch; KGDM enthaehlt einen Wert mehr
        return VersickerungTyp.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp.toXmlCode(src));
    }
    private Boolean mapBOOLEAN_Typ(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.ja)) {
            return true;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.nein)) {
            return false;
        }
        throw new IllegalArgumentException();
    }
    private ErtragAngaben mapErtragAngaben(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return ErtragAngaben.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(src));
    }
    private FsgLtgLaenge mapFsgLtgLaenge(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return FsgLtgLaenge.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge.toXmlCode(src));
    }
    private FsgLtgRichtung mapFsgLtgRichtung(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return FsgLtgRichtung.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung.toXmlCode(src));
    }
    private LeitungsArt mapRueckgabeLeitungTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung_Typ src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung_Typ.Rueckgabe_Leitung)) {
            return LeitungsArt.Rueckgabeleitung;
        }
        throw new IllegalArgumentException();
    }
    private ErfVorlBemerk mapErfVorlBemerk(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.GPS_0_01m)) {
            return ErfVorlBemerk.GPS_0_01m;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.GPS_0_10m)) {
            return ErfVorlBemerk.GPS_0_10m;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.GPS_1_00m)) {
            return ErfVorlBemerk.GPS_1_00m;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.Grundbuchplan_Papier)) {
            return ErfVorlBemerk.Grundbuchplan_Papier;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.keine_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.keine_Einpassmoeglichkeit;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.nach_muendlicher_Angabe)) {
            return ErfVorlBemerk.nach_muendlicher_Angabe;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.schematisch)) {
            return ErfVorlBemerk.Schematisch;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.schlechte_Einpassmoeglichkeit)) {
            return ErfVorlBemerk.schlechte_Einpassmoeglichkeit;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung)) {
            return ErfVorlBemerk.Vorlage_mit_massiver_Generalisierung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.Vorlage_unzuverlaessig)) {
            return ErfVorlBemerk.Vorlage_unzuverlaessig;
        }
        throw new IllegalArgumentException();
    }
    private Herkunftsart mapHerkunftsart(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.Aufnahme)) {
            return Herkunftsart.Aufnahme;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.UebernahmeKoordinaten)) {
            return Herkunftsart.UebernahmeKoordinaten;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.Planabgriff)) {
            return Herkunftsart.Planabgriff;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.konstruktiv)) {
            return Herkunftsart.konstruktiv;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.geschaetzt)) {
            return Herkunftsart.andere;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.unbekannt)) {
            return Herkunftsart.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.andere)) {
            return Herkunftsart.andere;
        }
        throw new IllegalArgumentException();
    }
    private ErfGenauigkeit mapErfGenauigkeit(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return ErfGenauigkeit.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.toXmlCode(src));
    }
    private ErfVorlHerkunft mapErfVorlHerkunft(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.Amt_fuer_Umweltschutz)) {
            return ErfVorlHerkunft.Amt_fuer_Umwelt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.Kant_Vermessungsamt)) {
            return ErfVorlHerkunft.Amt_fuer_Grundbuch_und_Geoinformation;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.privater_Betreiber)) {
            return ErfVorlHerkunft.privater_Betreiber;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.Schutzzonen_Bearbeiter)) {
            return ErfVorlHerkunft.Schutzzonen_Bearbeiter;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.Wasserversorgung)) {
            return ErfVorlHerkunft.Wasserversorgung;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.Eigentuemer)) {
            return ErfVorlHerkunft.Eigentuemer;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.unbekannt)) {
            return ErfVorlHerkunft.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.andere)) {
            return ErfVorlHerkunft.andere;
        }
        throw new IllegalArgumentException();
    }
    private BetriebsArt mapBetriebArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.in_Betrieb)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.in_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ausser_Betrieb)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.ausser_Betrieb;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.stillgelegt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.stillgelegt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.ungenutzt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.zerstoert)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.zerstoert;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.unbekannt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.im_Verwurf)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.im_Verwurf;
        }
        throw new IllegalArgumentException();
    }
    private DetailplanMstab mapDetailplanMstab(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return DetailplanMstab.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.toXmlCode(src));
    }
    private DetailplanArt mapDetailplanArt(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return DetailplanArt.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.toXmlCode(src));
    }
    private EigentumArt mapEigentumArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt eigentumArt) {
        if(eigentumArt==null)return null;
        // Werteliste ist identisch
        return EigentumArt.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt.toXmlCode(eigentumArt));
    }
    private JaNeinUnbestimmt mapNotversorgung(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung src) {
        if(src==null) {
            return JaNeinUnbestimmt.unbestimmt;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.nicht_geeignet)) {
            return JaNeinUnbestimmt.nein;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.nur_Notversorgung)) {
            return JaNeinUnbestimmt.ja;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.Not_und_Normalversorgung)) {
            return JaNeinUnbestimmt.ja;
        }else if(src.equals(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.unbekannt)) {
            return JaNeinUnbestimmt.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton mapKanton(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton kanton) {
        if(kanton==null)return null;
        // Werteliste ist identisch
        return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton.toXmlCode(kanton));
    }
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ mapSammeleinrichtungTyp2mapSammeleinrichtung_Typ(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp src) {
        
        //Typ Sickerleitung, Horizontal_Filterstrecke = Typ Fassungsstrang;
        //Typ Sickerleitung, Sammelstollen, Fassungsleitung_Allgemein, Fassungsleitung_Vollrohr = Typ Fassungsstollen; 
        //Typ Fassungsleitung_Vollrohr Fassungsleitung_Allgemein Punktfassung. Bohrung, andere, unbekannt = Typ unbestimmt
        if(src==null) {
            return null;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sickerleitung.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sammelstollen.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstollen;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Allgemein.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Vollrohr.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Punktfassung.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Bohrung.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.andere.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.unbekannt.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.unbestimmt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Horizontal_Filterstrecke.equals(src)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.Fassungsstrang;
        }
        throw new IllegalArgumentException("unexpected SammeleinrichtungTyp <"+src+">");
    }
    private SammeleinrichtungTyp mapSammeleinrichtungTyp(
            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp src) {
        if(src==null) {
            return null;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sickerleitung.equals(src)) {
            return SammeleinrichtungTyp.Sickerleitung;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Sammelstollen.equals(src)) {
            return SammeleinrichtungTyp.Sammelstollen;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Allgemein.equals(src)) {
            return SammeleinrichtungTyp.Fassungsleitung_Allgemein;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Fassungsleitung_Vollrohr.equals(src)) {
            return SammeleinrichtungTyp.Fassungsleitung_Vollrohr;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Punktfassung.equals(src)) {
            return SammeleinrichtungTyp.Punktfassung;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Bohrung.equals(src)) {
            return SammeleinrichtungTyp.Bohrung;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.andere.equals(src)) {
            return SammeleinrichtungTyp.andere;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.unbekannt.equals(src)) {
            return SammeleinrichtungTyp.unbekannt;
        }else if(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.Horizontal_Filterstrecke.equals(src)) {
            return SammeleinrichtungTyp.andere;
        }
        throw new IllegalArgumentException("unexpected SammeleinrichtungTyp <"+src+">");
    }
    private void addMappedObj(IomObject mappedObj,IomObject srcObj) {
        String uuid=mappedObj.getobjectoid();
        if(uuid==null) {
            // link obj
            mappedLinkObjs.add(mappedObj);
        }else {
            if(uuid2srcObj.containsKey(uuid)){
                logDelayedError("duplicate UUID "+uuid+"; "+srcObj.toString()+"; "+uuid2srcObj.get(uuid));
            }else {
                uuid2srcObj.put(uuid, srcObj);
            }
            mappedObjs.put(uuid, mappedObj);
            addAnchorObj(mappedObj);
        }
    }
    private void addAnchorObj(IomObject mappedObj) {
        String uuid=mappedObj.getobjectoid();
        if(uuid!=null) {
            if(mappedObj instanceof Foerderanlage) {
                mappedFoerderanlage.put(uuid,(Foerderanlage) mappedObj);
            }
            if(mappedObj instanceof Quellschacht) {
                mappedQuellschacht.put(uuid,(Quellschacht) mappedObj);
            }
            if(mappedObj instanceof Sammelschacht) {
                mappedSammelschacht.put(uuid,(Sammelschacht) mappedObj);
            }
            if(mappedObj instanceof Reservoir) {
                mappedReservoir.put(uuid,(Reservoir) mappedObj);
            }
        }
    }
    private void addCreatedObj(IomObject mappedObj) {
        String uuid=mappedObj.getobjectoid();
        if(uuid==null) {
            mappedLinkObjs.add(mappedObj);
        }else {
            mappedObjs.put(uuid, mappedObj);
        }
        addAnchorObj(mappedObj);
    }
    private void addWvaObj(IomObject mappedObj) {
        addAnchorObj(mappedObj);
        readOnlyWvaObjs.add(mappedObj);
    }
    public IomObject getMappedObject() {
        if(mappingComplete) {
            if(!mappedObjs.isEmpty()) {
                return mappedObjs.remove(mappedObjs.keySet().iterator().next());
            }
            if(!mappedLinkObjs.isEmpty()) {
                return mappedLinkObjs.remove(0);
            }
            if(!readOnlyWvaObjs.isEmpty()) {
                return readOnlyWvaObjs.remove(0);
            }
            while(!readQueSchaFoerderanlage.isEmpty()) {
                QueSchaFoerderanlage qs=readQueSchaFoerderanlage.remove(0);
                if(mappedFoerderanlage.containsKey(qs.getFoerderanlage()) && mappedQuellschacht.containsKey(qs.getQuellschacht())) {
                    return qs;
                }
            }
            while(!readQueSchaRes.isEmpty()) {
                QueSchaRes qs=readQueSchaRes.remove(0);
                if(mappedReservoir.containsKey(qs.getReservoir()) && mappedQuellschacht.containsKey(qs.getQuellschacht())) {
                    return qs;
                }
            }
            while(!readQueSchaSaScha.isEmpty()) {
                QueSchaSaScha qs=readQueSchaSaScha.remove(0);
                if(mappedSammelschacht.containsKey(qs.getSammelschacht()) && mappedQuellschacht.containsKey(qs.getQuellschacht())) {
                    return qs;
                }
            }
        }
        return null;
    }

}
