package ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits;
public class AdministrativeUnit extends ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeElement
{
  public final static String tag= "AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit";
  public AdministrativeUnit(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_UpperLevelUnit="UpperLevelUnit";
  public String getUpperLevelUnit() {
    ch.interlis.iom.IomObject value=getattrobj("UpperLevelUnit",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setUpperLevelUnit(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("UpperLevelUnit",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("UpperLevelUnit","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("UpperLevelUnit",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
