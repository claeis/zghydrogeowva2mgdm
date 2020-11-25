package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class Rechtsstatus{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Rechtsstatus(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Rechtsstatus value) {
     return value.value;
  }
  static public Rechtsstatus parseXmlCode(String value) {
     return (Rechtsstatus)valuev.get(value);
  }
  static public Rechtsstatus rechtskraeftig=new Rechtsstatus("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public Rechtsstatus provisorisch=new Rechtsstatus("provisorisch");
  public final static String tag_provisorisch="provisorisch";
}
