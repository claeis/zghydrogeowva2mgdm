package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Uebergabestelle extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle";
  public Uebergabestelle(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_SymbolGeo="SymbolGeo";
  public int sizeSymbolGeo() {return getattrvaluecount("SymbolGeo");}
  public ch.interlis.iom.IomObject getSymbolGeo() {
    int size=getattrvaluecount("SymbolGeo");
    if(size==0)return null;
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
  public final static String tag_VerbundArt="VerbundArt";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerbundArt getVerbundArt() {
    String value=getattrvalue("VerbundArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerbundArt.parseXmlCode(value);
  }
  public void setVerbundArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerbundArt value) {
    setattrvalue("VerbundArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerbundArt.toXmlCode(value));
  }
  public final static String tag_AusloesungVon="AusloesungVon";
  public String getAusloesungVon() {
    if(getattrvaluecount("AusloesungVon")==0)return null;
    String value=getattrvalue("AusloesungVon");
    return value;
  }
  public void setAusloesungVon(String value) {
    if(value==null){setattrundefined("AusloesungVon");return;}
    setattrvalue("AusloesungVon", value);
  }
  public final static String tag_PumpeVon="PumpeVon";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp getPumpeVon() {
    if(getattrvaluecount("PumpeVon")==0)return null;
    String value=getattrvalue("PumpeVon");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.parseXmlCode(value);
  }
  public void setPumpeVon(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp value) {
    if(value==null){setattrundefined("PumpeVon");return;}
    setattrvalue("PumpeVon", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.toXmlCode(value));
  }
  public final static String tag_VerbindungsleitungVon="VerbindungsleitungVon";
  public Integer getVerbindungsleitungVon() {
    if(getattrvaluecount("VerbindungsleitungVon")==0)return null;
    String value=getattrvalue("VerbindungsleitungVon");
    return Integer.parseInt(value);
  }
  public void setVerbindungsleitungVon(Integer value) {
    if(value==null){setattrundefined("VerbindungsleitungVon");return;}
    setattrvalue("VerbindungsleitungVon", Integer.toString(value));
  }
  public final static String tag_AusloesungNach="AusloesungNach";
  public String getAusloesungNach() {
    if(getattrvaluecount("AusloesungNach")==0)return null;
    String value=getattrvalue("AusloesungNach");
    return value;
  }
  public void setAusloesungNach(String value) {
    if(value==null){setattrundefined("AusloesungNach");return;}
    setattrvalue("AusloesungNach", value);
  }
  public final static String tag_PumpeNach="PumpeNach";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp getPumpeNach() {
    if(getattrvaluecount("PumpeNach")==0)return null;
    String value=getattrvalue("PumpeNach");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.parseXmlCode(value);
  }
  public void setPumpeNach(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp value) {
    if(value==null){setattrundefined("PumpeNach");return;}
    setattrvalue("PumpeNach", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.BooleanTyp.toXmlCode(value));
  }
  public final static String tag_VerbindungsleitungNach="VerbindungsleitungNach";
  public Integer getVerbindungsleitungNach() {
    if(getattrvaluecount("VerbindungsleitungNach")==0)return null;
    String value=getattrvalue("VerbindungsleitungNach");
    return Integer.parseInt(value);
  }
  public void setVerbindungsleitungNach(Integer value) {
    if(value==null){setattrundefined("VerbindungsleitungNach");return;}
    setattrvalue("VerbindungsleitungNach", Integer.toString(value));
  }
  public final static String tag_Bemerkung="Bemerkung";
  public String getBemerkung() {
    if(getattrvaluecount("Bemerkung")==0)return null;
    String value=getattrvalue("Bemerkung");
    return value;
  }
  public void setBemerkung(String value) {
    if(value==null){setattrundefined("Bemerkung");return;}
    setattrvalue("Bemerkung", value);
  }
  public final static String tag_Objekt="Objekt";
  public String getObjekt() {
    if(getattrvaluecount("Objekt")==0)return null;
    String value=getattrvalue("Objekt");
    return value;
  }
  public void setObjekt(String value) {
    if(value==null){setattrundefined("Objekt");return;}
    setattrvalue("Objekt", value);
  }
  public final static String tag_ObjektArt="ObjektArt";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt getObjektArt() {
    if(getattrvaluecount("ObjektArt")==0)return null;
    String value=getattrvalue("ObjektArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt.parseXmlCode(value);
  }
  public void setObjektArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt value) {
    if(value==null){setattrundefined("ObjektArt");return;}
    setattrvalue("ObjektArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObjektArt.toXmlCode(value));
  }
  public final static String tag_MaxDarst="MaxDarst";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung getMaxDarst() {
    if(getattrvaluecount("MaxDarst")==0)return null;
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung value) {
    if(value==null){setattrundefined("MaxDarst");return;}
    setattrvalue("MaxDarst", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Darstellung.toXmlCode(value));
  }
  public final static String tag_MutatDatum="MutatDatum";
  public String getMutatDatum() {
    if(getattrvaluecount("MutatDatum")==0)return null;
    String value=getattrvalue("MutatDatum");
    return value;
  }
  public void setMutatDatum(String value) {
    if(value==null){setattrundefined("MutatDatum");return;}
    setattrvalue("MutatDatum", value);
  }
  public final static String tag_MutatBemerk="MutatBemerk";
  public String getMutatBemerk() {
    if(getattrvaluecount("MutatBemerk")==0)return null;
    String value=getattrvalue("MutatBemerk");
    return value;
  }
  public void setMutatBemerk(String value) {
    if(value==null){setattrundefined("MutatBemerk");return;}
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
