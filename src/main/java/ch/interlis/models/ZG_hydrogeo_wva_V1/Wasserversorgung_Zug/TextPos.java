package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class TextPos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos";
  public TextPos(String oid) {
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
  public final static String tag_Plantyp="Plantyp";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp getPlantyp() {
    if(getattrvaluecount("Plantyp")==0)return null;
    String value=getattrvalue("Plantyp");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.parseXmlCode(value);
  }
  public void setPlantyp(ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp value) {
    if(value==null){setattrundefined("Plantyp");return;}
    setattrvalue("Plantyp", ch.interlis.models.ZG_hydrogeo_wva_V1.PlanTyp.toXmlCode(value));
  }
  public final static String tag_Leitung="Leitung";
  public String getLeitung() {
    ch.interlis.iom.IomObject value=getattrobj("Leitung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setLeitung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Leitung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Leitung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Leitung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_OberflGewFassung="OberflGewFassung";
  public String getOberflGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewFassung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOberflGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("OberflGewFassung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("OberflGewFassung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("OberflGewFassung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_WeitereAnlage="WeitereAnlage";
  public String getWeitereAnlage() {
    ch.interlis.iom.IomObject value=getattrobj("WeitereAnlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setWeitereAnlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("WeitereAnlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("WeitereAnlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("WeitereAnlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
