package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Rueckgabebrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen";
  public Rueckgabebrunnen(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lage="Lage";
  public String getLage() {
    String value=getattrvalue("Lage");
    return value;
  }
  public void setLage(String value) {
    setattrvalue("Lage", value);
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungTyp.toXmlCode(value));
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt getEigentumArt() {
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt value) {
    setattrvalue("EigentumArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt.toXmlCode(value));
  }
  public final static String tag_BetriebArt="BetriebArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt getBetriebArt() {
    String value=getattrvalue("BetriebArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.parseXmlCode(value);
  }
  public void setBetriebArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt value) {
    setattrvalue("BetriebArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton getKanton() {
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton value) {
    setattrvalue("Kanton", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton.toXmlCode(value));
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
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
  public final static String tag_AnlageEigentuemer="AnlageEigentuemer";
  public String getAnlageEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("AnlageEigentuemer",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAnlageEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("AnlageEigentuemer","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_GrundEigentuemer="GrundEigentuemer";
  public String getGrundEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("GrundEigentuemer",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGrundEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GrundEigentuemer","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_KontaktPerson="KontaktPerson";
  public String getKontaktPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontaktPerson",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setKontaktPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("KontaktPerson","REF");
    structvalue.setobjectrefoid(oid);
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
