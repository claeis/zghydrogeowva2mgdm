package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class BewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.BewiReg";
  public BewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BewiNummer="BewiNummer";
  public int getBewiNummer() {
    String value=getattrvalue("BewiNummer");
    return Integer.parseInt(value);
  }
  public void setBewiNummer(int value) {
    setattrvalue("BewiNummer", Integer.toString(value));
  }
  public final static String tag_Entnahmemenge="Entnahmemenge";
  public int getEntnahmemenge() {
    String value=getattrvalue("Entnahmemenge");
    return Integer.parseInt(value);
  }
  public void setEntnahmemenge(int value) {
    setattrvalue("Entnahmemenge", Integer.toString(value));
  }
  public final static String tag_Pumpmenge="Pumpmenge";
  public int getPumpmenge() {
    String value=getattrvalue("Pumpmenge");
    return Integer.parseInt(value);
  }
  public void setPumpmenge(int value) {
    setattrvalue("Pumpmenge", Integer.toString(value));
  }
  public final static String tag_Vesickerungsmenge="Vesickerungsmenge";
  public int getVesickerungsmenge() {
    String value=getattrvalue("Vesickerungsmenge");
    return Integer.parseInt(value);
  }
  public void setVesickerungsmenge(int value) {
    setattrvalue("Vesickerungsmenge", Integer.toString(value));
  }
  public final static String tag_Datum="Datum";
  public String getDatum() {
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    setattrvalue("Datum", value);
  }
}
