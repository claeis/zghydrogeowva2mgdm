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
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpwerk(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Pumpwerk","REF");
    structvalue.setobjectrefoid(oid);
  }
}
