package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.ehi.basics.settings.Settings;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.Iom_jObject;
import ch.interlis.iox.*;
import ch.interlis.models.ZG_HYDROGEOLOGISCHEOBJEKTE_2_3;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;
import ch.interlis.models.INTERLIS.HALIGNMENT;
import ch.interlis.models.INTERLIS.VALIGNMENT;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDatei;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BauenGWTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFassungsArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellenTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsg;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungArt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage_Qualitaet;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.WasserQualitaet;

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
    private Map<String,String> qwfsgendpunkt2tid=new HashMap<String,String>();
    private Map<String,String> rueckgabebrunnen2tid=new HashMap<String,String>();
    private Map<String,String> versickerungsanlage2tid=new HashMap<String,String>();
    private Map<String,String> bautengw2tid=new HashMap<String,String>();
    private Map<String,String> abwaeinleit2tid=new HashMap<String,String>();
    private Map<String,String> saubwaeinleit2tid=new HashMap<String,String>();
    //private Map<String,String> saubwaeinleit2tid=new HashMap<String,String>();
    private List<IomObject> bufferedAssocObj=new ArrayList<IomObject>();
    private Map<String, ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg> bewiRegs=new HashMap<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg>();
    
    
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
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit(newTid());
                    mappedObj.setGUID(srcObj.getGUID());
                    mappedObj.setLage(srcObj.getLage());
                    mappedObj.setTyp(mapAbWaEinleitTyp(srcObj.getTyp()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebArt()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    //TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    //TODO mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    //TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    //TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    abwaeinleit2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                    addTextPos(AweNrAfu_Intranet2Pos.tag,AweNrAfu_Intranet2Pos.tag_AbWaEinleit,mappedObj.getobjectoid(),srcObj.getEinlNrAfu_Intranet2Pos());
                    addTextPos(AweNrAfu_Intranet5Pos.tag,AweNrAfu_Intranet5Pos.tag_AbWaEinleit,mappedObj.getobjectoid(),srcObj.getEinlNrAfu_Intranet5Pos());
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
                    bufferedAssocObj.add(iomObj);
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
                    addTextPos(AnrNrAfu_Intranet2Pos.tag,AnrNrAfu_Intranet2Pos.tag_Anreicherungsanlage,mappedObj.getobjectoid(),srcObj.getAnrNrAfu_Intranet2Pos());
                    addTextPos(AnrNrAfu_Intranet5Pos.tag,AnrNrAfu_Intranet5Pos.tag_Anreicherungsanlage,mappedObj.getobjectoid(),srcObj.getAnrNrAfu_Intranet5Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW(newTid());
                    mappedObj.setGUID(srcObj.getGUID());
                    mappedObj.setLage(srcObj.getLage_Punkt());
                    if(srcObj.sizeLage_Flaeche()>0) {
                        for(ch.interlis.models.ZG_hydrogeo_wva_V1.SurfaceStructure flaeche:srcObj.getLage_Flaeche().getSurfaces()) {
                            ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche mappedObjFl=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche(newTid());
                            mappedObjFl.setGeometrie(flaeche.getSurface());
                            mappedObjFl.setBautenGW(mappedObj.getobjectoid());
                            addMappedObj(mappedObjFl,srcObj);
                        }
                    }
                    mappedObj.setTyp(mapBauenGWTyp(srcObj.getTyp()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    //TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    //TODO mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    //TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    //TODO mappedObj.setKontakPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    bautengw2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                    addTextPos(BgwNrAfu_Intranet2Pos.tag,BgwNrAfu_Intranet2Pos.tag_BautenGW,mappedObj.getobjectoid(),srcObj.getBgwNrAfu_Intranet2Pos());
                    addTextPos(BgwNrAfu_Intranet5Pos.tag,BgwNrAfu_Intranet5Pos.tag_BautenGW,mappedObj.getobjectoid(),srcObj.getBgwNrAfu_Intranet5Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg) {
                    bewiRegs.put(iomObj.getobjectoid(),(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg)iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Datei) {
                    throw new IllegalStateException("Datei ist eine STRUCTURE");
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw)iomObj;
                    EntbruGSBAoTw mappedObj=new EntbruGSBAoTw(newTid());
                    mappedObj.setEntbruGUID(srcObj.getEntbru());
                    mappedObj.setGSBAoTwGUID(srcObj.getGSBAoTw());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruZsBeZu) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruZsBeZu srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruZsBeZu)iomObj;
                    EntbruZsBeZu mappedObj=new EntbruZsBeZu(newTid());
                    mappedObj.setEntbruGUID(srcObj.getEntbru());
                    mappedObj.setZsBeZuGUID(srcObj.getZsBeZu());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone)iomObj;
                    EntbruGWSZone mappedObj=new EntbruGWSZone(newTid());
                    mappedObj.setEntbruGUID(srcObj.getEntbru());
                    mappedObj.setGWSZoneGUID(srcObj.getGWSZone());
                    addMappedObj(mappedObj,srcObj);
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
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebArt()));
                    mappedObj.setNotversorgung(mapNotwasserversorgung2Notversorgung(srcObj.getNotwasserversorgung()));
                    mappedObj.setNotversorgung(mapNotversorgung(srcObj.getNotversorgung()));
                    final Double filterrohrDimension = srcObj.getDurchmesser();
                    mappedObj.setFilterrohrDimension(filterrohrDimension==null ? null : new Integer(filterrohrDimension.intValue()));
                    mappedObj.setTiefeTerrAbstich(srcObj.getTiefeTerrAbstich());
                    mappedObj.setWspHoeheTiefst(srcObj.getWspHoeheTiefst());
                    mappedObj.setK_Wert(srcObj.getK_Wert());
                    mappedObj.setWqualiBemerkung(mapWasserQualitaet(srcObj.getWqualiBemerkung()));
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
                    // nur WVA srcObj.getNameTextPos();
                    // nur WVA srcObj.getTechdata1TextPos();
                    // nur WVA srcObj.getTechdata2TextPos();
                    // nur WVA srcObj.getTechdata3TextPos();
                    // nur WVA srcObj.getTechdata4TextPos();
                    addTextPos(GwfNrAfu_Intranet2Pos.tag,GwfNrAfu_Intranet2Pos.tag_Entnahmebrunnen,mappedObj.getobjectoid(),srcObj.getGwfNrAfu_Intranet2Pos());
                    addTextPos(GwfNrAfu_Intranet5Pos.tag,GwfNrAfu_Intranet5Pos.tag_Entnahmebrunnen,mappedObj.getobjectoid(),srcObj.getGwfNrAfu_Intranet5Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg) {
                    bufferedAssocObj.add(iomObj);
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
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos) {
                    throw new IllegalStateException("IntranetPos ist eine STRUCTURE");
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung)iomObj;
                    final double nennweite = srcObj.getNennweite();
                    if(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung_LeitArt.OberflGewFsgLeitung.equals(srcObj.getLeitArt())){
                        ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung(newTid());
                        mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                        final IomObject geometrie = srcObj.getGeometrie();
                        if(geometrie!=null) {
                            mappedObj.setGeometrie(geometrie);
                        }
                        mappedObj.setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung_Typ.Fassungsleitung);
                        mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                        if(nennweite>=0.0) {
                            mappedObj.setLtgDimension(nennweite);
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
                    }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung_LeitArt.RueckgabeLeitung.equals(srcObj.getLeitArt())) {
                        ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung(newTid());
                        mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                        final IomObject geometrie = srcObj.getGeometrie();
                        if(geometrie!=null) {
                            mappedObj.setGeometrie(geometrie);
                        }
                        mappedObj.setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung_Typ.Rueckgabe_Leitung);
                        mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                        if(nennweite>=0.0) {
                            mappedObj.setLtgDimension(nennweite);
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
                        // TODO mappedObj.setEntnahmebrunnen(oid);
                        // TODO mappedObj.setRueckgabebrunnen(oid);
                        addMappedObj(mappedObj,srcObj);
                    }
                    // nur WVA srcObj.getLeitTextPos();
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson(newTid());
                    mappedObj.setMutatPerson(srcObj.getMutatPerson());
                    mutatperson2tid.put(srcObj.getobjectoid(), mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri) {
                    // nur WVA
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
                    mappedObj.setNotversorgung(mapNotwasserversorgung2Notversorgung(srcObj.getNotwasserversorgung()));
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
                    // nur WVA srcObj.getObflGewFsgTiefeText();
                    addTextPos(OwfNrAfu_Intranet2Pos.tag,OwfNrAfu_Intranet2Pos.tag_OberflaechenGewFassung,mappedObj.getobjectoid(),srcObj.getOwfNrAfu_Intranet2Pos());
                    addTextPos(OwfNrAfu_Intranet5Pos.tag,OwfNrAfu_Intranet5Pos.tag_OberflaechenGewFassung,mappedObj.getobjectoid(),srcObj.getOwfNrAfu_Intranet5Pos());
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
                    // nur WVA srcObj.getNameTextPos();
                    // nur WVA srcObj.getTechdataTextPos();
                    // nur WVA srcObj.getTechdata1TextPos();
                    // nur WVA srcObj.getTechdata2TextPos();
                    // nur WVA srcObj.getTechdata3TextPos();
                    // nur WVA srcObj.getTechdata4TextPos();
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage) { 
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw)iomObj;
                    ObFasGSBAoTw mappedObj=new ObFasGSBAoTw(newTid());
                    mappedObj.setGSBAoTwGUID(srcObj.getGSBAoTw());
                    mappedObj.setObGewFasGUID(srcObj.getObFas());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasZsBeZu) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasZsBeZu srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasZsBeZu)iomObj;
                    ObFasZsBeZu mappedObj=new ObFasZsBeZu(newTid());
                    mappedObj.setZsBeZuGUID(srcObj.getZsBeZu());
                    mappedObj.setObGewFasGUID(srcObj.getObFas());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone)iomObj;
                    ObFasGWSZone mappedObj=new ObFasGWSZone(newTid());
                    mappedObj.setGWSZoneGUID(srcObj.getGWSZone());
                    mappedObj.setObGewFasGUID(srcObj.getObFas());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg) {
                    bufferedAssocObj.add(iomObj);
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
                    mappedObj.setNotversorgung(mapNotwasserversorgung2Notversorgung(srcObj.getNotwasserversorgung()));
                    if(srcObj.getattrvaluecount(srcObj.tag_Ertrag_minimal)>0 && srcObj.getErtrag_minimal()>=0.0) {
                        mappedObj.setSchuettmengeMin(srcObj.getErtrag_minimal());
                    }
                    mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                    mappedObj.setSchuettmengeMax(srcObj.getErtrag_maximal());
                    mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                    mappedObj.setSchuettmengeMittl(srcObj.getErtrag_mittel());
                    mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                    mappedObj.setWqualiBemerkung(mapTrinkwasser2WasserQualitaet(srcObj.getTrinkwasser()));
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
                    // nur WVA srcObj.getErtragBrstTextPos();
                    // nur WVA srcObj.getErtragGrpTextPos();
                    // nur WVA srcObj.getNameTextPos();
                    // nur WVA ((ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht)srcObj).getTechDataTextPos();
                    addTextPos(QwfNrAfu_Intranet2Pos.tag,QwfNrAfu_Intranet2Pos.tag_Quellschacht,mappedObj.getobjectoid(),srcObj.getQwfNrAfu_Intranet2Pos());
                    addTextPos(QwfNrAfu_Intranet5Pos.tag,QwfNrAfu_Intranet5Pos.tag_Quellschacht,mappedObj.getobjectoid(),srcObj.getQwfNrAfu_Intranet5Pos());
                    addTextPos(QwfMenge_Karte25Pos.tag,QwfMenge_Karte25Pos.tag_Quellschacht,mappedObj.getobjectoid(),srcObj.getQwfMenge_Karte25Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw)iomObj;
                    QuellSchGSBAoTw mappedObj=new QuellSchGSBAoTw(newTid());
                    mappedObj.setGSBAoTwGUID(srcObj.getGSBAoTw());
                    mappedObj.setQuellSchGUID(srcObj.getQuellSch());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchZsBeZu) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchZsBeZu srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchZsBeZu)iomObj;
                    QuellSchZsBeZu mappedObj=new QuellSchZsBeZu(newTid());
                    mappedObj.setZsBeZuGUID(srcObj.getZsBeZu());
                    mappedObj.setQuellSchGUID(srcObj.getQuellSch());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone)iomObj;
                    QuellSchGWSZone mappedObj=new QuellSchGWSZone(newTid());
                    mappedObj.setGWSZoneGUID(srcObj.getGWSZone());
                    mappedObj.setQuellSchGUID(srcObj.getQuellSch());
                    addMappedObj(mappedObj, srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos) {
                    throw new IllegalStateException("QwfMenge_Karte25Pos ist eine STRUCTURE");
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt 
                        || iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setLage(srcObj.getGeometrie());
                    mappedObj.setTyp(mapQuelle_Fassungsart(srcObj.getFassungsart()));
                    mappedObj.setFassungsart(mapQWFassungsArt(srcObj.getQWFassungsArt()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjektNummer(srcObj.getObjektNummer());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    mappedObj.setPrivaterNutzer(srcObj.getPrivatNutzer());
                    mappedObj.setBetriebArt(mapQuelle_Nutzungszustand2BetriebArt(srcObj.getNutzungszustand()));
                    mappedObj.setNotversorgung(mapNotwasserversorgung2Notversorgung(srcObj.getNotwasserversorgung()));
                    final int schuettung_minimal = srcObj.getSchuettung_minimal();
                    if(schuettung_minimal>=0) {
                        mappedObj.setSchuettmengeMin(schuettung_minimal);
                    }
                    mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                    mappedObj.setSchuettmengeMax(srcObj.getSchuettung_maximal());
                    mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                    mappedObj.setSchuettmengeMittl(srcObj.getSchuettung_mittel());
                    mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                    mappedObj.setWqualiBemerkung(mapTrinkwasser2WasserQualitaet(srcObj.getTrinkwasser()));
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
                    mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                    mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setQuellschacht(quellschacht2oid.get(srcObj.getQuellschacht()));
                    // TODO mappedObj.setFassungsEigentuemer(adresse2oid.get(srcObj.getFassgEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    qwfsgendpunkt2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW) {
                    // TODO 20211027 kann man die evtl. aus dem KGDM löschen?
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru) {
                    // TODO 20211028 kann man die evtl. aus dem KGDM löschen?
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen(newTid());
                    mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                    mappedObj.setLage(srcObj.getGeometrie());
                    mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                    final ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt betriebArt = srcObj.getBetriebsArt();
                    mappedObj.setBetriebArt(mapBetriebsArt(betriebArt));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    rueckgabebrunnen2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung 
                        || iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung)iomObj;
                    if(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Qwf.equals(srcObj.getArtSammeleinrichtung())) {
                        ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf(newTid());
                        mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                        IomObject geom=srcObj.getGeometrie();
                        mappedObj.setGeometrie(geom);
                        mappedObj.setTyp(mapSammeleinrichtungTyp(srcObj.getSammeleinrichtungTyp()));
                        mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                        mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                        mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                        mappedObj.setLtgDimension(srcObj.getLtgDimension());
                        mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                        mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                        if(srcObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf) {
                            ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf srcObjQwf=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf)iomObj;
                            mappedObj.setBetriebArt(mapBetriebsArt(srcObjQwf.getBetriebsArt()));
                            mappedObj.setSchuettmengeMin(srcObjQwf.getSchuettmengeMin());
                            mappedObj.setErtragMinAng(mapErtragAngaben(srcObjQwf.getErtragMinAng()));
                            mappedObj.setSchuettmengeMax(srcObjQwf.getSchuettmengeMax());
                            mappedObj.setErtragMaxAng(mapErtragAngaben(srcObjQwf.getErtragMaxAng()));
                            mappedObj.setSchuettmengeMittl(srcObjQwf.getSchuettmengeMittl());
                            mappedObj.setErtragMittlAng(mapErtragAngaben(srcObjQwf.getErtragMittlAng()));
                        }
                        mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                        mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                        // TODO mappedObj.setQuellschacht(quellschacht2oid.get(srcObj.getQuellschacht()));
                        addMappedObj(mappedObj,srcObj);
                    }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Gwf.equals(srcObj.getArtSammeleinrichtung())) {
                        ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf(newTid());
                        mappedObj.setGUID(stripZG(srcObj.getIdentifikator()));
                        IomObject geom=srcObj.getGeometrie();
                        mappedObj.setGeometrie(geom);
                        mappedObj.setTyp(mapSammeleinrichtungTyp(srcObj.getSammeleinrichtungTyp()));
                        mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                        mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                        mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                        mappedObj.setLtgDimension(srcObj.getLtgDimension());
                        mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                        mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                        mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                        mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                        // TODO mappedObj.setEntnahmebrunnen();
                        addMappedObj(mappedObj,srcObj);
                    }else {
                        throw new IllegalStateException();
                    }
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit(newTid());
                    mappedObj.setGUID(srcObj.getGUID());
                    mappedObj.setLage(srcObj.getLage());
                    mappedObj.setTyp(mapSaubWaEinleitTyp(srcObj.getTyp()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebArt()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    // TODO mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    // TODO mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    // TODO mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    // TODO mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    saubwaeinleit2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                    addTextPos(SweNrAfu_Intranet2Pos.tag,SweNrAfu_Intranet2Pos.tag_SaubWaEinleit,mappedObj.getobjectoid(),srcObj.getEinlNrAfu_Intranet2Pos());
                    addTextPos(SweNrAfu_Intranet5Pos.tag,SweNrAfu_Intranet5Pos.tag_SaubWaEinleit,mappedObj.getobjectoid(),srcObj.getEinlNrAfu_Intranet5Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos) {
                    throw new IllegalStateException("TextPos ist eine STRUCTURE");
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage(newTid());
                    mappedObj.setGUID(srcObj.getGUID());
                    mappedObj.setLage(srcObj.getLage());
                    mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                    mappedObj.setArt(mapVersickerungArt(srcObj.getArt()));
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                    mappedObj.setBetriebArt(mapBetriebsArt(srcObj.getBetriebsArt()));
                    mappedObj.setQualitaet(mapVersickerungsanlage_Qualitaet(srcObj.getQualitaet()));
                    mappedObj.setNachfuehrungsstand(LegacyUtil.mapDateToITF(srcObj.getNachfuehrungsstand()));
                    mappedObj.setBemerkungen(srcObj.getBemerkungen());
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
                    mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                    mappedObj.setGrundstNr(srcObj.getGrundstNr());
                    mappedObj.setKontaktDatum(LegacyUtil.mapDateToITF(srcObj.getKontaktDatum()));
                    //mappedObj.setMutatPerson(mutatperson2oid.get(srcObj.getMutatPerson()));
                    //mappedObj.setAnlageEigentuemer(adresse2oid.get(srcObj.getAnlageEigentuemer()));
                    //mappedObj.setGrundEigentuemer(adresse2oid.get(srcObj.getGrundEigentuemer()));
                    //mappedObj.setKontaktPerson(adresse2oid.get(srcObj.getKontaktPerson()));
                    versickerungsanlage2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                    addTextPos(VerNrAfu_Intranet2Pos.tag,VerNrAfu_Intranet2Pos.tag_Versickerungsanlage,mappedObj.getobjectoid(),srcObj.getVerNrAfu_Intranet2Pos());
                    addTextPos(VerNrAfu_Intranet5Pos.tag,VerNrAfu_Intranet5Pos.tag_Versickerungsanlage,mappedObj.getobjectoid(),srcObj.getVerNrAfu_Intranet5Pos());
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg) {
                    bufferedAssocObj.add(iomObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung mappedObj=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung(newTid());
                    mappedObj.setWVName(srcObj.getWVName());
                    wasserversorgung2tid.put(srcObj.getobjectoid(),mappedObj.getobjectoid());
                    addMappedObj(mappedObj,srcObj);
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage) {
                    // nur WVA
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg) {
                    // nur WVA
                }else {
                    throw new IllegalArgumentException();
                }
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

    private void addTextPos(String tag, String tagRef, String masteroid,
            ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos srcObj) {
        if(srcObj==null) {
            return;
        }
        IomObject mappedObj=new Iom_jObject(tag,newTid());
        if(masteroid!=null) {
            IomObject ref=new Iom_jObject("REF",null);
            ref.setobjectrefoid(masteroid);
            mappedObj.addattrobj(tagRef, ref);
        }
        final IomObject pos = srcObj.getPos();
        if(pos!=null) {
            mappedObj.addattrobj(QwfNrAfu_Intranet2Pos.tag_Pos, pos);
        }
        final Double ori = srcObj.getOri();
        if(ori!=null) {
            mappedObj.setattrvalue(QwfNrAfu_Intranet2Pos.tag_Ori, ori.toString());
        }
        final HALIGNMENT hali = srcObj.getHali();
        if(hali!=null) {
            mappedObj.setattrvalue(QwfNrAfu_Intranet2Pos.tag_HAli,HALIGNMENT.toXmlCode(hali));
        }
        final VALIGNMENT vali = srcObj.getVali();
        if(vali!=null) {
            mappedObj.setattrvalue(QwfNrAfu_Intranet2Pos.tag_VAli,VALIGNMENT.toXmlCode(vali));
        }
        final String mappedSizeTyp = mapSizeTyp(srcObj.getSize());
        if(mappedSizeTyp!=null) {
            mappedObj.setattrvalue(QwfNrAfu_Intranet2Pos.tag_Size,mappedSizeTyp);
        }
        final String mappedPlanTyp = mapPlanTyp(srcObj.getPlantyp());
        if(mappedPlanTyp!=null) {
            mappedObj.setattrvalue(QwfNrAfu_Intranet2Pos.tag_Plantyp,mappedPlanTyp);
        }
        if(srcObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos) {
            final String platzhalterBeschriftung = ((ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos) srcObj).getPlatzhalterBeschriftung();
            if(platzhalterBeschriftung!=null) {
                mappedObj.setattrvalue(QwfMenge_Karte25Pos.tag_PlatzhalterBeschriftung, platzhalterBeschriftung);
            }
        }
        addMappedObj(mappedObj,srcObj);
    }
    private String mapSizeTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.klein)) {
            return Size_Typ.toXmlCode(Size_Typ.klein);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.mittel)) {
            return Size_Typ.toXmlCode(Size_Typ.mittel);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.gross)) {
            return Size_Typ.toXmlCode(Size_Typ.gross);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.unterdrueckt)) {
            return Size_Typ.toXmlCode(Size_Typ.unterdrueckt);
        }
        throw new IllegalArgumentException();
    }
    private String mapPlanTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.M_1_1000)) {
            return PlanTyp.toXmlCode(PlanTyp.M_1_1000);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.M_1_2000)) {
            return PlanTyp.toXmlCode(PlanTyp.M_1_2000);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.M_1_5000)) {
            return PlanTyp.toXmlCode(PlanTyp.M_1_5000);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.M_1_10000)) {
            return PlanTyp.toXmlCode(PlanTyp.M_1_10000);
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.M_1_25000)) {
            return PlanTyp.toXmlCode(PlanTyp.M_1_25000);
        }
        throw new IllegalArgumentException();
    }

    private QuellenTyp mapQuelle_Fassungsart(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.ungefasst)) {
            return QuellenTyp.ungefasst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_direkt)) {
            return QuellenTyp.gefasst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_Fassungsstrang)) {
            return QuellenTyp.gefasst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_Fassungsstollen)) {
            return QuellenTyp.gefasst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_unbestimmt)) {
            return QuellenTyp.gefasst;
        }
        throw new IllegalArgumentException();
    }

    private WasserQualitaet mapWasserQualitaet(
            ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.ohne_Aufbereitung_als_Trinkwasser_nutzbar)) {
            return WasserQualitaet.ohne_Aufbereitung_als_Trinkwasser_nutzbar;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.kein_Trinkwasser)){
            return WasserQualitaet.kein_Trinkwasser;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.Aufbereitung_vorhanden)){
            return WasserQualitaet.Aufbereitung_vorhanden;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.unbekannt)){
            return WasserQualitaet.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private Notversorgung mapNotversorgung(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.nicht_geeignet)) {
            return Notversorgung.nicht_geeignet;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.nur_Notversorgung)) {
            return Notversorgung.nur_Notversorgung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.Not_und_Normalversorgung)) {
            return Notversorgung.Not_und_Normalversorgung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.unbekannt)) {
            return Notversorgung.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private QWFassungsArt mapQWFassungsArt(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.Schacht)) {
            return QWFassungsArt.Schacht;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.Sickerleitung)){
            return QWFassungsArt.Sickerleitung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.Stollen)){
            return QWFassungsArt.Stollen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.Felsspalt)){
            return QWFassungsArt.Felsspalt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.unbekannt)){
            return QWFassungsArt.unbekannt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.andere)){
            return QWFassungsArt.andere;
        }
        throw new IllegalArgumentException();
    }

    private SaubWaEinleitTyp mapSaubWaEinleitTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.Meteorwasser)) {
            return SaubWaEinleitTyp.Meteorwasser;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.Strassenabwasser)) {
            return SaubWaEinleitTyp.Strassenabwasser;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.landwirtschaftliche_Drainagen)) {
            return SaubWaEinleitTyp.landwirtschaftliche_Drainagen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.Sonstige)) {
            return SaubWaEinleitTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.unbekannt)) {
            return SaubWaEinleitTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private AbWaEinleitTyp mapAbWaEinleitTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.SABA)) {
            return AbWaEinleitTyp.SABA;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.Industrie)) {
            return AbWaEinleitTyp.Industrie;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.ARA)) {
            return AbWaEinleitTyp.ARA;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.KLARA)) {
            return AbWaEinleitTyp.KLARA;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.Mischwasserentlastung)) {
            return AbWaEinleitTyp.Mischwasserentlastung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.Sonstige)) {
            return AbWaEinleitTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.AbWaEinleitTyp.unbekannt)) {
            return AbWaEinleitTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private BauenGWTyp mapBauenGWTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Bauten)) {
            return BauenGWTyp.Bauten;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Bohrung)) {
            return BauenGWTyp.Bohrung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Spundwand_Schlitzwand)) {
            return BauenGWTyp.Spundwand_Schlitzwand;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Leitung)) {
            return BauenGWTyp.Leitung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Pfahlung)) {
            return BauenGWTyp.Pfahlung;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.Sonstige)) {
            return BauenGWTyp.Sonstige;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.unbekannt)) {
            return BauenGWTyp.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private Versickerungsanlage_Qualitaet mapVersickerungsanlage_Qualitaet(
            ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage_Qualitaet src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return Versickerungsanlage_Qualitaet.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage_Qualitaet.toXmlCode(src));
    }

    private VersickerungArt mapVersickerungArt(ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungArt src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return VersickerungArt.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungArt.toXmlCode(src));
    }

    private FsgLtgLaenge mapFsgLtgLaenge(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return FsgLtgLaenge.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge.toXmlCode(src));
    }

    private FsgLtgRichtung mapFsgLtgRichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung src) {
        if(src==null)return null;
        // Werteliste ist identisch
        return FsgLtgRichtung.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung.toXmlCode(src));
    }

    private SammeleinrichtungTyp mapSammeleinrichtungTyp(
            ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp src) {
        if(src==null) {
            return null;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Sickerleitung.equals(src)) {
            return SammeleinrichtungTyp.Sickerleitung;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Sammelstollen.equals(src)) {
            return SammeleinrichtungTyp.Sammelstollen;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Fassungsleitung_Allgemein.equals(src)) {
            return SammeleinrichtungTyp.Fassungsleitung_Allgemein;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Fassungsleitung_Vollrohr.equals(src)) {
            return SammeleinrichtungTyp.Fassungsleitung_Vollrohr;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Punktfassung.equals(src)) {
            return SammeleinrichtungTyp.Punktfassung;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Bohrung.equals(src)) {
            return SammeleinrichtungTyp.Bohrung;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.Horizontal_Filterstrecke.equals(src)) {
            return SammeleinrichtungTyp.Horizontal_Filterstrecke;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.andere.equals(src)) {
            return SammeleinrichtungTyp.andere;
        }else if(ch.interlis.models.ZG_hydrogeo_wva_V1.SammeleinrichtungTyp.unbekannt.equals(src)) {
            return SammeleinrichtungTyp.unbekannt;
        }
        throw new IllegalArgumentException("unexpected SammeleinrichtungTyp <"+src.toXmlCode(src)+">");
    }

    private VersickerungTyp mapVersickerungTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungTyp src) {
        if(src==null)return null;
        // Werteliste ist (fast) identisch; KGDM enthaehlt einen Wert mehr
        return VersickerungTyp.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungTyp.toXmlCode(src));
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

    private BetriebArt mapQuelle_Nutzungszustand2BetriebArt(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.genutzt)) {
            return BetriebArt.in_Betrieb;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.aufgehoben)) {
            return BetriebArt.stillgelegt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.ungenutzt)) {
            return BetriebArt.ungenutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.unbestimmt)) {
            return BetriebArt.unbekannt;
        }
        throw new IllegalArgumentException();
    }

    private Notversorgung mapNotwasserversorgung2Notversorgung(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt src) {
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

    private WasserQualitaet mapTrinkwasser2WasserQualitaet(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein src) {
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
                doAssocMapping();
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

    private void doAssocMapping() {
        for(IomObject iomObj:bufferedAssocObj) {
            if(false) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg)iomObj;
                AnranlWasservsg mappedObj=new AnranlWasservsg(newTid());
                mappedObj.setAnreicherungsanlage(anreicherungsanlage2tid.get(srcObj.getAnreicherungsanlage()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                BautenGWBewiReg mappedObj=new BautenGWBewiReg(newTid());
                mappedObj.setBautenGW(bautengw2tid.get(srcObj.getBautenGW()));
                mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                String einleitTid=saubwaeinleit2tid.get(srcObj.getEinleit());
                if(einleitTid!=null) {
                    SaubWaEinleitBewiReg mappedObj=new SaubWaEinleitBewiReg(newTid());
                    mappedObj.setSaubWaEinleit(einleitTid);
                    mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                    mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                    addMappedObj(mappedObj,srcObj);
                }else {
                    einleitTid=abwaeinleit2tid.get(srcObj.getEinleit());
                    AbWaEinleitBewiReg mappedObj=new AbWaEinleitBewiReg(newTid());
                    mappedObj.setAbWaEinleit(einleitTid);
                    mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                    mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                    addMappedObj(mappedObj,srcObj);
                }
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                EntbruBewiReg mappedObj=new EntbruBewiReg(newTid());
                mappedObj.setEntnahmebrunnen(entnahmebrunnen2tid.get(srcObj.getEntnahmebrunnen()));
                mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                mappedObj.setEntnahmemenge(bewiReg.getEntnahmemenge());
                mappedObj.setPumpmenge(bewiReg.getPumpmenge());
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg)iomObj;
                EntbruWasservsg mappedObj=new EntbruWasservsg(newTid());
                mappedObj.setEntnahmebrunnen(entnahmebrunnen2tid.get(srcObj.getEntnahmebrunnen()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg)iomObj;
                FassgebWasservsg mappedObj=new FassgebWasservsg(newTid());
                mappedObj.setFassungseinzugsgebiet(fassungseinzugsgebiet2tid.get(srcObj.getFassungseinzugsgebiet()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                ObFasBewiReg mappedObj=new ObFasBewiReg(newTid());
                mappedObj.setOberflaechenGewFassung(oberflaechengewfassung2tid.get(srcObj.getOberflGewFassung()));
                mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                mappedObj.setEntnahmemenge(bewiReg.getEntnahmemenge());
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg)iomObj;
                ObFasWasservsg mappedObj=new ObFasWasservsg(newTid());
                mappedObj.setOberflaechenGewFassung(oberflaechengewfassung2tid.get(srcObj.getOberflGewFassung()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg)iomObj;
                QuellSchWasservsg mappedObj=new QuellSchWasservsg(newTid());
                mappedObj.setQuellschacht(quellschacht2tid.get(srcObj.getQuellschacht()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                RuebruBewiReg mappedObj=new RuebruBewiReg(newTid());
                mappedObj.setRueckgabebrunnen(rueckgabebrunnen2tid.get(srcObj.getRueBru()));
                mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                mappedObj.setVersickerungsmenge(bewiReg.getVesickerungsmenge());
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruWasservsg)iomObj;
                RuebruWasservsg mappedObj=new RuebruWasservsg(newTid());
                mappedObj.setRueckgabebrunnen(rueckgabebrunnen2tid.get(srcObj.getRueckgabebrunnen()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru) {
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg)iomObj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg bewiReg=bewiRegs.get(srcObj.getBewiReg());
                VersiBewiReg mappedObj=new VersiBewiReg(newTid());
                mappedObj.setVersickerungsanlage(versickerungsanlage2tid.get(srcObj.getVersickerungsanlage()));
                mappedObj.setBewiNummer(bewiReg.getBewiNummer());
                mappedObj.setDatum(LegacyUtil.mapDateToITF(bewiReg.getDatum()));
                mappedObj.setVersickerungsmenge(bewiReg.getVesickerungsmenge());
                addMappedObj(mappedObj,srcObj);
            }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg) {
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg)iomObj;
                VersiWasservsg mappedObj=new VersiWasservsg(newTid());
                mappedObj.setVersickerungsanlage(versickerungsanlage2tid.get(srcObj.getVersickerungsanlage()));
                mappedObj.setWasserversorgung(wasserversorgung2tid.get(srcObj.getWasserversorgung()));
                addMappedObj(mappedObj,srcObj);
            }else {
                throw new IllegalArgumentException();
            }
        }
    }

}
