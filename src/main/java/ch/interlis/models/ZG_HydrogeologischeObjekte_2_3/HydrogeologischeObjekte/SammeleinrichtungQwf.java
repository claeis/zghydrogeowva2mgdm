package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class SammeleinrichtungQwf extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf";
  public SammeleinrichtungQwf(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public int sizeGeometrie() {return getattrvaluecount("Geometrie");}
  public ch.interlis.iom.IomObject getGeometrie() {
    int size=getattrvaluecount("Geometrie");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungTyp.toXmlCode(value));
  }
  public final static String tag_FsgHorizont="FsgHorizont";
  public String getFsgHorizont() {
    if(getattrvaluecount("FsgHorizont")==0)return null;
    String value=getattrvalue("FsgHorizont");
    return value;
  }
  public void setFsgHorizont(String value) {
    if(value==null){setattrundefined("FsgHorizont");return;}
    setattrvalue("FsgHorizont", value);
  }
  public final static String tag_FsgStrangNr="FsgStrangNr";
  public String getFsgStrangNr() {
    if(getattrvaluecount("FsgStrangNr")==0)return null;
    String value=getattrvalue("FsgStrangNr");
    return value;
  }
  public void setFsgStrangNr(String value) {
    if(value==null){setattrundefined("FsgStrangNr");return;}
    setattrvalue("FsgStrangNr", value);
  }
  public final static String tag_FsgHorizontKote="FsgHorizontKote";
  public Double getFsgHorizontKote() {
    if(getattrvaluecount("FsgHorizontKote")==0)return null;
    String value=getattrvalue("FsgHorizontKote");
    return Double.parseDouble(value);
  }
  public void setFsgHorizontKote(Double value) {
    if(value==null){setattrundefined("FsgHorizontKote");return;}
    setattrvalue("FsgHorizontKote", Double.toString(value));
  }
  public final static String tag_LtgDimension="LtgDimension";
  public Double getLtgDimension() {
    if(getattrvaluecount("LtgDimension")==0)return null;
    String value=getattrvalue("LtgDimension");
    return Double.parseDouble(value);
  }
  public void setLtgDimension(Double value) {
    if(value==null){setattrundefined("LtgDimension");return;}
    setattrvalue("LtgDimension", Double.toString(value));
  }
  public final static String tag_FsgLeitungRichtung="FsgLeitungRichtung";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung getFsgLeitungRichtung() {
    if(getattrvaluecount("FsgLeitungRichtung")==0)return null;
    String value=getattrvalue("FsgLeitungRichtung");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung.parseXmlCode(value);
  }
  public void setFsgLeitungRichtung(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung value) {
    if(value==null){setattrundefined("FsgLeitungRichtung");return;}
    setattrvalue("FsgLeitungRichtung", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung.toXmlCode(value));
  }
  public final static String tag_FsgLeitungLaenge="FsgLeitungLaenge";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge getFsgLeitungLaenge() {
    if(getattrvaluecount("FsgLeitungLaenge")==0)return null;
    String value=getattrvalue("FsgLeitungLaenge");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge.parseXmlCode(value);
  }
  public void setFsgLeitungLaenge(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge value) {
    if(value==null){setattrundefined("FsgLeitungLaenge");return;}
    setattrvalue("FsgLeitungLaenge", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge.toXmlCode(value));
  }
  public final static String tag_BetriebArt="BetriebArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt getBetriebArt() {
    if(getattrvaluecount("BetriebArt")==0)return null;
    String value=getattrvalue("BetriebArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.parseXmlCode(value);
  }
  public void setBetriebArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt value) {
    if(value==null){setattrundefined("BetriebArt");return;}
    setattrvalue("BetriebArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMinAng() {
    if(getattrvaluecount("ErtragMinAng")==0)return null;
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMinAng");return;}
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMaxAng() {
    if(getattrvaluecount("ErtragMaxAng")==0)return null;
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMaxAng");return;}
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMittlAng() {
    if(getattrvaluecount("ErtragMittlAng")==0)return null;
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMittlAng");return;}
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_Nachfuehrungsstand="Nachfuehrungsstand";
  public String getNachfuehrungsstand() {
    if(getattrvaluecount("Nachfuehrungsstand")==0)return null;
    String value=getattrvalue("Nachfuehrungsstand");
    return value;
  }
  public void setNachfuehrungsstand(String value) {
    if(value==null){setattrundefined("Nachfuehrungsstand");return;}
    setattrvalue("Nachfuehrungsstand", value);
  }
  public final static String tag_Bemerkungen="Bemerkungen";
  public String getBemerkungen() {
    if(getattrvaluecount("Bemerkungen")==0)return null;
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    if(value==null){setattrundefined("Bemerkungen");return;}
    setattrvalue("Bemerkungen", value);
  }
  public final static String tag_MutatBemerk="MutatBemerk";
  public String getMutatBemerk() {
    if(getattrvaluecount("MutatBemerk")==0)return null;
    String value=getattrvalue("MutatBemerk");
    return value;
  }
  public void setMutatBemerk(String value) {
    if(value==null){setattrundefined("MutatBemerk");return;}
    setattrvalue("MutatBemerk", value);
  }
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt getDetailplanArt() {
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanDatum="DetailplanDatum";
  public String getDetailplanDatum() {
    if(getattrvaluecount("DetailplanDatum")==0)return null;
    String value=getattrvalue("DetailplanDatum");
    return value;
  }
  public void setDetailplanDatum(String value) {
    if(value==null){setattrundefined("DetailplanDatum");return;}
    setattrvalue("DetailplanDatum", value);
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft getDetailplanHerkunft() {
    if(getattrvaluecount("DetailplanHerkunft")==0)return null;
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft value) {
    if(value==null){setattrundefined("DetailplanHerkunft");return;}
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.toXmlCode(value));
  }
  public final static String tag_DetailplanNr="DetailplanNr";
  public String getDetailplanNr() {
    if(getattrvaluecount("DetailplanNr")==0)return null;
    String value=getattrvalue("DetailplanNr");
    return value;
  }
  public void setDetailplanNr(String value) {
    if(value==null){setattrundefined("DetailplanNr");return;}
    setattrvalue("DetailplanNr", value);
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk getErfVorlBemerk() {
    if(getattrvaluecount("ErfVorlBemerk")==0)return null;
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk value) {
    if(value==null){setattrundefined("ErfVorlBemerk");return;}
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.toXmlCode(value));
  }
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    ch.interlis.iom.IomObject value=getattrobj("MutatPerson",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setMutatPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("MutatPerson","REF");
    structvalue.setobjectrefoid(oid);
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
