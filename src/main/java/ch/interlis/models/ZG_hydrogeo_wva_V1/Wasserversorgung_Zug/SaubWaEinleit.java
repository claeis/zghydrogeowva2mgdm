package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class SaubWaEinleit extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Einleit
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit";
  public SaubWaEinleit(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_hydrogeo_wva_V1.SaubWaEinleitTyp.toXmlCode(value));
  }
}
