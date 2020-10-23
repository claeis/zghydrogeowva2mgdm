package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class WasserQualitaet{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private WasserQualitaet(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(WasserQualitaet value) {
     return value.value;
  }
  static public WasserQualitaet parseXmlCode(String value) {
     return (WasserQualitaet)valuev.get(value);
  }
  static public WasserQualitaet ohne_Aufbereitung_als_Trinkwasser_nutzbar=new WasserQualitaet("ohne_Aufbereitung_als_Trinkwasser_nutzbar");
  public final static String tag_ohne_Aufbereitung_als_Trinkwasser_nutzbar="ohne_Aufbereitung_als_Trinkwasser_nutzbar";
  static public WasserQualitaet kein_Trinkwasser=new WasserQualitaet("kein_Trinkwasser");
  public final static String tag_kein_Trinkwasser="kein_Trinkwasser";
  static public WasserQualitaet Aufbereitung_vorhanden=new WasserQualitaet("Aufbereitung_vorhanden");
  public final static String tag_Aufbereitung_vorhanden="Aufbereitung_vorhanden";
  static public WasserQualitaet unbekannt=new WasserQualitaet("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
