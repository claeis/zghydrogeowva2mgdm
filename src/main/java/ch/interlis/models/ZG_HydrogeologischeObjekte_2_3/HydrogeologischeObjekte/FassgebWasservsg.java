package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class FassgebWasservsg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg";
  public FassgebWasservsg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Fassungseinzugsgebiet="Fassungseinzugsgebiet";
  public String getFassungseinzugsgebiet() {
    ch.interlis.iom.IomObject value=getattrobj("Fassungseinzugsgebiet",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setFassungseinzugsgebiet(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Fassungseinzugsgebiet",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Fassungseinzugsgebiet","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Fassungseinzugsgebiet",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Wasserversorgung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Wasserversorgung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Wasserversorgung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
