package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Oberflaechengewaesserfassung_Nutzungszustand{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Oberflaechengewaesserfassung_Nutzungszustand(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Oberflaechengewaesserfassung_Nutzungszustand value) {
     return value.value;
  }
  static public Oberflaechengewaesserfassung_Nutzungszustand parseXmlCode(String value) {
     return (Oberflaechengewaesserfassung_Nutzungszustand)valuev.get(value);
  }
  static public Oberflaechengewaesserfassung_Nutzungszustand genutzt=new Oberflaechengewaesserfassung_Nutzungszustand("genutzt");
  public final static String tag_genutzt="genutzt";
  static public Oberflaechengewaesserfassung_Nutzungszustand ungenutzt=new Oberflaechengewaesserfassung_Nutzungszustand("ungenutzt");
  public final static String tag_ungenutzt="ungenutzt";
}
