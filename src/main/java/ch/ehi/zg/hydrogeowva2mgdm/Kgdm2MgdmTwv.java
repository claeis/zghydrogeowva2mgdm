package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.ArrayList;
import java.util.List;

import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.metamodel.Model;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.iox.EndBasketEvent;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.StartBasketEvent;
import ch.interlis.iox_j.filter.ReduceToBaseModel;
import ch.interlis.models.TWVINNOTLAGEN_LV95_V1;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;

public class Kgdm2MgdmTwv extends ReduceToBaseModel {

    public Kgdm2MgdmTwv(TransferDescription td, Settings config) {
        super();
        List<Model> twvModel=new ArrayList<Model>();
        twvModel.add((Model) td.getElement(TWVINNOTLAGEN_LV95_V1.MODEL));
        setup(twvModel, td, config);
    }
    private boolean filter=false;
    @Override
    public IoxEvent filter(IoxEvent event) throws IoxException {
        if(filter) {
            if(event instanceof EndBasketEvent) {
                filter=false;
            }
            return null;
        }
        IoxEvent ret=super.filter(event);
        if(ret!=null) {
            if(ret instanceof StartBasketEvent) {
                if(((StartBasketEvent) ret).getType().equals(ZG_HYDROGEO_WVA_V1.TransferMetadaten)) {
                    filter=true;
                    ret=null;
                }
            }
        }
        return ret;
    }

}
