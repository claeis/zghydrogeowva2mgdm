package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Aufbereitungswerk_TextArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Aufbereitungswerk_TextArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Aufbereitungswerk_TextArt value) {
     return value.value;
  }
  static public Aufbereitungswerk_TextArt parseXmlCode(String value) {
     return (Aufbereitungswerk_TextArt)valuev.get(value);
  }
  static public Aufbereitungswerk_TextArt AufbWkrName=new Aufbereitungswerk_TextArt("AufbWkrName");
  public final static String tag_AufbWkrName="AufbWkrName";
  static public Aufbereitungswerk_TextArt AufbWkrFilterleist=new Aufbereitungswerk_TextArt("AufbWkrFilterleist");
  public final static String tag_AufbWkrFilterleist="AufbWkrFilterleist";
}
