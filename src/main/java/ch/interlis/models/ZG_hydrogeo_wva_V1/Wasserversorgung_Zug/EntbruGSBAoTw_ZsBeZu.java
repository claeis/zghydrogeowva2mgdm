package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class EntbruGSBAoTw_ZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu";
  public EntbruGSBAoTw_ZsBeZu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_EntbruGUID="EntbruGUID";
  public String getEntbruGUID() {
    ch.interlis.iom.IomObject value=getattrobj("EntbruGUID",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setEntbruGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("EntbruGUID",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("EntbruGUID","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("EntbruGUID",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_GSBAoTw_ZsBeZuGUID="GSBAoTw_ZsBeZuGUID";
  public String getGSBAoTw_ZsBeZuGUID() {
    ch.interlis.iom.IomObject value=getattrobj("GSBAoTw_ZsBeZuGUID",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGSBAoTw_ZsBeZuGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GSBAoTw_ZsBeZuGUID",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GSBAoTw_ZsBeZuGUID","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GSBAoTw_ZsBeZuGUID",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
