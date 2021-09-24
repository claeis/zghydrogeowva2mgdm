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
  public final static String tag_FilterLeistTextPos="FilterLeistTextPos";
  public int sizeFilterLeistTextPos() {return getattrvaluecount("FilterLeistTextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getFilterLeistTextPos() {
    int size=getattrvaluecount("FilterLeistTextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("FilterLeistTextPos",0);
    return value;
  }
  public void setFilterLeistTextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("FilterLeistTextPos")>0){
      changeattrobj("FilterLeistTextPos",0, value);
    }else{
      addattrobj("FilterLeistTextPos", value);
    }
  }
}
