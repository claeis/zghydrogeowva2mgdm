package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class DruckRedTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected DruckRedTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(DruckRedTyp value) {
     return value.value;
  }
  static public DruckRedTyp parseXmlCode(String value) {
     return (DruckRedTyp)valuev.get(value);
  }
  static public DruckRedTyp Druckbrecherschacht=new DruckRedTyp("Druckbrecherschacht");
  public final static String tag_Druckbrecherschacht="Druckbrecherschacht";
  static public DruckRedTyp Druckreduzierventil=new DruckRedTyp("Druckreduzierventil");
  public final static String tag_Druckreduzierventil="Druckreduzierventil";
  static public DruckRedTyp unbekannt=new DruckRedTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
