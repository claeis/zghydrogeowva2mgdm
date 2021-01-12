package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche;
public class GSBereichEinzugsgebiet extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet";
  public GSBereichEinzugsgebiet(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_GSBereich="GSBereich";
  public String getGSBereich() {
    ch.interlis.iom.IomObject value=getattrobj("GSBereich",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGSBereich(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GSBereich",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GSBereich","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GSBereich",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Einzugsgebiet="Einzugsgebiet";
  public String getEinzugsgebiet() {
    ch.interlis.iom.IomObject value=getattrobj("Einzugsgebiet",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setEinzugsgebiet(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Einzugsgebiet",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Einzugsgebiet","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Einzugsgebiet",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
