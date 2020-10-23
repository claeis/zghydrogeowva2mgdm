package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class QwFsgEndpunktQuellschacht extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.QwFsgEndpunktQuellschacht";
  public QwFsgEndpunktQuellschacht(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QwFsgEndpunkt="QwFsgEndpunkt";
  public String getQwFsgEndpunkt() {
    ch.interlis.iom.IomObject value=getattrobj("QwFsgEndpunkt",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQwFsgEndpunkt(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("QwFsgEndpunkt","REF");
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
