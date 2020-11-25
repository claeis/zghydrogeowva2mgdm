package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class ObjektArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected ObjektArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ObjektArt value) {
     return value.value;
  }
  static public ObjektArt parseXmlCode(String value) {
     return (ObjektArt)valuev.get(value);
  }
  static public ObjektArt Hydrant=new ObjektArt("Hydrant");
  public final static String tag_Hydrant="Hydrant";
}
