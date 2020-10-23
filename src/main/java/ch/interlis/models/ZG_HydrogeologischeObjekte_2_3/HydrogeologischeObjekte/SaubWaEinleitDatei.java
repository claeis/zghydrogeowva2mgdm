package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class SaubWaEinleitDatei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDatei";
  public SaubWaEinleitDatei(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Datum="Datum";
  public String getDatum() {
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    setattrvalue("Datum", value);
  }
  public final static String tag_Dateiname="Dateiname";
  public String getDateiname() {
    String value=getattrvalue("Dateiname");
    return value;
  }
  public void setDateiname(String value) {
    setattrvalue("Dateiname", value);
  }
  public final static String tag_SaubWaEinleit="SaubWaEinleit";
  public String getSaubWaEinleit() {
    ch.interlis.iom.IomObject value=getattrobj("SaubWaEinleit",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSaubWaEinleit(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("SaubWaEinleit","REF");
    structvalue.setobjectrefoid(oid);
  }
}
