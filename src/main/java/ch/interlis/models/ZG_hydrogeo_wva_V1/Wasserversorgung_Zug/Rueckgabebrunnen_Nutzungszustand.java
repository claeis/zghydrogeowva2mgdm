package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Rueckgabebrunnen_Nutzungszustand{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Rueckgabebrunnen_Nutzungszustand(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Rueckgabebrunnen_Nutzungszustand value) {
     return value.value;
  }
  static public Rueckgabebrunnen_Nutzungszustand parseXmlCode(String value) {
     return (Rueckgabebrunnen_Nutzungszustand)valuev.get(value);
  }
  static public Rueckgabebrunnen_Nutzungszustand genutzt=new Rueckgabebrunnen_Nutzungszustand("genutzt");
  public final static String tag_genutzt="genutzt";
  static public Rueckgabebrunnen_Nutzungszustand ungenutzt=new Rueckgabebrunnen_Nutzungszustand("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public Rueckgabebrunnen_Nutzungszustand aufgehoben=new Rueckgabebrunnen_Nutzungszustand("aufgehoben");
  public final static String tag_aufgehoben="aufgehoben";
  static public Rueckgabebrunnen_Nutzungszustand unbestimmt=new Rueckgabebrunnen_Nutzungszustand("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
