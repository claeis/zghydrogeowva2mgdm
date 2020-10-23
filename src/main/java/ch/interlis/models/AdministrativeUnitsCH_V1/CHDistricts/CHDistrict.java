package ch.interlis.models.AdministrativeUnitsCH_V1.CHDistricts;
public class CHDistrict extends ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit
{
  public final static String tag= "AdministrativeUnitsCH_V1.CHDistricts.CHDistrict";
  public CHDistrict(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ShortName="ShortName";
  public String getShortName() {
    String value=getattrvalue("ShortName");
    return value;
  }
  public void setShortName(String value) {
    setattrvalue("ShortName", value);
  }
  public final static String tag_Name="Name";
  public ch.interlis.models.LocalisationCH_V1.MultilingualText getName() {
    ch.interlis.models.LocalisationCH_V1.MultilingualText value=(ch.interlis.models.LocalisationCH_V1.MultilingualText)getattrobj("Name",0);
    return value;
  }
  public void setName(ch.interlis.models.LocalisationCH_V1.MultilingualText value) {
    if(getattrvaluecount("Name")>0){
      changeattrobj("Name",0, value);
    }else{
      addattrobj("Name", value);
    }
  }
  public final static String tag_Web="Web";
  public String getWeb() {
    String value=getattrvalue("Web");
    return value;
  }
  public void setWeb(String value) {
    setattrvalue("Web", value);
  }
}
