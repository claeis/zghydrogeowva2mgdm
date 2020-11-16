package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Leitung_LeitArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Leitung_LeitArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Leitung_LeitArt value) {
     return value.value;
  }
  static public Leitung_LeitArt parseXmlCode(String value) {
     return (Leitung_LeitArt)valuev.get(value);
  }
  static public Leitung_LeitArt OberflGewFsgLeitung=new Leitung_LeitArt("OberflGewFsgLeitung");
  public final static String tag_OberflGewFsgLeitung="OberflGewFsgLeitung";
  static public Leitung_LeitArt RueckgabeLeitung=new Leitung_LeitArt("RueckgabeLeitung");
  public final static String tag_RueckgabeLeitung="RueckgabeLeitung";
  static public Leitung_LeitArt LeitungsnetzWV=new Leitung_LeitArt("LeitungsnetzWV");
  public final static String tag_LeitungsnetzWV="LeitungsnetzWV";
  static public Leitung_LeitArt WVAFassungsleitung=new Leitung_LeitArt("WVAFassungsleitung");
  public final static String tag_WVAFassungsleitung="WVAFassungsleitung";
}
