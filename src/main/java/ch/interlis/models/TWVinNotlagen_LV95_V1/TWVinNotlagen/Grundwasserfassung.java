package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Grundwasserfassung extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung
{
  public final static String tag= "TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung";
  public Grundwasserfassung(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Durchmesser="Durchmesser";
  public double getDurchmesser() {
    String value=getattrvalue("Durchmesser");
    return Double.parseDouble(value);
  }
  public void setDurchmesser(double value) {
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
    String value=getattrvalue("Nutzungszustand");
    return Grundwasserfassung_Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(Grundwasserfassung_Nutzungszustand value) {
    setattrvalue("Nutzungszustand", Grundwasserfassung_Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Pkonz="Pkonz";
  public int getPkonz() {
    String value=getattrvalue("Pkonz");
    return Integer.parseInt(value);
  }
  public void setPkonz(int value) {
    setattrvalue("Pkonz", Integer.toString(value));
  }
}
