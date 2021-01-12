package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class PWFoeMenge extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge";
  public PWFoeMenge(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public int getFoerdermenge() {
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(int value) {
    setattrvalue("Foerdermenge", Integer.toString(value));
  }
  public final static String tag_Pumpwerk="Pumpwerk";
  public String getPumpwerk() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpwerk",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setPumpwerk(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Pumpwerk",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Pumpwerk","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Pumpwerk",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
