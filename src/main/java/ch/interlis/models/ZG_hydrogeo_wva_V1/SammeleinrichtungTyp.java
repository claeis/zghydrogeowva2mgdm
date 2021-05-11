package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class SammeleinrichtungTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected SammeleinrichtungTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(SammeleinrichtungTyp value) {
     return value.value;
  }
  static public SammeleinrichtungTyp parseXmlCode(String value) {
     return (SammeleinrichtungTyp)valuev.get(value);
  }
  static public SammeleinrichtungTyp Sickerleitung=new SammeleinrichtungTyp("Sickerleitung");
  public final static String tag_Sickerleitung="Sickerleitung";
  static public SammeleinrichtungTyp Sammelstollen=new SammeleinrichtungTyp("Sammelstollen");
  public final static String tag_Sammelstollen="Sammelstollen";
  static public SammeleinrichtungTyp Fassungsleitung_Allgemein=new SammeleinrichtungTyp("Fassungsleitung_Allgemein");
  public final static String tag_Fassungsleitung_Allgemein="Fassungsleitung_Allgemein";
  static public SammeleinrichtungTyp Fassungsleitung_Vollrohr=new SammeleinrichtungTyp("Fassungsleitung_Vollrohr");
  public final static String tag_Fassungsleitung_Vollrohr="Fassungsleitung_Vollrohr";
  static public SammeleinrichtungTyp Punktfassung=new SammeleinrichtungTyp("Punktfassung");
  public final static String tag_Punktfassung="Punktfassung";
  static public SammeleinrichtungTyp Bohrung=new SammeleinrichtungTyp("Bohrung");
  public final static String tag_Bohrung="Bohrung";
  static public SammeleinrichtungTyp andere=new SammeleinrichtungTyp("andere");
  public final static String tag_andere="andere";
  static public SammeleinrichtungTyp unbekannt=new SammeleinrichtungTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public SammeleinrichtungTyp Horizontal_Filterstrecke=new SammeleinrichtungTyp("Horizontal_Filterstrecke");
  public final static String tag_Horizontal_Filterstrecke="Horizontal_Filterstrecke";
}
