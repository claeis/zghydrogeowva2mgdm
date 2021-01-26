package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Sammelschacht extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht";
  public Sammelschacht(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Leitungsart="Leitungsart";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt getLeitungsart() {
    String value=getattrvalue("Leitungsart");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt.parseXmlCode(value);
  }
  public void setLeitungsart(ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt value) {
    setattrvalue("Leitungsart", ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt.toXmlCode(value));
  }
  public final static String tag_TechData="TechData";
  public String getTechData() {
    if(getattrvaluecount("TechData")==0)return null;
    String value=getattrvalue("TechData");
    return value;
  }
  public void setTechData(String value) {
    if(value==null){setattrundefined("TechData");return;}
    setattrvalue("TechData", value);
  }
  public final static String tag_Grundlage="Grundlage";
  public String getGrundlage() {
    ch.interlis.iom.IomObject value=getattrobj("Grundlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGrundlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Grundlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Grundlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Grundlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
