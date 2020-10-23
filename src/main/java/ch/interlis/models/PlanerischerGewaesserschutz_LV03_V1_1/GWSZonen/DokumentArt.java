package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class DokumentArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected DokumentArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(DokumentArt value) {
     return value.value;
  }
  static public DokumentArt parseXmlCode(String value) {
     return (DokumentArt)valuev.get(value);
  }
  static public DokumentArt Rechtsvorschrift=new DokumentArt("Rechtsvorschrift");
  public final static String tag_Rechtsvorschrift="Rechtsvorschrift";
  static public DokumentArt GesetzlicheGrundlage=new DokumentArt("GesetzlicheGrundlage");
  public final static String tag_GesetzlicheGrundlage="GesetzlicheGrundlage";
  static public DokumentArt Hinweis=new DokumentArt("Hinweis");
  public final static String tag_Hinweis="Hinweis";
}
