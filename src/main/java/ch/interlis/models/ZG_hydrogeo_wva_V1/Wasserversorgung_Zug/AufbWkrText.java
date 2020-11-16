package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class AufbWkrText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWkrText";
  public AufbWkrText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_TextPos="TextPos";
  public String getTextPos() {
    ch.interlis.iom.IomObject value=getattrobj("TextPos",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setTextPos(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("TextPos","REF");
    structvalue.setobjectrefoid(oid);
  }
}
