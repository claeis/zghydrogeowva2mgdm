package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Foerderanlage_Art{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Foerderanlage_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Foerderanlage_Art value) {
     return value.value;
  }
  static public Foerderanlage_Art parseXmlCode(String value) {
     return (Foerderanlage_Art)valuev.get(value);
  }
  static public Foerderanlage_Art Pumpwerk=new Foerderanlage_Art("Pumpwerk");
  public final static String tag_Pumpwerk="Pumpwerk";
  static public Foerderanlage_Art Stufenpumpwerk=new Foerderanlage_Art("Stufenpumpwerk");
  public final static String tag_Stufenpumpwerk="Stufenpumpwerk";
  static public Foerderanlage_Art Stufenpumpwerk_mit_Behaelter=new Foerderanlage_Art("Stufenpumpwerk_mit_Behaelter");
  public final static String tag_Stufenpumpwerk_mit_Behaelter="Stufenpumpwerk_mit_Behaelter";
  static public Foerderanlage_Art Druckerhoehungspumpwerk=new Foerderanlage_Art("Druckerhoehungspumpwerk");
  public final static String tag_Druckerhoehungspumpwerk="Druckerhoehungspumpwerk";
  static public Foerderanlage_Art hydraulischer_Widder=new Foerderanlage_Art("hydraulischer_Widder");
  public final static String tag_hydraulischer_Widder="hydraulischer_Widder";
  static public Foerderanlage_Art Heberanlage=new Foerderanlage_Art("Heberanlage");
  public final static String tag_Heberanlage="Heberanlage";
  static public Foerderanlage_Art unbestimmt=new Foerderanlage_Art("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
