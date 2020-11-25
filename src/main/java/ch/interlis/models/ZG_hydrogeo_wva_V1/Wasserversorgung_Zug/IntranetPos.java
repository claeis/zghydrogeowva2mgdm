package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class IntranetPos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos";
  public IntranetPos(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_TextTyp="TextTyp";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.TextTyp getTextTyp() {
    String value=getattrvalue("TextTyp");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.TextTyp.parseXmlCode(value);
  }
  public void setTextTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.TextTyp value) {
    setattrvalue("TextTyp", ch.interlis.models.ZG_hydrogeo_wva_V1.TextTyp.toXmlCode(value));
  }
  public final static String tag_IntranetPos="IntranetPos";
  public IntranetPos_IntranetPos getIntranetPos() {
    String value=getattrvalue("IntranetPos");
    return IntranetPos_IntranetPos.parseXmlCode(value);
  }
  public void setIntranetPos(IntranetPos_IntranetPos value) {
    setattrvalue("IntranetPos", IntranetPos_IntranetPos.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe getFarbe() {
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe value) {
    setattrvalue("Farbe", ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.toXmlCode(value));
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
  public final static String tag_Hali="Hali";
  public ch.interlis.models.INTERLIS.HALIGNMENT getHali() {
    if(getattrvaluecount("Hali")==0)return null;
    String value=getattrvalue("Hali");
    return ch.interlis.models.INTERLIS.HALIGNMENT.parseXmlCode(value);
  }
  public void setHali(ch.interlis.models.INTERLIS.HALIGNMENT value) {
    if(value==null){setattrundefined("Hali");return;}
    setattrvalue("Hali", ch.interlis.models.INTERLIS.HALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Vali="Vali";
  public ch.interlis.models.INTERLIS.VALIGNMENT getVali() {
    if(getattrvaluecount("Vali")==0)return null;
    String value=getattrvalue("Vali");
    return ch.interlis.models.INTERLIS.VALIGNMENT.parseXmlCode(value);
  }
  public void setVali(ch.interlis.models.INTERLIS.VALIGNMENT value) {
    if(value==null){setattrundefined("Vali");return;}
    setattrvalue("Vali", ch.interlis.models.INTERLIS.VALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Size="Size";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp getSize() {
    if(getattrvaluecount("Size")==0)return null;
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp value) {
    if(value==null){setattrundefined("Size");return;}
    setattrvalue("Size", ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.toXmlCode(value));
  }
}
