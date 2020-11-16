package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class VersickerungArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected VersickerungArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(VersickerungArt value) {
     return value.value;
  }
  static public VersickerungArt parseXmlCode(String value) {
     return (VersickerungArt)valuev.get(value);
  }
  static public VersickerungArt Typ_F=new VersickerungArt("Typ_F");
  public final static String tag_Typ_F="Typ_F";
  static public VersickerungArt Typ_H=new VersickerungArt("Typ_H");
  public final static String tag_Typ_H="Typ_H";
  static public VersickerungArt Typ_K=new VersickerungArt("Typ_K");
  public final static String tag_Typ_K="Typ_K";
  static public VersickerungArt unbekannt=new VersickerungArt("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
