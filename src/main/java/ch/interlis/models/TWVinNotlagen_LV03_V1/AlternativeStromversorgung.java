package ch.interlis.models.TWVinNotlagen_LV03_V1;
public class AlternativeStromversorgung{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected AlternativeStromversorgung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(AlternativeStromversorgung value) {
     return value.value;
  }
  static public AlternativeStromversorgung parseXmlCode(String value) {
     return (AlternativeStromversorgung)valuev.get(value);
  }
  static public AlternativeStromversorgung keine=new AlternativeStromversorgung("keine");
  public final static String tag_keine="keine";
  static public AlternativeStromversorgung Generator=new AlternativeStromversorgung("Generator");
  public final static String tag_Generator="Generator";
  static public AlternativeStromversorgung Notstromanschluss=new AlternativeStromversorgung("Notstromanschluss");
  public final static String tag_Notstromanschluss="Notstromanschluss";
  static public AlternativeStromversorgung andere=new AlternativeStromversorgung("andere");
  public final static String tag_andere="andere";
}
