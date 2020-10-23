package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class VersickerungTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private VersickerungTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(VersickerungTyp value) {
     return value.value;
  }
  static public VersickerungTyp parseXmlCode(String value) {
     return (VersickerungTyp)valuev.get(value);
  }
  static public VersickerungTyp Versickerungsbecken=new VersickerungTyp("Versickerungsbecken");
  public final static String tag_Versickerungsbecken="Versickerungsbecken";
  static public VersickerungTyp Versickerungsgraben=new VersickerungTyp("Versickerungsgraben");
  public final static String tag_Versickerungsgraben="Versickerungsgraben";
  static public VersickerungTyp Rigolenversickerung=new VersickerungTyp("Rigolenversickerung");
  public final static String tag_Rigolenversickerung="Rigolenversickerung";
  static public VersickerungTyp Kieskoerper=new VersickerungTyp("Kieskoerper");
  public final static String tag_Kieskoerper="Kieskoerper";
  static public VersickerungTyp Sickerschacht=new VersickerungTyp("Sickerschacht");
  public final static String tag_Sickerschacht="Sickerschacht";
  static public VersickerungTyp Sickerstrang_Galerie=new VersickerungTyp("Sickerstrang_Galerie");
  public final static String tag_Sickerstrang_Galerie="Sickerstrang_Galerie";
  static public VersickerungTyp Sonstige=new VersickerungTyp("Sonstige");
  public final static String tag_Sonstige="Sonstige";
  static public VersickerungTyp unbekannt=new VersickerungTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
