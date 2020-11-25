package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class ObFasBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg";
  public ObFasBewiReg(String oid) {
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
  public final static String tag_OberflaechenGewFassung="OberflaechenGewFassung";
  public String getOberflaechenGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflaechenGewFassung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOberflaechenGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OberflaechenGewFassung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
