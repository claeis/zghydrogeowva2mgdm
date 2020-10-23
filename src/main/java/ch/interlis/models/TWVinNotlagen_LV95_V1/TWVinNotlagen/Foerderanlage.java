package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Foerderanlage extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute
{
  public final static String tag= "TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage";
  public Foerderanlage(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Alternative_Stromversorgung="Alternative_Stromversorgung";
  public ch.interlis.models.TWVinNotlagen_LV95_V1.AlternativeStromversorgung getAlternative_Stromversorgung() {
    String value=getattrvalue("Alternative_Stromversorgung");
    return ch.interlis.models.TWVinNotlagen_LV95_V1.AlternativeStromversorgung.parseXmlCode(value);
  }
  public void setAlternative_Stromversorgung(ch.interlis.models.TWVinNotlagen_LV95_V1.AlternativeStromversorgung value) {
    setattrvalue("Alternative_Stromversorgung", ch.interlis.models.TWVinNotlagen_LV95_V1.AlternativeStromversorgung.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public Foerderanlage_Art getArt() {
    String value=getattrvalue("Art");
    return Foerderanlage_Art.parseXmlCode(value);
  }
  public void setArt(Foerderanlage_Art value) {
    setattrvalue("Art", Foerderanlage_Art.toXmlCode(value));
  }
  public final static String tag_Aufbereitung="Aufbereitung";
  public ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt getAufbereitung() {
    String value=getattrvalue("Aufbereitung");
    return ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setAufbereitung(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt value) {
    setattrvalue("Aufbereitung", ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Dauerleistung="Dauerleistung";
  public int getDauerleistung() {
    String value=getattrvalue("Dauerleistung");
    return Integer.parseInt(value);
  }
  public void setDauerleistung(int value) {
    setattrvalue("Dauerleistung", Integer.toString(value));
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public int getFoerdermenge() {
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(int value) {
    setattrvalue("Foerdermenge", Integer.toString(value));
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
  public final static String tag_Leistung_max="Leistung_max";
  public int getLeistung_max() {
    String value=getattrvalue("Leistung_max");
    return Integer.parseInt(value);
  }
  public void setLeistung_max(int value) {
    setattrvalue("Leistung_max", Integer.toString(value));
  }
  public final static String tag_Pumpen_Anz="Pumpen_Anz";
  public int getPumpen_Anz() {
    String value=getattrvalue("Pumpen_Anz");
    return Integer.parseInt(value);
  }
  public void setPumpen_Anz(int value) {
    setattrvalue("Pumpen_Anz", Integer.toString(value));
  }
  public final static String tag_Pumpen_Text="Pumpen_Text";
  public String getPumpen_Text() {
    String value=getattrvalue("Pumpen_Text");
    return value;
  }
  public void setPumpen_Text(String value) {
    setattrvalue("Pumpen_Text", value);
  }
}
