package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class AnrNrAfu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnrNrAfu";
  public AnrNrAfu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Anreicherungsanlage="Anreicherungsanlage";
  public String getAnreicherungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Anreicherungsanlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setAnreicherungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Anreicherungsanlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Anreicherungsanlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Anreicherungsanlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_IntranetPos="IntranetPos";
  public String getIntranetPos() {
    ch.interlis.iom.IomObject value=getattrobj("IntranetPos",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setIntranetPos(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("IntranetPos",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("IntranetPos","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("IntranetPos",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
