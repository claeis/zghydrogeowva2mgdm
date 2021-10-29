package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class ObFasZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasZsBeZu";
  public ObFasZsBeZu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObFas="ObFas";
  public String getObFas() {
    ch.interlis.iom.IomObject value=getattrobj("ObFas",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setObFas(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("ObFas",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("ObFas","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("ObFas",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_ZsBeZu="ZsBeZu";
  public String getZsBeZu() {
    ch.interlis.iom.IomObject value=getattrobj("ZsBeZu",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setZsBeZu(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("ZsBeZu",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("ZsBeZu","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("ZsBeZu",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
