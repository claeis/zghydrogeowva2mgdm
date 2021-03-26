package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Entnahmebrunnen_Foerdermethode{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Entnahmebrunnen_Foerdermethode(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Entnahmebrunnen_Foerdermethode value) {
     return value.value;
  }
  static public Entnahmebrunnen_Foerdermethode parseXmlCode(String value) {
     return (Entnahmebrunnen_Foerdermethode)valuev.get(value);
  }
  static public Entnahmebrunnen_Foerdermethode Pumpe=new Entnahmebrunnen_Foerdermethode("Pumpe");
  public final static String tag_Pumpe="Pumpe";
  static public Entnahmebrunnen_Foerdermethode Heber=new Entnahmebrunnen_Foerdermethode("Heber");
  public final static String tag_Heber="Heber";
  static public Entnahmebrunnen_Foerdermethode artesisch=new Entnahmebrunnen_Foerdermethode("artesisch");
  public final static String tag_artesisch="artesisch";
  static public Entnahmebrunnen_Foerdermethode unbestimmt=new Entnahmebrunnen_Foerdermethode("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
