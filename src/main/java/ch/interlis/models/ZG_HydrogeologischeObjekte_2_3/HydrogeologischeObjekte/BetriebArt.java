package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class BetriebArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected BetriebArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BetriebArt value) {
     return value.value;
  }
  static public BetriebArt parseXmlCode(String value) {
     return (BetriebArt)valuev.get(value);
  }
  static public BetriebArt in_Betrieb=new BetriebArt("in_Betrieb");
  public final static String tag_in_Betrieb="in_Betrieb";
  static public BetriebArt ausser_Betrieb=new BetriebArt("ausser_Betrieb");
  public final static String tag_ausser_Betrieb="ausser_Betrieb";
  static public BetriebArt stillgelegt=new BetriebArt("stillgelegt");
  public final static String tag_stillgelegt="stillgelegt";
  static public BetriebArt ungenutzt=new BetriebArt("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public BetriebArt zerstoert=new BetriebArt("zerstoert");
  public final static String tag_zerstoert="zerstoert";
  static public BetriebArt unbekannt=new BetriebArt("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public BetriebArt im_Verwurf=new BetriebArt("im_Verwurf");
  public final static String tag_im_Verwurf="im_Verwurf";
}
