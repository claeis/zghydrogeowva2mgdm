package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class VersiDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.VersiDatei";
  public VersiDatei(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Versickerungsanlage="Versickerungsanlage";
  public String getVersickerungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Versickerungsanlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setVersickerungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Versickerungsanlage","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Datei="Datei";
  public String getDatei() {
    ch.interlis.iom.IomObject value=getattrobj("Datei",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setDatei(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Datei","REF");
    structvalue.setobjectrefoid(oid);
  }
}
