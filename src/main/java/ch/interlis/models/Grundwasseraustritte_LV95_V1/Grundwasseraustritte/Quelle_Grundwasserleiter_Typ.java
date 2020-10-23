package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Quelle_Grundwasserleiter_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Quelle_Grundwasserleiter_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Quelle_Grundwasserleiter_Typ value) {
     return value.value;
  }
  static public Quelle_Grundwasserleiter_Typ parseXmlCode(String value) {
     return (Quelle_Grundwasserleiter_Typ)valuev.get(value);
  }
  static public Quelle_Grundwasserleiter_Typ Lockergestein=new Quelle_Grundwasserleiter_Typ("Lockergestein");
  public final static String tag_Lockergestein="Lockergestein";
  static public Quelle_Grundwasserleiter_Typ Kluft=new Quelle_Grundwasserleiter_Typ("Kluft");
  public final static String tag_Kluft="Kluft";
  static public Quelle_Grundwasserleiter_Typ Karst=new Quelle_Grundwasserleiter_Typ("Karst");
  public final static String tag_Karst="Karst";
  static public Quelle_Grundwasserleiter_Typ gemischt=new Quelle_Grundwasserleiter_Typ("gemischt");
  public final static String tag_gemischt="gemischt";
  static public Quelle_Grundwasserleiter_Typ unbestimmt=new Quelle_Grundwasserleiter_Typ("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
