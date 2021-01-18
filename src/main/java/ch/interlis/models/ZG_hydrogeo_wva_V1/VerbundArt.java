package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class VerbundArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected VerbundArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(VerbundArt value) {
     return value.value;
  }
  static public VerbundArt parseXmlCode(String value) {
     return (VerbundArt)valuev.get(value);
  }
  static public VerbundArt fester_Verbund=new VerbundArt("fester_Verbund");
  public final static String tag_fester_Verbund="fester_Verbund";
  static public VerbundArt anzustrebender_fester_Verbund=new VerbundArt("anzustrebender_fester_Verbund");
  public final static String tag_anzustrebender_fester_Verbund="anzustrebender_fester_Verbund";
  static public VerbundArt Notverbund=new VerbundArt("Notverbund");
  public final static String tag_Notverbund="Notverbund";
}
