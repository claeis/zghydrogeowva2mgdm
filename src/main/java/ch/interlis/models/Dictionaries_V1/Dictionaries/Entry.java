package ch.interlis.models.Dictionaries_V1.Dictionaries;
public class Entry extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "Dictionaries_V1.Dictionaries.Entry";
  public Entry() {
    super(tag,null);
  }
  protected Entry(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
