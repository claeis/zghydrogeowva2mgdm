package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Sammeleinrichtung_ArtSammeleinrichtung{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Sammeleinrichtung_ArtSammeleinrichtung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Sammeleinrichtung_ArtSammeleinrichtung value) {
     return value.value;
  }
  static public Sammeleinrichtung_ArtSammeleinrichtung parseXmlCode(String value) {
     return (Sammeleinrichtung_ArtSammeleinrichtung)valuev.get(value);
  }
  static public Sammeleinrichtung_ArtSammeleinrichtung Qwf=new Sammeleinrichtung_ArtSammeleinrichtung("Qwf");
  public final static String tag_Qwf="Qwf";
  static public Sammeleinrichtung_ArtSammeleinrichtung Gwf=new Sammeleinrichtung_ArtSammeleinrichtung("Gwf");
  public final static String tag_Gwf="Gwf";
}
