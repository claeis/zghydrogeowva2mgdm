package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Nutzungszustand{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Nutzungszustand(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Nutzungszustand value) {
     return value.value;
  }
  static public Nutzungszustand parseXmlCode(String value) {
     return (Nutzungszustand)valuev.get(value);
  }
  static public Nutzungszustand genutzt=new Nutzungszustand("genutzt");
  public final static String tag_genutzt="genutzt";
  static public Nutzungszustand ungenutzt=new Nutzungszustand("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public Nutzungszustand aufgehoben=new Nutzungszustand("aufgehoben");
  public final static String tag_aufgehoben="aufgehoben";
  static public Nutzungszustand unbestimmt=new Nutzungszustand("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
