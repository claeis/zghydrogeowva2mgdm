package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class BautenGWTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected BautenGWTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BautenGWTyp value) {
     return value.value;
  }
  static public BautenGWTyp parseXmlCode(String value) {
     return (BautenGWTyp)valuev.get(value);
  }
  static public BautenGWTyp Bauten=new BautenGWTyp("Bauten");
  public final static String tag_Bauten="Bauten";
  static public BautenGWTyp Bohrung=new BautenGWTyp("Bohrung");
  public final static String tag_Bohrung="Bohrung";
  static public BautenGWTyp Spundwand_Schlitzwand=new BautenGWTyp("Spundwand_Schlitzwand");
  public final static String tag_Spundwand_Schlitzwand="Spundwand_Schlitzwand";
  static public BautenGWTyp Leitung=new BautenGWTyp("Leitung");
  public final static String tag_Leitung="Leitung";
  static public BautenGWTyp Pfahlung=new BautenGWTyp("Pfahlung");
  public final static String tag_Pfahlung="Pfahlung";
  static public BautenGWTyp Sonstige=new BautenGWTyp("Sonstige");
  public final static String tag_Sonstige="Sonstige";
  static public BautenGWTyp unbekannt=new BautenGWTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
