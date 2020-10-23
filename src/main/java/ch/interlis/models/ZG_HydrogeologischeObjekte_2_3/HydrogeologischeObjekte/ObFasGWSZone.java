package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone";
  public ObFasGWSZone(String oid) {
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
  public final static String tag_GWSZoneGUID="GWSZoneGUID";
  public String getGWSZoneGUID() {
    String value=getattrvalue("GWSZoneGUID");
    return value;
  }
  public void setGWSZoneGUID(String value) {
    setattrvalue("GWSZoneGUID", value);
  }
}
