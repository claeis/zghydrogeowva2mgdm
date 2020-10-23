package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Rueckgabebrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Rueckgabebrunnen";
  public Rueckgabebrunnen(String oid) {
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
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public Rueckgabebrunnen_Nutzungszustand getNutzungszustand() {
    String value=getattrvalue("Nutzungszustand");
    return Rueckgabebrunnen_Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(Rueckgabebrunnen_Nutzungszustand value) {
    setattrvalue("Nutzungszustand", Rueckgabebrunnen_Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    setattrvalue("Zweck", value);
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
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_Wasser_V1.VersickerungTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_Wasser_V1.VersickerungTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_Wasser_V1.VersickerungTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_Wasser_V1.VersickerungTyp.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public ch.interlis.models.ZG_Wasser_V1.VersickerungArt getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.ZG_Wasser_V1.VersickerungArt.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.ZG_Wasser_V1.VersickerungArt value) {
    setattrvalue("Art", ch.interlis.models.ZG_Wasser_V1.VersickerungArt.toXmlCode(value));
  }
  public final static String tag_ObjNrAfu="ObjNrAfu";
  public String getObjNrAfu() {
    String value=getattrvalue("ObjNrAfu");
    return value;
  }
  public void setObjNrAfu(String value) {
    setattrvalue("ObjNrAfu", value);
  }
  public final static String tag_EigentumArt="EigentumArt";
  public ch.interlis.models.ZG_Wasser_V1.EigentumArt getEigentumArt() {
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_Wasser_V1.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_Wasser_V1.EigentumArt value) {
    setattrvalue("EigentumArt", ch.interlis.models.ZG_Wasser_V1.EigentumArt.toXmlCode(value));
  }
  public final static String tag_BetriebsArt="BetriebsArt";
  public ch.interlis.models.ZG_Wasser_V1.BetriebsArt getBetriebsArt() {
    String value=getattrvalue("BetriebsArt");
    return ch.interlis.models.ZG_Wasser_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsArt(ch.interlis.models.ZG_Wasser_V1.BetriebsArt value) {
    setattrvalue("BetriebsArt", ch.interlis.models.ZG_Wasser_V1.BetriebsArt.toXmlCode(value));
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
  public final static String tag_QkatPlanNr="QkatPlanNr";
  public int getQkatPlanNr() {
    String value=getattrvalue("QkatPlanNr");
    return Integer.parseInt(value);
  }
  public void setQkatPlanNr(int value) {
    setattrvalue("QkatPlanNr", Integer.toString(value));
  }
  public final static String tag_GrundstNr="GrundstNr";
  public String getGrundstNr() {
    String value=getattrvalue("GrundstNr");
    return value;
  }
  public void setGrundstNr(String value) {
    setattrvalue("GrundstNr", value);
  }
  public final static String tag_KontaktDatum="KontaktDatum";
  public String getKontaktDatum() {
    String value=getattrvalue("KontaktDatum");
    return value;
  }
  public void setKontaktDatum(String value) {
    setattrvalue("KontaktDatum", value);
  }
  public final static String tag_Adresse="Adresse";
  public String getAdresse() {
    ch.interlis.iom.IomObject value=getattrobj("Adresse",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAdresse(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Adresse","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Adresse1="Adresse1";
  public String getAdresse1() {
    ch.interlis.iom.IomObject value=getattrobj("Adresse1",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAdresse1(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Adresse1","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Adresse2="Adresse2";
  public String getAdresse2() {
    ch.interlis.iom.IomObject value=getattrobj("Adresse2",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAdresse2(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Adresse2","REF");
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
}
