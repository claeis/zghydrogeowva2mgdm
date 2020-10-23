package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche;
public class GSBereichTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected GSBereichTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(GSBereichTyp value) {
     return value.value;
  }
  static public GSBereichTyp parseXmlCode(String value) {
     return (GSBereichTyp)valuev.get(value);
  }
  static public GSBereichTyp Ao=new GSBereichTyp("Ao");
  public final static String tag_Ao="Ao";
  static public GSBereichTyp Au=new GSBereichTyp("Au");
  public final static String tag_Au="Au";
  static public GSBereichTyp Zo=new GSBereichTyp("Zo");
  public final static String tag_Zo="Zo";
  static public GSBereichTyp Zu=new GSBereichTyp("Zu");
  public final static String tag_Zu="Zu";
  static public GSBereichTyp UB=new GSBereichTyp("UB");
  public final static String tag_UB="UB";
}
