package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class LaufBruDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDatei";
  public LaufBruDatei(String oid) {
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
  public final static String tag_LaufBrunnen="LaufBrunnen";
  public String getLaufBrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("LaufBrunnen",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLaufBrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("LaufBrunnen",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("LaufBrunnen","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("LaufBrunnen",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
