package ch.interlis.models.Localisation_V1;
public class MultilingualText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Localisation_V1.MultilingualText";
  public MultilingualText() {
    super(tag,null);
  }
  protected MultilingualText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_LocalisedText="LocalisedText";
  public int sizeLocalisedText() {return getattrvaluecount("LocalisedText");}
  public ch.interlis.models.Localisation_V1.LocalisedText[] getLocalisedText() {
    int size=getattrvaluecount("LocalisedText");
    ch.interlis.models.Localisation_V1.LocalisedText value[]=new ch.interlis.models.Localisation_V1.LocalisedText[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.Localisation_V1.LocalisedText)getattrobj("LocalisedText",i);
    }
    return value;
  }
  public void addLocalisedText(ch.interlis.models.Localisation_V1.LocalisedText value) {
    addattrobj("LocalisedText", value);
  }
}
