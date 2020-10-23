package ch.interlis.models.ZG_Wasser_V1;
public class BetriebsArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected BetriebsArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BetriebsArt value) {
     return value.value;
  }
  static public BetriebsArt parseXmlCode(String value) {
     return (BetriebsArt)valuev.get(value);
  }
  static public BetriebsArt ausser_Betrieb=new BetriebsArt("ausser_Betrieb");
  public final static String tag_ausser_Betrieb="ausser_Betrieb";
  static public BetriebsArt im_Bau=new BetriebsArt("im_Bau");
  public final static String tag_im_Bau="im_Bau";
  static public BetriebsArt in_Betrieb=new BetriebsArt("in_Betrieb");
  public final static String tag_in_Betrieb="in_Betrieb";
  static public BetriebsArt projektiert=new BetriebsArt("projektiert");
  public final static String tag_projektiert="projektiert";
  static public BetriebsArt stillgelegt=new BetriebsArt("stillgelegt");
  public final static String tag_stillgelegt="stillgelegt";
  static public BetriebsArt unbekannt=new BetriebsArt("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
