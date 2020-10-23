package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0;
public class ErfGenauigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private ErfGenauigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ErfGenauigkeit value) {
     return value.value;
  }
  static public ErfGenauigkeit parseXmlCode(String value) {
     return (ErfGenauigkeit)valuev.get(value);
  }
  static public ErfGenauigkeit AV_gerechnet=new ErfGenauigkeit("AV_gerechnet");
  public final static String tag_AV_gerechnet="AV_gerechnet";
  static public ErfGenauigkeit Detailplan=new ErfGenauigkeit("Detailplan");
  public final static String tag_Detailplan="Detailplan";
  static public ErfGenauigkeit andere=new ErfGenauigkeit("andere");
  public final static String tag_andere="andere";
  static public ErfGenauigkeit unbekannt=new ErfGenauigkeit("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
