package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Grundwasserfassung extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Fassung
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.Grundwasserfassung";
  public Grundwasserfassung(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Durchmesser="Durchmesser";
  public Double getDurchmesser() {
    if(getattrvaluecount("Durchmesser")==0)return null;
    String value=getattrvalue("Durchmesser");
    return Double.parseDouble(value);
  }
  public void setDurchmesser(Double value) {
    if(value==null){setattrundefined("Durchmesser");return;}
    setattrvalue("Durchmesser", Double.toString(value));
  }
  public final static String tag_Fassungsart="Fassungsart";
  public Grundwasserfassung_Fassungsart getFassungsart() {
    String value=getattrvalue("Fassungsart");
    return Grundwasserfassung_Fassungsart.parseXmlCode(value);
  }
  public void setFassungsart(Grundwasserfassung_Fassungsart value) {
    setattrvalue("Fassungsart", Grundwasserfassung_Fassungsart.toXmlCode(value));
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public Grundwasserfassung_Nutzungszustand getNutzungszustand() {
    if(getattrvaluecount("Nutzungszustand")==0)return null;
    String value=getattrvalue("Nutzungszustand");
    return Grundwasserfassung_Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(Grundwasserfassung_Nutzungszustand value) {
    if(value==null){setattrundefined("Nutzungszustand");return;}
    setattrvalue("Nutzungszustand", Grundwasserfassung_Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Pkonz="Pkonz";
  public Integer getPkonz() {
    if(getattrvaluecount("Pkonz")==0)return null;
    String value=getattrvalue("Pkonz");
    return Integer.parseInt(value);
  }
  public void setPkonz(Integer value) {
    if(value==null){setattrundefined("Pkonz");return;}
    setattrvalue("Pkonz", Integer.toString(value));
  }
}
