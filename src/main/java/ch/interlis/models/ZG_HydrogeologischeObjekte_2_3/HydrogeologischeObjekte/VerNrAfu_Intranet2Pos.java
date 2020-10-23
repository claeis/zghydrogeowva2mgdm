package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class VerNrAfu_Intranet2Pos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos";
  public VerNrAfu_Intranet2Pos(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Pos="Pos";
  public String getPos() {
    String value=getattrvalue("Pos");
    return value;
  }
  public void setPos(String value) {
    setattrvalue("Pos", value);
  }
  public final static String tag_Ori="Ori";
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_HAli="HAli";
  public ch.interlis.models.INTERLIS.HALIGNMENT getHAli() {
    String value=getattrvalue("HAli");
    return ch.interlis.models.INTERLIS.HALIGNMENT.parseXmlCode(value);
  }
  public void setHAli(ch.interlis.models.INTERLIS.HALIGNMENT value) {
    setattrvalue("HAli", ch.interlis.models.INTERLIS.HALIGNMENT.toXmlCode(value));
  }
  public final static String tag_VAli="VAli";
  public ch.interlis.models.INTERLIS.VALIGNMENT getVAli() {
    String value=getattrvalue("VAli");
    return ch.interlis.models.INTERLIS.VALIGNMENT.parseXmlCode(value);
  }
  public void setVAli(ch.interlis.models.INTERLIS.VALIGNMENT value) {
    setattrvalue("VAli", ch.interlis.models.INTERLIS.VALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Size="Size";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ getSize() {
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ value) {
    setattrvalue("Size", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ.toXmlCode(value));
  }
  public final static String tag_Plantyp="Plantyp";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp getPlantyp() {
    String value=getattrvalue("Plantyp");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp.parseXmlCode(value);
  }
  public void setPlantyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp value) {
    setattrvalue("Plantyp", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp.toXmlCode(value));
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
