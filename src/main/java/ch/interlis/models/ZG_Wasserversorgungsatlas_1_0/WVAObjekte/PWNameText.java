package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class PWNameText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText";
  public PWNameText(String oid) {
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
  public final static String tag_Farbe="Farbe";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe getFarbe() {
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe value) {
    setattrvalue("Farbe", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp getSize() {
    String value=getattrvalue("Size");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.parseXmlCode(value);
  }
  public void setSize(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp value) {
    setattrvalue("Size", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.SizeTyp.toXmlCode(value));
  }
  public final static String tag_Pumpwerk="Pumpwerk";
  public String getPumpwerk() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpwerk",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpwerk(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Pumpwerk","REF");
    structvalue.setobjectrefoid(oid);
  }
}
