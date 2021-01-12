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
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOrderer(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Orderer",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Orderer","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Orderer",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Executor="Executor";
  public String getExecutor() {
    ch.interlis.iom.IomObject value=getattrobj("Executor",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setExecutor(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Executor",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Executor","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Executor",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
