package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class OberflaechenGewFassung_Nutzung{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected OberflaechenGewFassung_Nutzung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(OberflaechenGewFassung_Nutzung value) {
     return value.value;
  }
  static public OberflaechenGewFassung_Nutzung parseXmlCode(String value) {
     return (OberflaechenGewFassung_Nutzung)valuev.get(value);
  }
  static public OberflaechenGewFassung_Nutzung Trinkwasser=new OberflaechenGewFassung_Nutzung("Trinkwasser");
  public final static String tag_Trinkwasser="Trinkwasser";
  static public OberflaechenGewFassung_Nutzung Brauchwasser=new OberflaechenGewFassung_Nutzung("Brauchwasser");
  public final static String tag_Brauchwasser="Brauchwasser";
}
