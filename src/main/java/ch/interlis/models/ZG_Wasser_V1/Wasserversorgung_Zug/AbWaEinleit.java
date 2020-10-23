package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class AbWaEinleit extends ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.Einleit
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.AbWaEinleit";
  public AbWaEinleit(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_Wasser_V1.AbWaEinleitTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_Wasser_V1.AbWaEinleitTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_Wasser_V1.AbWaEinleitTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_Wasser_V1.AbWaEinleitTyp.toXmlCode(value));
  }
}
