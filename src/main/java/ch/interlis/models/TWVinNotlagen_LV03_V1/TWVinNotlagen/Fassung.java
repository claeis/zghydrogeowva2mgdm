package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Fassung extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Basisattribute
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.Fassung";
  public Fassung(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
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
  public int sizeGeometrie() {return getattrvaluecount("Geometrie");}
  public ch.interlis.iom.IomObject getGeometrie() {
    int size=getattrvaluecount("Geometrie");
    if(size==0)return null;
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
  public final static String tag_Notwasserversorgung="Notwasserversorgung";
  public ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt getNotwasserversorgung() {
    String value=getattrvalue("Notwasserversorgung");
    return ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setNotwasserversorgung(ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt value) {
    setattrvalue("Notwasserversorgung", ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Trinkwasser="Trinkwasser";
  public ch.interlis.models.TWVinNotlagen_LV03_V1.JaNein getTrinkwasser() {
    String value=getattrvalue("Trinkwasser");
    return ch.interlis.models.TWVinNotlagen_LV03_V1.JaNein.parseXmlCode(value);
  }
  public void setTrinkwasser(ch.interlis.models.TWVinNotlagen_LV03_V1.JaNein value) {
    setattrvalue("Trinkwasser", ch.interlis.models.TWVinNotlagen_LV03_V1.JaNein.toXmlCode(value));
  }
}
