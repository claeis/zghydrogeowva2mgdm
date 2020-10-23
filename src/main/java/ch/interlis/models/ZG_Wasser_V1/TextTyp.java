package ch.interlis.models.ZG_Wasser_V1;
public class TextTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected TextTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(TextTyp value) {
     return value.value;
  }
  static public TextTyp parseXmlCode(String value) {
     return (TextTyp)valuev.get(value);
  }
  static public TextTyp NameText=new TextTyp("NameText");
  public final static String tag_NameText="NameText";
  static public TextTyp TechData=new TextTyp("TechData");
  public final static String tag_TechData="TechData";
  static public TextTyp TechData1=new TextTyp("TechData1");
  public final static String tag_TechData1="TechData1";
  static public TextTyp TechData2=new TextTyp("TechData2");
  public final static String tag_TechData2="TechData2";
  static public TextTyp TechData3=new TextTyp("TechData3");
  public final static String tag_TechData3="TechData3";
  static public TextTyp TechData4=new TextTyp("TechData4");
  public final static String tag_TechData4="TechData4";
}
