package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class BautenGWFlaeche extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche";
  public BautenGWFlaeche(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_BautenGW="BautenGW";
  public String getBautenGW() {
    ch.interlis.iom.IomObject value=getattrobj("BautenGW",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBautenGW(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BautenGW","REF");
    structvalue.setobjectrefoid(oid);
  }
}
