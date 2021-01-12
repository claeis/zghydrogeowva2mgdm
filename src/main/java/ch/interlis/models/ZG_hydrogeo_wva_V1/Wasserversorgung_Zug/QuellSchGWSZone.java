package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QuellSchGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone";
  public QuellSchGWSZone(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSchGUID="QuellSchGUID";
  public String getQuellSchGUID() {
    ch.interlis.iom.IomObject value=getattrobj("QuellSchGUID",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuellSchGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("QuellSchGUID",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("QuellSchGUID","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("QuellSchGUID",0);
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
