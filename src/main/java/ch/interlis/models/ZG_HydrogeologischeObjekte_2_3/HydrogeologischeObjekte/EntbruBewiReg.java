package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class EntbruBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg";
  public EntbruBewiReg(String oid) {
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
  public final static String tag_Entnahmemenge="Entnahmemenge";
  public Integer getEntnahmemenge() {
    if(getattrvaluecount("Entnahmemenge")==0)return null;
    String value=getattrvalue("Entnahmemenge");
    return Integer.parseInt(value);
  }
  public void setEntnahmemenge(Integer value) {
    if(value==null){setattrundefined("Entnahmemenge");return;}
    setattrvalue("Entnahmemenge", Integer.toString(value));
  }
  public final static String tag_Pumpmenge="Pumpmenge";
  public Integer getPumpmenge() {
    if(getattrvaluecount("Pumpmenge")==0)return null;
    String value=getattrvalue("Pumpmenge");
    return Integer.parseInt(value);
  }
  public void setPumpmenge(Integer value) {
    if(value==null){setattrundefined("Pumpmenge");return;}
    setattrvalue("Pumpmenge", Integer.toString(value));
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
