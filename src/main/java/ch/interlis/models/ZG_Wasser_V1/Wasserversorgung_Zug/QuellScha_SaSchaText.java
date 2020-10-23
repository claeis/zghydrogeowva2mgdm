package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class QuellScha_SaSchaText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.QuellScha_SaSchaText";
  public QuellScha_SaSchaText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Quell_Sammelschacht="Quell_Sammelschacht";
  public String getQuell_Sammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quell_Sammelschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQuell_Sammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Quell_Sammelschacht","REF");
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
