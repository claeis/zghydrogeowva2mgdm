package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ErfVorlBemerk{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private ErfVorlBemerk(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ErfVorlBemerk value) {
     return value.value;
  }
  static public ErfVorlBemerk parseXmlCode(String value) {
     return (ErfVorlBemerk)valuev.get(value);
  }
  static public ErfVorlBemerk GPS_0_01m=new ErfVorlBemerk("GPS_0_01m");
  public final static String tag_GPS_0_01m="GPS_0_01m";
  static public ErfVorlBemerk GPS_0_10m=new ErfVorlBemerk("GPS_0_10m");
  public final static String tag_GPS_0_10m="GPS_0_10m";
  static public ErfVorlBemerk GPS_1_00m=new ErfVorlBemerk("GPS_1_00m");
  public final static String tag_GPS_1_00m="GPS_1_00m";
  static public ErfVorlBemerk Grundbuchplan_Papier=new ErfVorlBemerk("Grundbuchplan_Papier");
  public final static String tag_Grundbuchplan_Papier="Grundbuchplan_Papier";
  static public ErfVorlBemerk keine_Einpassmoeglichkeit=new ErfVorlBemerk("keine_Einpassmoeglichkeit");
  public final static String tag_keine_Einpassmoeglichkeit="keine_Einpassmoeglichkeit";
  static public ErfVorlBemerk nach_muendlicher_Angabe=new ErfVorlBemerk("nach_muendlicher_Angabe");
  public final static String tag_nach_muendlicher_Angabe="nach_muendlicher_Angabe";
  static public ErfVorlBemerk schematisch=new ErfVorlBemerk("schematisch");
  public final static String tag_schematisch="schematisch";
  static public ErfVorlBemerk schlechte_Einpassmoeglichkeit=new ErfVorlBemerk("schlechte_Einpassmoeglichkeit");
  public final static String tag_schlechte_Einpassmoeglichkeit="schlechte_Einpassmoeglichkeit";
  static public ErfVorlBemerk Vorlage_mit_massiver_Generalisierung=new ErfVorlBemerk("Vorlage_mit_massiver_Generalisierung");
  public final static String tag_Vorlage_mit_massiver_Generalisierung="Vorlage_mit_massiver_Generalisierung";
  static public ErfVorlBemerk Vorlage_unzuverlaessig=new ErfVorlBemerk("Vorlage_unzuverlaessig");
  public final static String tag_Vorlage_unzuverlaessig="Vorlage_unzuverlaessig";
}
