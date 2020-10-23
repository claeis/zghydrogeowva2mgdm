package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Anreicherungsanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Anreicherungsanlage";
  public Anreicherungsanlage(String oid) {
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
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Typ="Typ";
  public Anreicherungsanlage_Typ getTyp() {
    String value=getattrvalue("Typ");
    return Anreicherungsanlage_Typ.parseXmlCode(value);
  }
  public void setTyp(Anreicherungsanlage_Typ value) {
    setattrvalue("Typ", Anreicherungsanlage_Typ.toXmlCode(value));
  }
  public final static String tag_Typ_Bemerkung="Typ_Bemerkung";
  public String getTyp_Bemerkung() {
    String value=getattrvalue("Typ_Bemerkung");
    return value;
  }
  public void setTyp_Bemerkung(String value) {
    setattrvalue("Typ_Bemerkung", value);
  }
  public final static String tag_Max_Versickerung="Max_Versickerung";
  public double getMax_Versickerung() {
    String value=getattrvalue("Max_Versickerung");
    return Double.parseDouble(value);
  }
  public void setMax_Versickerung(double value) {
    setattrvalue("Max_Versickerung", Double.toString(value));
  }
  public final static String tag_Bezugsgewaesser="Bezugsgewaesser";
  public String getBezugsgewaesser() {
    String value=getattrvalue("Bezugsgewaesser");
    return value;
  }
  public void setBezugsgewaesser(String value) {
    setattrvalue("Bezugsgewaesser", value);
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    setattrvalue("Zweck", value);
  }
  public final static String tag_GeometriePunkt="GeometriePunkt";
  public ch.interlis.iom.IomObject getGeometriePunkt() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("GeometriePunkt",0);
    return value;
  }
  public void setGeometriePunkt(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("GeometriePunkt")>0){
      changeattrobj("GeometriePunkt",0, value);
    }else{
      addattrobj("GeometriePunkt", value);
    }
  }
  public final static String tag_ObjNrAfu="ObjNrAfu";
  public String getObjNrAfu() {
    String value=getattrvalue("ObjNrAfu");
    return value;
  }
  public void setObjNrAfu(String value) {
    setattrvalue("ObjNrAfu", value);
  }
  public final static String tag_Bewilligungsdatum="Bewilligungsdatum";
  public String getBewilligungsdatum() {
    String value=getattrvalue("Bewilligungsdatum");
    return value;
  }
  public void setBewilligungsdatum(String value) {
    setattrvalue("Bewilligungsdatum", value);
  }
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_Wasser_V1.BetriebsArt getBetriebsart() {
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_Wasser_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_Wasser_V1.BetriebsArt value) {
    setattrvalue("Betriebsart", ch.interlis.models.ZG_Wasser_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_Nachfuehrungsstand="Nachfuehrungsstand";
  public String getNachfuehrungsstand() {
    String value=getattrvalue("Nachfuehrungsstand");
    return value;
  }
  public void setNachfuehrungsstand(String value) {
    setattrvalue("Nachfuehrungsstand", value);
  }
  public final static String tag_AuskunftsStelle="AuskunftsStelle";
  public String getAuskunftsStelle() {
    String value=getattrvalue("AuskunftsStelle");
    return value;
  }
  public void setAuskunftsStelle(String value) {
    setattrvalue("AuskunftsStelle", value);
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.ZG_Wasser_V1.Kanton getKanton() {
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_Wasser_V1.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_Wasser_V1.Kanton value) {
    setattrvalue("Kanton", ch.interlis.models.ZG_Wasser_V1.Kanton.toXmlCode(value));
  }
  public final static String tag_GdeNrBFS="GdeNrBFS";
  public int getGdeNrBFS() {
    String value=getattrvalue("GdeNrBFS");
    return Integer.parseInt(value);
  }
  public void setGdeNrBFS(int value) {
    setattrvalue("GdeNrBFS", Integer.toString(value));
  }
  public final static String tag_Lokalitaet="Lokalitaet";
  public String getLokalitaet() {
    String value=getattrvalue("Lokalitaet");
    return value;
  }
  public void setLokalitaet(String value) {
    setattrvalue("Lokalitaet", value);
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
  public final static String tag_MutatBemerk="MutatBemerk";
  public String getMutatBemerk() {
    String value=getattrvalue("MutatBemerk");
    return value;
  }
  public void setMutatBemerk(String value) {
    setattrvalue("MutatBemerk", value);
  }
  public final static String tag_Datei="Datei";
  public String getDatei() {
    ch.interlis.iom.IomObject value=getattrobj("Datei",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setDatei(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Datei","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Person="Person";
  public String getPerson() {
    ch.interlis.iom.IomObject value=getattrobj("Person",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Person","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Wasserversorgung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
