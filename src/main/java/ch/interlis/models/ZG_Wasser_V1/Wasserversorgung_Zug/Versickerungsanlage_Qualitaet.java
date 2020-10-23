package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Versickerungsanlage_Qualitaet{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Versickerungsanlage_Qualitaet(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Versickerungsanlage_Qualitaet value) {
     return value.value;
  }
  static public Versickerungsanlage_Qualitaet parseXmlCode(String value) {
     return (Versickerungsanlage_Qualitaet)valuev.get(value);
  }
  static public Versickerungsanlage_Qualitaet belastet=new Versickerungsanlage_Qualitaet("belastet");
  public final static String tag_belastet="belastet";
  static public Versickerungsanlage_Qualitaet unbelastet=new Versickerungsanlage_Qualitaet("unbelastet");
  public final static String tag_unbelastet="unbelastet";
}
