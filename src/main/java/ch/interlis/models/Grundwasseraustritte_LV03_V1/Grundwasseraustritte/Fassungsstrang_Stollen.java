package ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte;
public class Fassungsstrang_Stollen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsstrang_Stollen";
  public Fassungsstrang_Stollen(String oid) {
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
  public final static String tag_Typ="Typ";
  public Fassungsstrang_Stollen_Typ getTyp() {
    String value=getattrvalue("Typ");
    return Fassungsstrang_Stollen_Typ.parseXmlCode(value);
  }
  public void setTyp(Fassungsstrang_Stollen_Typ value) {
    setattrvalue("Typ", Fassungsstrang_Stollen_Typ.toXmlCode(value));
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
