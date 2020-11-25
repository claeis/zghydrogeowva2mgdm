package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class Wasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Wasserversorgung";
  public Wasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_WVName="WVName";
  public String getWVName() {
    if(getattrvaluecount("WVName")==0)return null;
    String value=getattrvalue("WVName");
    return value;
  }
  public void setWVName(String value) {
    if(value==null){setattrundefined("WVName");return;}
    setattrvalue("WVName", value);
  }
}
