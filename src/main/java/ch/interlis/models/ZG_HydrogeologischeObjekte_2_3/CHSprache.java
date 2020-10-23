package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class CHSprache{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private CHSprache(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(CHSprache value) {
     return value.value;
  }
  static public CHSprache parseXmlCode(String value) {
     return (CHSprache)valuev.get(value);
  }
  static public CHSprache de=new CHSprache("de");
  public final static String tag_de="de";
  static public CHSprache fr=new CHSprache("fr");
  public final static String tag_fr="fr";
  static public CHSprache it=new CHSprache("it");
  public final static String tag_it="it";
  static public CHSprache rm=new CHSprache("rm");
  public final static String tag_rm="rm";
  static public CHSprache en=new CHSprache("en");
  public final static String tag_en="en";
}
