package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class VersiBewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg";
  public VersiBewiReg(String oid) {
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
  public final static String tag_Versickerungsmenge="Versickerungsmenge";
  public int getVersickerungsmenge() {
    String value=getattrvalue("Versickerungsmenge");
    return Integer.parseInt(value);
  }
  public void setVersickerungsmenge(int value) {
    setattrvalue("Versickerungsmenge", Integer.toString(value));
  }
  public final static String tag_Versickerungsanlage="Versickerungsanlage";
  public String getVersickerungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Versickerungsanlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setVersickerungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Versickerungsanlage","REF");
    structvalue.setobjectrefoid(oid);
  }
}
