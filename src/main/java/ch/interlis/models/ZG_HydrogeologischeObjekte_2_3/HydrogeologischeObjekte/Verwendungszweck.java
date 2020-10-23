package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Verwendungszweck extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck";
  public Verwendungszweck(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    setattrvalue("Zweck", value);
  }
}
