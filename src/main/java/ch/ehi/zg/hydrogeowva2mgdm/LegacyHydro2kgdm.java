package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.interlis.iom.IomObject;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt;
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
import ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungArt;
import ch.interlis.models.ZG_hydrogeo_wva_V1.VersickerungTyp;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage_Qualitaet;

public class LegacyHydro2kgdm  {
    
    private List<IoxEvent> events=new ArrayList<IoxEvent>();
    private Map<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage> weitereAnlagen=new HashMap<String,ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage>();
    private int errc=0;
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject obj=((ObjectEvent)event).getIomObject();
            if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                IomObject lage=srcObj.getattrobj(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage.tag_Lage, 0);
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage.tag_GeometriePunkt,lage);
                // TODO mappedObj.setTyp(mapAnreicherungsanlageTyp(srcObj.getTyp());
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBewilligungsdatum(LegacyUtil.mapDate(srcObj.getBewilligungsdatum()));
                mappedObj.setBetriebsart(mapBetriebsArt(srcObj.getBetriebArt()));
                if(srcObj.getattrvaluecount(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage.tag_Anreicherungsmenge)>0) {
                    mappedObj.setMax_Versickerung(srcObj.getAnreicherungsmenge()/1000.0);
                }
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setTyp_Bemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setGUID(srcObj.getGUID());
                IomObject geometrie=srcObj.getattrobj(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet.tag_Geometrie, 0);
                mappedObj.addattrobj(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet.tag_Geometrie, geometrie);
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setBewilligungsdatum(LegacyUtil.mapDate(srcObj.getBewilligungsdatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                // TODO
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Gwf);
                IomObject geom=srcObj.getGeometrie();
                mappedObj.setGeometrie(geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp(srcObj.getTyp()));
                mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                mappedObj.setLtgDimension(srcObj.getLtgDimension());
                mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage)obj;
                // TODO fehlt in Abbildung
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe)obj;
                // TODO fehlt in Abbildung
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(LegacyUtil.newUUID());
                mappedObj.setWVName(srcObj.getWVName());
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                final IomObject geometrie = srcObj.getGeometrie();
                if(geometrie!=null) {
                    mappedObj.setGeometrie(geometrie);
                }
                mappedObj.setTyp(mapRueckgabeLeitungTyp(srcObj.getTyp()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                final Double ltgDimension = srcObj.getLtgDimension();
                if(ltgDimension!=null) {
                    mappedObj.setNennweite(ltgDimension);
                }
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                // TODO srcObj.getTyp();
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                // TODO srcObj.getBetriebArt();
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung notversorgung = srcObj.getNotversorgung();
                if(notversorgung!=null) {
                    mappedObj.setNotwasserversorgung(mapNotversorgung(notversorgung));
                }
                mappedObj.setTiefe(srcObj.getTiefe());
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDate(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDate(srcObj.getKontaktDatum()));
                mappedObj.setGewAbschnittCode(srcObj.getGewAbschnittCode());
                mappedObj.setGewAbschnittKm(srcObj.getGewAbschnittKm());
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                final BetriebArt betriebArt = srcObj.getBetriebArt();
                mappedObj.setBetriebsArt(mapBetriebsArt(betriebArt));
                if(betriebArt!=null) {
                    mappedObj.setNutzungszustand(mapBetriebsArt2Nutzungszustand(betriebArt));
                }
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDate(srcObj.getKontaktDatum()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setGUID(srcObj.getGUID());
                mappedObj.setLage(srcObj.getLage());
                mappedObj.setTyp(mapVersickerungTyp(srcObj.getTyp()));
                mappedObj.setArt(mapVersickerungArt(srcObj.getArt()));
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setBetriebsArt(mapBetriebsArt(srcObj.getBetriebArt()));
                mappedObj.setQualitaet(mapVersickerungsanlage_Qualitaet(srcObj.getQualitaet()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setAuskunftsStelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDate(srcObj.getKontaktDatum()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setGeometrie(srcObj.getLage());
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QWFSchachtTyp typ = srcObj.getTyp();
                if(typ!=null) {
                    mappedObj.setTyp(mapQWFSchachtTyp(typ));
                }
                // TODO srcObj.getFassungsart();
                mappedObj.setName(srcObj.getName());
                mappedObj.setObjNrAfu(srcObj.getObjNrAfu());
                mappedObj.setEigentumArt(mapEigentumArt(srcObj.getEigentumArt()));
                mappedObj.setPrivatNutzer(srcObj.getPrivaterNutzer());
                // TODO srcObj.getBetriebArt();
                final ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung notversorgung = srcObj.getNotversorgung();
                if(notversorgung!=null) {
                    mappedObj.setNotwasserversorgung(mapNotversorgung(notversorgung));
                }
                // TODO srcObj.getSchuettmengeMin());
                mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                // TODO srcObj.getSchuettmengeMax());
                mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                // TODO srcObj.getSchuettmengeMittl());
                mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                // TODO mappedObj.setTrinkwasser(mapWasserQualitaet(srcObj.getWqualiBemerkung()));
                mappedObj.setSchzNr(srcObj.getSchzNr());
                mappedObj.setSchzPflicht(mapBOOLEAN_Typ(srcObj.getSchzPflicht()));
                mappedObj.setSchzGutachten(mapBOOLEAN_Typ(srcObj.getSchzGutachten()));
                mappedObj.setSchzGutAutor(srcObj.getSchzGutAutor());
                mappedObj.setSchzGutDatum(LegacyUtil.mapDate(srcObj.getSchzGutDatum()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkung(srcObj.getBemerkungen());
                mappedObj.setAuskunftsstelle(srcObj.getAuskunftsStelle());
                mappedObj.setKanton(mapKanton(srcObj.getKanton()));
                mappedObj.setGdeNrBFS(srcObj.getGdeNrBFS());
                mappedObj.setLokalitaet(srcObj.getLokalitaet());
                mappedObj.setHoeheTerrain(srcObj.getHoeheTerrain());
                mappedObj.setHoeheAuslauf(srcObj.getHoeheAuslauf());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                mappedObj.setQkatPlanNr(srcObj.getQkatPlanNr());
                mappedObj.setGrundstNr(srcObj.getGrundstNr());
                mappedObj.setKontaktDatum(LegacyUtil.mapDate(srcObj.getKontaktDatum()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                // TODO
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setIdentifikator("ZG-"+srcObj.getGUID());
                mappedObj.setArtSammeleinrichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_ArtSammeleinrichtung.Qwf);
                IomObject geom=srcObj.getGeometrie();
                mappedObj.setGeometrie(geom);
                mappedObj.setTyp(mapSammeleinrichtungTyp(srcObj.getTyp()));
                mappedObj.setFsgHorizont(srcObj.getFsgHorizont());
                mappedObj.setFsgStrangNr(srcObj.getFsgStrangNr());
                mappedObj.setFsgHorizontKote(srcObj.getFsgHorizontKote());
                mappedObj.setLtgDimension(srcObj.getLtgDimension());
                mappedObj.setFsgLeitungRichtung(mapFsgLtgRichtung(srcObj.getFsgLeitungRichtung()));
                mappedObj.setFsgLeitungLaenge(mapFsgLtgLaenge(srcObj.getFsgLeitungLaenge()));
                mappedObj.setBetriebsArt(mapBetriebsArt(srcObj.getBetriebArt()));
                mappedObj.setSchuettmengeMin(srcObj.getSchuettmengeMin());
                mappedObj.setErtragMinAng(mapErtragAngaben(srcObj.getErtragMinAng()));
                mappedObj.setSchuettmengeMax(srcObj.getSchuettmengeMax());
                mappedObj.setErtragMaxAng(mapErtragAngaben(srcObj.getErtragMaxAng()));
                mappedObj.setSchuettmengeMittl(srcObj.getSchuettmengeMittl());
                mappedObj.setErtragMittlAng(mapErtragAngaben(srcObj.getErtragMittlAng()));
                mappedObj.setNachfuehrungsstand(LegacyUtil.mapDate(srcObj.getNachfuehrungsstand()));
                mappedObj.setBemerkungen(srcObj.getBemerkungen());
                mappedObj.setMutatBemerk(srcObj.getMutatBemerk());
                mappedObj.setDetailplanArt(mapDetailplanArt(srcObj.getDetailplanArt()));
                mappedObj.setDetailplanDatum(LegacyUtil.mapDate(srcObj.getDetailplanDatum()));
                mappedObj.setDetailplanMstab(mapDetailplanMstab(srcObj.getDetailplanMstab()));
                mappedObj.setDetailplanHerkunft(mapErfVorlHerkunft(srcObj.getDetailplanHerkunft()));
                mappedObj.setDetailplanNr(srcObj.getDetailplanNr());
                mappedObj.setErfGenauigkeit(mapErfGenauigkeit(srcObj.getErfGenauigkeit()));
                mappedObj.setGeometrieHerkunft(mapHerkunftsart(srcObj.getGeometrieHerkunft()));
                mappedObj.setErfVorlBemerk(mapErfVorlBemerk(srcObj.getErfVorlBemerk()));
                // TODO Beziehungen
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Punkt mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Punkt(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setGUID(srcObj.getGUID());
                // TODO
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setGUID(srcObj.getGUID());
                // TODO
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }else if(obj instanceof ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit){
                ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit srcObj=(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit)obj;
                ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit mappedObj=new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit(LegacyUtil.stripUUID(srcObj.getGUID()));
                mappedObj.setGUID(srcObj.getGUID());
                // TODO
                events.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
            }
        }
        
    }
    private Rueckgabebrunnen_Nutzungszustand mapBetriebsArt2Nutzungszustand(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt src) {
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
    private ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt mapBetriebsArt(BetriebArt src) {
        if(src==null) {
            return null;
        }else if(src.equals(BetriebArt.in_Betrieb)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.in_Betrieb;
        }else if(src.equals(BetriebArt.ausser_Betrieb)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.ausser_Betrieb;
        }else if(src.equals(BetriebArt.stillgelegt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.stillgelegt;
        }else if(src.equals(BetriebArt.ungenutzt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt;
        }else if(src.equals(BetriebArt.zerstoert)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt;
        }else if(src.equals(BetriebArt.unbekannt)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt;
        }else if(src.equals(BetriebArt.im_Verwurf)) {
            return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.unbekannt;
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
            return null;
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
    private ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ mapSammeleinrichtungTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp src) {
        
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
    public IomObject getMappedObject() {
        if(events.isEmpty()) {
            return null;
        }
        IoxEvent front=events.remove(0);
        return ((ObjectEvent)front).getIomObject();
    }

}
