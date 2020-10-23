package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Versickerungsanlage_Qualitaet{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Versickerungsanlage_Qualitaet(String value) {
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
