package ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits;
public class UnionMembers extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "AdministrativeUnits_V1.AdministrativeUnits.UnionMembers";
  public UnionMembers(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Union="Union";
  public String getUnion() {
    ch.interlis.iom.IomObject value=getattrobj("Union",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setUnion(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Union","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Member="Member";
  public String getMember() {
    ch.interlis.iom.IomObject value=getattrobj("Member",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setMember(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Member","REF");
    structvalue.setobjectrefoid(oid);
  }
}
