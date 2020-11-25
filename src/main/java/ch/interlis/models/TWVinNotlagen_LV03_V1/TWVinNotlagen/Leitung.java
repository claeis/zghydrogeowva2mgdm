package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Leitung extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Basisattribute
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.Leitung";
  public Leitung(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Nennweite="Nennweite";
  public double getNennweite() {
    String value=getattrvalue("Nennweite");
    return Double.parseDouble(value);
  }
  public void setNennweite(double value) {
    setattrvalue("Nennweite", Double.toString(value));
  }
}
