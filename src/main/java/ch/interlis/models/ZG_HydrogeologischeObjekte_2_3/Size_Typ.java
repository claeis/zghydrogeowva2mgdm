package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class Size_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Size_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Size_Typ value) {
     return value.value;
  }
  static public Size_Typ parseXmlCode(String value) {
     return (Size_Typ)valuev.get(value);
  }
  static public Size_Typ klein=new Size_Typ("klein");
  public final static String tag_klein="klein";
  static public Size_Typ mittel=new Size_Typ("mittel");
  public final static String tag_mittel="mittel";
  static public Size_Typ gross=new Size_Typ("gross");
  public final static String tag_gross="gross";
  static public Size_Typ unterdrueckt=new Size_Typ("unterdrueckt");
  public final static String tag_unterdrueckt="unterdrueckt";
}
