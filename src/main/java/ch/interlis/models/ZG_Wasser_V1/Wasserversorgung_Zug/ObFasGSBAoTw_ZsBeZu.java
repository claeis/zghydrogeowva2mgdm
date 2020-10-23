package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class ObFasGSBAoTw_ZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu";
  public ObFasGSBAoTw_ZsBeZu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObFasGUID="ObFasGUID";
  public String getObFasGUID() {
    ch.interlis.iom.IomObject value=getattrobj("ObFasGUID",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setObFasGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("ObFasGUID","REF");
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
