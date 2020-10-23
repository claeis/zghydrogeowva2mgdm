package ch.interlis.models.GeometryCHLV03_V1;
public class MultiSurface extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV03_V1.MultiSurface";
  public MultiSurface() {
    super(tag,null);
  }
  protected MultiSurface(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Surfaces="Surfaces";
  public int sizeSurfaces() {return getattrvaluecount("Surfaces");}
  public ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure[] getSurfaces() {
    int size=getattrvaluecount("Surfaces");
    ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure value[]=new ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure)getattrobj("Surfaces",i);
    }
    return value;
  }
  public void addSurfaces(ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure value) {
    addattrobj("Surfaces", value);
  }
}
