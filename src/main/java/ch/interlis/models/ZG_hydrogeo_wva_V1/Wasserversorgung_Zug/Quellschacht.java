package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Quellschacht extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht";
  public Quellschacht(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_hydrogeo_wva_V1.QWFSchachtTyp.toXmlCode(value));
  }
  public final static String tag_QWFassungsArt="QWFassungsArt";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt getQWFassungsArt() {
    if(getattrvaluecount("QWFassungsArt")==0)return null;
    String value=getattrvalue("QWFassungsArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.parseXmlCode(value);
  }
  public void setQWFassungsArt(ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt value) {
    if(value==null){setattrundefined("QWFassungsArt");return;}
    setattrvalue("QWFassungsArt", ch.interlis.models.ZG_hydrogeo_wva_V1.QWFassungsArt.toXmlCode(value));
  }
  public final static String tag_ObjNrAfu="ObjNrAfu";
  public String getObjNrAfu() {
    if(getattrvaluecount("ObjNrAfu")==0)return null;
    String value=getattrvalue("ObjNrAfu");
    return value;
  }
  public void setObjNrAfu(String value) {
    if(value==null){setattrundefined("ObjNrAfu");return;}
    setattrvalue("ObjNrAfu", value);
  }
  public final static String tag_QwfNrAfu_Intranet2Pos="QwfNrAfu_Intranet2Pos";
  public int sizeQwfNrAfu_Intranet2Pos() {return getattrvaluecount("QwfNrAfu_Intranet2Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getQwfNrAfu_Intranet2Pos() {
    int size=getattrvaluecount("QwfNrAfu_Intranet2Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("QwfNrAfu_Intranet2Pos",0);
    return value;
  }
  public void setQwfNrAfu_Intranet2Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("QwfNrAfu_Intranet2Pos")>0){
      changeattrobj("QwfNrAfu_Intranet2Pos",0, value);
    }else{
      addattrobj("QwfNrAfu_Intranet2Pos", value);
    }
  }
  public final static String tag_QwfNrAfu_Intranet5Pos="QwfNrAfu_Intranet5Pos";
  public int sizeQwfNrAfu_Intranet5Pos() {return getattrvaluecount("QwfNrAfu_Intranet5Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getQwfNrAfu_Intranet5Pos() {
    int size=getattrvaluecount("QwfNrAfu_Intranet5Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("QwfNrAfu_Intranet5Pos",0);
    return value;
  }
  public void setQwfNrAfu_Intranet5Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("QwfNrAfu_Intranet5Pos")>0){
      changeattrobj("QwfNrAfu_Intranet5Pos",0, value);
    }else{
      addattrobj("QwfNrAfu_Intranet5Pos", value);
    }
  }
  public final static String tag_QwfMenge_Karte25Pos="QwfMenge_Karte25Pos";
  public int sizeQwfMenge_Karte25Pos() {return getattrvaluecount("QwfMenge_Karte25Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos getQwfMenge_Karte25Pos() {
    int size=getattrvaluecount("QwfMenge_Karte25Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos)getattrobj("QwfMenge_Karte25Pos",0);
    return value;
  }
  public void setQwfMenge_Karte25Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos value) {
    if(getattrvaluecount("QwfMenge_Karte25Pos")>0){
      changeattrobj("QwfMenge_Karte25Pos",0, value);
    }else{
      addattrobj("QwfMenge_Karte25Pos", value);
    }
  }
  public final static String tag_EigentumArt="EigentumArt";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt getEigentumArt() {
    if(getattrvaluecount("EigentumArt")==0)return null;
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt value) {
    if(value==null){setattrundefined("EigentumArt");return;}
    setattrvalue("EigentumArt", ch.interlis.models.ZG_hydrogeo_wva_V1.EigentumArt.toXmlCode(value));
  }
  public final static String tag_PrivatNutzer="PrivatNutzer";
  public String getPrivatNutzer() {
    if(getattrvaluecount("PrivatNutzer")==0)return null;
    String value=getattrvalue("PrivatNutzer");
    return value;
  }
  public void setPrivatNutzer(String value) {
    if(value==null){setattrundefined("PrivatNutzer");return;}
    setattrvalue("PrivatNutzer", value);
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
  public final static String tag_ErtragMinAng="ErtragMinAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMinAng() {
    if(getattrvaluecount("ErtragMinAng")==0)return null;
    String value=getattrvalue("ErtragMinAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMinAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMinAng");return;}
    setattrvalue("ErtragMinAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_ErtragMaxAng="ErtragMaxAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMaxAng() {
    if(getattrvaluecount("ErtragMaxAng")==0)return null;
    String value=getattrvalue("ErtragMaxAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMaxAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMaxAng");return;}
    setattrvalue("ErtragMaxAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_ErtragMittlAng="ErtragMittlAng";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben getErtragMittlAng() {
    if(getattrvaluecount("ErtragMittlAng")==0)return null;
    String value=getattrvalue("ErtragMittlAng");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.parseXmlCode(value);
  }
  public void setErtragMittlAng(ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben value) {
    if(value==null){setattrundefined("ErtragMittlAng");return;}
    setattrvalue("ErtragMittlAng", ch.interlis.models.ZG_hydrogeo_wva_V1.ErtragAngaben.toXmlCode(value));
  }
  public final static String tag_WqualiBemerkung="WqualiBemerkung";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet getWqualiBemerkung() {
    if(getattrvaluecount("WqualiBemerkung")==0)return null;
    String value=getattrvalue("WqualiBemerkung");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.parseXmlCode(value);
  }
  public void setWqualiBemerkung(ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet value) {
    if(value==null){setattrundefined("WqualiBemerkung");return;}
    setattrvalue("WqualiBemerkung", ch.interlis.models.ZG_hydrogeo_wva_V1.WasserQualitaet.toXmlCode(value));
  }
  public final static String tag_SchzNr="SchzNr";
  public Integer getSchzNr() {
    if(getattrvaluecount("SchzNr")==0)return null;
    String value=getattrvalue("SchzNr");
    return Integer.parseInt(value);
  }
  public void setSchzNr(Integer value) {
    if(value==null){setattrundefined("SchzNr");return;}
    setattrvalue("SchzNr", Integer.toString(value));
  }
  public final static String tag_SchzPflicht="SchzPflicht";
  public Boolean getSchzPflicht() {
    if(getattrvaluecount("SchzPflicht")==0)return null;
    String value=getattrvalue("SchzPflicht");
    return value!=null && value.equals("true");
  }
  public void setSchzPflicht(Boolean value) {
    if(value==null){setattrundefined("SchzPflicht");return;}
    setattrvalue("SchzPflicht", value?"true":"false");
  }
  public final static String tag_SchzGutachten="SchzGutachten";
  public Boolean getSchzGutachten() {
    if(getattrvaluecount("SchzGutachten")==0)return null;
    String value=getattrvalue("SchzGutachten");
    return value!=null && value.equals("true");
  }
  public void setSchzGutachten(Boolean value) {
    if(value==null){setattrundefined("SchzGutachten");return;}
    setattrvalue("SchzGutachten", value?"true":"false");
  }
  public final static String tag_SchzGutAutor="SchzGutAutor";
  public String getSchzGutAutor() {
    if(getattrvaluecount("SchzGutAutor")==0)return null;
    String value=getattrvalue("SchzGutAutor");
    return value;
  }
  public void setSchzGutAutor(String value) {
    if(value==null){setattrundefined("SchzGutAutor");return;}
    setattrvalue("SchzGutAutor", value);
  }
  public final static String tag_SchzGutDatum="SchzGutDatum";
  public String getSchzGutDatum() {
    if(getattrvaluecount("SchzGutDatum")==0)return null;
    String value=getattrvalue("SchzGutDatum");
    return value;
  }
  public void setSchzGutDatum(String value) {
    if(value==null){setattrundefined("SchzGutDatum");return;}
    setattrvalue("SchzGutDatum", value);
  }
  public final static String tag_Nachfuehrungsstand="Nachfuehrungsstand";
  public String getNachfuehrungsstand() {
    if(getattrvaluecount("Nachfuehrungsstand")==0)return null;
    String value=getattrvalue("Nachfuehrungsstand");
    return value;
  }
  public void setNachfuehrungsstand(String value) {
    if(value==null){setattrundefined("Nachfuehrungsstand");return;}
    setattrvalue("Nachfuehrungsstand", value);
  }
  public final static String tag_Auskunftsstelle="Auskunftsstelle";
  public String getAuskunftsstelle() {
    if(getattrvaluecount("Auskunftsstelle")==0)return null;
    String value=getattrvalue("Auskunftsstelle");
    return value;
  }
  public void setAuskunftsstelle(String value) {
    if(value==null){setattrundefined("Auskunftsstelle");return;}
    setattrvalue("Auskunftsstelle", value);
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
  public final static String tag_HoeheTerrain="HoeheTerrain";
  public Double getHoeheTerrain() {
    if(getattrvaluecount("HoeheTerrain")==0)return null;
    String value=getattrvalue("HoeheTerrain");
    return Double.parseDouble(value);
  }
  public void setHoeheTerrain(Double value) {
    if(value==null){setattrundefined("HoeheTerrain");return;}
    setattrvalue("HoeheTerrain", Double.toString(value));
  }
  public final static String tag_HoeheAuslauf="HoeheAuslauf";
  public Double getHoeheAuslauf() {
    if(getattrvaluecount("HoeheAuslauf")==0)return null;
    String value=getattrvalue("HoeheAuslauf");
    return Double.parseDouble(value);
  }
  public void setHoeheAuslauf(Double value) {
    if(value==null){setattrundefined("HoeheAuslauf");return;}
    setattrvalue("HoeheAuslauf", Double.toString(value));
  }
  public final static String tag_ErtragBrst="ErtragBrst";
  public String getErtragBrst() {
    if(getattrvaluecount("ErtragBrst")==0)return null;
    String value=getattrvalue("ErtragBrst");
    return value;
  }
  public void setErtragBrst(String value) {
    if(value==null){setattrundefined("ErtragBrst");return;}
    setattrvalue("ErtragBrst", value);
  }
  public final static String tag_ErtragBrstTextPos="ErtragBrstTextPos";
  public int sizeErtragBrstTextPos() {return getattrvaluecount("ErtragBrstTextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getErtragBrstTextPos() {
    int size=getattrvaluecount("ErtragBrstTextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("ErtragBrstTextPos",0);
    return value;
  }
  public void setErtragBrstTextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("ErtragBrstTextPos")>0){
      changeattrobj("ErtragBrstTextPos",0, value);
    }else{
      addattrobj("ErtragBrstTextPos", value);
    }
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
  public final static String tag_ErtragGrpTextPos="ErtragGrpTextPos";
  public int sizeErtragGrpTextPos() {return getattrvaluecount("ErtragGrpTextPos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos getErtragGrpTextPos() {
    int size=getattrvaluecount("ErtragGrpTextPos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos)getattrobj("ErtragGrpTextPos",0);
    return value;
  }
  public void setErtragGrpTextPos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos value) {
    if(getattrvaluecount("ErtragGrpTextPos")>0){
      changeattrobj("ErtragGrpTextPos",0, value);
    }else{
      addattrobj("ErtragGrpTextPos", value);
    }
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
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt getDetailplanArt() {
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanDatum="DetailplanDatum";
  public String getDetailplanDatum() {
    if(getattrvaluecount("DetailplanDatum")==0)return null;
    String value=getattrvalue("DetailplanDatum");
    return value;
  }
  public void setDetailplanDatum(String value) {
    if(value==null){setattrundefined("DetailplanDatum");return;}
    setattrvalue("DetailplanDatum", value);
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_hydrogeo_wva_V1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft getDetailplanHerkunft() {
    if(getattrvaluecount("DetailplanHerkunft")==0)return null;
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft value) {
    if(value==null){setattrundefined("DetailplanHerkunft");return;}
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlHerkunft.toXmlCode(value));
  }
  public final static String tag_DetailplanNr="DetailplanNr";
  public String getDetailplanNr() {
    if(getattrvaluecount("DetailplanNr")==0)return null;
    String value=getattrvalue("DetailplanNr");
    return value;
  }
  public void setDetailplanNr(String value) {
    if(value==null){setattrundefined("DetailplanNr");return;}
    setattrvalue("DetailplanNr", value);
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
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_hydrogeo_wva_V1.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk getErfVorlBemerk() {
    if(getattrvaluecount("ErfVorlBemerk")==0)return null;
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk value) {
    if(value==null){setattrundefined("ErfVorlBemerk");return;}
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_hydrogeo_wva_V1.ErfVorlBemerk.toXmlCode(value));
  }
  public final static String tag_QkatPlanNr="QkatPlanNr";
  public Integer getQkatPlanNr() {
    if(getattrvaluecount("QkatPlanNr")==0)return null;
    String value=getattrvalue("QkatPlanNr");
    return Integer.parseInt(value);
  }
  public void setQkatPlanNr(Integer value) {
    if(value==null){setattrundefined("QkatPlanNr");return;}
    setattrvalue("QkatPlanNr", Integer.toString(value));
  }
  public final static String tag_GrundstNr="GrundstNr";
  public String getGrundstNr() {
    if(getattrvaluecount("GrundstNr")==0)return null;
    String value=getattrvalue("GrundstNr");
    return value;
  }
  public void setGrundstNr(String value) {
    if(value==null){setattrundefined("GrundstNr");return;}
    setattrvalue("GrundstNr", value);
  }
  public final static String tag_KontaktDatum="KontaktDatum";
  public String getKontaktDatum() {
    if(getattrvaluecount("KontaktDatum")==0)return null;
    String value=getattrvalue("KontaktDatum");
    return value;
  }
  public void setKontaktDatum(String value) {
    if(value==null){setattrundefined("KontaktDatum");return;}
    setattrvalue("KontaktDatum", value);
  }
  public final static String tag_Verwendungszweck="Verwendungszweck";
  public int sizeVerwendungszweck() {return getattrvaluecount("Verwendungszweck");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Texte getVerwendungszweck() {
    int size=getattrvaluecount("Verwendungszweck");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Texte value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Texte)getattrobj("Verwendungszweck",0);
    return value;
  }
  public void setVerwendungszweck(ch.interlis.models.ZG_hydrogeo_wva_V1.Texte value) {
    if(getattrvaluecount("Verwendungszweck")>0){
      changeattrobj("Verwendungszweck",0, value);
    }else{
      addattrobj("Verwendungszweck", value);
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
  public final static String tag_FassungsEigentuemer="FassungsEigentuemer";
  public String getFassungsEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("FassungsEigentuemer",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setFassungsEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("FassungsEigentuemer",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("FassungsEigentuemer","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("FassungsEigentuemer",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_GrundEigentuemer="GrundEigentuemer";
  public String getGrundEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("GrundEigentuemer",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setGrundEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("GrundEigentuemer",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("GrundEigentuemer","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("GrundEigentuemer",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_KontaktPerson="KontaktPerson";
  public String getKontaktPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontaktPerson",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setKontaktPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("KontaktPerson",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("KontaktPerson","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("KontaktPerson",0);
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
