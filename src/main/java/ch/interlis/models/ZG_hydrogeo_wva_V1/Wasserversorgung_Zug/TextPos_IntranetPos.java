package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class TextPos_IntranetPos{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected TextPos_IntranetPos(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(TextPos_IntranetPos value) {
     return value.value;
  }
  static public TextPos_IntranetPos parseXmlCode(String value) {
     return (TextPos_IntranetPos)valuev.get(value);
  }
  static public TextPos_IntranetPos Pos2=new TextPos_IntranetPos("Pos2");
  public final static String tag_Pos2="Pos2";
  static public TextPos_IntranetPos Pos5=new TextPos_IntranetPos("Pos5");
  public final static String tag_Pos5="Pos5";
}
