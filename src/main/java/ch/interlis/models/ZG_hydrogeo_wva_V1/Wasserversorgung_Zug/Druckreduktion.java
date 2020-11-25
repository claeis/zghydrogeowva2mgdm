package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Druckreduktion extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion";
  public Druckreduktion(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DruckRedTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DruckRedTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.DruckRedTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_hydrogeo_wva_V1.DruckRedTyp.toXmlCode(value));
  }
  public final static String tag_Druckeingang="Druckeingang";
  public Double getDruckeingang() {
    if(getattrvaluecount("Druckeingang")==0)return null;
    String value=getattrvalue("Druckeingang");
    return Double.parseDouble(value);
  }
  public void setDruckeingang(Double value) {
    if(value==null){setattrundefined("Druckeingang");return;}
    setattrvalue("Druckeingang", Double.toString(value));
  }
  public final static String tag_Druckausgang="Druckausgang";
  public Double getDruckausgang() {
    if(getattrvaluecount("Druckausgang")==0)return null;
    String value=getattrvalue("Druckausgang");
    return Double.parseDouble(value);
  }
  public void setDruckausgang(Double value) {
    if(value==null){setattrundefined("Druckausgang");return;}
    setattrvalue("Druckausgang", Double.toString(value));
  }
}
