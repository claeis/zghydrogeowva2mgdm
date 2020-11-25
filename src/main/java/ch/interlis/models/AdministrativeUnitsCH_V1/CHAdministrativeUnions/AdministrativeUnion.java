package ch.interlis.models.AdministrativeUnitsCH_V1.CHAdministrativeUnions;
public class AdministrativeUnion extends ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnion
{
  public final static String tag= "AdministrativeUnitsCH_V1.CHAdministrativeUnions.AdministrativeUnion";
  public AdministrativeUnion(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Description="Description";
  public int sizeDescription() {return getattrvaluecount("Description");}
  public ch.interlis.models.LocalisationCH_V1.MultilingualMText getDescription() {
    int size=getattrvaluecount("Description");
    if(size==0)return null;
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
