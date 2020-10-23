package ch.interlis.models.TWVinNotlagen_LV03_V1.TWVinNotlagen;
public class Grundwasserfassung_Fassungsart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Grundwasserfassung_Fassungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grundwasserfassung_Fassungsart value) {
     return value.value;
  }
  static public Grundwasserfassung_Fassungsart parseXmlCode(String value) {
     return (Grundwasserfassung_Fassungsart)valuev.get(value);
  }
  static public Grundwasserfassung_Fassungsart Vertikalfilterbrunnen=new Grundwasserfassung_Fassungsart("Vertikalfilterbrunnen");
  public final static String tag_Vertikalfilterbrunnen="Vertikalfilterbrunnen";
  static public Grundwasserfassung_Fassungsart Horizontalfilterbrunnen=new Grundwasserfassung_Fassungsart("Horizontalfilterbrunnen");
  public final static String tag_Horizontalfilterbrunnen="Horizontalfilterbrunnen";
  static public Grundwasserfassung_Fassungsart Sod_Schachtbrunnen=new Grundwasserfassung_Fassungsart("Sod_Schachtbrunnen");
  public final static String tag_Sod_Schachtbrunnen="Sod_Schachtbrunnen";
  static public Grundwasserfassung_Fassungsart andere=new Grundwasserfassung_Fassungsart("andere");
  public final static String tag_andere="andere";
}
