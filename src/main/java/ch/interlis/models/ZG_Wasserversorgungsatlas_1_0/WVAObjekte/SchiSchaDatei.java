package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class SchiSchaDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDatei";
  public SchiSchaDatei(String oid) {
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
  public final static String tag_Schieberschacht="Schieberschacht";
  public String getSchieberschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Schieberschacht",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setSchieberschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Schieberschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Schieberschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Schieberschacht",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
