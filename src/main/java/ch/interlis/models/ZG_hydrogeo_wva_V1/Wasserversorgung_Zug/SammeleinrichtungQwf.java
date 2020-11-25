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
    if(getattrvaluecount("BetriebsArt")==0)return null;
    String value=getattrvalue("BetriebsArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsArt(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt value) {
    if(value==null){setattrundefined("BetriebsArt");return;}
    setattrvalue("BetriebsArt", ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMin="SchuettmengeMin";
  public Integer getSchuettmengeMin() {
    if(getattrvaluecount("SchuettmengeMin")==0)return null;
    String value=getattrvalue("SchuettmengeMin");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMin(Integer value) {
    if(value==null){setattrundefined("SchuettmengeMin");return;}
    setattrvalue("SchuettmengeMin", Integer.toString(value));
  }
  public final static String tag_ErtragMinAng="ErtragMinAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMinAng() {
    if(getattrvaluecount("ErtragMinAng")==0)return null;
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMinAng");return;}
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMax="SchuettmengeMax";
  public Integer getSchuettmengeMax() {
    if(getattrvaluecount("SchuettmengeMax")==0)return null;
    String value=getattrvalue("SchuettmengeMax");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMax(Integer value) {
    if(value==null){setattrundefined("SchuettmengeMax");return;}
    setattrvalue("SchuettmengeMax", Integer.toString(value));
  }
  public final static String tag_ErtragMaxAng="ErtragMaxAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMaxAng() {
    if(getattrvaluecount("ErtragMaxAng")==0)return null;
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMaxAng");return;}
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_SchuettmengeMittl="SchuettmengeMittl";
  public Integer getSchuettmengeMittl() {
    if(getattrvaluecount("SchuettmengeMittl")==0)return null;
    String value=getattrvalue("SchuettmengeMittl");
    return Integer.parseInt(value);
  }
  public void setSchuettmengeMittl(Integer value) {
    if(value==null){setattrundefined("SchuettmengeMittl");return;}
    setattrvalue("SchuettmengeMittl", Integer.toString(value));
  }
  public final static String tag_ErtragMittlAng="ErtragMittlAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMittlAng() {
    if(getattrvaluecount("ErtragMittlAng")==0)return null;
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMittlAng");return;}
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
}
