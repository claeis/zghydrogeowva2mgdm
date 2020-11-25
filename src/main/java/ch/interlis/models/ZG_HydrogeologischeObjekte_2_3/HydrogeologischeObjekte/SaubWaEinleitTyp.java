package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class SaubWaEinleitTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected SaubWaEinleitTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(SaubWaEinleitTyp value) {
     return value.value;
  }
  static public SaubWaEinleitTyp parseXmlCode(String value) {
     return (SaubWaEinleitTyp)valuev.get(value);
  }
  static public SaubWaEinleitTyp Meteorwasser=new SaubWaEinleitTyp("Meteorwasser");
  public final static String tag_Meteorwasser="Meteorwasser";
  static public SaubWaEinleitTyp Strassenabwasser=new SaubWaEinleitTyp("Strassenabwasser");
  public final static String tag_Strassenabwasser="Strassenabwasser";
  static public SaubWaEinleitTyp landwirtschaftliche_Drainagen=new SaubWaEinleitTyp("landwirtschaftliche_Drainagen");
  public final static String tag_landwirtschaftliche_Drainagen="landwirtschaftliche_Drainagen";
  static public SaubWaEinleitTyp Sonstige=new SaubWaEinleitTyp("Sonstige");
  public final static String tag_Sonstige="Sonstige";
  static public SaubWaEinleitTyp unbekannt=new SaubWaEinleitTyp("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
