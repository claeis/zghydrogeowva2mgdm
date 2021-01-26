package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class NotLeitungVonVersPeri extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri";
  public NotLeitungVonVersPeri(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_NotLeitung="NotLeitung";
  public String getNotLeitung() {
    ch.interlis.iom.IomObject value=getattrobj("NotLeitung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setNotLeitung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("NotLeitung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("NotLeitung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("NotLeitung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_LieferungVon="LieferungVon";
  public String getLieferungVon() {
    ch.interlis.iom.IomObject value=getattrobj("LieferungVon",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLieferungVon(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("LieferungVon",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("LieferungVon","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("LieferungVon",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
