package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Fassungsbrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Fassungsbrunnen";
  public Fassungsbrunnen(String oid) {
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
  public final static String tag_Brunnenart="Brunnenart";
  public Fassungsbrunnen_Brunnenart getBrunnenart() {
    String value=getattrvalue("Brunnenart");
    return Fassungsbrunnen_Brunnenart.parseXmlCode(value);
  }
  public void setBrunnenart(Fassungsbrunnen_Brunnenart value) {
    setattrvalue("Brunnenart", Fassungsbrunnen_Brunnenart.toXmlCode(value));
  }
  public final static String tag_Foerdermethode="Foerdermethode";
  public Fassungsbrunnen_Foerdermethode getFoerdermethode() {
    String value=getattrvalue("Foerdermethode");
    return Fassungsbrunnen_Foerdermethode.parseXmlCode(value);
  }
  public void setFoerdermethode(Fassungsbrunnen_Foerdermethode value) {
    setattrvalue("Foerdermethode", Fassungsbrunnen_Foerdermethode.toXmlCode(value));
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Nutzungszustand getNutzungszustand() {
    String value=getattrvalue("Nutzungszustand");
    return ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Nutzungszustand value) {
    setattrvalue("Nutzungszustand", ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte.Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Trinkwasser="Trinkwasser";
  public ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNein getTrinkwasser() {
    String value=getattrvalue("Trinkwasser");
    return ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNein.parseXmlCode(value);
  }
  public void setTrinkwasser(ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNein value) {
    setattrvalue("Trinkwasser", ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNein.toXmlCode(value));
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
  public final static String tag_Notwasserversorgung="Notwasserversorgung";
  public ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt getNotwasserversorgung() {
    String value=getattrvalue("Notwasserversorgung");
    return ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setNotwasserversorgung(ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt value) {
    setattrvalue("Notwasserversorgung", ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Oeffentliches_Interesse="Oeffentliches_Interesse";
  public ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt getOeffentliches_Interesse() {
    String value=getattrvalue("Oeffentliches_Interesse");
    return ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setOeffentliches_Interesse(ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt value) {
    setattrvalue("Oeffentliches_Interesse", ch.interlis.models.Grundwasseraustritte_LV95_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Pkonz="Pkonz";
  public Double getPkonz() {
    if(getattrvaluecount("Pkonz")==0)return null;
    String value=getattrvalue("Pkonz");
    return Double.parseDouble(value);
  }
  public void setPkonz(Double value) {
    if(value==null){setattrundefined("Pkonz");return;}
    setattrvalue("Pkonz", Double.toString(value));
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
