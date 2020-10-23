package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class EinleitBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.EinleitBewiReg";
  public EinleitBewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Einleit="Einleit";
  public String getEinleit() {
    ch.interlis.iom.IomObject value=getattrobj("Einleit",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEinleit(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Einleit","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_BewiReg="BewiReg";
  public String getBewiReg() {
    ch.interlis.iom.IomObject value=getattrobj("BewiReg",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBewiReg(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BewiReg","REF");
    structvalue.setobjectrefoid(oid);
  }
}
