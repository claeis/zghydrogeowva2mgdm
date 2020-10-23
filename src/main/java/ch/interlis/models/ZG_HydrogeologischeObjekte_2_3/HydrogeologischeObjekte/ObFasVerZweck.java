package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasVerZweck extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck";
  public ObFasVerZweck(String oid) {
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
  public final static String tag_Verwendungszweck="Verwendungszweck";
  public String getVerwendungszweck() {
    ch.interlis.iom.IomObject value=getattrobj("Verwendungszweck",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setVerwendungszweck(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Verwendungszweck","REF");
    structvalue.setobjectrefoid(oid);
  }
}
