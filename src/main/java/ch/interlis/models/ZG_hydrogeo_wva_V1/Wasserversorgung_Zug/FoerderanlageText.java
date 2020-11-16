package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class FoerderanlageText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageText";
  public FoerderanlageText(String oid) {
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
