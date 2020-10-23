package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class NotLeitung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung";
  public NotLeitung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_UebergabeOrt="UebergabeOrt";
  public String getUebergabeOrt() {
    String value=getattrvalue("UebergabeOrt");
    return value;
  }
  public void setUebergabeOrt(String value) {
    setattrvalue("UebergabeOrt", value);
  }
  public final static String tag_VerbundNr="VerbundNr";
  public int getVerbundNr() {
    String value=getattrvalue("VerbundNr");
    return Integer.parseInt(value);
  }
  public void setVerbundNr(int value) {
    setattrvalue("VerbundNr", Integer.toString(value));
  }
  public final static String tag_AusloesungVon="AusloesungVon";
  public String getAusloesungVon() {
    String value=getattrvalue("AusloesungVon");
    return value;
  }
  public void setAusloesungVon(String value) {
    setattrvalue("AusloesungVon", value);
  }
  public final static String tag_PumpeVon="PumpeVon";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp getPumpeVon() {
    String value=getattrvalue("PumpeVon");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.parseXmlCode(value);
  }
  public void setPumpeVon(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp value) {
    setattrvalue("PumpeVon", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.toXmlCode(value));
  }
  public final static String tag_VerbindungsleitungVon="VerbindungsleitungVon";
  public int getVerbindungsleitungVon() {
    String value=getattrvalue("VerbindungsleitungVon");
    return Integer.parseInt(value);
  }
  public void setVerbindungsleitungVon(int value) {
    setattrvalue("VerbindungsleitungVon", Integer.toString(value));
  }
  public final static String tag_AusloesungNach="AusloesungNach";
  public String getAusloesungNach() {
    String value=getattrvalue("AusloesungNach");
    return value;
  }
  public void setAusloesungNach(String value) {
    setattrvalue("AusloesungNach", value);
  }
  public final static String tag_PumpeNach="PumpeNach";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp getPumpeNach() {
    String value=getattrvalue("PumpeNach");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.parseXmlCode(value);
  }
  public void setPumpeNach(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp value) {
    setattrvalue("PumpeNach", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.toXmlCode(value));
  }
  public final static String tag_VerbindungsleitungNach="VerbindungsleitungNach";
  public int getVerbindungsleitungNach() {
    String value=getattrvalue("VerbindungsleitungNach");
    return Integer.parseInt(value);
  }
  public void setVerbindungsleitungNach(int value) {
    setattrvalue("VerbindungsleitungNach", Integer.toString(value));
  }
  public final static String tag_Bemerkung="Bemerkung";
  public String getBemerkung() {
    String value=getattrvalue("Bemerkung");
    return value;
  }
  public void setBemerkung(String value) {
    setattrvalue("Bemerkung", value);
  }
  public final static String tag_Objekt="Objekt";
  public String getObjekt() {
    String value=getattrvalue("Objekt");
    return value;
  }
  public void setObjekt(String value) {
    setattrvalue("Objekt", value);
  }
  public final static String tag_ObjektArt="ObjektArt";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt getObjektArt() {
    String value=getattrvalue("ObjektArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt.parseXmlCode(value);
  }
  public void setObjektArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt value) {
    setattrvalue("ObjektArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt.toXmlCode(value));
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
  public final static String tag_LieferungNach="LieferungNach";
  public String getLieferungNach() {
    ch.interlis.iom.IomObject value=getattrobj("LieferungNach",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLieferungNach(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LieferungNach","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_LieferungVon="LieferungVon";
  public String getLieferungVon() {
    ch.interlis.iom.IomObject value=getattrobj("LieferungVon",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLieferungVon(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LieferungVon","REF");
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
