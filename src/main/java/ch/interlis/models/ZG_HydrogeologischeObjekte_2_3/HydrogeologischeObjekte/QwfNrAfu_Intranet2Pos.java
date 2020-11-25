package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QwfNrAfu_Intranet2Pos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos";
  public QwfNrAfu_Intranet2Pos(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Pos="Pos";
  public int sizePos() {return getattrvaluecount("Pos");}
  public ch.interlis.iom.IomObject getPos() {
    int size=getattrvaluecount("Pos");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Pos",0);
    return value;
  }
  public void setPos(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Pos")>0){
      changeattrobj("Pos",0, value);
    }else{
      addattrobj("Pos", value);
    }
  }
  public final static String tag_Ori="Ori";
  public Double getOri() {
    if(getattrvaluecount("Ori")==0)return null;
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(Double value) {
    if(value==null){setattrundefined("Ori");return;}
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_HAli="HAli";
  public ch.interlis.models.INTERLIS.HALIGNMENT getHAli() {
    if(getattrvaluecount("HAli")==0)return null;
    String value=getattrvalue("HAli");
    return ch.interlis.models.INTERLIS.HALIGNMENT.parseXmlCode(value);
  }
  public void setHAli(ch.interlis.models.INTERLIS.HALIGNMENT value) {
    if(value==null){setattrundefined("HAli");return;}
    setattrvalue("HAli", ch.interlis.models.INTERLIS.HALIGNMENT.toXmlCode(value));
  }
  public final static String tag_VAli="VAli";
  public ch.interlis.models.INTERLIS.VALIGNMENT getVAli() {
    if(getattrvaluecount("VAli")==0)return null;
    String value=getattrvalue("VAli");
    return ch.interlis.models.INTERLIS.VALIGNMENT.parseXmlCode(value);
  }
  public void setVAli(ch.interlis.models.INTERLIS.VALIGNMENT value) {
    if(value==null){setattrundefined("VAli");return;}
    setattrvalue("VAli", ch.interlis.models.INTERLIS.VALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Size="Size";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ getSize() {
    if(getattrvaluecount("Size")==0)return null;
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ value) {
    if(value==null){setattrundefined("Size");return;}
    setattrvalue("Size", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Size_Typ.toXmlCode(value));
  }
  public final static String tag_Plantyp="Plantyp";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp getPlantyp() {
    if(getattrvaluecount("Plantyp")==0)return null;
    String value=getattrvalue("Plantyp");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp.parseXmlCode(value);
  }
  public void setPlantyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp value) {
    if(value==null){setattrundefined("Plantyp");return;}
    setattrvalue("Plantyp", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.PlanTyp.toXmlCode(value));
  }
  public final static String tag_Quellschacht="Quellschacht";
  public String getQuellschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quellschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setQuellschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Quellschacht","REF");
    structvalue.setobjectrefoid(oid);
  }
}
