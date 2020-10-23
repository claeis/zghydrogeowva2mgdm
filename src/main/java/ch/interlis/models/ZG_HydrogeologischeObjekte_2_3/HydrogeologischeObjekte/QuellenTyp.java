package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QuellenTyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private QuellenTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(QuellenTyp value) {
     return value.value;
  }
  static public QuellenTyp parseXmlCode(String value) {
     return (QuellenTyp)valuev.get(value);
  }
  static public QuellenTyp gefasst=new QuellenTyp("gefasst");
  public final static String tag_gefasst="gefasst";
  static public QuellenTyp ungefasst=new QuellenTyp("ungefasst");
  public final static String tag_ungefasst="ungefasst";
}
