package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Wasserversorgung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung";
  public Wasserversorgung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_WVName="WVName";
  public String getWVName() {
    String value=getattrvalue("WVName");
    return value;
  }
  public void setWVName(String value) {
    setattrvalue("WVName", value);
  }
  public final static String tag_Nummer="Nummer";
  public Integer getNummer() {
    if(getattrvaluecount("Nummer")==0)return null;
    String value=getattrvalue("Nummer");
    return Integer.parseInt(value);
  }
  public void setNummer(Integer value) {
    if(value==null){setattrundefined("Nummer");return;}
    setattrvalue("Nummer", Integer.toString(value));
  }
  public final static String tag_EigentumArt="EigentumArt";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt getEigentumArt() {
    if(getattrvaluecount("EigentumArt")==0)return null;
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt value) {
    if(value==null){setattrundefined("EigentumArt");return;}
    setattrvalue("EigentumArt", ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.toXmlCode(value));
  }
}
