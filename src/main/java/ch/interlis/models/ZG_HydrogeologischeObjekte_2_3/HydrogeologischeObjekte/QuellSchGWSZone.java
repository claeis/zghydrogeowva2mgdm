package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QuellSchGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone";
  public QuellSchGWSZone(String oid) {
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
  public final static String tag_GWSZoneGUID="GWSZoneGUID";
  public String getGWSZoneGUID() {
    String value=getattrvalue("GWSZoneGUID");
    return value;
  }
  public void setGWSZoneGUID(String value) {
    setattrvalue("GWSZoneGUID", value);
  }
}
