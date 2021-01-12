package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class RuebruBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg";
  public RuebruBewiReg(String oid) {
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
  public final static String tag_Versickerungsmenge="Versickerungsmenge";
  public Integer getVersickerungsmenge() {
    if(getattrvaluecount("Versickerungsmenge")==0)return null;
    String value=getattrvalue("Versickerungsmenge");
    return Integer.parseInt(value);
  }
  public void setVersickerungsmenge(Integer value) {
    if(value==null){setattrundefined("Versickerungsmenge");return;}
    setattrvalue("Versickerungsmenge", Integer.toString(value));
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
}
