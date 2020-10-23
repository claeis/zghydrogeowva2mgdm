package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0;
public class BooleanTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private BooleanTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BooleanTyp value) {
     return value.value;
  }
  static public BooleanTyp parseXmlCode(String value) {
     return (BooleanTyp)valuev.get(value);
  }
  static public BooleanTyp nein=new BooleanTyp("nein");
  public final static String tag_nein="nein";
  static public BooleanTyp ja=new BooleanTyp("ja");
  public final static String tag_ja="ja";
}
