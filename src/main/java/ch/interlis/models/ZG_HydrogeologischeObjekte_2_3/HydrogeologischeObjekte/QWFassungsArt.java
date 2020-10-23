package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QWFassungsArt{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private QWFassungsArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(QWFassungsArt value) {
     return value.value;
  }
  static public QWFassungsArt parseXmlCode(String value) {
     return (QWFassungsArt)valuev.get(value);
  }
  static public QWFassungsArt Schacht=new QWFassungsArt("Schacht");
  public final static String tag_Schacht="Schacht";
  static public QWFassungsArt Sickerleitung=new QWFassungsArt("Sickerleitung");
  public final static String tag_Sickerleitung="Sickerleitung";
  static public QWFassungsArt Stollen=new QWFassungsArt("Stollen");
  public final static String tag_Stollen="Stollen";
  static public QWFassungsArt Felsspalt=new QWFassungsArt("Felsspalt");
  public final static String tag_Felsspalt="Felsspalt";
  static public QWFassungsArt unbekannt=new QWFassungsArt("unbekannt");
  public final static String tag_unbekannt="unbekannt";
  static public QWFassungsArt andere=new QWFassungsArt("andere");
  public final static String tag_andere="andere";
}
