package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class ReinwaPWDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDatei";
  public ReinwaPWDatei(String oid) {
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
  public final static String tag_Dateiname="Dateiname";
  public String getDateiname() {
    String value=getattrvalue("Dateiname");
    return value;
  }
  public void setDateiname(String value) {
    setattrvalue("Dateiname", value);
  }
  public final static String tag_ReinwasserPW="ReinwasserPW";
  public String getReinwasserPW() {
    ch.interlis.iom.IomObject value=getattrobj("ReinwasserPW",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setReinwasserPW(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("ReinwasserPW","REF");
    structvalue.setobjectrefoid(oid);
  }
}
