package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Foerderanlage extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage";
  public Foerderanlage(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_FoerderanlageArt="FoerderanlageArt";
  public Foerderanlage_FoerderanlageArt getFoerderanlageArt() {
    if(getattrvaluecount("FoerderanlageArt")==0)return null;
    String value=getattrvalue("FoerderanlageArt");
    return Foerderanlage_FoerderanlageArt.parseXmlCode(value);
  }
  public void setFoerderanlageArt(Foerderanlage_FoerderanlageArt value) {
    if(value==null){setattrundefined("FoerderanlageArt");return;}
    setattrvalue("FoerderanlageArt", Foerderanlage_FoerderanlageArt.toXmlCode(value));
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
  public Double getSymbolRot() {
    if(getattrvaluecount("SymbolRot")==0)return null;
    String value=getattrvalue("SymbolRot");
    return Double.parseDouble(value);
  }
  public void setSymbolRot(Double value) {
    if(value==null){setattrundefined("SymbolRot");return;}
    setattrvalue("SymbolRot", Double.toString(value));
  }
  public final static String tag_Farbe="Farbe";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe getFarbe() {
    if(getattrvaluecount("Farbe")==0)return null;
    String value=getattrvalue("Farbe");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.parseXmlCode(value);
  }
  public void setFarbe(ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe value) {
    if(value==null){setattrundefined("Farbe");return;}
    setattrvalue("Farbe", ch.interlis.models.ZG_hydrogeo_wva_V1.Farbe.toXmlCode(value));
  }
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt getBetriebsart() {
    if(getattrvaluecount("Betriebsart")==0)return null;
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt value) {
    if(value==null){setattrundefined("Betriebsart");return;}
    setattrvalue("Betriebsart", ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_Nutzungsart="Nutzungsart";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart getNutzungsart() {
    if(getattrvaluecount("Nutzungsart")==0)return null;
    String value=getattrvalue("Nutzungsart");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart.parseXmlCode(value);
  }
  public void setNutzungsart(ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart value) {
    if(value==null){setattrundefined("Nutzungsart");return;}
    setattrvalue("Nutzungsart", ch.interlis.models.ZG_hydrogeo_wva_V1.Nutzungsart.toXmlCode(value));
  }
  public final static String tag_TotFoerdermenge="TotFoerdermenge";
  public Integer getTotFoerdermenge() {
    if(getattrvaluecount("TotFoerdermenge")==0)return null;
    String value=getattrvalue("TotFoerdermenge");
    return Integer.parseInt(value);
  }
  public void setTotFoerdermenge(Integer value) {
    if(value==null){setattrundefined("TotFoerdermenge");return;}
    setattrvalue("TotFoerdermenge", Integer.toString(value));
  }
  public final static String tag_NameTextPos="NameTextPos";
  public int sizeNameTextPos() {return getattrvaluecount("NameTextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getNameTextPos() {
    int size=getattrvaluecount("NameTextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("NameTextPos",0);
    return value;
  }
  public void setNameTextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("NameTextPos")>0){
      changeattrobj("NameTextPos",0, value);
    }else{
      addattrobj("NameTextPos", value);
    }
  }
  public final static String tag_Techdata="Techdata";
  public String getTechdata() {
    if(getattrvaluecount("Techdata")==0)return null;
    String value=getattrvalue("Techdata");
    return value;
  }
  public void setTechdata(String value) {
    if(value==null){setattrundefined("Techdata");return;}
    setattrvalue("Techdata", value);
  }
  public final static String tag_TechdataTextPos="TechdataTextPos";
  public int sizeTechdataTextPos() {return getattrvaluecount("TechdataTextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getTechdataTextPos() {
    int size=getattrvaluecount("TechdataTextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("TechdataTextPos",0);
    return value;
  }
  public void setTechdataTextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("TechdataTextPos")>0){
      changeattrobj("TechdataTextPos",0, value);
    }else{
      addattrobj("TechdataTextPos", value);
    }
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
  public final static String tag_Techdata1TextPos="Techdata1TextPos";
  public int sizeTechdata1TextPos() {return getattrvaluecount("Techdata1TextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getTechdata1TextPos() {
    int size=getattrvaluecount("Techdata1TextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("Techdata1TextPos",0);
    return value;
  }
  public void setTechdata1TextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("Techdata1TextPos")>0){
      changeattrobj("Techdata1TextPos",0, value);
    }else{
      addattrobj("Techdata1TextPos", value);
    }
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
  public final static String tag_Techdata2TextPos="Techdata2TextPos";
  public int sizeTechdata2TextPos() {return getattrvaluecount("Techdata2TextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getTechdata2TextPos() {
    int size=getattrvaluecount("Techdata2TextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("Techdata2TextPos",0);
    return value;
  }
  public void setTechdata2TextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("Techdata2TextPos")>0){
      changeattrobj("Techdata2TextPos",0, value);
    }else{
      addattrobj("Techdata2TextPos", value);
    }
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
  public final static String tag_Techdata3TextPos="Techdata3TextPos";
  public int sizeTechdata3TextPos() {return getattrvaluecount("Techdata3TextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getTechdata3TextPos() {
    int size=getattrvaluecount("Techdata3TextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("Techdata3TextPos",0);
    return value;
  }
  public void setTechdata3TextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("Techdata3TextPos")>0){
      changeattrobj("Techdata3TextPos",0, value);
    }else{
      addattrobj("Techdata3TextPos", value);
    }
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
  public final static String tag_Techdata4TextPos="Techdata4TextPos";
  public int sizeTechdata4TextPos() {return getattrvaluecount("Techdata4TextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getTechdata4TextPos() {
    int size=getattrvaluecount("Techdata4TextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("Techdata4TextPos",0);
    return value;
  }
  public void setTechdata4TextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("Techdata4TextPos")>0){
      changeattrobj("Techdata4TextPos",0, value);
    }else{
      addattrobj("Techdata4TextPos", value);
    }
  }
  public final static String tag_Notversorgung="Notversorgung";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung getNotversorgung() {
    if(getattrvaluecount("Notversorgung")==0)return null;
    String value=getattrvalue("Notversorgung");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.parseXmlCode(value);
  }
  public void setNotversorgung(ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung value) {
    if(value==null){setattrundefined("Notversorgung");return;}
    setattrvalue("Notversorgung", ch.interlis.models.ZG_hydrogeo_wva_V1.Notversorgung.toXmlCode(value));
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton getKanton() {
    if(getattrvaluecount("Kanton")==0)return null;
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton value) {
    if(value==null){setattrundefined("Kanton");return;}
    setattrvalue("Kanton", ch.interlis.models.ZG_hydrogeo_wva_V1.Kanton.toXmlCode(value));
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
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung getMaxDarst() {
    if(getattrvaluecount("MaxDarst")==0)return null;
    String value=getattrvalue("MaxDarst");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.parseXmlCode(value);
  }
  public void setMaxDarst(ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung value) {
    if(value==null){setattrundefined("MaxDarst");return;}
    setattrvalue("MaxDarst", ch.interlis.models.ZG_hydrogeo_wva_V1.Darstellung.toXmlCode(value));
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
  public final static String tag_EinzelFoerdermenge="EinzelFoerdermenge";
  public int sizeEinzelFoerdermenge() {return getattrvaluecount("EinzelFoerdermenge");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Zahlen getEinzelFoerdermenge() {
    int size=getattrvaluecount("EinzelFoerdermenge");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Zahlen value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Zahlen)getattrobj("EinzelFoerdermenge",0);
    return value;
  }
  public void setEinzelFoerdermenge(ch.interlis.models.ZG_hydrogeo_wva_V1.Zahlen value) {
    if(getattrvaluecount("EinzelFoerdermenge")>0){
      changeattrobj("EinzelFoerdermenge",0, value);
    }else{
      addattrobj("EinzelFoerdermenge", value);
    }
  }
  public final static String tag_Dateireferenz="Dateireferenz";
  public int sizeDateireferenz() {return getattrvaluecount("Dateireferenz");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Datei[] getDateireferenz() {
    int size=getattrvaluecount("Dateireferenz");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Datei value[]=new ch.interlis.models.ZG_hydrogeo_wva_V1.Datei[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.ZG_hydrogeo_wva_V1.Datei)getattrobj("Dateireferenz",i);
    }
    return value;
  }
  public void addDateireferenz(ch.interlis.models.ZG_hydrogeo_wva_V1.Datei value) {
    addattrobj("Dateireferenz", value);
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
  public final static String tag_Reservoir="Reservoir";
  public String getReservoir() {
    ch.interlis.iom.IomObject value=getattrobj("Reservoir",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setReservoir(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Reservoir",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Reservoir","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Reservoir",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
