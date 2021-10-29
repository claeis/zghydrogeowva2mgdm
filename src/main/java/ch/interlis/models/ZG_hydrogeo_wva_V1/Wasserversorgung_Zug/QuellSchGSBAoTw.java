package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QuellSchGSBAoTw extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw";
  public QuellSchGSBAoTw(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSch="QuellSch";
  public String getQuellSch() {
    ch.interlis.iom.IomObject value=getattrobj("QuellSch",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuellSch(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("QuellSch",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("QuellSch","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("QuellSch",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_GSBAoTw="GSBAoTw";
  public String getGSBAoTw() {
    ch.interlis.iom.IomObject value=getattrobj("GSBAoTw",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGSBAoTw(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GSBAoTw",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GSBAoTw","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GSBAoTw",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
