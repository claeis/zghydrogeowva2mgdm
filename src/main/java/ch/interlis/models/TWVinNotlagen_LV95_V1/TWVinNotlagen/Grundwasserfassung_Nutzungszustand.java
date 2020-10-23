package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Grundwasserfassung_Nutzungszustand{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Grundwasserfassung_Nutzungszustand(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grundwasserfassung_Nutzungszustand value) {
     return value.value;
  }
  static public Grundwasserfassung_Nutzungszustand parseXmlCode(String value) {
     return (Grundwasserfassung_Nutzungszustand)valuev.get(value);
  }
  static public Grundwasserfassung_Nutzungszustand genutzt=new Grundwasserfassung_Nutzungszustand("genutzt");
  public final static String tag_genutzt="genutzt";
  static public Grundwasserfassung_Nutzungszustand ungenutzt=new Grundwasserfassung_Nutzungszustand("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public Grundwasserfassung_Nutzungszustand aufgehoben=new Grundwasserfassung_Nutzungszustand("aufgehoben");
  public final static String tag_aufgehoben="aufgehoben";
  static public Grundwasserfassung_Nutzungszustand unbestimmt=new Grundwasserfassung_Nutzungszustand("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
