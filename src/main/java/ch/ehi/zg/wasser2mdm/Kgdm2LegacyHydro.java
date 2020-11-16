package ch.ehi.zg.wasser2mdm;

import java.util.ArrayList;
import java.util.List;

import ch.ehi.basics.settings.Settings;
import ch.interlis.iom.IomObject;
import ch.interlis.iox.*;
import ch.interlis.models.GRUNDWASSERAUSTRITTE_LV95_V1;
import ch.interlis.models.ZG_HYDROGEOLOGISCHEOBJEKTE_2_3;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;
import ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsstrang_Stollen_Typ;
import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung_Typ;

public class Kgdm2LegacyHydro {

    private List<IoxEvent> pendingEvents=new ArrayList<IoxEvent>();
    private String appName;
    private boolean collectObjects=false;
    
    public Kgdm2LegacyHydro(Settings settings) {
        appName=settings.getValue(Zgwasser2mdm.SETTING_APPNAME);

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
                pendingEvents.add(new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEOLOGISCHEOBJEKTE_2_3.HydrogeologischeObjekte,"b1"));
            }
        }else if(event instanceof ObjectEvent) {
            if(collectObjects) {
                IomObject iomObj=((ObjectEvent) event).getIomObject();
                if(iomObj instanceof ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung) {
                    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung from=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung)iomObj;
                    ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf to=new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf(from.getobjectoid());
                    pendingEvents.add(new ch.interlis.iox_j.ObjectEvent(to));
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

    private Fassungsstrang_Stollen_Typ mapSammeleinrichtung_Typ(Sammeleinrichtung_Typ typ) {
        // Werteliste ist identisch
        return Fassungsstrang_Stollen_Typ.parseXmlCode(Sammeleinrichtung_Typ.toXmlCode(typ));
    }

    public IoxEvent getMappedEvent() {
        IoxEvent ret=null;
        if(!pendingEvents.isEmpty()) {
            ret=pendingEvents.remove(0);
        }
        return ret;
    }


}
