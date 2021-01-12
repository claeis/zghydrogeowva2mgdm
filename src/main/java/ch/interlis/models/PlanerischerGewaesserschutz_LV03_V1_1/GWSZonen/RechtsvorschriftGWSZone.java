package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class RechtsvorschriftGWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone";
  public RechtsvorschriftGWSZone(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Rechtsvorschrift="Rechtsvorschrift";
  public String getRechtsvorschrift() {
    ch.interlis.iom.IomObject value=getattrobj("Rechtsvorschrift",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setRechtsvorschrift(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Rechtsvorschrift",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Rechtsvorschrift","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Rechtsvorschrift",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_GWSZone="GWSZone";
  public String getGWSZone() {
    ch.interlis.iom.IomObject value=getattrobj("GWSZone",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGWSZone(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GWSZone",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GWSZone","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GWSZone",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
