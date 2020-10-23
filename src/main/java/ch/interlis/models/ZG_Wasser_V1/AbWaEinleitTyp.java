package ch.interlis.models.ZG_Wasser_V1;
public class AbWaEinleitTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected AbWaEinleitTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(AbWaEinleitTyp value) {
     return value.value;
  }
  static public AbWaEinleitTyp parseXmlCode(String value) {
     return (AbWaEinleitTyp)valuev.get(value);
  }
  static public AbWaEinleitTyp SABA=new AbWaEinleitTyp("SABA");
  public final static String tag_SABA="SABA";
  static public AbWaEinleitTyp Industrie=new AbWaEinleitTyp("Industrie");
  public final static String tag_Industrie="Industrie";
  static public AbWaEinleitTyp ARA=new AbWaEinleitTyp("ARA");
  public final static String tag_ARA="ARA";
  static public AbWaEinleitTyp KLARA=new AbWaEinleitTyp("KLARA");
  public final static String tag_KLARA="KLARA";
  static public AbWaEinleitTyp Mischwasserentlastung=new AbWaEinleitTyp("Mischwasserentlastung");
  public final static String tag_Mischwasserentlastung="Mischwasserentlastung";
  static public AbWaEinleitTyp Sonstige=new AbWaEinleitTyp("Sonstige");
  public final static String tag_Sonstige="Sonstige";
  static public AbWaEinleitTyp unbekannt=new AbWaEinleitTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
