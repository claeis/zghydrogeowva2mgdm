package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class Zahl extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Zahl";
  public Zahl() {
    super(tag,null);
  }
  protected Zahl(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Zahl="Zahl";
  public Integer getZahl() {
    if(getattrvaluecount("Zahl")==0)return null;
    String value=getattrvalue("Zahl");
    return Integer.parseInt(value);
  }
  public void setZahl(Integer value) {
    if(value==null){setattrundefined("Zahl");return;}
    setattrvalue("Zahl", Integer.toString(value));
  }
}
