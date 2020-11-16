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
  public final static String tag_IntranetPos="IntranetPos";
  public TextPos_IntranetPos getIntranetPos() {
    String value=getattrvalue("IntranetPos");
    return TextPos_IntranetPos.parseXmlCode(value);
  }
  public void setIntranetPos(TextPos_IntranetPos value) {
    setattrvalue("IntranetPos", TextPos_IntranetPos.toXmlCode(value));
  }
  public final static String tag_Pos="Pos";
  public ch.interlis.iom.IomObject getPos() {
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
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_Hali="Hali";
  public ch.interlis.models.INTERLIS.HALIGNMENT getHali() {
    String value=getattrvalue("Hali");
    return ch.interlis.models.INTERLIS.HALIGNMENT.parseXmlCode(value);
  }
  public void setHali(ch.interlis.models.INTERLIS.HALIGNMENT value) {
    setattrvalue("Hali", ch.interlis.models.INTERLIS.HALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Vali="Vali";
  public ch.interlis.models.INTERLIS.VALIGNMENT getVali() {
    String value=getattrvalue("Vali");
    return ch.interlis.models.INTERLIS.VALIGNMENT.parseXmlCode(value);
  }
  public void setVali(ch.interlis.models.INTERLIS.VALIGNMENT value) {
    setattrvalue("Vali", ch.interlis.models.INTERLIS.VALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Size="Size";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp getSize() {
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp value) {
    setattrvalue("Size", ch.interlis.models.ZG_hydrogeo_wva_V1.SizeTyp.toXmlCode(value));
  }
  public final static String tag_Leitung="Leitung";
  public String getLeitung() {
    ch.interlis.iom.IomObject value=getattrobj("Leitung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLeitung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Leitung","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_OberflGewFassung="OberflGewFassung";
  public String getOberflGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewFassung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOberflGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OberflGewFassung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
