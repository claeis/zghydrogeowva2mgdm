package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Uebergabestelle_ObjektArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected Uebergabestelle_ObjektArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Uebergabestelle_ObjektArt value) {
     return value.value;
  }
  static public Uebergabestelle_ObjektArt parseXmlCode(String value) {
     return (Uebergabestelle_ObjektArt)valuev.get(value);
  }
  static public Uebergabestelle_ObjektArt Hydrant=new Uebergabestelle_ObjektArt("Hydrant");
  public final static String tag_Hydrant="Hydrant";
}
