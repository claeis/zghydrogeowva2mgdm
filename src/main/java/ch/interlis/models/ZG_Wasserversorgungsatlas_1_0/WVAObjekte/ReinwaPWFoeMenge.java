package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class ReinwaPWFoeMenge extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge";
  public ReinwaPWFoeMenge(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public int getFoerdermenge() {
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(int value) {
    setattrvalue("Foerdermenge", Integer.toString(value));
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
