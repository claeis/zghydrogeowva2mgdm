package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0;
public class EigentumArt{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private EigentumArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(EigentumArt value) {
     return value.value;
  }
  static public EigentumArt parseXmlCode(String value) {
     return (EigentumArt)valuev.get(value);
  }
  static public EigentumArt privat=new EigentumArt("privat");
  public final static String tag_privat="privat";
  static public EigentumArt oeffentlich=new EigentumArt("oeffentlich");
  public final static String tag_oeffentlich="oeffentlich";
  static public EigentumArt unbekannt=new EigentumArt("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
