package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Wasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung";
  public Wasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_WVName="WVName";
  public String getWVName() {
    String value=getattrvalue("WVName");
    return value;
  }
  public void setWVName(String value) {
    setattrvalue("WVName", value);
  }
  public final static String tag_Nummer="Nummer";
  public int getNummer() {
    String value=getattrvalue("Nummer");
    return Integer.parseInt(value);
  }
  public void setNummer(int value) {
    setattrvalue("Nummer", Integer.toString(value));
  }
  public final static String tag_EigentumArt="EigentumArt";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt getEigentumArt() {
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt value) {
    setattrvalue("EigentumArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.EigentumArt.toXmlCode(value));
  }
}
