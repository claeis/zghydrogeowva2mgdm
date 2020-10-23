package ch.interlis.models.AdministrativeUnitsCH_V1.CHAgencies;
public class Agency extends ch.interlis.models.AdministrativeUnits_V1.Agencies.Agency
{
  public final static String tag= "AdministrativeUnitsCH_V1.CHAgencies.Agency";
  public Agency(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Description="Description";
  public ch.interlis.models.LocalisationCH_V1.MultilingualMText getDescription() {
    ch.interlis.models.LocalisationCH_V1.MultilingualMText value=(ch.interlis.models.LocalisationCH_V1.MultilingualMText)getattrobj("Description",0);
    return value;
  }
  public void setDescription(ch.interlis.models.LocalisationCH_V1.MultilingualMText value) {
    if(getattrvaluecount("Description")>0){
      changeattrobj("Description",0, value);
    }else{
      addattrobj("Description", value);
    }
  }
}
