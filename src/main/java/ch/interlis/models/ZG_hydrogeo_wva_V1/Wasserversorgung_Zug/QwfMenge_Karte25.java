package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QwfMenge_Karte25 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25";
  public QwfMenge_Karte25(String oid) {
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
  public final static String tag_QwfMenge_Karte25Pos="QwfMenge_Karte25Pos";
  public String getQwfMenge_Karte25Pos() {
    ch.interlis.iom.IomObject value=getattrobj("QwfMenge_Karte25Pos",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQwfMenge_Karte25Pos(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("QwfMenge_Karte25Pos","REF");
    structvalue.setobjectrefoid(oid);
  }
}
