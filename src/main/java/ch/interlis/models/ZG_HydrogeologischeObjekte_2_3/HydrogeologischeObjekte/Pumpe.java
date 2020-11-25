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
  public Integer getPumpeNummer() {
    if(getattrvaluecount("PumpeNummer")==0)return null;
    String value=getattrvalue("PumpeNummer");
    return Integer.parseInt(value);
  }
  public void setPumpeNummer(Integer value) {
    if(value==null){setattrundefined("PumpeNummer");return;}
    setattrvalue("PumpeNummer", Integer.toString(value));
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public Integer getFoerdermenge() {
    if(getattrvaluecount("Foerdermenge")==0)return null;
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(Integer value) {
    if(value==null){setattrundefined("Foerdermenge");return;}
    setattrvalue("Foerdermenge", Integer.toString(value));
  }
  public final static String tag_MotorLeistung="MotorLeistung";
  public Double getMotorLeistung() {
    if(getattrvaluecount("MotorLeistung")==0)return null;
    String value=getattrvalue("MotorLeistung");
    return Double.parseDouble(value);
  }
  public void setMotorLeistung(Double value) {
    if(value==null){setattrundefined("MotorLeistung");return;}
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
