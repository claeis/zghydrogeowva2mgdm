package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class LeitungsArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected LeitungsArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LeitungsArt value) {
     return value.value;
  }
  static public LeitungsArt parseXmlCode(String value) {
     return (LeitungsArt)valuev.get(value);
  }
  static public LeitungsArt Notverbindung_temporaer=new LeitungsArt("Notverbindung_temporaer");
  public final static String tag_Notverbindung_temporaer="Notverbindung_temporaer";
  static public LeitungsArt Quellwasserableitung=new LeitungsArt("Quellwasserableitung");
  public final static String tag_Quellwasserableitung="Quellwasserableitung";
  static public LeitungsArt Versorgungsleitung=new LeitungsArt("Versorgungsleitung");
  public final static String tag_Versorgungsleitung="Versorgungsleitung";
  static public LeitungsArt Rueckgabeleitung=new LeitungsArt("Rueckgabeleitung");
  public final static String tag_Rueckgabeleitung="Rueckgabeleitung";
}
