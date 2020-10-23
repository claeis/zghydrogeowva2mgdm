package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1;
public class Rechtsverbindlichkeit{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Rechtsverbindlichkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Rechtsverbindlichkeit value) {
     return value.value;
  }
  static public Rechtsverbindlichkeit parseXmlCode(String value) {
     return (Rechtsverbindlichkeit)valuev.get(value);
  }
  static public Rechtsverbindlichkeit grundeigentuemerverbindlich=new Rechtsverbindlichkeit("grundeigentuemerverbindlich");
  public final static String tag_grundeigentuemerverbindlich="grundeigentuemerverbindlich";
  static public Rechtsverbindlichkeit behoerdenverbindlich=new Rechtsverbindlichkeit("behoerdenverbindlich");
  public final static String tag_behoerdenverbindlich="behoerdenverbindlich";
}
