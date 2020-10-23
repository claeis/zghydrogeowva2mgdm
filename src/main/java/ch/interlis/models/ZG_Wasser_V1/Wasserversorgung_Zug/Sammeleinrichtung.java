package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Sammeleinrichtung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Sammeleinrichtung";
  public Sammeleinrichtung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
  }
  public final static String tag_Typ="Typ";
  public Sammeleinrichtung_Typ getTyp() {
    String value=getattrvalue("Typ");
    return Sammeleinrichtung_Typ.parseXmlCode(value);
  }
  public void setTyp(Sammeleinrichtung_Typ value) {
    setattrvalue("Typ", Sammeleinrichtung_Typ.toXmlCode(value));
  }
  public final static String tag_Geometrie="Geometrie";
  public ch.interlis.iom.IomObject getGeometrie() {
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
  public final static String tag_ArtSammeleinrichtung="ArtSammeleinrichtung";
  public Sammeleinrichtung_ArtSammeleinrichtung getArtSammeleinrichtung() {
    String value=getattrvalue("ArtSammeleinrichtung");
    return Sammeleinrichtung_ArtSammeleinrichtung.parseXmlCode(value);
  }
  public void setArtSammeleinrichtung(Sammeleinrichtung_ArtSammeleinrichtung value) {
    setattrvalue("ArtSammeleinrichtung", Sammeleinrichtung_ArtSammeleinrichtung.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasser_V1.FsgLtgRichtung getFsgLeitungRichtung() {
    String value=getattrvalue("FsgLeitungRichtung");
    return ch.interlis.models.ZG_Wasser_V1.FsgLtgRichtung.parseXmlCode(value);
  }
  public void setFsgLeitungRichtung(ch.interlis.models.ZG_Wasser_V1.FsgLtgRichtung value) {
    setattrvalue("FsgLeitungRichtung", ch.interlis.models.ZG_Wasser_V1.FsgLtgRichtung.toXmlCode(value));
  }
  public final static String tag_FsgLeitungLaenge="FsgLeitungLaenge";
  public ch.interlis.models.ZG_Wasser_V1.FsgLtgLaenge getFsgLeitungLaenge() {
    String value=getattrvalue("FsgLeitungLaenge");
    return ch.interlis.models.ZG_Wasser_V1.FsgLtgLaenge.parseXmlCode(value);
  }
  public void setFsgLeitungLaenge(ch.interlis.models.ZG_Wasser_V1.FsgLtgLaenge value) {
    setattrvalue("FsgLeitungLaenge", ch.interlis.models.ZG_Wasser_V1.FsgLtgLaenge.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasser_V1.DetailplanArt getDetailplanArt() {
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_Wasser_V1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_Wasser_V1.DetailplanArt value) {
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_Wasser_V1.DetailplanArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasser_V1.DetailplanMstab getDetailplanMstab() {
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_Wasser_V1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_Wasser_V1.DetailplanMstab value) {
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_Wasser_V1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_Wasser_V1.ErfVorlHerkunft getDetailplanHerkunft() {
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_Wasser_V1.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_Wasser_V1.ErfVorlHerkunft value) {
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_Wasser_V1.ErfVorlHerkunft.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasser_V1.ErfGenauigkeit getErfGenauigkeit() {
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_Wasser_V1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_Wasser_V1.ErfGenauigkeit value) {
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_Wasser_V1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_Wasser_V1.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_Wasser_V1.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_Wasser_V1.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_Wasser_V1.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_Wasser_V1.ErfVorlBemerk getErfVorlBemerk() {
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_Wasser_V1.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_Wasser_V1.ErfVorlBemerk value) {
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_Wasser_V1.ErfVorlBemerk.toXmlCode(value));
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
}
