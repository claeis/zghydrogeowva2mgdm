package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Fassungsbrunnen_Brunnenart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Fassungsbrunnen_Brunnenart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Fassungsbrunnen_Brunnenart value) {
     return value.value;
  }
  static public Fassungsbrunnen_Brunnenart parseXmlCode(String value) {
     return (Fassungsbrunnen_Brunnenart)valuev.get(value);
  }
  static public Fassungsbrunnen_Brunnenart Vertikalfilterbrunnen=new Fassungsbrunnen_Brunnenart("Vertikalfilterbrunnen");
  public final static String tag_Vertikalfilterbrunnen="Vertikalfilterbrunnen";
  static public Fassungsbrunnen_Brunnenart Horizontalfilterbrunnen=new Fassungsbrunnen_Brunnenart("Horizontalfilterbrunnen");
  public final static String tag_Horizontalfilterbrunnen="Horizontalfilterbrunnen";
  static public Fassungsbrunnen_Brunnenart Sod_Schachtbrunnen=new Fassungsbrunnen_Brunnenart("Sod_Schachtbrunnen");
  public final static String tag_Sod_Schachtbrunnen="Sod_Schachtbrunnen";
  static public Fassungsbrunnen_Brunnenart andere=new Fassungsbrunnen_Brunnenart("andere");
  public final static String tag_andere="andere";
}
