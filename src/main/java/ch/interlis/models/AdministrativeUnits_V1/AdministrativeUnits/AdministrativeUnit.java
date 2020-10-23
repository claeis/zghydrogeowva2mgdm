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
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setUpperLevelUnit(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("UpperLevelUnit","REF");
    structvalue.setobjectrefoid(oid);
  }
}
