package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class RueckgabeLeitung_Typ{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private RueckgabeLeitung_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(RueckgabeLeitung_Typ value) {
     return value.value;
  }
  static public RueckgabeLeitung_Typ parseXmlCode(String value) {
     return (RueckgabeLeitung_Typ)valuev.get(value);
  }
  static public RueckgabeLeitung_Typ Rueckgabe_Leitung=new RueckgabeLeitung_Typ("Rueckgabe_Leitung");
  public final static String tag_Rueckgabe_Leitung="Rueckgabe_Leitung";
}
