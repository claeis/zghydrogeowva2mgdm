package ch.ehi.zg.hydrogeowva2mgdm;

import java.util.UUID;

import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.Iom_jObject;

public class LegacyUtil {

    private LegacyUtil() {
    }

    public static String stripUUID(String guid) {
        if(guid.startsWith("{")) {
            return guid.substring(1,guid.length()-1);
        }
        return guid;
    }

    public static IomObject mapCoord(IomObject coord) {
        return LegacyUtil.mapCoord(Double.parseDouble(coord.getattrprim("C1",0)), Double.parseDouble(coord.getattrprim("C2",0)));
    }

    public static  IomObject mapPolyline(IomObject polylineObj) {
        if(polylineObj==null) {
            return null;
        }
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

    public static  IomObject mapCoord(double y,double x) 
    {
        IomObject coord=new ch.interlis.iom_j.Iom_jObject("COORD", null);
        coord.setattrvalue("C1", Double.toString(y+2000000.0));
        coord.setattrvalue("C2", Double.toString(x+1000000.0));
        return coord;
    }

    public static String mapDate(String datum) {
        if(datum!=null) {
            return datum.substring(0,4)+"-"+datum.substring(4,6)+"-"+datum.substring(6,8);
        }
        return null;
    }

    public static String newUUID() {
        return UUID.randomUUID().toString();
    }

}
