package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class EntbruText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruText";
  public EntbruText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  public String getEntnahmebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Entnahmebrunnen",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEntnahmebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Entnahmebrunnen","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_IntranetPos="IntranetPos";
  public String getIntranetPos() {
    ch.interlis.iom.IomObject value=getattrobj("IntranetPos",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setIntranetPos(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("IntranetPos","REF");
    structvalue.setobjectrefoid(oid);
  }
}
