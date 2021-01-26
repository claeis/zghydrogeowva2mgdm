package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class NotLeitung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung";
  public NotLeitung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public int sizeGeometrie() {return getattrvaluecount("Geometrie");}
  public ch.interlis.iom.IomObject getGeometrie() {
    int size=getattrvaluecount("Geometrie");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
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
  public final static String tag_UebergabeOrt="UebergabeOrt";
  public String getUebergabeOrt() {
    if(getattrvaluecount("UebergabeOrt")==0)return null;
    String value=getattrvalue("UebergabeOrt");
    return value;
  }
  public void setUebergabeOrt(String value) {
    if(value==null){setattrundefined("UebergabeOrt");return;}
    setattrvalue("UebergabeOrt", value);
  }
  public final static String tag_VerbundNr="VerbundNr";
  public Integer getVerbundNr() {
    if(getattrvaluecount("VerbundNr")==0)return null;
    String value=getattrvalue("VerbundNr");
    return Integer.parseInt(value);
  }
  public void setVerbundNr(Integer value) {
    if(value==null){setattrundefined("VerbundNr");return;}
    setattrvalue("VerbundNr", Integer.toString(value));
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
  public Boolean getPumpeVon() {
    if(getattrvaluecount("PumpeVon")==0)return null;
    String value=getattrvalue("PumpeVon");
    return value!=null && value.equals("true");
  }
  public void setPumpeVon(Boolean value) {
    if(value==null){setattrundefined("PumpeVon");return;}
    setattrvalue("PumpeVon", value?"true":"false");
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
  public Boolean getPumpeNach() {
    if(getattrvaluecount("PumpeNach")==0)return null;
    String value=getattrvalue("PumpeNach");
    return value!=null && value.equals("true");
  }
  public void setPumpeNach(Boolean value) {
    if(value==null){setattrundefined("PumpeNach");return;}
    setattrvalue("PumpeNach", value?"true":"false");
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
  public NotLeitung_ObjektArt getObjektArt() {
    if(getattrvaluecount("ObjektArt")==0)return null;
    String value=getattrvalue("ObjektArt");
    return NotLeitung_ObjektArt.parseXmlCode(value);
  }
  public void setObjektArt(NotLeitung_ObjektArt value) {
    if(value==null){setattrundefined("ObjektArt");return;}
    setattrvalue("ObjektArt", NotLeitung_ObjektArt.toXmlCode(value));
  }
  public final static String tag_MaxDarst="MaxDarst";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung getMaxDarst() {
    if(getattrvaluecount("MaxDarst")==0)return null;
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung value) {
    if(value==null){setattrundefined("MaxDarst");return;}
    setattrvalue("MaxDarst", ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.toXmlCode(value));
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
