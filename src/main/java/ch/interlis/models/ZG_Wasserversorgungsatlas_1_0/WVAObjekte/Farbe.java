package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Farbe{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Farbe(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Farbe value) {
     return value.value;
  }
  static public Farbe parseXmlCode(String value) {
     return (Farbe)valuev.get(value);
  }
  static public Farbe blau=new Farbe("blau");
  public final static String tag_blau="blau";
  static public Farbe gruen=new Farbe("gruen");
  public final static String tag_gruen="gruen";
  static public Farbe rot=new Farbe("rot");
  public final static String tag_rot="rot";
  static public Farbe braun=new Farbe("braun");
  public final static String tag_braun="braun";
  static public Farbe keine=new Farbe("keine");
  public final static String tag_keine="keine";
}
