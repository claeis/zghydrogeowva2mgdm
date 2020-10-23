package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class AnschriftNummer extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.AnschriftNummer";
  public AnschriftNummer(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Nummer="Nummer";
  public String getNummer() {
    String value=getattrvalue("Nummer");
    return value;
  }
  public void setNummer(String value) {
    setattrvalue("Nummer", value);
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
}
