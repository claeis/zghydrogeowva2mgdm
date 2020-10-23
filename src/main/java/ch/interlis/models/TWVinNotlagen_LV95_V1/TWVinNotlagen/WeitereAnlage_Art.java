package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class WeitereAnlage_Art{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected WeitereAnlage_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(WeitereAnlage_Art value) {
     return value.value;
  }
  static public WeitereAnlage_Art parseXmlCode(String value) {
     return (WeitereAnlage_Art)valuev.get(value);
  }
  static public WeitereAnlage_Art Trinkwasserbrunnen_an_Leitungsnetz=new WeitereAnlage_Art("Trinkwasserbrunnen_an_Leitungsnetz");
  public final static String tag_Trinkwasserbrunnen_an_Leitungsnetz="Trinkwasserbrunnen_an_Leitungsnetz";
  static public WeitereAnlage_Art Trinkwasserbrunnen_unabhaengig=new WeitereAnlage_Art("Trinkwasserbrunnen_unabhaengig");
  public final static String tag_Trinkwasserbrunnen_unabhaengig="Trinkwasserbrunnen_unabhaengig";
  static public WeitereAnlage_Art Brunnen_unabh_o_TWQualitaet=new WeitereAnlage_Art("Brunnen_unabh_o_TWQualitaet");
  public final static String tag_Brunnen_unabh_o_TWQualitaet="Brunnen_unabh_o_TWQualitaet";
  static public WeitereAnlage_Art Brunnen_unabh_TWQualitaet_unbest=new WeitereAnlage_Art("Brunnen_unabh_TWQualitaet_unbest");
  public final static String tag_Brunnen_unabh_TWQualitaet_unbest="Brunnen_unabh_TWQualitaet_unbest";
  static public WeitereAnlage_Art Schieberschacht=new WeitereAnlage_Art("Schieberschacht");
  public final static String tag_Schieberschacht="Schieberschacht";
  static public WeitereAnlage_Art Druckbrecherschacht=new WeitereAnlage_Art("Druckbrecherschacht");
  public final static String tag_Druckbrecherschacht="Druckbrecherschacht";
  static public WeitereAnlage_Art Druckregulierungsventil=new WeitereAnlage_Art("Druckregulierungsventil");
  public final static String tag_Druckregulierungsventil="Druckregulierungsventil";
  static public WeitereAnlage_Art andere=new WeitereAnlage_Art("andere");
  public final static String tag_andere="andere";
}
