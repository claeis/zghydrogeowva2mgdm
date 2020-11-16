package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QuellSchGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone";
  public QuellSchGWSZone(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSchGUID="QuellSchGUID";
  public String getQuellSchGUID() {
    ch.interlis.iom.IomObject value=getattrobj("QuellSchGUID",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQuellSchGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("QuellSchGUID","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_GWSZoneGUID="GWSZoneGUID";
  public String getGWSZoneGUID() {
    ch.interlis.iom.IomObject value=getattrobj("GWSZoneGUID",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGWSZoneGUID(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GWSZoneGUID","REF");
    structvalue.setobjectrefoid(oid);
  }
}
