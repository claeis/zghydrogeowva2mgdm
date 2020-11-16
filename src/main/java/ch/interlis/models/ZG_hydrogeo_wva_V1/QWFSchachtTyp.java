package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class QWFSchachtTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected QWFSchachtTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(QWFSchachtTyp value) {
     return value.value;
  }
  static public QWFSchachtTyp parseXmlCode(String value) {
     return (QWFSchachtTyp)valuev.get(value);
  }
  static public QWFSchachtTyp Brunnenstube=new QWFSchachtTyp("Brunnenstube");
  public final static String tag_Brunnenstube="Brunnenstube";
  static public QWFSchachtTyp Sammelschacht=new QWFSchachtTyp("Sammelschacht");
  public final static String tag_Sammelschacht="Sammelschacht";
  static public QWFSchachtTyp Reservoir=new QWFSchachtTyp("Reservoir");
  public final static String tag_Reservoir="Reservoir";
  static public QWFSchachtTyp Quellwasser_Pumpwerk=new QWFSchachtTyp("Quellwasser_Pumpwerk");
  public final static String tag_Quellwasser_Pumpwerk="Quellwasser_Pumpwerk";
  static public QWFSchachtTyp Laufender_Brunnen=new QWFSchachtTyp("Laufender_Brunnen");
  public final static String tag_Laufender_Brunnen="Laufender_Brunnen";
  static public QWFSchachtTyp Hyraulischer_Widder=new QWFSchachtTyp("Hyraulischer_Widder");
  public final static String tag_Hyraulischer_Widder="Hyraulischer_Widder";
  static public QWFSchachtTyp kein_Schacht=new QWFSchachtTyp("kein_Schacht");
  public final static String tag_kein_Schacht="kein_Schacht";
}
