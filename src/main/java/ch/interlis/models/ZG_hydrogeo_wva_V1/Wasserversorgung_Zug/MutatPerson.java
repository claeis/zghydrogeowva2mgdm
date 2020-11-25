package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class MutatPerson extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson";
  public MutatPerson(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    if(getattrvaluecount("MutatPerson")==0)return null;
    String value=getattrvalue("MutatPerson");
    return value;
  }
  public void setMutatPerson(String value) {
    if(value==null){setattrundefined("MutatPerson");return;}
    setattrvalue("MutatPerson", value);
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
  public final static String tag_Leitung="Leitung";
  public String getLeitung() {
    ch.interlis.iom.IomObject value=getattrobj("Leitung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLeitung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Leitung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
