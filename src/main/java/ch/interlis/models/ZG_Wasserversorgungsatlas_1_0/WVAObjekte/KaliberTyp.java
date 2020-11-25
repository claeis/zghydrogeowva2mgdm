package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class KaliberTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected KaliberTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(KaliberTyp value) {
     return value.value;
  }
  static public KaliberTyp parseXmlCode(String value) {
     return (KaliberTyp)valuev.get(value);
  }
  static public KaliberTyp Kaliber_1=new KaliberTyp("Kaliber_1");
  public final static String tag_Kaliber_1="Kaliber_1";
  static public KaliberTyp Kaliber_2=new KaliberTyp("Kaliber_2");
  public final static String tag_Kaliber_2="Kaliber_2";
  static public KaliberTyp Kaliber_3=new KaliberTyp("Kaliber_3");
  public final static String tag_Kaliber_3="Kaliber_3";
  static public KaliberTyp Kaliber_4=new KaliberTyp("Kaliber_4");
  public final static String tag_Kaliber_4="Kaliber_4";
  static public KaliberTyp Kaliber_5=new KaliberTyp("Kaliber_5");
  public final static String tag_Kaliber_5="Kaliber_5";
  static public KaliberTyp Kaliber_6=new KaliberTyp("Kaliber_6");
  public final static String tag_Kaliber_6="Kaliber_6";
}
