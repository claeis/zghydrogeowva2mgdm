package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class SammeleinrichtungQwf extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf";
  public SammeleinrichtungQwf(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BetriebsArt="BetriebsArt";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt getBetriebsArt() {
    String value=getattrvalue("BetriebsArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsArt(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt value) {
    setattrvalue("BetriebsArt", ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMin="SchuettmengeMin";
  public int getSchuettmengeMin() {
    String value=getattrvalue("SchuettmengeMin");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMin(int value) {
    setattrvalue("SchuettmengeMin", Integer.toString(value));
  }
  public final static String tag_ErtragMinAng="ErtragMinAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMinAng() {
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMax="SchuettmengeMax";
  public int getSchuettmengeMax() {
    String value=getattrvalue("SchuettmengeMax");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMax(int value) {
    setattrvalue("SchuettmengeMax", Integer.toString(value));
  }
  public final static String tag_ErtragMaxAng="ErtragMaxAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMaxAng() {
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMittl="SchuettmengeMittl";
  public int getSchuettmengeMittl() {
    String value=getattrvalue("SchuettmengeMittl");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMittl(int value) {
    setattrvalue("SchuettmengeMittl", Integer.toString(value));
  }
  public final static String tag_ErtragMittlAng="ErtragMittlAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMittlAng() {
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
}
