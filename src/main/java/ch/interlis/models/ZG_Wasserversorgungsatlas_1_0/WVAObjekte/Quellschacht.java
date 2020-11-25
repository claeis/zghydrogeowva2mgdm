package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Quellschacht extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht";
  public Quellschacht(String oid) {
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
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QWFSchachtTyp.toXmlCode(value));
  }
  public final static String tag_EtragBrst="EtragBrst";
  public String getEtragBrst() {
    if(getattrvaluecount("EtragBrst")==0)return null;
    String value=getattrvalue("EtragBrst");
    return value;
  }
  public void setEtragBrst(String value) {
    if(value==null){setattrundefined("EtragBrst");return;}
    setattrvalue("EtragBrst", value);
  }
  public final static String tag_ErtragGrp="ErtragGrp";
  public String getErtragGrp() {
    if(getattrvaluecount("ErtragGrp")==0)return null;
    String value=getattrvalue("ErtragGrp");
    return value;
  }
  public void setErtragGrp(String value) {
    if(value==null){setattrundefined("ErtragGrp");return;}
    setattrvalue("ErtragGrp", value);
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
  public final static String tag_HydWidder="HydWidder";
  public String getHydWidder() {
    ch.interlis.iom.IomObject value=getattrobj("HydWidder",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setHydWidder(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("HydWidder","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_LaufBrunnen="LaufBrunnen";
  public String getLaufBrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("LaufBrunnen",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLaufBrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LaufBrunnen","REF");
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
  public final static String tag_Pumpwerk="Pumpwerk";
  public String getPumpwerk() {
    ch.interlis.iom.IomObject value=getattrobj("Pumpwerk",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPumpwerk(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Pumpwerk","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Reservoir="Reservoir";
  public String getReservoir() {
    ch.interlis.iom.IomObject value=getattrobj("Reservoir",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setReservoir(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Reservoir","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Sammelschacht="Sammelschacht";
  public String getSammelschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Sammelschacht",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSammelschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Sammelschacht","REF");
    structvalue.setobjectrefoid(oid);
  }
}
