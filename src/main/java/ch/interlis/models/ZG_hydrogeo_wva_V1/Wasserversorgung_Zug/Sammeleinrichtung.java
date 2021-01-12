package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Sammeleinrichtung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung";
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung getFsgLeitungRichtung() {
    if(getattrvaluecount("FsgLeitungRichtung")==0)return null;
    String value=getattrvalue("FsgLeitungRichtung");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung.parseXmlCode(value);
  }
  public void setFsgLeitungRichtung(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung value) {
    if(value==null){setattrundefined("FsgLeitungRichtung");return;}
    setattrvalue("FsgLeitungRichtung", ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgRichtung.toXmlCode(value));
  }
  public final static String tag_FsgLeitungLaenge="FsgLeitungLaenge";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge getFsgLeitungLaenge() {
    if(getattrvaluecount("FsgLeitungLaenge")==0)return null;
    String value=getattrvalue("FsgLeitungLaenge");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge.parseXmlCode(value);
  }
  public void setFsgLeitungLaenge(ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge value) {
    if(value==null){setattrundefined("FsgLeitungLaenge");return;}
    setattrvalue("FsgLeitungLaenge", ch.interlis.models.ZG_hydrogeo_wva_V1.FsgLtgLaenge.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt getDetailplanArt() {
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft getDetailplanHerkunft() {
    if(getattrvaluecount("DetailplanHerkunft")==0)return null;
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft value) {
    if(value==null){setattrundefined("DetailplanHerkunft");return;}
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart getGeometrieHerkunft() {
    if(getattrvaluecount("GeometrieHerkunft")==0)return null;
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart value) {
    if(value==null){setattrundefined("GeometrieHerkunft");return;}
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk getErfVorlBemerk() {
    if(getattrvaluecount("ErfVorlBemerk")==0)return null;
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk value) {
    if(value==null){setattrundefined("ErfVorlBemerk");return;}
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.toXmlCode(value));
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    ch.interlis.iom.IomObject value=getattrobj("MutatPerson",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setMutatPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("MutatPerson",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("MutatPerson","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("MutatPerson",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
