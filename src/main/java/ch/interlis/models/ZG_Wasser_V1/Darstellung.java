package ch.interlis.models.ZG_Wasser_V1;
public class Darstellung{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Darstellung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Darstellung value) {
     return value.value;
  }
  static public Darstellung parseXmlCode(String value) {
     return (Darstellung)valuev.get(value);
  }
  static public Darstellung keine=new Darstellung("keine");
  public final static String tag_keine="keine";
  static public Darstellung M_1_5000=new Darstellung("M_1_5000");
  public final static String tag_M_1_5000="M_1_5000";
  static public Darstellung M_1_25000=new Darstellung("M_1_25000");
  public final static String tag_M_1_25000="M_1_25000";
  static public Darstellung M_1_50000=new Darstellung("M_1_50000");
  public final static String tag_M_1_50000="M_1_50000";
  static public Darstellung M_1_100000=new Darstellung("M_1_100000");
  public final static String tag_M_1_100000="M_1_100000";
  static public Darstellung M_1_200000=new Darstellung("M_1_200000");
  public final static String tag_M_1_200000="M_1_200000";
}
