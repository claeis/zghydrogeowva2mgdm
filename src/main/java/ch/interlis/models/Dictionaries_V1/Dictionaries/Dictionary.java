package ch.interlis.models.Dictionaries_V1.Dictionaries;
public class Dictionary extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Dictionaries_V1.Dictionaries.Dictionary";
  public Dictionary(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Language="Language";
  public ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1 getLanguage() {
    String value=getattrvalue("Language");
    return ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1.parseXmlCode(value);
  }
  public void setLanguage(ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1 value) {
    setattrvalue("Language", ch.interlis.models.InternationalCodes_V1.LanguageCode_ISO639_1.toXmlCode(value));
  }
  public final static String tag_Entries="Entries";
  public int sizeEntries() {return getattrvaluecount("Entries");}
  public ch.interlis.models.Dictionaries_V1.Dictionaries.Entry[] getEntries() {
    int size=getattrvaluecount("Entries");
    ch.interlis.models.Dictionaries_V1.Dictionaries.Entry value[]=new ch.interlis.models.Dictionaries_V1.Dictionaries.Entry[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.Dictionaries_V1.Dictionaries.Entry)getattrobj("Entries",i);
    }
    return value;
  }
  public void addEntries(ch.interlis.models.Dictionaries_V1.Dictionaries.Entry value) {
    addattrobj("Entries", value);
  }
}
