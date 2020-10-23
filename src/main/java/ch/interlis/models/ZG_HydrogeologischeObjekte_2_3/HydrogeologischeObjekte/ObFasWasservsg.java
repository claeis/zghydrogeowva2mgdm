package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasWasservsg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg";
  public ObFasWasservsg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_OberflaechenGewFassung="OberflaechenGewFassung";
  public String getOberflaechenGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflaechenGewFassung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOberflaechenGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OberflaechenGewFassung","REF");
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
