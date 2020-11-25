package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Oberflaechengewaesserfassung extends ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen.Fassung
{
  public final static String tag= "TWVinNotlagen_LV03_V1.TWVinNotlagen.Oberflaechengewaesserfassung";
  public Oberflaechengewaesserfassung(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Fassungsart="Fassungsart";
  public Oberflaechengewaesserfassung_Fassungsart getFassungsart() {
    String value=getattrvalue("Fassungsart");
    return Oberflaechengewaesserfassung_Fassungsart.parseXmlCode(value);
  }
  public void setFassungsart(Oberflaechengewaesserfassung_Fassungsart value) {
    setattrvalue("Fassungsart", Oberflaechengewaesserfassung_Fassungsart.toXmlCode(value));
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public Oberflaechengewaesserfassung_Nutzungszustand getNutzungszustand() {
    if(getattrvaluecount("Nutzungszustand")==0)return null;
    String value=getattrvalue("Nutzungszustand");
    return Oberflaechengewaesserfassung_Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(Oberflaechengewaesserfassung_Nutzungszustand value) {
    if(value==null){setattrundefined("Nutzungszustand");return;}
    setattrvalue("Nutzungszustand", Oberflaechengewaesserfassung_Nutzungszustand.toXmlCode(value));
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
