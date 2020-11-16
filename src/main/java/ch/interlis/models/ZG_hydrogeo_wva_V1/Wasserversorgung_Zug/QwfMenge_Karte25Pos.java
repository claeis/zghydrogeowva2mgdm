package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QwfMenge_Karte25Pos extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos";
  public QwfMenge_Karte25Pos(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_PlatzhalterBeschriftung="PlatzhalterBeschriftung";
  public String getPlatzhalterBeschriftung() {
    String value=getattrvalue("PlatzhalterBeschriftung");
    return value;
  }
  public void setPlatzhalterBeschriftung(String value) {
    setattrvalue("PlatzhalterBeschriftung", value);
  }
}
