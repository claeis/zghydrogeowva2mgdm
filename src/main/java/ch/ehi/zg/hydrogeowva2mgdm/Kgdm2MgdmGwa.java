package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.List;

import ch.ehi.basics.settings.Settings;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.*;
import ch.interlis.models.GRUNDWASSERAUSTRITTE_LV95_V1;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNein;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Anreicherungsanlage_Typ;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsbrunnen_Brunnenart;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsstrang_Stollen_Typ;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Nutzungszustand;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Quelle_Fassungsart;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Quelle_Grundwasserleiter_Typ;
import ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand;
import ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText;

public class Kgdm2MgdmGwa {

    private List<IoxEvent> pendingEvents=new ArrayList<IoxEvent>();
    private String appName;
    private boolean collectObjects=false;
    
    public Kgdm2MgdmGwa(Settings settings) {
        appName=settings.getValue(Converter.SETTING_APPNAME);

    }

    public void close() {
        collectObjects=false;
        pendingEvents=new ArrayList<IoxEvent>();
        
    }

    public void addInput(IoxEvent event) throws IoxException {
        if(event instanceof StartTransferEvent) {
            pendingEvents.add(new ch.interlis.iox_j.StartTransferEvent(appName));
        }else if(event instanceof StartBasketEvent) {
            if(((StartBasketEvent) event).getType().equals(ZG_HYDROGEO_WVA_V1.Wasserversorgung_Zug)) {
                collectObjects=true;
                pendingEvents.add(new ch.interlis.iox_j.StartBasketEvent(GRUNDWASSERAUSTRITTE_LV95_V1.Grundwasseraustritte,"b1"));
            }
        }else if(event instanceof ObjectEvent) {
            if(collectObjects) {
                IomObject iomObj=((ObjectEvent) event).getIomObject();
                if(false) {
                }else if(iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube) {
                }else if(iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung) {
                }else if(iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage)iomObj;
                    ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Anreicherungsanlage mappedObj=new ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Anreicherungsanlage(srcObj.getobjectoid());
                    mappedObj.setIdentifikator(srcObj.getIdentifikator());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setTyp(mapAnreicherungsanlage_Typ(srcObj.getTyp())); 
                    mappedObj.setTyp_Bemerkung(srcObj.getTyp_Bemerkung());
                    mappedObj.setMax_Versickerung(srcObj.getMax_Versickerung());
                    mappedObj.setBezugsgewaesser(srcObj.getBezugsgewaesser());
                    mappedObj.setZweck(srcObj.getZweck());
                    mappedObj.setGeometriePunkt(srcObj.getGeometriePunkt());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnrNrAfu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes) {

                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Flaeche) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Punkt) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg) {
                    // gibt es nicht im MGDM
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
                    ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsbrunnen mappedObj=new ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsbrunnen(srcObj.getobjectoid());
                    mappedObj.setIdentifikator(srcObj.getIdentifikator());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setBrunnenart(mapBrunnenart(srcObj.getEntnahmebrunnenTyp()));
                    // TODO mappedObj.setFoerdermethode(srcObj.getFoerdermethode());
                    mappedObj.setNutzungszustand(mapNutzungszustand(srcObj.getNutzungszustand()));
                    mappedObj.setTrinkwasser(mapJaNein(srcObj.getTrinkwasser()));
                    mappedObj.setZweck(mapTexte(srcObj.getVerwendungszweck()));
                    mappedObj.setNotwasserversorgung(mapJaNeinUnbestimmt(srcObj.getNotwasserversorgung()));
                    // TODO mappedObj.setOeffentliches_Interesse(srcObj.get);
                    final Integer pkonz = srcObj.getPkonz();
                    if(pkonz!=null) {
                        mappedObj.setPkonz(pkonz.doubleValue());
                    }
                    mappedObj.setGeometrie(srcObj.getGeometrie());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));

                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg) {
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos) {
                    // gibt es nicht im MGDM
                
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson) {
                    // gibt es nicht im MGDM

                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe) {
                    // gibt es nicht im MGDM
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellScha_SaSchaText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt 
                        || iomObj instanceof ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle) {
                    ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle srcObj=(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle)iomObj;
                    ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Quelle mappedObj=new ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Quelle(srcObj.getobjectoid());
                    mappedObj.setIdentifikator(srcObj.getIdentifikator());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setGrundwasserleiter_Typ(mapQuelle_Grundwasserleiter_Typ(srcObj.getGrundwasserleiter_Typ()));
                    mappedObj.setQuelltyp(srcObj.getQuelltyp());
                    mappedObj.setFassungsart(mapQuelle_Fassungsart(srcObj.getFassungsart()));
                    mappedObj.setNutzungszustand(mapNutzungszustand(srcObj.getNutzungszustand()));
                    mappedObj.setTrinkwasser(mapJaNein(srcObj.getTrinkwasser()));
                    mappedObj.setZweck(srcObj.getZweck());
                    mappedObj.setNotwasserversorgung(mapJaNeinUnbestimmt(srcObj.getNotwasserversorgung()));
                    mappedObj.setOeffentliches_Interesse(mapJaNeinUnbestimmt(srcObj.getOeffentliches_Interesse()));
                    mappedObj.setSchuettung_minimal(mapLiterMinute(srcObj.getSchuettung_minimal()));
                    mappedObj.setSchuettung_mittel(mapLiterMinute(srcObj.getSchuettung_mittel()));
                    mappedObj.setSchuettung_maximal(mapLiterMinute(srcObj.getSchuettung_maximal()));
                    mappedObj.setGeometrie(srcObj.getGeometrie());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResText) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen)iomObj;
                    ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Rueckgabebrunnen mappedObj=new ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Rueckgabebrunnen(srcObj.getobjectoid());
                    mappedObj.setIdentifikator(srcObj.getIdentifikator());
                    mappedObj.setName(srcObj.getName());
                    mappedObj.setNutzungszustand(mapNutzungszustand(srcObj.getNutzungszustand()));
                    mappedObj.setZweck(srcObj.getZweck());
                    mappedObj.setGeometrie(srcObj.getGeometrie());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung 
                        || iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung srcObj=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung)iomObj;
                    ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsstrang_Stollen mappedObj=new ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsstrang_Stollen(srcObj.getobjectoid());
                    mappedObj.setIdentifikator(srcObj.getIdentifikator());
                    mappedObj.setTyp(mapSammeleinrichtung_Typ(srcObj.getTyp()));
                    mappedObj.setGeometrie(srcObj.getGeometrie());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(mappedObj));
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit) {
                    // gibt es nicht im MGDM
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
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg) {
                    
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung) {
                    // gibt es nicht im MGDM
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage) {
                }else if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg) {
                }
            }
        }else if(event instanceof EndBasketEvent) {
            if(collectObjects) {
                collectObjects=false;
                pendingEvents.add(new ch.interlis.iox_j.EndBasketEvent());
            }
        }else if(event instanceof EndTransferEvent) {
            pendingEvents.add(new ch.interlis.iox_j.EndTransferEvent());
        }
        return;
    }

    private String mapTexte(ch.interlis.models.ZG_hydrogeo_wva_V1.Texte src) {
        if(src==null) {
            return null;
        }
        if(src.sizeTexte()==0) {
            return null;
        }
        StringBuffer ret=new StringBuffer();
        String sep="";
        for(HilfsText txt:src.getTexte()){
            String t=txt.getText();
            if(t!=null) {
                t=t.trim();
                if(t.length()>0) {
                    ret.append(sep);
                    ret.append(t);
                    sep=" ";
                }
            }
        }
        return ret.toString();
    }

    private Fassungsbrunnen_Brunnenart mapBrunnenart(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.einfacheGWFassung)) {
            return Fassungsbrunnen_Brunnenart.Vertikalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.HorizontalfilterBrunnen)) {
            return Fassungsbrunnen_Brunnenart.Horizontalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.VertikalfilterBrunnen)) {
            return Fassungsbrunnen_Brunnenart.Vertikalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.Sodbrunnen)) {
            return Fassungsbrunnen_Brunnenart.Sod_Schachtbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.Rohr)) {
            return Fassungsbrunnen_Brunnenart.Vertikalfilterbrunnen;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.andere)) {
            return Fassungsbrunnen_Brunnenart.andere;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.EntnahmebrunnenTyp.unbekannt)) {
            return Fassungsbrunnen_Brunnenart.andere;
        }
        throw new IllegalArgumentException();
    }

    private Anreicherungsanlage_Typ mapAnreicherungsanlage_Typ(
            ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ.oberirdisch)) {
            return Anreicherungsanlage_Typ.oberirdisch;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ.unterirdisch)) {
            return Anreicherungsanlage_Typ.unterirdisch;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ.kombiniert)) {
            return Anreicherungsanlage_Typ.kombiniert;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage_Typ.unbestimmt)) {
            return Anreicherungsanlage_Typ.unbestimmt;
        }
        throw new IllegalArgumentException();
    }

    private Double mapLiterMinute(Integer src) {
        if(src==null) {
            return null;
        }
        return new Double(src);
    }

    private JaNeinUnbestimmt mapJaNeinUnbestimmt(
            ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.ja)) {
            return JaNeinUnbestimmt.ja;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.nein)) {
            return JaNeinUnbestimmt.nein;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.unbestimmt)) {
            return JaNeinUnbestimmt.unbestimmt;
        }
        throw new IllegalArgumentException();
    }

    private JaNein mapJaNein(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.ja)) {
            return JaNein.ja;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.nein)) {
            return JaNein.nein;
        }
        throw new IllegalArgumentException();
    }

    private Nutzungszustand mapNutzungszustand(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.genutzt)) {
            return Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.ungenutzt)) {
            return Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.aufgehoben)) {
            return Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Nutzungszustand.unbestimmt)) {
            return Nutzungszustand.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private Nutzungszustand mapNutzungszustand(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand.genutzt)) {
            return Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand.ungenutzt)) {
            return Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand.aufgehoben)) {
            return Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen_Nutzungszustand.unbestimmt)) {
            return Nutzungszustand.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private Nutzungszustand mapNutzungszustand(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.genutzt)) {
            return Nutzungszustand.genutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.ungenutzt)) {
            return Nutzungszustand.ungenutzt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.aufgehoben)) {
            return Nutzungszustand.aufgehoben;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung_Nutzungszustand.unbestimmt)) {
            return Nutzungszustand.unbestimmt;
        }
        throw new IllegalArgumentException();
    }
    private Quelle_Fassungsart mapQuelle_Fassungsart(
            ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.ungefasst)) {
            return Quelle_Fassungsart.ungefasst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_direkt)) {
            return Quelle_Fassungsart.gefasst_direkt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_Fassungsstrang)) {
            return Quelle_Fassungsart.gefasst_Fassungsstrang;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_Fassungsstollen)) {
            return Quelle_Fassungsart.gefasst_Fassungsstollen;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Fassungsart.gefasst_unbestimmt)) {
            return Quelle_Fassungsart.gefasst_unbestimmt;
        }
        throw new IllegalArgumentException();
    }

    private Quelle_Grundwasserleiter_Typ mapQuelle_Grundwasserleiter_Typ(
            ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ src) {
        if(src==null) {
            return null;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ.Lockergestein)) {
            return Quelle_Grundwasserleiter_Typ.Lockergestein;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ.Kluft)) {
            return Quelle_Grundwasserleiter_Typ.Kluft;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ.Karst)) {
            return Quelle_Grundwasserleiter_Typ.Karst;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ.gemischt)) {
            return Quelle_Grundwasserleiter_Typ.gemischt;
        }else if(src.equals(ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle_Grundwasserleiter_Typ.unbestimmt)) {
            return Quelle_Grundwasserleiter_Typ.unbestimmt;
        }
        throw new IllegalArgumentException();
    }

    private Fassungsstrang_Stollen_Typ mapSammeleinrichtung_Typ(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ typ) {
        // Werteliste ist identisch
        return Fassungsstrang_Stollen_Typ.parseXmlCode(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ.toXmlCode(typ));
    }

    public IoxEvent getMappedEvent() {
        IoxEvent ret=null;
        if(!pendingEvents.isEmpty()) {
            ret=pendingEvents.remove(0);
        }
        return ret;
    }


}
