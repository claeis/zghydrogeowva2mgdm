package ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte;
public class Quelle extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Quelle";
  public Quelle(String oid) {
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
  public final static String tag_Grundwasserleiter_Typ="Grundwasserleiter_Typ";
  public Quelle_Grundwasserleiter_Typ getGrundwasserleiter_Typ() {
    String value=getattrvalue("Grundwasserleiter_Typ");
    return Quelle_Grundwasserleiter_Typ.parseXmlCode(value);
  }
  public void setGrundwasserleiter_Typ(Quelle_Grundwasserleiter_Typ value) {
    setattrvalue("Grundwasserleiter_Typ", Quelle_Grundwasserleiter_Typ.toXmlCode(value));
  }
  public final static String tag_Quelltyp="Quelltyp";
  public String getQuelltyp() {
    String value=getattrvalue("Quelltyp");
    return value;
  }
  public void setQuelltyp(String value) {
    setattrvalue("Quelltyp", value);
  }
  public final static String tag_Fassungsart="Fassungsart";
  public Quelle_Fassungsart getFassungsart() {
    String value=getattrvalue("Fassungsart");
    return Quelle_Fassungsart.parseXmlCode(value);
  }
  public void setFassungsart(Quelle_Fassungsart value) {
    setattrvalue("Fassungsart", Quelle_Fassungsart.toXmlCode(value));
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand getNutzungszustand() {
    String value=getattrvalue("Nutzungszustand");
    return ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand value) {
    setattrvalue("Nutzungszustand", ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Trinkwasser="Trinkwasser";
  public ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNein getTrinkwasser() {
    String value=getattrvalue("Trinkwasser");
    return ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNein.parseXmlCode(value);
  }
  public void setTrinkwasser(ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNein value) {
    setattrvalue("Trinkwasser", ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNein.toXmlCode(value));
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    setattrvalue("Zweck", value);
  }
  public final static String tag_Notwasserversorgung="Notwasserversorgung";
  public ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt getNotwasserversorgung() {
    String value=getattrvalue("Notwasserversorgung");
    return ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setNotwasserversorgung(ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt value) {
    setattrvalue("Notwasserversorgung", ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Oeffentliches_Interesse="Oeffentliches_Interesse";
  public ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt getOeffentliches_Interesse() {
    String value=getattrvalue("Oeffentliches_Interesse");
    return ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setOeffentliches_Interesse(ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt value) {
    setattrvalue("Oeffentliches_Interesse", ch.interlis.models.Grundwasseraustritte_LV03_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Schuettung_minimal="Schuettung_minimal";
  public double getSchuettung_minimal() {
    String value=getattrvalue("Schuettung_minimal");
    return Double.parseDouble(value);
  }
  public void setSchuettung_minimal(double value) {
    setattrvalue("Schuettung_minimal", Double.toString(value));
  }
  public final static String tag_Schuettung_mittel="Schuettung_mittel";
  public double getSchuettung_mittel() {
    String value=getattrvalue("Schuettung_mittel");
    return Double.parseDouble(value);
  }
  public void setSchuettung_mittel(double value) {
    setattrvalue("Schuettung_mittel", Double.toString(value));
  }
  public final static String tag_Schuettung_maximal="Schuettung_maximal";
  public double getSchuettung_maximal() {
    String value=getattrvalue("Schuettung_maximal");
    return Double.parseDouble(value);
  }
  public void setSchuettung_maximal(double value) {
    setattrvalue("Schuettung_maximal", Double.toString(value));
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
