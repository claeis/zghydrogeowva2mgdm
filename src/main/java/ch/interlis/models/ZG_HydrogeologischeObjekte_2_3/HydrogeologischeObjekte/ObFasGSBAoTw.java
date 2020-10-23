package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasGSBAoTw extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw";
  public ObFasGSBAoTw(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObGewFasGUID="ObGewFasGUID";
  public String getObGewFasGUID() {
    String value=getattrvalue("ObGewFasGUID");
    return value;
  }
  public void setObGewFasGUID(String value) {
    setattrvalue("ObGewFasGUID", value);
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
