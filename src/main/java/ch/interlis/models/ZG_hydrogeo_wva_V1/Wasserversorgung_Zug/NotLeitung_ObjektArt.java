package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class NotLeitung_ObjektArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected NotLeitung_ObjektArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(NotLeitung_ObjektArt value) {
     return value.value;
  }
  static public NotLeitung_ObjektArt parseXmlCode(String value) {
     return (NotLeitung_ObjektArt)valuev.get(value);
  }
  static public NotLeitung_ObjektArt Hydrant=new NotLeitung_ObjektArt("Hydrant");
  public final static String tag_Hydrant="Hydrant";
}
