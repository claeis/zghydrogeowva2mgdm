package ch.interlis.models.GeometryCHLV03_V1;
public class SurfaceStructure extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV03_V1.SurfaceStructure";
  public SurfaceStructure() {
    super(tag,null);
  }
  protected SurfaceStructure(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Surface="Surface";
  public ch.interlis.iom.IomObject getSurface() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Surface",0);
    return value;
  }
  public void setSurface(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Surface")>0){
      changeattrobj("Surface",0, value);
    }else{
      addattrobj("Surface", value);
    }
  }
}
