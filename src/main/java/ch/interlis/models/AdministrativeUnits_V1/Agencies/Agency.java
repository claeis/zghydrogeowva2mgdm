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
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSupervisor(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Supervisor","REF");
    structvalue.setobjectrefoid(oid);
  }
}
