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
    if(getattrvaluecount("Name")==0)return null;
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    if(value==null){setattrundefined("Name");return;}
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
    if(getattrvaluecount("Typ_Bemerkung")==0)return null;
    String value=getattrvalue("Typ_Bemerkung");
    return value;
  }
  public void setTyp_Bemerkung(String value) {
    if(value==null){setattrundefined("Typ_Bemerkung");return;}
    setattrvalue("Typ_Bemerkung", value);
  }
  public final static String tag_Max_Versickerung="Max_Versickerung";
  public Double getMax_Versickerung() {
    if(getattrvaluecount("Max_Versickerung")==0)return null;
    String value=getattrvalue("Max_Versickerung");
    return Double.parseDouble(value);
  }
  public void setMax_Versickerung(Double value) {
    if(value==null){setattrundefined("Max_Versickerung");return;}
    setattrvalue("Max_Versickerung", Double.toString(value));
  }
  public final static String tag_Bezugsgewaesser="Bezugsgewaesser";
  public String getBezugsgewaesser() {
    if(getattrvaluecount("Bezugsgewaesser")==0)return null;
    String value=getattrvalue("Bezugsgewaesser");
    return value;
  }
  public void setBezugsgewaesser(String value) {
    if(value==null){setattrundefined("Bezugsgewaesser");return;}
    setattrvalue("Bezugsgewaesser", value);
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
  public final static String tag_GeometriePunkt="GeometriePunkt";
  public int sizeGeometriePunkt() {return getattrvaluecount("GeometriePunkt");}
  public ch.interlis.iom.IomObject getGeometriePunkt() {
    int size=getattrvaluecount("GeometriePunkt");
    if(size==0)return null;
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
  public int sizeGeometrieLinie() {return getattrvaluecount("GeometrieLinie");}
  public ch.interlis.iom.IomObject getGeometrieLinie() {
    int size=getattrvaluecount("GeometrieLinie");
    if(size==0)return null;
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
  public int sizeGeometrieFlaeche() {return getattrvaluecount("GeometrieFlaeche");}
  public ch.interlis.iom.IomObject getGeometrieFlaeche() {
    int size=getattrvaluecount("GeometrieFlaeche");
    if(size==0)return null;
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
