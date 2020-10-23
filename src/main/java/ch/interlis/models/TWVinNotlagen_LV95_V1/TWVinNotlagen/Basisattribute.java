package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Basisattribute extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute";
  public Basisattribute(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Bemerkung="Bemerkung";
  public String getBemerkung() {
    String value=getattrvalue("Bemerkung");
    return value;
  }
  public void setBemerkung(String value) {
    setattrvalue("Bemerkung", value);
  }
  public final static String tag_Identifikator="Identifikator";
  /** Identifikator = <Kantonscode:CHAdminCodes_V1.CHCantonCode>-<Kantonsidentifikator>
   */
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  /** Identifikator = <Kantonscode:CHAdminCodes_V1.CHCantonCode>-<Kantonsidentifikator>
   */
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
  public final static String tag_Netzteilident="Netzteilident";
  /** Definition optional oder obligatorisch wird erst in der abgeleiteten Klasse definiert.
   */
  public String getNetzteilident() {
    String value=getattrvalue("Netzteilident");
    return value;
  }
  /** Definition optional oder obligatorisch wird erst in der abgeleiteten Klasse definiert.
   */
  public void setNetzteilident(String value) {
    setattrvalue("Netzteilident", value);
  }
}
