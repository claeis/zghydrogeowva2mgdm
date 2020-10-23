package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class WeitereAnlage_WeitereAnlageArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected WeitereAnlage_WeitereAnlageArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(WeitereAnlage_WeitereAnlageArt value) {
     return value.value;
  }
  static public WeitereAnlage_WeitereAnlageArt parseXmlCode(String value) {
     return (WeitereAnlage_WeitereAnlageArt)valuev.get(value);
  }
  static public WeitereAnlage_WeitereAnlageArt Laufbrunnen=new WeitereAnlage_WeitereAnlageArt("Laufbrunnen");
  public final static String tag_Laufbrunnen="Laufbrunnen";
  static public WeitereAnlage_WeitereAnlageArt Kaliberwechsel=new WeitereAnlage_WeitereAnlageArt("Kaliberwechsel");
  public final static String tag_Kaliberwechsel="Kaliberwechsel";
  static public WeitereAnlage_WeitereAnlageArt RWZisterne=new WeitereAnlage_WeitereAnlageArt("RWZisterne");
  public final static String tag_RWZisterne="RWZisterne";
}
