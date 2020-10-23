package ch.interlis.models.GeometryCHLV95_V1;
public class Accuracy{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Accuracy(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Accuracy value) {
     return value.value;
  }
  static public Accuracy parseXmlCode(String value) {
     return (Accuracy)valuev.get(value);
  }
  static public Accuracy cm=new Accuracy("cm");
  public final static String tag_cm="cm";
  static public Accuracy cm50=new Accuracy("cm50");
  public final static String tag_cm50="cm50";
  static public Accuracy m=new Accuracy("m");
  public final static String tag_m="m";
  static public Accuracy m10=new Accuracy("m10");
  public final static String tag_m10="m10";
  static public Accuracy m50=new Accuracy("m50");
  public final static String tag_m50="m50";
  static public Accuracy vague=new Accuracy("vague");
  public final static String tag_vague="vague";
}
