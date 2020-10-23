package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Adresse extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse";
  public Adresse(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Vorname="Vorname";
  public String getVorname() {
    String value=getattrvalue("Vorname");
    return value;
  }
  public void setVorname(String value) {
    setattrvalue("Vorname", value);
  }
  public final static String tag_Adresse="Adresse";
  public String getAdresse() {
    String value=getattrvalue("Adresse");
    return value;
  }
  public void setAdresse(String value) {
    setattrvalue("Adresse", value);
  }
  public final static String tag_PLZ="PLZ";
  public int getPLZ() {
    String value=getattrvalue("PLZ");
    return Integer.parseInt(value);
  }
  public void setPLZ(int value) {
    setattrvalue("PLZ", Integer.toString(value));
  }
  public final static String tag_Ort="Ort";
  public String getOrt() {
    String value=getattrvalue("Ort");
    return value;
  }
  public void setOrt(String value) {
    setattrvalue("Ort", value);
  }
  public final static String tag_TelefonP="TelefonP";
  public String getTelefonP() {
    String value=getattrvalue("TelefonP");
    return value;
  }
  public void setTelefonP(String value) {
    setattrvalue("TelefonP", value);
  }
  public final static String tag_TelefonG="TelefonG";
  public String getTelefonG() {
    String value=getattrvalue("TelefonG");
    return value;
  }
  public void setTelefonG(String value) {
    setattrvalue("TelefonG", value);
  }
  public final static String tag_Email="Email";
  public String getEmail() {
    String value=getattrvalue("Email");
    return value;
  }
  public void setEmail(String value) {
    setattrvalue("Email", value);
  }
}
