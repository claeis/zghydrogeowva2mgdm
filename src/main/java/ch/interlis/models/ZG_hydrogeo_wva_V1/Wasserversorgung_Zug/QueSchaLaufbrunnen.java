package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QueSchaLaufbrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaLaufbrunnen";
  public QueSchaLaufbrunnen(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Quellschacht="Quellschacht";
  public String getQuellschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quellschacht",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuellschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Quellschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Quellschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Quellschacht",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_WeitereAnlage="WeitereAnlage";
  public String getWeitereAnlage() {
    ch.interlis.iom.IomObject value=getattrobj("WeitereAnlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setWeitereAnlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("WeitereAnlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("WeitereAnlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("WeitereAnlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
