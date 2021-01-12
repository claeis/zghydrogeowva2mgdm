package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class LaufBruWasservsg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg";
  public LaufBruWasservsg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_LaufBrunnen="LaufBrunnen";
  public String getLaufBrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("LaufBrunnen",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLaufBrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("LaufBrunnen",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("LaufBrunnen","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("LaufBrunnen",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Wasserversorgung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Wasserversorgung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Wasserversorgung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
