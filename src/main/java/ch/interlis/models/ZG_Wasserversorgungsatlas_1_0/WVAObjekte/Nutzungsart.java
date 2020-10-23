package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Nutzungsart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Nutzungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Nutzungsart value) {
     return value.value;
  }
  static public Nutzungsart parseXmlCode(String value) {
     return (Nutzungsart)valuev.get(value);
  }
  static public Nutzungsart Brauchwasser=new Nutzungsart("Brauchwasser");
  public final static String tag_Brauchwasser="Brauchwasser";
  static public Nutzungsart Laufender_Brunnen=new Nutzungsart("Laufender_Brunnen");
  public final static String tag_Laufender_Brunnen="Laufender_Brunnen";
  static public Nutzungsart ungenutzt=new Nutzungsart("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
  static public Nutzungsart Trinkwasser=new Nutzungsart("Trinkwasser");
  public final static String tag_Trinkwasser="Trinkwasser";
  static public Nutzungsart unbekannt=new Nutzungsart("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public Nutzungsart Viehtraenke=new Nutzungsart("Viehtraenke");
  public final static String tag_Viehtraenke="Viehtraenke";
  static public Nutzungsart Waschwasser_Milch=new Nutzungsart("Waschwasser_Milch");
  public final static String tag_Waschwasser_Milch="Waschwasser_Milch";
  static public Nutzungsart Turbine=new Nutzungsart("Turbine");
  public final static String tag_Turbine="Turbine";
}
