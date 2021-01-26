package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class LeitOberflaechenGewFassung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitOberflaechenGewFassung";
  public LeitOberflaechenGewFassung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Leitung="Leitung";
  public String getLeitung() {
    ch.interlis.iom.IomObject value=getattrobj("Leitung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLeitung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Leitung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Leitung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Leitung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_OberflaechenGewFassung="OberflaechenGewFassung";
  public String getOberflaechenGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflaechenGewFassung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOberflaechenGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("OberflaechenGewFassung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("OberflaechenGewFassung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("OberflaechenGewFassung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
