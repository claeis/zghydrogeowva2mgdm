package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class EntbruZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu";
  public EntbruZsBeZu(String oid) {
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
  public final static String tag_ZsBeZuGUID="ZsBeZuGUID";
  public String getZsBeZuGUID() {
    String value=getattrvalue("ZsBeZuGUID");
    return value;
  }
  public void setZsBeZuGUID(String value) {
    setattrvalue("ZsBeZuGUID", value);
  }
}
