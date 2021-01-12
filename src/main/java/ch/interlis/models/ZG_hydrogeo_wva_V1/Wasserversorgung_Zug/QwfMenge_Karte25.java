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
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuellschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Quellschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Quellschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Quellschacht",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_QwfMenge_Karte25Pos="QwfMenge_Karte25Pos";
  public String getQwfMenge_Karte25Pos() {
    ch.interlis.iom.IomObject value=getattrobj("QwfMenge_Karte25Pos",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQwfMenge_Karte25Pos(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("QwfMenge_Karte25Pos",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("QwfMenge_Karte25Pos","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("QwfMenge_Karte25Pos",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
