package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class IntranetPos_IntranetPos{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected IntranetPos_IntranetPos(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(IntranetPos_IntranetPos value) {
     return value.value;
  }
  static public IntranetPos_IntranetPos parseXmlCode(String value) {
     return (IntranetPos_IntranetPos)valuev.get(value);
  }
  static public IntranetPos_IntranetPos Pos2=new IntranetPos_IntranetPos("Pos2");
  public final static String tag_Pos2="Pos2";
  static public IntranetPos_IntranetPos Pos5=new IntranetPos_IntranetPos("Pos5");
  public final static String tag_Pos5="Pos5";
}
