package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Sammeleinrichtung_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Sammeleinrichtung_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Sammeleinrichtung_Typ value) {
     return value.value;
  }
  static public Sammeleinrichtung_Typ parseXmlCode(String value) {
     return (Sammeleinrichtung_Typ)valuev.get(value);
  }
  static public Sammeleinrichtung_Typ Fassungsstrang=new Sammeleinrichtung_Typ("Fassungsstrang");
  public final static String tag_Fassungsstrang="Fassungsstrang";
  static public Sammeleinrichtung_Typ Fassungsstollen=new Sammeleinrichtung_Typ("Fassungsstollen");
  public final static String tag_Fassungsstollen="Fassungsstollen";
  static public Sammeleinrichtung_Typ unbestimmt=new Sammeleinrichtung_Typ("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
