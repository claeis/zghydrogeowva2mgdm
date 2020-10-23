package ch.interlis.models.ZG_Wasser_V1;
public class Herkunftsart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Herkunftsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Herkunftsart value) {
     return value.value;
  }
  static public Herkunftsart parseXmlCode(String value) {
     return (Herkunftsart)valuev.get(value);
  }
  static public Herkunftsart Aufnahme=new Herkunftsart("Aufnahme");
  public final static String tag_Aufnahme="Aufnahme";
  static public Herkunftsart UebernahmeKoordinaten=new Herkunftsart("UebernahmeKoordinaten");
  public final static String tag_UebernahmeKoordinaten="UebernahmeKoordinaten";
  static public Herkunftsart Planabgriff=new Herkunftsart("Planabgriff");
  public final static String tag_Planabgriff="Planabgriff";
  static public Herkunftsart konstruktiv=new Herkunftsart("konstruktiv");
  public final static String tag_konstruktiv="konstruktiv";
  static public Herkunftsart unbekannt=new Herkunftsart("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public Herkunftsart andere=new Herkunftsart("andere");
  public final static String tag_andere="andere";
}
