package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class OberflGewRohwaPW_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected OberflGewRohwaPW_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(OberflGewRohwaPW_Typ value) {
     return value.value;
  }
  static public OberflGewRohwaPW_Typ parseXmlCode(String value) {
     return (OberflGewRohwaPW_Typ)valuev.get(value);
  }
  static public OberflGewRohwaPW_Typ RohwasserPW=new OberflGewRohwaPW_Typ("RohwasserPW");
  public final static String tag_RohwasserPW="RohwasserPW";
}
