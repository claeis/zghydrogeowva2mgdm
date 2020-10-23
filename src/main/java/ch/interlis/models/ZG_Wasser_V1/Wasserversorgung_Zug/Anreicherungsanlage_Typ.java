package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Anreicherungsanlage_Typ{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Anreicherungsanlage_Typ(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Anreicherungsanlage_Typ value) {
     return value.value;
  }
  static public Anreicherungsanlage_Typ parseXmlCode(String value) {
     return (Anreicherungsanlage_Typ)valuev.get(value);
  }
  static public Anreicherungsanlage_Typ oberirdisch=new Anreicherungsanlage_Typ("oberirdisch");
  public final static String tag_oberirdisch="oberirdisch";
  static public Anreicherungsanlage_Typ unterirdisch=new Anreicherungsanlage_Typ("unterirdisch");
  public final static String tag_unterirdisch="unterirdisch";
  static public Anreicherungsanlage_Typ kombiniert=new Anreicherungsanlage_Typ("kombiniert");
  public final static String tag_kombiniert="kombiniert";
  static public Anreicherungsanlage_Typ unbestimmt=new Anreicherungsanlage_Typ("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
