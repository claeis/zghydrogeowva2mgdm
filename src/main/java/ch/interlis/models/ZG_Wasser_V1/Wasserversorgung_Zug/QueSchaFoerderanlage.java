package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class QueSchaFoerderanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.QueSchaFoerderanlage";
  public QueSchaFoerderanlage(String oid) {
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
  public final static String tag_Foerderanlage="Foerderanlage";
  public String getFoerderanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Foerderanlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFoerderanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Foerderanlage","REF");
    structvalue.setobjectrefoid(oid);
  }
}
