package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Reservoir extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Basisattribute
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.Reservoir";
  public Reservoir(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Alternative_Stromversorgung="Alternative_Stromversorgung";
  public ch.interlis.models.TWVinNotlagen_LV03_V1.AlternativeStromversorgung getAlternative_Stromversorgung() {
    if(getattrvaluecount("Alternative_Stromversorgung")==0)return null;
    String value=getattrvalue("Alternative_Stromversorgung");
    return ch.interlis.models.TWVinNotlagen_LV03_V1.AlternativeStromversorgung.parseXmlCode(value);
  }
  public void setAlternative_Stromversorgung(ch.interlis.models.TWVinNotlagen_LV03_V1.AlternativeStromversorgung value) {
    if(value==null){setattrundefined("Alternative_Stromversorgung");return;}
    setattrvalue("Alternative_Stromversorgung", ch.interlis.models.TWVinNotlagen_LV03_V1.AlternativeStromversorgung.toXmlCode(value));
  }
  public final static String tag_Aufbereitung="Aufbereitung";
  public ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt getAufbereitung() {
    if(getattrvaluecount("Aufbereitung")==0)return null;
    String value=getattrvalue("Aufbereitung");
    return ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setAufbereitung(ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt value) {
    if(value==null){setattrundefined("Aufbereitung");return;}
    setattrvalue("Aufbereitung", ch.interlis.models.TWVinNotlagen_LV03_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Brauchreserve="Brauchreserve";
  public int getBrauchreserve() {
    String value=getattrvalue("Brauchreserve");
    return Integer.parseInt(value);
  }
  public void setBrauchreserve(int value) {
    setattrvalue("Brauchreserve", Integer.toString(value));
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
  public final static String tag_Loeschreserve="Loeschreserve";
  public int getLoeschreserve() {
    String value=getattrvalue("Loeschreserve");
    return Integer.parseInt(value);
  }
  public void setLoeschreserve(int value) {
    setattrvalue("Loeschreserve", Integer.toString(value));
  }
  public final static String tag_Wasserspiegel_max="Wasserspiegel_max";
  public double getWasserspiegel_max() {
    String value=getattrvalue("Wasserspiegel_max");
    return Double.parseDouble(value);
  }
  public void setWasserspiegel_max(double value) {
    setattrvalue("Wasserspiegel_max", Double.toString(value));
  }
}
