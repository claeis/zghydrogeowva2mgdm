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
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
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
    String value=getattrvalue("FsgHorizont");
    return value;
  }
  public void setFsgHorizont(String value) {
    setattrvalue("FsgHorizont", value);
  }
  public final static String tag_FsgStrangNr="FsgStrangNr";
  public String getFsgStrangNr() {
    String value=getattrvalue("FsgStrangNr");
    return value;
  }
  public void setFsgStrangNr(String value) {
    setattrvalue("FsgStrangNr", value);
  }
  public final static String tag_FsgHorizontKote="FsgHorizontKote";
  public double getFsgHorizontKote() {
    String value=getattrvalue("FsgHorizontKote");
    return Double.parseDouble(value);
  }
  public void setFsgHorizontKote(double value) {
    setattrvalue("FsgHorizontKote", Double.toString(value));
  }
  public final static String tag_LtgDimension="LtgDimension";
  public double getLtgDimension() {
    String value=getattrvalue("LtgDimension");
    return Double.parseDouble(value);
  }
  public void setLtgDimension(double value) {
    setattrvalue("LtgDimension", Double.toString(value));
  }
  public final static String tag_FsgLeitungRichtung="FsgLeitungRichtung";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung getFsgLeitungRichtung() {
    String value=getattrvalue("FsgLeitungRichtung");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung.parseXmlCode(value);
  }
  public void setFsgLeitungRichtung(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung value) {
    setattrvalue("FsgLeitungRichtung", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgRichtung.toXmlCode(value));
  }
  public final static String tag_FsgLeitungLaenge="FsgLeitungLaenge";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge getFsgLeitungLaenge() {
    String value=getattrvalue("FsgLeitungLaenge");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge.parseXmlCode(value);
  }
  public void setFsgLeitungLaenge(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge value) {
    setattrvalue("FsgLeitungLaenge", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FsgLtgLaenge.toXmlCode(value));
  }
  public final static String tag_BetriebArt="BetriebArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt getBetriebArt() {
    String value=getattrvalue("BetriebArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.parseXmlCode(value);
  }
  public void setBetriebArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt value) {
    setattrvalue("BetriebArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMinAng() {
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMaxAng() {
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben getErtragMittlAng() {
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben value) {
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_Nachfuehrungsstand="Nachfuehrungsstand";
  public String getNachfuehrungsstand() {
    String value=getattrvalue("Nachfuehrungsstand");
    return value;
  }
  public void setNachfuehrungsstand(String value) {
    setattrvalue("Nachfuehrungsstand", value);
  }
  public final static String tag_Bemerkungen="Bemerkungen";
  public String getBemerkungen() {
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    setattrvalue("Bemerkungen", value);
  }
  public final static String tag_MutatBemerk="MutatBemerk";
  public String getMutatBemerk() {
    String value=getattrvalue("MutatBemerk");
    return value;
  }
  public void setMutatBemerk(String value) {
    setattrvalue("MutatBemerk", value);
  }
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt getDetailplanArt() {
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt value) {
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanDatum="DetailplanDatum";
  public String getDetailplanDatum() {
    String value=getattrvalue("DetailplanDatum");
    return value;
  }
  public void setDetailplanDatum(String value) {
    setattrvalue("DetailplanDatum", value);
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab getDetailplanMstab() {
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab value) {
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft getDetailplanHerkunft() {
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft value) {
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.toXmlCode(value));
  }
  public final static String tag_DetailplanNr="DetailplanNr";
  public String getDetailplanNr() {
    String value=getattrvalue("DetailplanNr");
    return value;
  }
  public void setDetailplanNr(String value) {
    setattrvalue("DetailplanNr", value);
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit getErfGenauigkeit() {
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit value) {
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
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk value) {
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
