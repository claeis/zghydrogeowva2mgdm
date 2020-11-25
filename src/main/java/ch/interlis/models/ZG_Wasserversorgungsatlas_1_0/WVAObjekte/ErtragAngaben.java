package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class ErtragAngaben{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected ErtragAngaben(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ErtragAngaben value) {
     return value.value;
  }
  static public ErtragAngaben parseXmlCode(String value) {
     return (ErtragAngaben)valuev.get(value);
  }
  static public ErtragAngaben gemessen=new ErtragAngaben("gemessen");
  public final static String tag_gemessen="gemessen";
  static public ErtragAngaben geschaetzt=new ErtragAngaben("geschaetzt");
  public final static String tag_geschaetzt="geschaetzt";
  static public ErtragAngaben umgerechnet=new ErtragAngaben("umgerechnet");
  public final static String tag_umgerechnet="umgerechnet";
  static public ErtragAngaben unbekannt=new ErtragAngaben("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
