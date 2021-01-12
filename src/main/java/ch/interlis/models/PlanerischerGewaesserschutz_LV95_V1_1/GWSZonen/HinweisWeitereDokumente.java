package ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen;
public class HinweisWeitereDokumente extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.HinweisWeitereDokumente";
  public HinweisWeitereDokumente(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Ursprung="Ursprung";
  public String getUrsprung() {
    ch.interlis.iom.IomObject value=getattrobj("Ursprung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setUrsprung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Ursprung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Ursprung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Ursprung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Hinweis="Hinweis";
  public String getHinweis() {
    ch.interlis.iom.IomObject value=getattrobj("Hinweis",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setHinweis(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Hinweis",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Hinweis","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Hinweis",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
