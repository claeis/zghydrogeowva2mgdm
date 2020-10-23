package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Kaliberwechsel extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel";
  public Kaliberwechsel(String oid) {
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
  public final static String tag_SymbolTyp="SymbolTyp";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp getSymbolTyp() {
    String value=getattrvalue("SymbolTyp");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.parseXmlCode(value);
  }
  public void setSymbolTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp value) {
    setattrvalue("SymbolTyp", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberTyp.toXmlCode(value));
  }
  public final static String tag_Leitungsart="Leitungsart";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt getLeitungsart() {
    String value=getattrvalue("Leitungsart");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.parseXmlCode(value);
  }
  public void setLeitungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt value) {
    setattrvalue("Leitungsart", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsArt.toXmlCode(value));
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
