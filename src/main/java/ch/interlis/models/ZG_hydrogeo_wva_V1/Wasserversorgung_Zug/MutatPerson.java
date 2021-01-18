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
}
