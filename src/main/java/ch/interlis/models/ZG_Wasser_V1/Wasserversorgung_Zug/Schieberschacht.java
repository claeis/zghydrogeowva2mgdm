package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Schieberschacht extends ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug.WeitereAnlage
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Schieberschacht";
  public Schieberschacht(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Leitungsart="Leitungsart";
  public ch.interlis.models.ZG_Wasser_V1.LeitungsArt getLeitungsart() {
    String value=getattrvalue("Leitungsart");
    return ch.interlis.models.ZG_Wasser_V1.LeitungsArt.parseXmlCode(value);
  }
  public void setLeitungsart(ch.interlis.models.ZG_Wasser_V1.LeitungsArt value) {
    setattrvalue("Leitungsart", ch.interlis.models.ZG_Wasser_V1.LeitungsArt.toXmlCode(value));
  }
}
