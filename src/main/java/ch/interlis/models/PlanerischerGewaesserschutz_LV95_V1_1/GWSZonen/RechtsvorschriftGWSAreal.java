package ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen;
public class RechtsvorschriftGWSAreal extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.RechtsvorschriftGWSAreal";
  public RechtsvorschriftGWSAreal(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Rechtsvorschrift="Rechtsvorschrift";
  public String getRechtsvorschrift() {
    ch.interlis.iom.IomObject value=getattrobj("Rechtsvorschrift",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setRechtsvorschrift(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Rechtsvorschrift","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_GWSAreal="GWSAreal";
  public String getGWSAreal() {
    ch.interlis.iom.IomObject value=getattrobj("GWSAreal",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGWSAreal(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GWSAreal","REF");
    structvalue.setobjectrefoid(oid);
  }
}
