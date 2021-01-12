package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class ObFasGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone";
  public ObFasGWSZone(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObFasGUID="ObFasGUID";
  public String getObFasGUID() {
    ch.interlis.iom.IomObject value=getattrobj("ObFasGUID",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setObFasGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("ObFasGUID",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("ObFasGUID","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("ObFasGUID",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_GWSZoneGUID="GWSZoneGUID";
  public String getGWSZoneGUID() {
    ch.interlis.iom.IomObject value=getattrobj("GWSZoneGUID",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGWSZoneGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GWSZoneGUID",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GWSZoneGUID","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GWSZoneGUID",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
