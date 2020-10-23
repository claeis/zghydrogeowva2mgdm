package ch.interlis.models.AdministrativeUnits_V1.Agencies;
public class Organisation extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "AdministrativeUnits_V1.Agencies.Organisation";
  public Organisation(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Orderer="Orderer";
  public String getOrderer() {
    ch.interlis.iom.IomObject value=getattrobj("Orderer",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOrderer(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Orderer","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Executor="Executor";
  public String getExecutor() {
    ch.interlis.iom.IomObject value=getattrobj("Executor",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setExecutor(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Executor","REF");
    structvalue.setobjectrefoid(oid);
  }
}
