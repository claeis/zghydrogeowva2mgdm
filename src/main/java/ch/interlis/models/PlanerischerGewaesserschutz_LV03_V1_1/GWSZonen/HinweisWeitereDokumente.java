package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class HinweisWeitereDokumente extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.HinweisWeitereDokumente";
  public HinweisWeitereDokumente(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Ursprung="Ursprung";
  public String getUrsprung() {
    ch.interlis.iom.IomObject value=getattrobj("Ursprung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setUrsprung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Ursprung","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Hinweis="Hinweis";
  public String getHinweis() {
    ch.interlis.iom.IomObject value=getattrobj("Hinweis",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setHinweis(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Hinweis","REF");
    structvalue.setobjectrefoid(oid);
  }
}
