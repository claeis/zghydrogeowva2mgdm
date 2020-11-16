package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Stufenpumpwerk extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Stufenpumpwerk";
  public Stufenpumpwerk(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Reservoir="Reservoir";
  public String getReservoir() {
    ch.interlis.iom.IomObject value=getattrobj("Reservoir",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setReservoir(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Reservoir","REF");
    structvalue.setobjectrefoid(oid);
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
}
