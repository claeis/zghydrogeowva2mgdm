package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Anreicherungsanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Anreicherungsanlage";
  public Anreicherungsanlage(String oid) {
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
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Typ="Typ";
  public Anreicherungsanlage_Typ getTyp() {
    String value=getattrvalue("Typ");
    return Anreicherungsanlage_Typ.parseXmlCode(value);
  }
  public void setTyp(Anreicherungsanlage_Typ value) {
    setattrvalue("Typ", Anreicherungsanlage_Typ.toXmlCode(value));
  }
  public final static String tag_Typ_Bemerkung="Typ_Bemerkung";
  public String getTyp_Bemerkung() {
    String value=getattrvalue("Typ_Bemerkung");
    return value;
  }
  public void setTyp_Bemerkung(String value) {
    setattrvalue("Typ_Bemerkung", value);
  }
  public final static String tag_Max_Versickerung="Max_Versickerung";
  public double getMax_Versickerung() {
    String value=getattrvalue("Max_Versickerung");
    return Double.parseDouble(value);
  }
  public void setMax_Versickerung(double value) {
    setattrvalue("Max_Versickerung", Double.toString(value));
  }
  public final static String tag_Bezugsgewaesser="Bezugsgewaesser";
  public String getBezugsgewaesser() {
    String value=getattrvalue("Bezugsgewaesser");
    return value;
  }
  public void setBezugsgewaesser(String value) {
    setattrvalue("Bezugsgewaesser", value);
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    setattrvalue("Zweck", value);
  }
  public final static String tag_GeometriePunkt="GeometriePunkt";
  public ch.interlis.iom.IomObject getGeometriePunkt() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("GeometriePunkt",0);
    return value;
  }
  public void setGeometriePunkt(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("GeometriePunkt")>0){
      changeattrobj("GeometriePunkt",0, value);
    }else{
      addattrobj("GeometriePunkt", value);
    }
  }
  public final static String tag_GeometrieLinie="GeometrieLinie";
  public ch.interlis.iom.IomObject getGeometrieLinie() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("GeometrieLinie",0);
    return value;
  }
  public void setGeometrieLinie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("GeometrieLinie")>0){
      changeattrobj("GeometrieLinie",0, value);
    }else{
      addattrobj("GeometrieLinie", value);
    }
  }
  public final static String tag_GeometrieFlaeche="GeometrieFlaeche";
  public ch.interlis.iom.IomObject getGeometrieFlaeche() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("GeometrieFlaeche",0);
    return value;
  }
  public void setGeometrieFlaeche(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("GeometrieFlaeche")>0){
      changeattrobj("GeometrieFlaeche",0, value);
    }else{
      addattrobj("GeometrieFlaeche", value);
    }
  }
}
