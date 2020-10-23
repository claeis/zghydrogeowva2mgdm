package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class Kanton{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Kanton(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Kanton value) {
     return value.value;
  }
  static public Kanton parseXmlCode(String value) {
     return (Kanton)valuev.get(value);
  }
  static public Kanton ZG=new Kanton("ZG");
  public final static String tag_ZG="ZG";
  static public Kanton ZH=new Kanton("ZH");
  public final static String tag_ZH="ZH";
  static public Kanton AG=new Kanton("AG");
  public final static String tag_AG="AG";
  static public Kanton LU=new Kanton("LU");
  public final static String tag_LU="LU";
  static public Kanton SZ=new Kanton("SZ");
  public final static String tag_SZ="SZ";
}
