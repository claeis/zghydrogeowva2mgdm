package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu";
  public ObFasZsBeZu(String oid) {
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
  public final static String tag_ZsBeZuGUID="ZsBeZuGUID";
  public String getZsBeZuGUID() {
    String value=getattrvalue("ZsBeZuGUID");
    return value;
  }
  public void setZsBeZuGUID(String value) {
    setattrvalue("ZsBeZuGUID", value);
  }
}
