package ch.interlis.models.ZG_Wasser_V1;
public class ResSymbTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected ResSymbTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ResSymbTyp value) {
     return value.value;
  }
  static public ResSymbTyp parseXmlCode(String value) {
     return (ResSymbTyp)valuev.get(value);
  }
  static public ResSymbTyp Vol_5_29=new ResSymbTyp("Vol_5_29");
  public final static String tag_Vol_5_29="Vol_5_29";
  static public ResSymbTyp Vol_30_1000=new ResSymbTyp("Vol_30_1000");
  public final static String tag_Vol_30_1000="Vol_30_1000";
  static public ResSymbTyp Vol_1001_5000=new ResSymbTyp("Vol_1001_5000");
  public final static String tag_Vol_1001_5000="Vol_1001_5000";
  static public ResSymbTyp Vol_5001_9999=new ResSymbTyp("Vol_5001_9999");
  public final static String tag_Vol_5001_9999="Vol_5001_9999";
  static public ResSymbTyp Vol_10000=new ResSymbTyp("Vol_10000");
  public final static String tag_Vol_10000="Vol_10000";
}
