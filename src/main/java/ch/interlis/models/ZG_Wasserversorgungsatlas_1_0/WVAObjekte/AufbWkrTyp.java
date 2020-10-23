package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class AufbWkrTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private AufbWkrTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(AufbWkrTyp value) {
     return value.value;
  }
  static public AufbWkrTyp parseXmlCode(String value) {
     return (AufbWkrTyp)valuev.get(value);
  }
  static public AufbWkrTyp AufbWrk=new AufbWkrTyp("AufbWrk");
  public final static String tag_AufbWrk="AufbWrk";
  static public AufbWkrTyp AufbWrk_RohwaPW=new AufbWkrTyp("AufbWrk_RohwaPW");
  public final static String tag_AufbWrk_RohwaPW="AufbWrk_RohwaPW";
  static public AufbWkrTyp AufbWrk_ReinwaPW=new AufbWkrTyp("AufbWrk_ReinwaPW");
  public final static String tag_AufbWrk_ReinwaPW="AufbWrk_ReinwaPW";
  static public AufbWkrTyp AufbWrk_ReinRowwaPW=new AufbWkrTyp("AufbWrk_ReinRowwaPW");
  public final static String tag_AufbWrk_ReinRowwaPW="AufbWrk_ReinRowwaPW";
}
