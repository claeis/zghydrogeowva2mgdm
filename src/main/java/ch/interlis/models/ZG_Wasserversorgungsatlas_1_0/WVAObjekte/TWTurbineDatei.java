package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class TWTurbineDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDatei";
  public TWTurbineDatei(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Dateiname="Dateiname";
  public String getDateiname() {
    String value=getattrvalue("Dateiname");
    return value;
  }
  public void setDateiname(String value) {
    setattrvalue("Dateiname", value);
  }
  public final static String tag_TWTurbine="TWTurbine";
  public String getTWTurbine() {
    ch.interlis.iom.IomObject value=getattrobj("TWTurbine",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setTWTurbine(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("TWTurbine","REF");
    structvalue.setobjectrefoid(oid);
  }
}
