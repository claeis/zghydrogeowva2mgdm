package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class MutatPerson extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson";
  public MutatPerson(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    String value=getattrvalue("MutatPerson");
    return value;
  }
  public void setMutatPerson(String value) {
    setattrvalue("MutatPerson", value);
  }
}
