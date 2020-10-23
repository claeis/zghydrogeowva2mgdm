package ch.interlis.models.Grundwasseraustritte_LV95_V1;
public class JaNeinUnbestimmt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected JaNeinUnbestimmt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(JaNeinUnbestimmt value) {
     return value.value;
  }
  static public JaNeinUnbestimmt parseXmlCode(String value) {
     return (JaNeinUnbestimmt)valuev.get(value);
  }
  static public JaNeinUnbestimmt ja=new JaNeinUnbestimmt("ja");
  public final static String tag_ja="ja";
  static public JaNeinUnbestimmt nein=new JaNeinUnbestimmt("nein");
  public final static String tag_nein="nein";
  static public JaNeinUnbestimmt unbestimmt=new JaNeinUnbestimmt("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
