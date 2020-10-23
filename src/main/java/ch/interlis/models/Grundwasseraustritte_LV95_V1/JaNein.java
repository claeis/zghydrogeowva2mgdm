package ch.interlis.models.Grundwasseraustritte_LV95_V1;
public class JaNein{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected JaNein(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(JaNein value) {
     return value.value;
  }
  static public JaNein parseXmlCode(String value) {
     return (JaNein)valuev.get(value);
  }
  static public JaNein ja=new JaNein("ja");
  public final static String tag_ja="ja";
  static public JaNein nein=new JaNein("nein");
  public final static String tag_nein="nein";
}
