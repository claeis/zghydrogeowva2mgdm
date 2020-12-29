package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Pumpe_PumpenAnlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe_PumpenAnlage";
  public Pumpe_PumpenAnlage(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_PumpenAnlage="PumpenAnlage";
  public String getPumpenAnlage() {
    ch.interlis.iom.IomObject value=getattrobj("PumpenAnlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpenAnlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("PumpenAnlage","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Pumpe="Pumpe";
  public String getPumpe() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpe",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpe(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Pumpe","REF");
    structvalue.setobjectrefoid(oid);
  }
}
