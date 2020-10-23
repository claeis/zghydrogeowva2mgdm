package ch.interlis.models.Grundwasseraustritte_LV95_V1.Grundwasseraustritte;
public class Fassungsstrang_Stollen_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Fassungsstrang_Stollen_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Fassungsstrang_Stollen_Typ value) {
     return value.value;
  }
  static public Fassungsstrang_Stollen_Typ parseXmlCode(String value) {
     return (Fassungsstrang_Stollen_Typ)valuev.get(value);
  }
  static public Fassungsstrang_Stollen_Typ Fassungsstrang=new Fassungsstrang_Stollen_Typ("Fassungsstrang");
  public final static String tag_Fassungsstrang="Fassungsstrang";
  static public Fassungsstrang_Stollen_Typ Fassungsstollen=new Fassungsstrang_Stollen_Typ("Fassungsstollen");
  public final static String tag_Fassungsstollen="Fassungsstollen";
  static public Fassungsstrang_Stollen_Typ unbestimmt=new Fassungsstrang_Stollen_Typ("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
