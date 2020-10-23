package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class EntbruGSBAoTw extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw";
  public EntbruGSBAoTw(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_EntbruGUID="EntbruGUID";
  public String getEntbruGUID() {
    String value=getattrvalue("EntbruGUID");
    return value;
  }
  public void setEntbruGUID(String value) {
    setattrvalue("EntbruGUID", value);
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
