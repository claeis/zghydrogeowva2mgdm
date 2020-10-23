package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Entnahmebrunnen extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Entnahmebrunnen";
  public Entnahmebrunnen(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_EntnahmebrunnenTyp="EntnahmebrunnenTyp";
  public ch.interlis.models.ZG_Wasser_V1.EntnahmebrunnenTyp getEntnahmebrunnenTyp() {
    String value=getattrvalue("EntnahmebrunnenTyp");
    return ch.interlis.models.ZG_Wasser_V1.EntnahmebrunnenTyp.parseXmlCode(value);
  }
  public void setEntnahmebrunnenTyp(ch.interlis.models.ZG_Wasser_V1.EntnahmebrunnenTyp value) {
    setattrvalue("EntnahmebrunnenTyp", ch.interlis.models.ZG_Wasser_V1.EntnahmebrunnenTyp.toXmlCode(value));
  }
  public final static String tag_TextTyp="TextTyp";
  public ch.interlis.models.ZG_Wasser_V1.TextTyp getTextTyp() {
    String value=getattrvalue("TextTyp");
    return ch.interlis.models.ZG_Wasser_V1.TextTyp.parseXmlCode(value);
  }
  public void setTextTyp(ch.interlis.models.ZG_Wasser_V1.TextTyp value) {
    setattrvalue("TextTyp", ch.interlis.models.ZG_Wasser_V1.TextTyp.toXmlCode(value));
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
  public final static String tag_PrivatNutzer="PrivatNutzer";
  public String getPrivatNutzer() {
    String value=getattrvalue("PrivatNutzer");
    return value;
  }
  public void setPrivatNutzer(String value) {
    setattrvalue("PrivatNutzer", value);
  }
  public final static String tag_TiefeTerrAbstich="TiefeTerrAbstich";
  public double getTiefeTerrAbstich() {
    String value=getattrvalue("TiefeTerrAbstich");
    return Double.parseDouble(value);
  }
  public void setTiefeTerrAbstich(double value) {
    setattrvalue("TiefeTerrAbstich", Double.toString(value));
  }
  public final static String tag_HoeheTerrAbstuch="HoeheTerrAbstuch";
  public double getHoeheTerrAbstuch() {
    String value=getattrvalue("HoeheTerrAbstuch");
    return Double.parseDouble(value);
  }
  public void setHoeheTerrAbstuch(double value) {
    setattrvalue("HoeheTerrAbstuch", Double.toString(value));
  }
  public final static String tag_WspHoeheTiefst="WspHoeheTiefst";
  public double getWspHoeheTiefst() {
    String value=getattrvalue("WspHoeheTiefst");
    return Double.parseDouble(value);
  }
  public void setWspHoeheTiefst(double value) {
    setattrvalue("WspHoeheTiefst", Double.toString(value));
  }
  public final static String tag_K_Wert="K_Wert";
  public double getK_Wert() {
    String value=getattrvalue("K_Wert");
    return Double.parseDouble(value);
  }
  public void setK_Wert(double value) {
    setattrvalue("K_Wert", Double.toString(value));
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
  public final static String tag_MutatDatum="MutatDatum";
  public String getMutatDatum() {
    String value=getattrvalue("MutatDatum");
    return value;
  }
  public void setMutatDatum(String value) {
    setattrvalue("MutatDatum", value);
  }
  public final static String tag_SymbolGeo="SymbolGeo";
  public ch.interlis.iom.IomObject getSymbolGeo() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("SymbolGeo",0);
    return value;
  }
  public void setSymbolGeo(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("SymbolGeo")>0){
      changeattrobj("SymbolGeo",0, value);
    }else{
      addattrobj("SymbolGeo", value);
    }
  }
  public final static String tag_SymbolRot="SymbolRot";
  public double getSymbolRot() {
    String value=getattrvalue("SymbolRot");
    return Double.parseDouble(value);
  }
  public void setSymbolRot(double value) {
    setattrvalue("SymbolRot", Double.toString(value));
  }
  public final static String tag_Farbe="Farbe";
  public ch.interlis.models.ZG_Wasser_V1.Farbe getFarbe() {
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_Wasser_V1.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_Wasser_V1.Farbe value) {
    setattrvalue("Farbe", ch.interlis.models.ZG_Wasser_V1.Farbe.toXmlCode(value));
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
  public final static String tag_Techdata1="Techdata1";
  public String getTechdata1() {
    String value=getattrvalue("Techdata1");
    return value;
  }
  public void setTechdata1(String value) {
    setattrvalue("Techdata1", value);
  }
  public final static String tag_Techdata2="Techdata2";
  public String getTechdata2() {
    String value=getattrvalue("Techdata2");
    return value;
  }
  public void setTechdata2(String value) {
    setattrvalue("Techdata2", value);
  }
  public final static String tag_Techdata3="Techdata3";
  public String getTechdata3() {
    String value=getattrvalue("Techdata3");
    return value;
  }
  public void setTechdata3(String value) {
    setattrvalue("Techdata3", value);
  }
  public final static String tag_Techdata4="Techdata4";
  public String getTechdata4() {
    String value=getattrvalue("Techdata4");
    return value;
  }
  public void setTechdata4(String value) {
    setattrvalue("Techdata4", value);
  }
  public final static String tag_MaxDarst="MaxDarst";
  public ch.interlis.models.ZG_Wasser_V1.Darstellung getMaxDarst() {
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_Wasser_V1.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_Wasser_V1.Darstellung value) {
    setattrvalue("MaxDarst", ch.interlis.models.ZG_Wasser_V1.Darstellung.toXmlCode(value));
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
  public final static String tag_Verwendungszweck="Verwendungszweck";
  public ch.interlis.models.ZG_Wasser_V1.Texte getVerwendungszweck() {
    ch.interlis.models.ZG_Wasser_V1.Texte value=(ch.interlis.models.ZG_Wasser_V1.Texte)getattrobj("Verwendungszweck",0);
    return value;
  }
  public void setVerwendungszweck(ch.interlis.models.ZG_Wasser_V1.Texte value) {
    if(getattrvaluecount("Verwendungszweck")>0){
      changeattrobj("Verwendungszweck",0, value);
    }else{
      addattrobj("Verwendungszweck", value);
    }
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
}
