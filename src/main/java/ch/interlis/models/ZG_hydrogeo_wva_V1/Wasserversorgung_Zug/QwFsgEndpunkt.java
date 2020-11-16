package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class QwFsgEndpunkt extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt";
  public QwFsgEndpunkt(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObjektNummer="ObjektNummer";
  public int getObjektNummer() {
    String value=getattrvalue("ObjektNummer");
    return Integer.parseInt(value);
  }
  public void setObjektNummer(int value) {
    setattrvalue("ObjektNummer", Integer.toString(value));
  }
  public final static String tag_PrivatNutzer="PrivatNutzer";
  public String getPrivatNutzer() {
    String value=getattrvalue("PrivatNutzer");
    return value;
  }
  public void setPrivatNutzer(String value) {
    setattrvalue("PrivatNutzer", value);
  }
  public final static String tag_ErtragMinAng="ErtragMinAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMinAng() {
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_ErtragMaxAng="ErtragMaxAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMaxAng() {
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_ErtragMittlAng="ErtragMittlAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMittlAng() {
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_SchzNr="SchzNr";
  public int getSchzNr() {
    String value=getattrvalue("SchzNr");
    return Integer.parseInt(value);
  }
  public void setSchzNr(int value) {
    setattrvalue("SchzNr", Integer.toString(value));
  }
  public final static String tag_SchzPflicht="SchzPflicht";
  public boolean getSchzPflicht() {
    String value=getattrvalue("SchzPflicht");
    return value!=null && value.equals("true");
  }
  public void setSchzPflicht(boolean value) {
    setattrvalue("SchzPflicht", value?"true":"false");
  }
  public final static String tag_SchzGutachten="SchzGutachten";
  public boolean getSchzGutachten() {
    String value=getattrvalue("SchzGutachten");
    return value!=null && value.equals("true");
  }
  public void setSchzGutachten(boolean value) {
    setattrvalue("SchzGutachten", value?"true":"false");
  }
  public final static String tag_SchzGutAutor="SchzGutAutor";
  public String getSchzGutAutor() {
    String value=getattrvalue("SchzGutAutor");
    return value;
  }
  public void setSchzGutAutor(String value) {
    setattrvalue("SchzGutAutor", value);
  }
  public final static String tag_SchzGutDatum="SchzGutDatum";
  public String getSchzGutDatum() {
    String value=getattrvalue("SchzGutDatum");
    return value;
  }
  public void setSchzGutDatum(String value) {
    setattrvalue("SchzGutDatum", value);
  }
  public final static String tag_Nachfuehrungsstand="Nachfuehrungsstand";
  public String getNachfuehrungsstand() {
    String value=getattrvalue("Nachfuehrungsstand");
    return value;
  }
  public void setNachfuehrungsstand(String value) {
    setattrvalue("Nachfuehrungsstand", value);
  }
  public final static String tag_Auskunftsstelle="Auskunftsstelle";
  public String getAuskunftsstelle() {
    String value=getattrvalue("Auskunftsstelle");
    return value;
  }
  public void setAuskunftsstelle(String value) {
    setattrvalue("Auskunftsstelle", value);
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton getKanton() {
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton value) {
    setattrvalue("Kanton", ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.toXmlCode(value));
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
  public final static String tag_HoeheTerrain="HoeheTerrain";
  public double getHoeheTerrain() {
    String value=getattrvalue("HoeheTerrain");
    return Double.parseDouble(value);
  }
  public void setHoeheTerrain(double value) {
    setattrvalue("HoeheTerrain", Double.toString(value));
  }
  public final static String tag_HoeheAuslauf="HoeheAuslauf";
  public double getHoeheAuslauf() {
    String value=getattrvalue("HoeheAuslauf");
    return Double.parseDouble(value);
  }
  public void setHoeheAuslauf(double value) {
    setattrvalue("HoeheAuslauf", Double.toString(value));
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    String value=getattrvalue("MutatPerson");
    return value;
  }
  public void setMutatPerson(String value) {
    setattrvalue("MutatPerson", value);
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt getDetailplanArt() {
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt value) {
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab getDetailplanMstab() {
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab value) {
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft getDetailplanHerkunft() {
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft value) {
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit getErfGenauigkeit() {
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit value) {
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk getErfVorlBemerk() {
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk value) {
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.toXmlCode(value));
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
