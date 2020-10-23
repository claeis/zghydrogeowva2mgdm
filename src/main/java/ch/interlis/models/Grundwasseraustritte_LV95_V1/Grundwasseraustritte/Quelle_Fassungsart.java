package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Quelle_Fassungsart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Quelle_Fassungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Quelle_Fassungsart value) {
     return value.value;
  }
  static public Quelle_Fassungsart parseXmlCode(String value) {
     return (Quelle_Fassungsart)valuev.get(value);
  }
  static public Quelle_Fassungsart ungefasst=new Quelle_Fassungsart("ungefasst");
  public final static String tag_ungefasst="ungefasst";
  static public Quelle_Fassungsart gefasst_direkt=new Quelle_Fassungsart("gefasst.direkt");
  public final static String tag_gefasst_direkt="gefasst.direkt";
  static public Quelle_Fassungsart gefasst_Fassungsstrang=new Quelle_Fassungsart("gefasst.Fassungsstrang");
  public final static String tag_gefasst_Fassungsstrang="gefasst.Fassungsstrang";
  static public Quelle_Fassungsart gefasst_Fassungsstollen=new Quelle_Fassungsart("gefasst.Fassungsstollen");
  public final static String tag_gefasst_Fassungsstollen="gefasst.Fassungsstollen";
  static public Quelle_Fassungsart gefasst_unbestimmt=new Quelle_Fassungsart("gefasst.unbestimmt");
  public final static String tag_gefasst_unbestimmt="gefasst.unbestimmt";
}
