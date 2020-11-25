package ch.interlis.models.AdministrativeUnitsCH_V1.CHCantons;
public class CHCanton extends ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit
{
  public final static String tag= "AdministrativeUnitsCH_V1.CHCantons.CHCanton";
  public CHCanton(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Code="Code";
  public ch.interlis.models.CHAdminCodes_V1.CHCantonCode getCode() {
    String value=getattrvalue("Code");
    return ch.interlis.models.CHAdminCodes_V1.CHCantonCode.parseXmlCode(value);
  }
  public void setCode(ch.interlis.models.CHAdminCodes_V1.CHCantonCode value) {
    setattrvalue("Code", ch.interlis.models.CHAdminCodes_V1.CHCantonCode.toXmlCode(value));
  }
  public final static String tag_Name="Name";
  public int sizeName() {return getattrvaluecount("Name");}
  public ch.interlis.models.LocalisationCH_V1.MultilingualText getName() {
    int size=getattrvaluecount("Name");
    if(size==0)return null;
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
    if(getattrvaluecount("Web")==0)return null;
    String value=getattrvalue("Web");
    return value;
  }
  public void setWeb(String value) {
    if(value==null){setattrundefined("Web");return;}
    setattrvalue("Web", value);
  }
}
