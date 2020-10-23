package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Wasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung";
  public Wasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_WVName="WVName";
  public String getWVName() {
    String value=getattrvalue("WVName");
    return value;
  }
  public void setWVName(String value) {
    setattrvalue("WVName", value);
  }
}
