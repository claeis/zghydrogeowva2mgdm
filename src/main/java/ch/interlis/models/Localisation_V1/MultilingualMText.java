package ch.interlis.models.Localisation_V1;
public class MultilingualMText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Localisation_V1.MultilingualMText";
  public MultilingualMText() {
    super(tag,null);
  }
  protected MultilingualMText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_LocalisedText="LocalisedText";
  public int sizeLocalisedText() {return getattrvaluecount("LocalisedText");}
  public ch.interlis.models.Localisation_V1.LocalisedMText[] getLocalisedText() {
    int size=getattrvaluecount("LocalisedText");
    ch.interlis.models.Localisation_V1.LocalisedMText value[]=new ch.interlis.models.Localisation_V1.LocalisedMText[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.Localisation_V1.LocalisedMText)getattrobj("LocalisedText",i);
    }
    return value;
  }
  public void addLocalisedText(ch.interlis.models.Localisation_V1.LocalisedMText value) {
    addattrobj("LocalisedText", value);
  }
}
