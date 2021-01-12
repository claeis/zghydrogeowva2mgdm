package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Pumpe_OberflGewRohwaPW extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe_OberflGewRohwaPW";
  public Pumpe_OberflGewRohwaPW(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Pumpe="Pumpe";
  public String getPumpe() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpe",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setPumpe(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Pumpe",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Pumpe","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Pumpe",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_OberflGewRohwaPW="OberflGewRohwaPW";
  public String getOberflGewRohwaPW() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewRohwaPW",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOberflGewRohwaPW(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("OberflGewRohwaPW",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("OberflGewRohwaPW","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("OberflGewRohwaPW",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
