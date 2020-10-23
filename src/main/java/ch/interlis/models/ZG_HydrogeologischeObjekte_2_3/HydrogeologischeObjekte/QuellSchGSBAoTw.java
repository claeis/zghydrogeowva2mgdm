package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QuellSchGSBAoTw extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw";
  public QuellSchGSBAoTw(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSchGUID="QuellSchGUID";
  public String getQuellSchGUID() {
    String value=getattrvalue("QuellSchGUID");
    return value;
  }
  public void setQuellSchGUID(String value) {
    setattrvalue("QuellSchGUID", value);
  }
  public final static String tag_GSBAoTwGUID="GSBAoTwGUID";
  public String getGSBAoTwGUID() {
    String value=getattrvalue("GSBAoTwGUID");
    return value;
  }
  public void setGSBAoTwGUID(String value) {
    setattrvalue("GSBAoTwGUID", value);
  }
}
