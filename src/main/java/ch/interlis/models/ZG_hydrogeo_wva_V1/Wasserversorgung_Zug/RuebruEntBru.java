package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class RuebruEntBru extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru";
  public RuebruEntBru(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Rueckgabebrunnen="Rueckgabebrunnen";
  public String getRueckgabebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Rueckgabebrunnen",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setRueckgabebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Rueckgabebrunnen",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Rueckgabebrunnen","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Rueckgabebrunnen",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  public String getEntnahmebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Entnahmebrunnen",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setEntnahmebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Entnahmebrunnen",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Entnahmebrunnen","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Entnahmebrunnen",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}