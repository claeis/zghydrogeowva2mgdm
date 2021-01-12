package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class AufbWrkRes extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes";
  public AufbWrkRes(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Aufbereitungswerk="Aufbereitungswerk";
  public String getAufbereitungswerk() {
    ch.interlis.iom.IomObject value=getattrobj("Aufbereitungswerk",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setAufbereitungswerk(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Aufbereitungswerk",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Aufbereitungswerk","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Aufbereitungswerk",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Reservoir="Reservoir";
  public String getReservoir() {
    ch.interlis.iom.IomObject value=getattrobj("Reservoir",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setReservoir(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Reservoir",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Reservoir","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Reservoir",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
