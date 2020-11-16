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
  public double getDruckeingang() {
    String value=getattrvalue("Druckeingang");
    return Double.parseDouble(value);
  }
  public void setDruckeingang(double value) {
    setattrvalue("Druckeingang", Double.toString(value));
  }
  public final static String tag_Druckausgang="Druckausgang";
  public double getDruckausgang() {
    String value=getattrvalue("Druckausgang");
    return Double.parseDouble(value);
  }
  public void setDruckausgang(double value) {
    setattrvalue("Druckausgang", Double.toString(value));
  }
}
