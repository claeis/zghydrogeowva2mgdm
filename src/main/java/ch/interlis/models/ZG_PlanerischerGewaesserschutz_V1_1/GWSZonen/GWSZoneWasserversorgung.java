package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class GWSZoneWasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZoneWasserversorgung";
  public GWSZoneWasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
