package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class AnreicherungsanlageTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private AnreicherungsanlageTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(AnreicherungsanlageTyp value) {
     return value.value;
  }
  static public AnreicherungsanlageTyp parseXmlCode(String value) {
     return (AnreicherungsanlageTyp)valuev.get(value);
  }
  static public AnreicherungsanlageTyp Anreicherungsanlage=new AnreicherungsanlageTyp("Anreicherungsanlage");
  public final static String tag_Anreicherungsanlage="Anreicherungsanlage";
  static public AnreicherungsanlageTyp andere=new AnreicherungsanlageTyp("andere");
  public final static String tag_andere="andere";
}
