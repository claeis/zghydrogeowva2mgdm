package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class OberflGewFsgLeitung_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected OberflGewFsgLeitung_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(OberflGewFsgLeitung_Typ value) {
     return value.value;
  }
  static public OberflGewFsgLeitung_Typ parseXmlCode(String value) {
     return (OberflGewFsgLeitung_Typ)valuev.get(value);
  }
  static public OberflGewFsgLeitung_Typ Fassungsleitung=new OberflGewFsgLeitung_Typ("Fassungsleitung");
  public final static String tag_Fassungsleitung="Fassungsleitung";
}
