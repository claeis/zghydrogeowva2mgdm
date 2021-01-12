package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class SaubWaEinleitBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg";
  public SaubWaEinleitBewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BewiNummer="BewiNummer";
  public int getBewiNummer() {
    String value=getattrvalue("BewiNummer");
    return Integer.parseInt(value);
  }
  public void setBewiNummer(int value) {
    setattrvalue("BewiNummer", Integer.toString(value));
  }
  public final static String tag_Datum="Datum";
  public String getDatum() {
    if(getattrvaluecount("Datum")==0)return null;
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    if(value==null){setattrundefined("Datum");return;}
    setattrvalue("Datum", value);
  }
  public final static String tag_SaubWaEinleit="SaubWaEinleit";
  public String getSaubWaEinleit() {
    ch.interlis.iom.IomObject value=getattrobj("SaubWaEinleit",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setSaubWaEinleit(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("SaubWaEinleit",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("SaubWaEinleit","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("SaubWaEinleit",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
