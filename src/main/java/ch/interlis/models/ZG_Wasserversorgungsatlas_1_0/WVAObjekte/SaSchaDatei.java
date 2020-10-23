package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class SaSchaDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDatei";
  public SaSchaDatei(String oid) {
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
  public final static String tag_Sammelschacht="Sammelschacht";
  public String getSammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Sammelschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Sammelschacht","REF");
    structvalue.setobjectrefoid(oid);
  }
}
