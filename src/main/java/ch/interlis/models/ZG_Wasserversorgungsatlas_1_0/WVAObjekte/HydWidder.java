package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class HydWidder extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder";
  public HydWidder(String oid) {
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
    if(getattrvaluecount("Name")==0)return null;
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    if(value==null){setattrundefined("Name");return;}
    setattrvalue("Name", value);
  }
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt getBetriebsart() {
    if(getattrvaluecount("Betriebsart")==0)return null;
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt value) {
    if(value==null){setattrundefined("Betriebsart");return;}
    setattrvalue("Betriebsart", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_Nutzungsart="Nutzungsart";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart getNutzungsart() {
    if(getattrvaluecount("Nutzungsart")==0)return null;
    String value=getattrvalue("Nutzungsart");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.parseXmlCode(value);
  }
  public void setNutzungsart(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart value) {
    if(value==null){setattrundefined("Nutzungsart");return;}
    setattrvalue("Nutzungsart", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Nutzungsart.toXmlCode(value));
  }
  public final static String tag_Notversorgung="Notversorgung";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung getNotversorgung() {
    if(getattrvaluecount("Notversorgung")==0)return null;
    String value=getattrvalue("Notversorgung");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.parseXmlCode(value);
  }
  public void setNotversorgung(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung value) {
    if(value==null){setattrundefined("Notversorgung");return;}
    setattrvalue("Notversorgung", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Notversorgung.toXmlCode(value));
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton getKanton() {
    if(getattrvaluecount("Kanton")==0)return null;
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton value) {
    if(value==null){setattrundefined("Kanton");return;}
    setattrvalue("Kanton", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Kanton.toXmlCode(value));
  }
  public final static String tag_GdeNrBFS="GdeNrBFS";
  public Integer getGdeNrBFS() {
    if(getattrvaluecount("GdeNrBFS")==0)return null;
    String value=getattrvalue("GdeNrBFS");
    return Integer.parseInt(value);
  }
  public void setGdeNrBFS(Integer value) {
    if(value==null){setattrundefined("GdeNrBFS");return;}
    setattrvalue("GdeNrBFS", Integer.toString(value));
  }
  public final static String tag_Lokalitaet="Lokalitaet";
  public String getLokalitaet() {
    if(getattrvaluecount("Lokalitaet")==0)return null;
    String value=getattrvalue("Lokalitaet");
    return value;
  }
  public void setLokalitaet(String value) {
    if(value==null){setattrundefined("Lokalitaet");return;}
    setattrvalue("Lokalitaet", value);
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
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGrundlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Grundlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Grundlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Grundlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_MutatPerson="MutatPerson";
  public String getMutatPerson() {
    ch.interlis.iom.IomObject value=getattrobj("MutatPerson",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setMutatPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("MutatPerson",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("MutatPerson","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("MutatPerson",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
