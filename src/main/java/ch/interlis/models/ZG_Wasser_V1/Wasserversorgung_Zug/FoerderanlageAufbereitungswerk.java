package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class FoerderanlageAufbereitungswerk extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk";
  public FoerderanlageAufbereitungswerk(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Foerderanlage="Foerderanlage";
  public String getFoerderanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Foerderanlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFoerderanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Foerderanlage","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Aufbereitungswerk="Aufbereitungswerk";
  public String getAufbereitungswerk() {
    ch.interlis.iom.IomObject value=getattrobj("Aufbereitungswerk",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAufbereitungswerk(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Aufbereitungswerk","REF");
    structvalue.setobjectrefoid(oid);
  }
}
