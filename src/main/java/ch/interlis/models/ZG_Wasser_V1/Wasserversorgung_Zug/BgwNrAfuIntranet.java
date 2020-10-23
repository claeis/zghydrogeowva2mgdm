package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class BgwNrAfuIntranet extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.BgwNrAfuIntranet";
  public BgwNrAfuIntranet(String oid) {
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
  public final static String tag_IntranetPos="IntranetPos";
  public String getIntranetPos() {
    ch.interlis.iom.IomObject value=getattrobj("IntranetPos",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setIntranetPos(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("IntranetPos","REF");
    structvalue.setobjectrefoid(oid);
  }
}
