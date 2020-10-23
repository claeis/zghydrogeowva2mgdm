package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Quelle_Nutzungszustand{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Quelle_Nutzungszustand(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Quelle_Nutzungszustand value) {
     return value.value;
  }
  static public Quelle_Nutzungszustand parseXmlCode(String value) {
     return (Quelle_Nutzungszustand)valuev.get(value);
  }
  static public Quelle_Nutzungszustand genutzt=new Quelle_Nutzungszustand("genutzt");
  public final static String tag_genutzt="genutzt";
  static public Quelle_Nutzungszustand ungenutzt=new Quelle_Nutzungszustand("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public Quelle_Nutzungszustand aufgehoben=new Quelle_Nutzungszustand("aufgehoben");
  public final static String tag_aufgehoben="aufgehoben";
  static public Quelle_Nutzungszustand unbestimmt=new Quelle_Nutzungszustand("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
