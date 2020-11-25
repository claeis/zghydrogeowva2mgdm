package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche;
public class Einzugsgebiet_GSB_Ao_Trinkwasser extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Einzugsgebiet_GSB_Ao_Trinkwasser";
  public Einzugsgebiet_GSB_Ao_Trinkwasser(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObjName="ObjName";
  public String getObjName() {
    if(getattrvaluecount("ObjName")==0)return null;
    String value=getattrvalue("ObjName");
    return value;
  }
  public void setObjName(String value) {
    if(value==null){setattrundefined("ObjName");return;}
    setattrvalue("ObjName", value);
  }
  public final static String tag_Geometrie="Geometrie";
  public int sizeGeometrie() {return getattrvaluecount("Geometrie");}
  public ch.interlis.iom.IomObject getGeometrie() {
    int size=getattrvaluecount("Geometrie");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
  }
}
