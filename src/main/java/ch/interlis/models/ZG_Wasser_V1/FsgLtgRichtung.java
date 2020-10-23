package ch.interlis.models.ZG_Wasser_V1;
public class FsgLtgRichtung{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected FsgLtgRichtung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(FsgLtgRichtung value) {
     return value.value;
  }
  static public FsgLtgRichtung parseXmlCode(String value) {
     return (FsgLtgRichtung)valuev.get(value);
  }
  static public FsgLtgRichtung bekannt=new FsgLtgRichtung("bekannt");
  public final static String tag_bekannt="bekannt";
  static public FsgLtgRichtung Einlauf_bekannt=new FsgLtgRichtung("Einlauf_bekannt");
  public final static String tag_Einlauf_bekannt="Einlauf_bekannt";
  static public FsgLtgRichtung ungefaehr_bekannt=new FsgLtgRichtung("ungefaehr_bekannt");
  public final static String tag_ungefaehr_bekannt="ungefaehr_bekannt";
  static public FsgLtgRichtung schematisch=new FsgLtgRichtung("schematisch");
  public final static String tag_schematisch="schematisch";
  static public FsgLtgRichtung unbekannt=new FsgLtgRichtung("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
