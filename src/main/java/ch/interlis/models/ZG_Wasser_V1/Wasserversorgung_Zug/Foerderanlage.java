package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class Foerderanlage extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.Foerderanlage";
  public Foerderanlage(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_FoerderanlageArt="FoerderanlageArt";
  public Foerderanlage_FoerderanlageArt getFoerderanlageArt() {
    String value=getattrvalue("FoerderanlageArt");
    return Foerderanlage_FoerderanlageArt.parseXmlCode(value);
  }
  public void setFoerderanlageArt(Foerderanlage_FoerderanlageArt value) {
    setattrvalue("FoerderanlageArt", Foerderanlage_FoerderanlageArt.toXmlCode(value));
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
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_Wasser_V1.BetriebsArt getBetriebsart() {
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_Wasser_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_Wasser_V1.BetriebsArt value) {
    setattrvalue("Betriebsart", ch.interlis.models.ZG_Wasser_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_Nutzungsart="Nutzungsart";
  public ch.interlis.models.ZG_Wasser_V1.Nutzungsart getNutzungsart() {
    String value=getattrvalue("Nutzungsart");
    return ch.interlis.models.ZG_Wasser_V1.Nutzungsart.parseXmlCode(value);
  }
  public void setNutzungsart(ch.interlis.models.ZG_Wasser_V1.Nutzungsart value) {
    setattrvalue("Nutzungsart", ch.interlis.models.ZG_Wasser_V1.Nutzungsart.toXmlCode(value));
  }
  public final static String tag_TotFoerdermenge="TotFoerdermenge";
  public int getTotFoerdermenge() {
    String value=getattrvalue("TotFoerdermenge");
    return Integer.parseInt(value);
  }
  public void setTotFoerdermenge(int value) {
    setattrvalue("TotFoerdermenge", Integer.toString(value));
  }
  public final static String tag_Techdata="Techdata";
  public String getTechdata() {
    String value=getattrvalue("Techdata");
    return value;
  }
  public void setTechdata(String value) {
    setattrvalue("Techdata", value);
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
  public final static String tag_Notversorgung="Notversorgung";
  public ch.interlis.models.ZG_Wasser_V1.Notversorgung getNotversorgung() {
    String value=getattrvalue("Notversorgung");
    return ch.interlis.models.ZG_Wasser_V1.Notversorgung.parseXmlCode(value);
  }
  public void setNotversorgung(ch.interlis.models.ZG_Wasser_V1.Notversorgung value) {
    setattrvalue("Notversorgung", ch.interlis.models.ZG_Wasser_V1.Notversorgung.toXmlCode(value));
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
  public final static String tag_MaxDarst="MaxDarst";
  public ch.interlis.models.ZG_Wasser_V1.Darstellung getMaxDarst() {
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_Wasser_V1.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_Wasser_V1.Darstellung value) {
    setattrvalue("MaxDarst", ch.interlis.models.ZG_Wasser_V1.Darstellung.toXmlCode(value));
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
  public final static String tag_EinzelFoerdermenge="EinzelFoerdermenge";
  public ch.interlis.models.ZG_Wasser_V1.Zahlen getEinzelFoerdermenge() {
    ch.interlis.models.ZG_Wasser_V1.Zahlen value=(ch.interlis.models.ZG_Wasser_V1.Zahlen)getattrobj("EinzelFoerdermenge",0);
    return value;
  }
  public void setEinzelFoerdermenge(ch.interlis.models.ZG_Wasser_V1.Zahlen value) {
    if(getattrvaluecount("EinzelFoerdermenge")>0){
      changeattrobj("EinzelFoerdermenge",0, value);
    }else{
      addattrobj("EinzelFoerdermenge", value);
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
  public final static String tag_Grundlage="Grundlage";
  public String getGrundlage() {
    ch.interlis.iom.IomObject value=getattrobj("Grundlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGrundlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Grundlage","REF");
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
