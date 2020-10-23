package ch.interlis.models.ZG_Wasser_V1;
public class ErfVorlHerkunft{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected ErfVorlHerkunft(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ErfVorlHerkunft value) {
     return value.value;
  }
  static public ErfVorlHerkunft parseXmlCode(String value) {
     return (ErfVorlHerkunft)valuev.get(value);
  }
  static public ErfVorlHerkunft Amt_fuer_Umwelt=new ErfVorlHerkunft("Amt_fuer_Umwelt");
  public final static String tag_Amt_fuer_Umwelt="Amt_fuer_Umwelt";
  static public ErfVorlHerkunft Amt_fuer_Grundbuch_und_Geoinformation=new ErfVorlHerkunft("Amt_fuer_Grundbuch_und_Geoinformation");
  public final static String tag_Amt_fuer_Grundbuch_und_Geoinformation="Amt_fuer_Grundbuch_und_Geoinformation";
  static public ErfVorlHerkunft privater_Betreiber=new ErfVorlHerkunft("privater_Betreiber");
  public final static String tag_privater_Betreiber="privater_Betreiber";
  static public ErfVorlHerkunft Schutzzonen_Bearbeiter=new ErfVorlHerkunft("Schutzzonen_Bearbeiter");
  public final static String tag_Schutzzonen_Bearbeiter="Schutzzonen_Bearbeiter";
  static public ErfVorlHerkunft Wasserversorgung=new ErfVorlHerkunft("Wasserversorgung");
  public final static String tag_Wasserversorgung="Wasserversorgung";
  static public ErfVorlHerkunft Eigentuemer=new ErfVorlHerkunft("Eigentuemer");
  public final static String tag_Eigentuemer="Eigentuemer";
  static public ErfVorlHerkunft unbekannt=new ErfVorlHerkunft("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public ErfVorlHerkunft andere=new ErfVorlHerkunft("andere");
  public final static String tag_andere="andere";
}
