package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class BOOLEAN_Typ{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private BOOLEAN_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BOOLEAN_Typ value) {
     return value.value;
  }
  static public BOOLEAN_Typ parseXmlCode(String value) {
     return (BOOLEAN_Typ)valuev.get(value);
  }
  static public BOOLEAN_Typ nein=new BOOLEAN_Typ("nein");
  public final static String tag_nein="nein";
  static public BOOLEAN_Typ ja=new BOOLEAN_Typ("ja");
  public final static String tag_ja="ja";
}
