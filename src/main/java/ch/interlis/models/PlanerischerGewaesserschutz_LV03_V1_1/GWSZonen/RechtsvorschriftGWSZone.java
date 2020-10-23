package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class RechtsvorschriftGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone";
  public RechtsvorschriftGWSZone(String oid) {
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
  public final static String tag_GWSZone="GWSZone";
  public String getGWSZone() {
    ch.interlis.iom.IomObject value=getattrobj("GWSZone",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGWSZone(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GWSZone","REF");
    structvalue.setobjectrefoid(oid);
  }
}
