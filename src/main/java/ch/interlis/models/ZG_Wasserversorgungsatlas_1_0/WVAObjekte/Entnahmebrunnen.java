package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Entnahmebrunnen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen";
  public Entnahmebrunnen(String oid) {
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
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenTyp.toXmlCode(value));
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
  public final static String tag_Techdata1="Techdata1";
  public String getTechdata1() {
    if(getattrvaluecount("Techdata1")==0)return null;
    String value=getattrvalue("Techdata1");
    return value;
  }
  public void setTechdata1(String value) {
    if(value==null){setattrundefined("Techdata1");return;}
    setattrvalue("Techdata1", value);
  }
  public final static String tag_Techdata2="Techdata2";
  public String getTechdata2() {
    if(getattrvaluecount("Techdata2")==0)return null;
    String value=getattrvalue("Techdata2");
    return value;
  }
  public void setTechdata2(String value) {
    if(value==null){setattrundefined("Techdata2");return;}
    setattrvalue("Techdata2", value);
  }
  public final static String tag_Techdata3="Techdata3";
  public String getTechdata3() {
    if(getattrvaluecount("Techdata3")==0)return null;
    String value=getattrvalue("Techdata3");
    return value;
  }
  public void setTechdata3(String value) {
    if(value==null){setattrundefined("Techdata3");return;}
    setattrvalue("Techdata3", value);
  }
  public final static String tag_Techdata4="Techdata4";
  public String getTechdata4() {
    if(getattrvaluecount("Techdata4")==0)return null;
    String value=getattrvalue("Techdata4");
    return value;
  }
  public void setTechdata4(String value) {
    if(value==null){setattrundefined("Techdata4");return;}
    setattrvalue("Techdata4", value);
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
