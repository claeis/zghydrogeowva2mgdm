package ch.interlis.models.ZG_Wasser_V1;
public class HilfsText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.HilfsText";
  public HilfsText() {
    super(tag,null);
  }
  protected HilfsText(String oid) {
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
