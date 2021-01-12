package ch.interlis.models.AdministrativeUnits_V1.Agencies;
public class Agency extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "AdministrativeUnits_V1.Agencies.Agency";
  public Agency(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Supervisor="Supervisor";
  public String getSupervisor() {
    ch.interlis.iom.IomObject value=getattrobj("Supervisor",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setSupervisor(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Supervisor",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Supervisor","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Supervisor",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
