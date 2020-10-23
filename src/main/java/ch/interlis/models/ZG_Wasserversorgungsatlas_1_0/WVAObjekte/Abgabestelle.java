package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Abgabestelle extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle";
  public Abgabestelle(String oid) {
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
  public final static String tag_StrassePlatz="StrassePlatz";
  public String getStrassePlatz() {
    String value=getattrvalue("StrassePlatz");
    return value;
  }
  public void setStrassePlatz(String value) {
    setattrvalue("StrassePlatz", value);
  }
  public final static String tag_NaehereBezeichnung="NaehereBezeichnung";
  public String getNaehereBezeichnung() {
    String value=getattrvalue("NaehereBezeichnung");
    return value;
  }
  public void setNaehereBezeichnung(String value) {
    setattrvalue("NaehereBezeichnung", value);
  }
  public final static String tag_Schlauchlaenge="Schlauchlaenge";
  public int getSchlauchlaenge() {
    String value=getattrvalue("Schlauchlaenge");
    return Integer.parseInt(value);
  }
  public void setSchlauchlaenge(int value) {
    setattrvalue("Schlauchlaenge", Integer.toString(value));
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
  public final static String tag_Hydrant="Hydrant";
  public String getHydrant() {
    ch.interlis.iom.IomObject value=getattrobj("Hydrant",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setHydrant(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Hydrant","REF");
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
