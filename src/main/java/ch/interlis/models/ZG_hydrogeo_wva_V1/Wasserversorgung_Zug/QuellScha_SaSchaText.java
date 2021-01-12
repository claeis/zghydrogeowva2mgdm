package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QuellScha_SaSchaText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellScha_SaSchaText";
  public QuellScha_SaSchaText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Quell_Sammelschacht="Quell_Sammelschacht";
  public String getQuell_Sammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quell_Sammelschacht",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuell_Sammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Quell_Sammelschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Quell_Sammelschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Quell_Sammelschacht",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_TextPos="TextPos";
  public String getTextPos() {
    ch.interlis.iom.IomObject value=getattrobj("TextPos",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setTextPos(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("TextPos",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("TextPos","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("TextPos",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
