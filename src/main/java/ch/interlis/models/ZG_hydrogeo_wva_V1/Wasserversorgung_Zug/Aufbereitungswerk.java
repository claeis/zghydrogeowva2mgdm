package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Aufbereitungswerk extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk";
  public Aufbereitungswerk(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_FilterLeist="FilterLeist";
  public String getFilterLeist() {
    if(getattrvaluecount("FilterLeist")==0)return null;
    String value=getattrvalue("FilterLeist");
    return value;
  }
  public void setFilterLeist(String value) {
    if(value==null){setattrundefined("FilterLeist");return;}
    setattrvalue("FilterLeist", value);
  }
  public final static String tag_TextArt="TextArt";
  public Aufbereitungswerk_TextArt getTextArt() {
    String value=getattrvalue("TextArt");
    return Aufbereitungswerk_TextArt.parseXmlCode(value);
  }
  public void setTextArt(Aufbereitungswerk_TextArt value) {
    setattrvalue("TextArt", Aufbereitungswerk_TextArt.toXmlCode(value));
  }
}
