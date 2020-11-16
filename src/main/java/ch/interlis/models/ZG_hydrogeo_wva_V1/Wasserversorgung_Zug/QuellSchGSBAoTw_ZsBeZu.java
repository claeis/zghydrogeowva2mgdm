package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QuellSchGSBAoTw_ZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu";
  public QuellSchGSBAoTw_ZsBeZu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSchGUID="QuellSchGUID";
  public String getQuellSchGUID() {
    ch.interlis.iom.IomObject value=getattrobj("QuellSchGUID",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQuellSchGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("QuellSchGUID","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_GSBAoTw_ZsBeZuGUID="GSBAoTw_ZsBeZuGUID";
  public String getGSBAoTw_ZsBeZuGUID() {
    ch.interlis.iom.IomObject value=getattrobj("GSBAoTw_ZsBeZuGUID",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGSBAoTw_ZsBeZuGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GSBAoTw_ZsBeZuGUID","REF");
    structvalue.setobjectrefoid(oid);
  }
}
