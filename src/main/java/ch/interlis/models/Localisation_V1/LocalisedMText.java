package ch.interlis.models.Localisation_V1;
public class LocalisedMText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Localisation_V1.LocalisedMText";
  public LocalisedMText() {
    super(tag,null);
  }
  protected LocalisedMText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Language="Language";
  public ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1 getLanguage() {
    if(getattrvaluecount("Language")==0)return null;
    String value=getattrvalue("Language");
    return ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1.parseXmlCode(value);
  }
  public void setLanguage(ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1 value) {
    if(value==null){setattrundefined("Language");return;}
    setattrvalue("Language", ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1.toXmlCode(value));
  }
  public final static String tag_Text="Text";
  public String getText() {
    String value=getattrvalue("Text");
    return value;
  }
  public void setText(String value) {
    setattrvalue("Text", value);
  }
}
