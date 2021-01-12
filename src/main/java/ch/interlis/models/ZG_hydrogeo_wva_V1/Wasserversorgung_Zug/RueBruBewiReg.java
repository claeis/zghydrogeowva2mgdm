package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class RueBruBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg";
  public RueBruBewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_RueBru="RueBru";
  public String getRueBru() {
    ch.interlis.iom.IomObject value=getattrobj("RueBru",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setRueBru(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("RueBru",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("RueBru","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("RueBru",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_BewiReg="BewiReg";
  public String getBewiReg() {
    ch.interlis.iom.IomObject value=getattrobj("BewiReg",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setBewiReg(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("BewiReg",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("BewiReg","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("BewiReg",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
