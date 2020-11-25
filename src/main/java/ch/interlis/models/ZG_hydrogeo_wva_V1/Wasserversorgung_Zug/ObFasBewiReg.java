package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class ObFasBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg";
  public ObFasBewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_OberflGewFassung="OberflGewFassung";
  public String getOberflGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewFassung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOberflGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OberflGewFassung","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_BewiReg="BewiReg";
  public String getBewiReg() {
    ch.interlis.iom.IomObject value=getattrobj("BewiReg",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBewiReg(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BewiReg","REF");
    structvalue.setobjectrefoid(oid);
  }
}
