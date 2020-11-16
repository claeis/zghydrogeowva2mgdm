package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Foerderanlage_FoerderanlageArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Foerderanlage_FoerderanlageArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Foerderanlage_FoerderanlageArt value) {
     return value.value;
  }
  static public Foerderanlage_FoerderanlageArt parseXmlCode(String value) {
     return (Foerderanlage_FoerderanlageArt)valuev.get(value);
  }
  static public Foerderanlage_FoerderanlageArt Pumpwerk=new Foerderanlage_FoerderanlageArt("Pumpwerk");
  public final static String tag_Pumpwerk="Pumpwerk";
  static public Foerderanlage_FoerderanlageArt HydWidder=new Foerderanlage_FoerderanlageArt("HydWidder");
  public final static String tag_HydWidder="HydWidder";
  static public Foerderanlage_FoerderanlageArt ReinwasserPW=new Foerderanlage_FoerderanlageArt("ReinwasserPW");
  public final static String tag_ReinwasserPW="ReinwasserPW";
  static public Foerderanlage_FoerderanlageArt OberflGewRohwaPW=new Foerderanlage_FoerderanlageArt("OberflGewRohwaPW");
  public final static String tag_OberflGewRohwaPW="OberflGewRohwaPW";
}
