package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3;
public class DetailplanArt{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private DetailplanArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(DetailplanArt value) {
     return value.value;
  }
  static public DetailplanArt parseXmlCode(String value) {
     return (DetailplanArt)valuev.get(value);
  }
  static public DetailplanArt Plan_digital=new DetailplanArt("Plan_digital");
  public final static String tag_Plan_digital="Plan_digital";
  static public DetailplanArt Plan_analog=new DetailplanArt("Plan_analog");
  public final static String tag_Plan_analog="Plan_analog";
  static public DetailplanArt Uebersichtsplan=new DetailplanArt("Uebersichtsplan");
  public final static String tag_Uebersichtsplan="Uebersichtsplan";
  static public DetailplanArt Landeskarte=new DetailplanArt("Landeskarte");
  public final static String tag_Landeskarte="Landeskarte";
  static public DetailplanArt Skizze=new DetailplanArt("Skizze");
  public final static String tag_Skizze="Skizze";
  static public DetailplanArt andere=new DetailplanArt("andere");
  public final static String tag_andere="andere";
}
