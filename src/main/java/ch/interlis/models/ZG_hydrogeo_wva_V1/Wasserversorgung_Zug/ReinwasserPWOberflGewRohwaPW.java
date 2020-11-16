package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class ReinwasserPWOberflGewRohwaPW extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW";
  public ReinwasserPWOberflGewRohwaPW(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_OberflGewRohwaPW="OberflGewRohwaPW";
  public String getOberflGewRohwaPW() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewRohwaPW",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOberflGewRohwaPW(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OberflGewRohwaPW","REF");
    structvalue.setobjectrefoid(oid);
  }
}
