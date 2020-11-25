package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class HilfsText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.HilfsText";
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
    if(getattrvaluecount("Text")==0)return null;
    String value=getattrvalue("Text");
    return value;
  }
  public void setText(String value) {
    if(value==null){setattrundefined("Text");return;}
    setattrvalue("Text", value);
  }
}
