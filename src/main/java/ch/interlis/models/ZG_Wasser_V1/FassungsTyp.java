package ch.interlis.models.ZG_Wasser_V1;
public class FassungsTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected FassungsTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(FassungsTyp value) {
     return value.value;
  }
  static public FassungsTyp parseXmlCode(String value) {
     return (FassungsTyp)valuev.get(value);
  }
  static public FassungsTyp Entnahmebrunnen=new FassungsTyp("Entnahmebrunnen");
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  static public FassungsTyp Quellwasserfassung=new FassungsTyp("Quellwasserfassung");
  public final static String tag_Quellwasserfassung="Quellwasserfassung";
  static public FassungsTyp Oberflaechenwasserfassung=new FassungsTyp("Oberflaechenwasserfassung");
  public final static String tag_Oberflaechenwasserfassung="Oberflaechenwasserfassung";
}
