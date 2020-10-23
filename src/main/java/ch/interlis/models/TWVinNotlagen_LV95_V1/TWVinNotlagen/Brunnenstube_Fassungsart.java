package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Brunnenstube_Fassungsart{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Brunnenstube_Fassungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Brunnenstube_Fassungsart value) {
     return value.value;
  }
  static public Brunnenstube_Fassungsart parseXmlCode(String value) {
     return (Brunnenstube_Fassungsart)valuev.get(value);
  }
  static public Brunnenstube_Fassungsart Brunnenstube=new Brunnenstube_Fassungsart("Brunnenstube");
  public final static String tag_Brunnenstube="Brunnenstube";
  static public Brunnenstube_Fassungsart Quellschacht=new Brunnenstube_Fassungsart("Quellschacht");
  public final static String tag_Quellschacht="Quellschacht";
  static public Brunnenstube_Fassungsart Sammelschacht=new Brunnenstube_Fassungsart("Sammelschacht");
  public final static String tag_Sammelschacht="Sammelschacht";
  static public Brunnenstube_Fassungsart unbestimmt=new Brunnenstube_Fassungsart("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
