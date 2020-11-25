package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class OberflaeGewFassungTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected OberflaeGewFassungTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(OberflaeGewFassungTyp value) {
     return value.value;
  }
  static public OberflaeGewFassungTyp parseXmlCode(String value) {
     return (OberflaeGewFassungTyp)valuev.get(value);
  }
  static public OberflaeGewFassungTyp Seewasserfassung=new OberflaeGewFassungTyp("Seewasserfassung");
  public final static String tag_Seewasserfassung="Seewasserfassung";
  static public OberflaeGewFassungTyp Fliessgewaesserfassung=new OberflaeGewFassungTyp("Fliessgewaesserfassung");
  public final static String tag_Fliessgewaesserfassung="Fliessgewaesserfassung";
  static public OberflaeGewFassungTyp andere=new OberflaeGewFassungTyp("andere");
  public final static String tag_andere="andere";
}
