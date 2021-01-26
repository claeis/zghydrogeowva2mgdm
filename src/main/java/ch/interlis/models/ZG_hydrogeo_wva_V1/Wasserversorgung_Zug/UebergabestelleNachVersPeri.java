package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class UebergabestelleNachVersPeri extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri";
  public UebergabestelleNachVersPeri(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Uebergabestelle1="Uebergabestelle1";
  public String getUebergabestelle1() {
    ch.interlis.iom.IomObject value=getattrobj("Uebergabestelle1",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setUebergabestelle1(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Uebergabestelle1",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Uebergabestelle1","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Uebergabestelle1",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_LieferungNach="LieferungNach";
  public String getLieferungNach() {
    ch.interlis.iom.IomObject value=getattrobj("LieferungNach",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLieferungNach(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("LieferungNach",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("LieferungNach","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("LieferungNach",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
