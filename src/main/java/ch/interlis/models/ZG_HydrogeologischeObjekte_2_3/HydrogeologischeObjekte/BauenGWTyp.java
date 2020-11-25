package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class BauenGWTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected BauenGWTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BauenGWTyp value) {
     return value.value;
  }
  static public BauenGWTyp parseXmlCode(String value) {
     return (BauenGWTyp)valuev.get(value);
  }
  static public BauenGWTyp Bauten=new BauenGWTyp("Bauten");
  public final static String tag_Bauten="Bauten";
  static public BauenGWTyp Bohrung=new BauenGWTyp("Bohrung");
  public final static String tag_Bohrung="Bohrung";
  static public BauenGWTyp Spundwand_Schlitzwand=new BauenGWTyp("Spundwand_Schlitzwand");
  public final static String tag_Spundwand_Schlitzwand="Spundwand_Schlitzwand";
  static public BauenGWTyp Leitung=new BauenGWTyp("Leitung");
  public final static String tag_Leitung="Leitung";
  static public BauenGWTyp Pfahlung=new BauenGWTyp("Pfahlung");
  public final static String tag_Pfahlung="Pfahlung";
  static public BauenGWTyp Sonstige=new BauenGWTyp("Sonstige");
  public final static String tag_Sonstige="Sonstige";
  static public BauenGWTyp unbekannt=new BauenGWTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
