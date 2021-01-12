package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class VersiDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiDatei";
  public VersiDatei(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Versickerungsanlage="Versickerungsanlage";
  public String getVersickerungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Versickerungsanlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setVersickerungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Versickerungsanlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Versickerungsanlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Versickerungsanlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Datei="Datei";
  public String getDatei() {
    ch.interlis.iom.IomObject value=getattrobj("Datei",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setDatei(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Datei",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Datei","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Datei",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
