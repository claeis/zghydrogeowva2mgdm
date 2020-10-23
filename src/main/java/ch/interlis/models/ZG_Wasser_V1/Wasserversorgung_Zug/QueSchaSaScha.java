package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class QueSchaSaScha extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.QueSchaSaScha";
  public QueSchaSaScha(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Sammelschacht="Sammelschacht";
  public String getSammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Sammelschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Sammelschacht","REF");
    structvalue.setobjectrefoid(oid);
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
}
