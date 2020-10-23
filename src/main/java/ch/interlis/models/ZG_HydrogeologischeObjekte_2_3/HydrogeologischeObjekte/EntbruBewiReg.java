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
  public int getEntnahmemenge() {
    String value=getattrvalue("Entnahmemenge");
    return Integer.parseInt(value);
  }
  public void setEntnahmemenge(int value) {
    setattrvalue("Entnahmemenge", Integer.toString(value));
  }
  public final static String tag_Pumpmenge="Pumpmenge";
  public int getPumpmenge() {
    String value=getattrvalue("Pumpmenge");
    return Integer.parseInt(value);
  }
  public void setPumpmenge(int value) {
    setattrvalue("Pumpmenge", Integer.toString(value));
  }
  public final static String tag_Datum="Datum";
  public String getDatum() {
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    setattrvalue("Datum", value);
  }
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  public String getEntnahmebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Entnahmebrunnen",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEntnahmebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Entnahmebrunnen","REF");
    structvalue.setobjectrefoid(oid);
  }
}
