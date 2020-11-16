package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class SizeTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected SizeTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(SizeTyp value) {
     return value.value;
  }
  static public SizeTyp parseXmlCode(String value) {
     return (SizeTyp)valuev.get(value);
  }
  static public SizeTyp kleinst=new SizeTyp("kleinst");
  public final static String tag_kleinst="kleinst";
  static public SizeTyp klein=new SizeTyp("klein");
  public final static String tag_klein="klein";
  static public SizeTyp mittel=new SizeTyp("mittel");
  public final static String tag_mittel="mittel";
  static public SizeTyp gross=new SizeTyp("gross");
  public final static String tag_gross="gross";
  static public SizeTyp unterdrueckt=new SizeTyp("unterdrueckt");
  public final static String tag_unterdrueckt="unterdrueckt";
}
