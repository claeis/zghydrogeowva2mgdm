package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class ReinwasserPW extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW";
  public ReinwasserPW(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_SymbolGeo="SymbolGeo";
  public String getSymbolGeo() {
    String value=getattrvalue("SymbolGeo");
    return value;
  }
  public void setSymbolGeo(String value) {
    setattrvalue("SymbolGeo", value);
  }
  public final static String tag_SymbolRot="SymbolRot";
  public double getSymbolRot() {
    String value=getattrvalue("SymbolRot");
    return Double.parseDouble(value);
  }
  public void setSymbolRot(double value) {
    setattrvalue("SymbolRot", Double.toString(value));
  }
  public final static String tag_RealY="RealY";
  public double getRealY() {
    String value=getattrvalue("RealY");
    return Double.parseDouble(value);
  }
  public void setRealY(double value) {
    setattrvalue("RealY", Double.toString(value));
  }
  public final static String tag_RealX="RealX";
  public double getRealX() {
    String value=getattrvalue("RealX");
    return Double.parseDouble(value);
  }
  public void setRealX(double value) {
    setattrvalue("RealX", Double.toString(value));
  }
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
  public final static String tag_Farbe="Farbe";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe getFarbe() {
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe value) {
    setattrvalue("Farbe", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Farbe.toXmlCode(value));
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt getBetriebsart() {
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt value) {
    setattrvalue("Betriebsart", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_Nutzungsart="Nutzungsart";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart getNutzungsart() {
    String value=getattrvalue("Nutzungsart");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.parseXmlCode(value);
  }
  public void setNutzungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart value) {
    setattrvalue("Nutzungsart", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.toXmlCode(value));
  }
  public final static String tag_TotFoerdermenge="TotFoerdermenge";
  public int getTotFoerdermenge() {
    String value=getattrvalue("TotFoerdermenge");
    return Integer.parseInt(value);
  }
  public void setTotFoerdermenge(int value) {
    setattrvalue("TotFoerdermenge", Integer.toString(value));
  }
  public final static String tag_TechData1="TechData1";
  public String getTechData1() {
    String value=getattrvalue("TechData1");
    return value;
  }
  public void setTechData1(String value) {
    setattrvalue("TechData1", value);
  }
  public final static String tag_TechData2="TechData2";
  public String getTechData2() {
    String value=getattrvalue("TechData2");
    return value;
  }
  public void setTechData2(String value) {
    setattrvalue("TechData2", value);
  }
  public final static String tag_TechData3="TechData3";
  public String getTechData3() {
    String value=getattrvalue("TechData3");
    return value;
  }
  public void setTechData3(String value) {
    setattrvalue("TechData3", value);
  }
  public final static String tag_TechData4="TechData4";
  public String getTechData4() {
    String value=getattrvalue("TechData4");
    return value;
  }
  public void setTechData4(String value) {
    setattrvalue("TechData4", value);
  }
  public final static String tag_Notversorgung="Notversorgung";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung getNotversorgung() {
    String value=getattrvalue("Notversorgung");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.parseXmlCode(value);
  }
  public void setNotversorgung(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung value) {
    setattrvalue("Notversorgung", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.toXmlCode(value));
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton getKanton() {
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton value) {
    setattrvalue("Kanton", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.toXmlCode(value));
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
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung getMaxDarst() {
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung value) {
    setattrvalue("MaxDarst", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung.toXmlCode(value));
  }
  public final static String tag_MutatDatum="MutatDatum";
  public String getMutatDatum() {
    String value=getattrvalue("MutatDatum");
    return value;
  }
  public void setMutatDatum(String value) {
    setattrvalue("MutatDatum", value);
  }
  public final static String tag_MutatBemerk="MutatBemerk";
  public String getMutatBemerk() {
    String value=getattrvalue("MutatBemerk");
    return value;
  }
  public void setMutatBemerk(String value) {
    setattrvalue("MutatBemerk", value);
  }
  public final static String tag_Aufbereitungswerk="Aufbereitungswerk";
  public String getAufbereitungswerk() {
    ch.interlis.iom.IomObject value=getattrobj("Aufbereitungswerk",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setAufbereitungswerk(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Aufbereitungswerk","REF");
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
}
