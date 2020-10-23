package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class AbWaEinleitBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg";
  public AbWaEinleitBewiReg(String oid) {
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
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    setattrvalue("Datum", value);
  }
  public final static String tag_AbWaEinleit="AbWaEinleit";
  public String getAbWaEinleit() {
    ch.interlis.iom.IomObject value=getattrobj("AbWaEinleit",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAbWaEinleit(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("AbWaEinleit","REF");
    structvalue.setobjectrefoid(oid);
  }
}
