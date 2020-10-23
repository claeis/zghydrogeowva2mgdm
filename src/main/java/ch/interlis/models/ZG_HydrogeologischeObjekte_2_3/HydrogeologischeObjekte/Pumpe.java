package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Pumpe extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe";
  public Pumpe(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_PumpeNummer="PumpeNummer";
  public int getPumpeNummer() {
    String value=getattrvalue("PumpeNummer");
    return Integer.parseInt(value);
  }
  public void setPumpeNummer(int value) {
    setattrvalue("PumpeNummer", Integer.toString(value));
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public int getFoerdermenge() {
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(int value) {
    setattrvalue("Foerdermenge", Integer.toString(value));
  }
  public final static String tag_MotorLeistung="MotorLeistung";
  public double getMotorLeistung() {
    String value=getattrvalue("MotorLeistung");
    return Double.parseDouble(value);
  }
  public void setMotorLeistung(double value) {
    setattrvalue("MotorLeistung", Double.toString(value));
  }
  public final static String tag_Pumpenanlage="Pumpenanlage";
  public String getPumpenanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpenanlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpenanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Pumpenanlage","REF");
    structvalue.setobjectrefoid(oid);
  }
}
