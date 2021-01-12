package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class GWSArealWasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSArealWasserversorgung";
  public GWSArealWasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_GWSAreal="GWSAreal";
  public String getGWSAreal() {
    ch.interlis.iom.IomObject value=getattrobj("GWSAreal",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGWSAreal(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GWSAreal",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GWSAreal","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GWSAreal",0);
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
