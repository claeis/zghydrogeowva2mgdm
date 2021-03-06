package ch.interlis.models.GeometryCHLV03_V1;
public class LineStructure extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV03_V1.LineStructure";
  public LineStructure() {
    super(tag,null);
  }
  protected LineStructure(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Line="Line";
  public int sizeLine() {return getattrvaluecount("Line");}
  public ch.interlis.iom.IomObject getLine() {
    int size=getattrvaluecount("Line");
    if(size==0)return null;
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
