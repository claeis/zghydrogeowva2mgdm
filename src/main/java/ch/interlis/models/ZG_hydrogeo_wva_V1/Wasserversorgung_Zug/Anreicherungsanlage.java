package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Anreicherungsanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage";
  public Anreicherungsanlage(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Typ="Typ";
  public Anreicherungsanlage_Typ getTyp() {
    String value=getattrvalue("Typ");
    return Anreicherungsanlage_Typ.parseXmlCode(value);
  }
  public void setTyp(Anreicherungsanlage_Typ value) {
    setattrvalue("Typ", Anreicherungsanlage_Typ.toXmlCode(value));
  }
  public final static String tag_Typ_Bemerkung="Typ_Bemerkung";
  public String getTyp_Bemerkung() {
    if(getattrvaluecount("Typ_Bemerkung")==0)return null;
    String value=getattrvalue("Typ_Bemerkung");
    return value;
  }
  public void setTyp_Bemerkung(String value) {
    if(value==null){setattrundefined("Typ_Bemerkung");return;}
    setattrvalue("Typ_Bemerkung", value);
  }
  public final static String tag_Max_Versickerung="Max_Versickerung";
  public Double getMax_Versickerung() {
    if(getattrvaluecount("Max_Versickerung")==0)return null;
    String value=getattrvalue("Max_Versickerung");
    return Double.parseDouble(value);
  }
  public void setMax_Versickerung(Double value) {
    if(value==null){setattrundefined("Max_Versickerung");return;}
    setattrvalue("Max_Versickerung", Double.toString(value));
  }
  public final static String tag_Bezugsgewaesser="Bezugsgewaesser";
  public String getBezugsgewaesser() {
    if(getattrvaluecount("Bezugsgewaesser")==0)return null;
    String value=getattrvalue("Bezugsgewaesser");
    return value;
  }
  public void setBezugsgewaesser(String value) {
    if(value==null){setattrundefined("Bezugsgewaesser");return;}
    setattrvalue("Bezugsgewaesser", value);
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    if(getattrvaluecount("Zweck")==0)return null;
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    if(value==null){setattrundefined("Zweck");return;}
    setattrvalue("Zweck", value);
  }
  public final static String tag_GeometriePunkt="GeometriePunkt";
  public int sizeGeometriePunkt() {return getattrvaluecount("GeometriePunkt");}
  public ch.interlis.iom.IomObject getGeometriePunkt() {
    int size=getattrvaluecount("GeometriePunkt");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("GeometriePunkt",0);
    return value;
  }
  public void setGeometriePunkt(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("GeometriePunkt")>0){
      changeattrobj("GeometriePunkt",0, value);
    }else{
      addattrobj("GeometriePunkt", value);
    }
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
  public final static String tag_AnrNrAfu_Intranet2Pos="AnrNrAfu_Intranet2Pos";
  public int sizeAnrNrAfu_Intranet2Pos() {return getattrvaluecount("AnrNrAfu_Intranet2Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getAnrNrAfu_Intranet2Pos() {
    int size=getattrvaluecount("AnrNrAfu_Intranet2Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("AnrNrAfu_Intranet2Pos",0);
    return value;
  }
  public void setAnrNrAfu_Intranet2Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("AnrNrAfu_Intranet2Pos")>0){
      changeattrobj("AnrNrAfu_Intranet2Pos",0, value);
    }else{
      addattrobj("AnrNrAfu_Intranet2Pos", value);
    }
  }
  public final static String tag_AnrNrAfu_Intranet5Pos="AnrNrAfu_Intranet5Pos";
  public int sizeAnrNrAfu_Intranet5Pos() {return getattrvaluecount("AnrNrAfu_Intranet5Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getAnrNrAfu_Intranet5Pos() {
    int size=getattrvaluecount("AnrNrAfu_Intranet5Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("AnrNrAfu_Intranet5Pos",0);
    return value;
  }
  public void setAnrNrAfu_Intranet5Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("AnrNrAfu_Intranet5Pos")>0){
      changeattrobj("AnrNrAfu_Intranet5Pos",0, value);
    }else{
      addattrobj("AnrNrAfu_Intranet5Pos", value);
    }
  }
  public final static String tag_Bewilligungsdatum="Bewilligungsdatum";
  public String getBewilligungsdatum() {
    if(getattrvaluecount("Bewilligungsdatum")==0)return null;
    String value=getattrvalue("Bewilligungsdatum");
    return value;
  }
  public void setBewilligungsdatum(String value) {
    if(value==null){setattrundefined("Bewilligungsdatum");return;}
    setattrvalue("Bewilligungsdatum", value);
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
  public final static String tag_AuskunftsStelle="AuskunftsStelle";
  public String getAuskunftsStelle() {
    if(getattrvaluecount("AuskunftsStelle")==0)return null;
    String value=getattrvalue("AuskunftsStelle");
    return value;
  }
  public void setAuskunftsStelle(String value) {
    if(value==null){setattrundefined("AuskunftsStelle");return;}
    setattrvalue("AuskunftsStelle", value);
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
