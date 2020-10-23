package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class BautenGWBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.BautenGWBewiReg";
  public BautenGWBewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BautenGW="BautenGW";
  public String getBautenGW() {
    ch.interlis.iom.IomObject value=getattrobj("BautenGW",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBautenGW(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BautenGW","REF");
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
