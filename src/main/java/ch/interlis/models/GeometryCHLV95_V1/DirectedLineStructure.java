package ch.interlis.models.GeometryCHLV95_V1;
public class DirectedLineStructure extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV95_V1.DirectedLineStructure";
  public DirectedLineStructure() {
    super(tag,null);
  }
  protected DirectedLineStructure(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Line="Line";
  public ch.interlis.iom.IomObject getLine() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Line",0);
    return value;
  }
  public void setLine(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Line")>0){
      changeattrobj("Line",0, value);
    }else{
      addattrobj("Line", value);
    }
  }
}
