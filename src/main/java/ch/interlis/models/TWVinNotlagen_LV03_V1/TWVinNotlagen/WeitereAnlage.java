package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class WeitereAnlage extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Basisattribute
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.WeitereAnlage";
  public WeitereAnlage(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Art="Art";
  public WeitereAnlage_Art getArt() {
    String value=getattrvalue("Art");
    return WeitereAnlage_Art.parseXmlCode(value);
  }
  public void setArt(WeitereAnlage_Art value) {
    setattrvalue("Art", WeitereAnlage_Art.toXmlCode(value));
  }
  public final static String tag_Aufbereitung="Aufbereitung";
  public ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt getAufbereitung() {
    String value=getattrvalue("Aufbereitung");
    return ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setAufbereitung(ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt value) {
    setattrvalue("Aufbereitung", ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Geometrie="Geometrie";
  public ch.interlis.iom.IomObject getGeometrie() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
  }
}
