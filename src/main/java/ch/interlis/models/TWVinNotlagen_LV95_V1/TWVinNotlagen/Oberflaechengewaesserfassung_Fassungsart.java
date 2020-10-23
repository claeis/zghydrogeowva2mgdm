package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Oberflaechengewaesserfassung_Fassungsart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Oberflaechengewaesserfassung_Fassungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Oberflaechengewaesserfassung_Fassungsart value) {
     return value.value;
  }
  static public Oberflaechengewaesserfassung_Fassungsart parseXmlCode(String value) {
     return (Oberflaechengewaesserfassung_Fassungsart)valuev.get(value);
  }
  static public Oberflaechengewaesserfassung_Fassungsart Fliessgewaesserfassung=new Oberflaechengewaesserfassung_Fassungsart("Fliessgewaesserfassung");
  public final static String tag_Fliessgewaesserfassung="Fliessgewaesserfassung";
  static public Oberflaechengewaesserfassung_Fassungsart Seewasserfassung=new Oberflaechengewaesserfassung_Fassungsart("Seewasserfassung");
  public final static String tag_Seewasserfassung="Seewasserfassung";
}
