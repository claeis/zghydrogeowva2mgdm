package ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte;
public class Fassungsbrunnen_Foerdermethode{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Fassungsbrunnen_Foerdermethode(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Fassungsbrunnen_Foerdermethode value) {
     return value.value;
  }
  static public Fassungsbrunnen_Foerdermethode parseXmlCode(String value) {
     return (Fassungsbrunnen_Foerdermethode)valuev.get(value);
  }
  static public Fassungsbrunnen_Foerdermethode Pumpe=new Fassungsbrunnen_Foerdermethode("Pumpe");
  public final static String tag_Pumpe="Pumpe";
  static public Fassungsbrunnen_Foerdermethode Heber=new Fassungsbrunnen_Foerdermethode("Heber");
  public final static String tag_Heber="Heber";
  static public Fassungsbrunnen_Foerdermethode artesisch=new Fassungsbrunnen_Foerdermethode("artesisch");
  public final static String tag_artesisch="artesisch";
  static public Fassungsbrunnen_Foerdermethode unbestimmt=new Fassungsbrunnen_Foerdermethode("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
