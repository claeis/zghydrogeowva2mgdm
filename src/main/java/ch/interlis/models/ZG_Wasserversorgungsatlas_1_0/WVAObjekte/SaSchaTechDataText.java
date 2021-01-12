package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class SaSchaTechDataText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText";
  public SaSchaTechDataText(String oid) {
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
  public final static String tag_Farbe="Farbe";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe getFarbe() {
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe value) {
    setattrvalue("Farbe", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp getSize() {
    if(getattrvaluecount("Size")==0)return null;
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp value) {
    if(value==null){setattrundefined("Size");return;}
    setattrvalue("Size", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.toXmlCode(value));
  }
  public final static String tag_Sammelschacht="Sammelschacht";
  public String getSammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Sammelschacht",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setSammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Sammelschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Sammelschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Sammelschacht",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
