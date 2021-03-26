package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Entnahmebrunnen_Oeffentliches_Interesse{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Entnahmebrunnen_Oeffentliches_Interesse(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Entnahmebrunnen_Oeffentliches_Interesse value) {
     return value.value;
  }
  static public Entnahmebrunnen_Oeffentliches_Interesse parseXmlCode(String value) {
     return (Entnahmebrunnen_Oeffentliches_Interesse)valuev.get(value);
  }
  static public Entnahmebrunnen_Oeffentliches_Interesse ja=new Entnahmebrunnen_Oeffentliches_Interesse("ja");
  public final static String tag_ja="ja";
  static public Entnahmebrunnen_Oeffentliches_Interesse nein=new Entnahmebrunnen_Oeffentliches_Interesse("nein");
  public final static String tag_nein="nein";
  static public Entnahmebrunnen_Oeffentliches_Interesse unbestimmt=new Entnahmebrunnen_Oeffentliches_Interesse("unbestimmt");
  public final static String tag_unbestimmt="unbestimmt";
}
