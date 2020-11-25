package ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte;
public class Rueckgabebrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Rueckgabebrunnen";
  public Rueckgabebrunnen(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
  }
  public final static String tag_Name="Name";
  public String getName() {
    if(getattrvaluecount("Name")==0)return null;
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    if(value==null){setattrundefined("Name");return;}
    setattrvalue("Name", value);
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand getNutzungszustand() {
    String value=getattrvalue("Nutzungszustand");
    return ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand value) {
    setattrvalue("Nutzungszustand", ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    if(getattrvaluecount("Zweck")==0)return null;
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    if(value==null){setattrundefined("Zweck");return;}
    setattrvalue("Zweck", value);
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
}
