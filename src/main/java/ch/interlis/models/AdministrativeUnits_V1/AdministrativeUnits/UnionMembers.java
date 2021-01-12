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
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setUnion(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Union",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Union","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Union",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Member="Member";
  public String getMember() {
    ch.interlis.iom.IomObject value=getattrobj("Member",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setMember(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Member",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Member","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Member",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
