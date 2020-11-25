package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Adresse extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse";
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
    if(getattrvaluecount("Vorname")==0)return null;
    String value=getattrvalue("Vorname");
    return value;
  }
  public void setVorname(String value) {
    if(value==null){setattrundefined("Vorname");return;}
    setattrvalue("Vorname", value);
  }
  public final static String tag_Adresse="Adresse";
  public String getAdresse() {
    if(getattrvaluecount("Adresse")==0)return null;
    String value=getattrvalue("Adresse");
    return value;
  }
  public void setAdresse(String value) {
    if(value==null){setattrundefined("Adresse");return;}
    setattrvalue("Adresse", value);
  }
  public final static String tag_PLZ="PLZ";
  public Integer getPLZ() {
    if(getattrvaluecount("PLZ")==0)return null;
    String value=getattrvalue("PLZ");
    return Integer.parseInt(value);
  }
  public void setPLZ(Integer value) {
    if(value==null){setattrundefined("PLZ");return;}
    setattrvalue("PLZ", Integer.toString(value));
  }
  public final static String tag_Ort="Ort";
  public String getOrt() {
    if(getattrvaluecount("Ort")==0)return null;
    String value=getattrvalue("Ort");
    return value;
  }
  public void setOrt(String value) {
    if(value==null){setattrundefined("Ort");return;}
    setattrvalue("Ort", value);
  }
  public final static String tag_TelefonP="TelefonP";
  public String getTelefonP() {
    if(getattrvaluecount("TelefonP")==0)return null;
    String value=getattrvalue("TelefonP");
    return value;
  }
  public void setTelefonP(String value) {
    if(value==null){setattrundefined("TelefonP");return;}
    setattrvalue("TelefonP", value);
  }
  public final static String tag_TelefonG="TelefonG";
  public String getTelefonG() {
    if(getattrvaluecount("TelefonG")==0)return null;
    String value=getattrvalue("TelefonG");
    return value;
  }
  public void setTelefonG(String value) {
    if(value==null){setattrundefined("TelefonG");return;}
    setattrvalue("TelefonG", value);
  }
  public final static String tag_Email="Email";
  public String getEmail() {
    if(getattrvaluecount("Email")==0)return null;
    String value=getattrvalue("Email");
    return value;
  }
  public void setEmail(String value) {
    if(value==null){setattrundefined("Email");return;}
    setattrvalue("Email", value);
  }
}
