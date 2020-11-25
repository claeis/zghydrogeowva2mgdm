package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class FsgLtgLaenge{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected FsgLtgLaenge(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(FsgLtgLaenge value) {
     return value.value;
  }
  static public FsgLtgLaenge parseXmlCode(String value) {
     return (FsgLtgLaenge)valuev.get(value);
  }
  static public FsgLtgLaenge bekannt=new FsgLtgLaenge("bekannt");
  public final static String tag_bekannt="bekannt";
  static public FsgLtgLaenge ungefaehr_bekannt=new FsgLtgLaenge("ungefaehr_bekannt");
  public final static String tag_ungefaehr_bekannt="ungefaehr_bekannt";
  static public FsgLtgLaenge schematisch=new FsgLtgLaenge("schematisch");
  public final static String tag_schematisch="schematisch";
  static public FsgLtgLaenge unbekannt=new FsgLtgLaenge("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
