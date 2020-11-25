package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class BautenGW_Flaeche extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW_Flaeche";
  public BautenGW_Flaeche(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lage="Lage";
  public int sizeLage() {return getattrvaluecount("Lage");}
  public ch.interlis.iom.IomObject getLage() {
    int size=getattrvaluecount("Lage");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Lage",0);
    return value;
  }
  public void setLage(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Lage")>0){
      changeattrobj("Lage",0, value);
    }else{
      addattrobj("Lage", value);
    }
  }
}
