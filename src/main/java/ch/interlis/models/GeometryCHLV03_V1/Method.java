package ch.interlis.models.GeometryCHLV03_V1;
public class Method{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Method(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Method value) {
     return value.value;
  }
  static public Method parseXmlCode(String value) {
     return (Method)valuev.get(value);
  }
  static public Method measured=new Method("measured");
  public final static String tag_measured="measured";
  static public Method sketched=new Method("sketched");
  public final static String tag_sketched="sketched";
  static public Method calculated=new Method("calculated");
  public final static String tag_calculated="calculated";
}
