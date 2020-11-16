package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Quellschacht_TextArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Quellschacht_TextArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Quellschacht_TextArt value) {
     return value.value;
  }
  static public Quellschacht_TextArt parseXmlCode(String value) {
     return (Quellschacht_TextArt)valuev.get(value);
  }
  static public Quellschacht_TextArt QueSchaErtragBrst=new Quellschacht_TextArt("QueSchaErtragBrst");
  public final static String tag_QueSchaErtragBrst="QueSchaErtragBrst";
  static public Quellschacht_TextArt QueSchaErtragGrp=new Quellschacht_TextArt("QueSchaErtragGrp");
  public final static String tag_QueSchaErtragGrp="QueSchaErtragGrp";
  static public Quellschacht_TextArt Name=new Quellschacht_TextArt("Name");
  public final static String tag_Name="Name";
  static public Quellschacht_TextArt Techdata=new Quellschacht_TextArt("Techdata");
  public final static String tag_Techdata="Techdata";
}
