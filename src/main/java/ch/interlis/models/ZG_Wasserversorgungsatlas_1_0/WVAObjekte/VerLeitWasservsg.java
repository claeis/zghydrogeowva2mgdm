package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class VerLeitWasservsg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg";
  public VerLeitWasservsg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_LeitungsnetzWV="LeitungsnetzWV";
  public String getLeitungsnetzWV() {
    ch.interlis.iom.IomObject value=getattrobj("LeitungsnetzWV",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLeitungsnetzWV(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LeitungsnetzWV","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Wasserversorgung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
