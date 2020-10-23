package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class EntbruGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone";
  public EntbruGWSZone(String oid) {
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
  public final static String tag_GWSZoneGUID="GWSZoneGUID";
  public String getGWSZoneGUID() {
    String value=getattrvalue("GWSZoneGUID");
    return value;
  }
  public void setGWSZoneGUID(String value) {
    setattrvalue("GWSZoneGUID", value);
  }
}
