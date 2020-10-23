package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class QueSchaRes extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.QueSchaRes";
  public QueSchaRes(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Quellschacht="Quellschacht";
  public String getQuellschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quellschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQuellschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Quellschacht","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Reservoir="Reservoir";
  public String getReservoir() {
    ch.interlis.iom.IomObject value=getattrobj("Reservoir",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setReservoir(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Reservoir","REF");
    structvalue.setobjectrefoid(oid);
  }
}
