package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class PWTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private PWTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(PWTyp value) {
     return value.value;
  }
  static public PWTyp parseXmlCode(String value) {
     return (PWTyp)valuev.get(value);
  }
  static public PWTyp Stufenpumpwerk=new PWTyp("Stufenpumpwerk");
  public final static String tag_Stufenpumpwerk="Stufenpumpwerk";
  static public PWTyp QuellwasserbehaelterMitStufenpumpwerk=new PWTyp("QuellwasserbehaelterMitStufenpumpwerk");
  public final static String tag_QuellwasserbehaelterMitStufenpumpwerk="QuellwasserbehaelterMitStufenpumpwerk";
  static public PWTyp Druckerhoehungspumpwerk=new PWTyp("Druckerhoehungspumpwerk");
  public final static String tag_Druckerhoehungspumpwerk="Druckerhoehungspumpwerk";
}
