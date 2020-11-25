package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class EntnahmebrunnenTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected EntnahmebrunnenTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(EntnahmebrunnenTyp value) {
     return value.value;
  }
  static public EntnahmebrunnenTyp parseXmlCode(String value) {
     return (EntnahmebrunnenTyp)valuev.get(value);
  }
  static public EntnahmebrunnenTyp einfacheGWFassung=new EntnahmebrunnenTyp("einfacheGWFassung");
  public final static String tag_einfacheGWFassung="einfacheGWFassung";
  static public EntnahmebrunnenTyp HorizontalfilterBrunnen=new EntnahmebrunnenTyp("HorizontalfilterBrunnen");
  public final static String tag_HorizontalfilterBrunnen="HorizontalfilterBrunnen";
  static public EntnahmebrunnenTyp VertikalfilterBrunnen=new EntnahmebrunnenTyp("VertikalfilterBrunnen");
  public final static String tag_VertikalfilterBrunnen="VertikalfilterBrunnen";
  static public EntnahmebrunnenTyp Sodbrunnen=new EntnahmebrunnenTyp("Sodbrunnen");
  public final static String tag_Sodbrunnen="Sodbrunnen";
  static public EntnahmebrunnenTyp GW_Notbrunnen=new EntnahmebrunnenTyp("GW_Notbrunnen");
  public final static String tag_GW_Notbrunnen="GW_Notbrunnen";
  static public EntnahmebrunnenTyp Rohr=new EntnahmebrunnenTyp("Rohr");
  public final static String tag_Rohr="Rohr";
  static public EntnahmebrunnenTyp unbekannt=new EntnahmebrunnenTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public EntnahmebrunnenTyp andere=new EntnahmebrunnenTyp("andere");
  public final static String tag_andere="andere";
}
