package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Notversorgung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Notversorgung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Notversorgung value) {
     return value.value;
  }
  static public Notversorgung parseXmlCode(String value) {
     return (Notversorgung)valuev.get(value);
  }
  static public Notversorgung Normalversorgung=new Notversorgung("Normalversorgung");
  public final static String tag_Normalversorgung="Normalversorgung";
  static public Notversorgung nur_Notversorgung=new Notversorgung("nur_Notversorgung");
  public final static String tag_nur_Notversorgung="nur_Notversorgung";
  static public Notversorgung Not_und_Normalversorgung=new Notversorgung("Not_und_Normalversorgung");
  public final static String tag_Not_und_Normalversorgung="Not_und_Normalversorgung";
  static public Notversorgung unbekannt=new Notversorgung("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
