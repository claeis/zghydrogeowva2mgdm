package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class BautenGW extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW";
  public BautenGW(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lage_Punkt="Lage_Punkt";
  public int sizeLage_Punkt() {return getattrvaluecount("Lage_Punkt");}
  public ch.interlis.iom.IomObject getLage_Punkt() {
    int size=getattrvaluecount("Lage_Punkt");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Lage_Punkt",0);
    return value;
  }
  public void setLage_Punkt(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Lage_Punkt")>0){
      changeattrobj("Lage_Punkt",0, value);
    }else{
      addattrobj("Lage_Punkt", value);
    }
  }
  public final static String tag_Lage_Flaeche="Lage_Flaeche";
  public int sizeLage_Flaeche() {return getattrvaluecount("Lage_Flaeche");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.MultiSurface getLage_Flaeche() {
    int size=getattrvaluecount("Lage_Flaeche");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.MultiSurface value=(ch.interlis.models.ZG_hydrogeo_wva_V1.MultiSurface)getattrobj("Lage_Flaeche",0);
    return value;
  }
  public void setLage_Flaeche(ch.interlis.models.ZG_hydrogeo_wva_V1.MultiSurface value) {
    if(getattrvaluecount("Lage_Flaeche")>0){
      changeattrobj("Lage_Flaeche",0, value);
    }else{
      addattrobj("Lage_Flaeche", value);
    }
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_hydrogeo_wva_V1.BautenGWTyp.toXmlCode(value));
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
  public final static String tag_BgwNrAfu_Intranet2Pos="BgwNrAfu_Intranet2Pos";
  public int sizeBgwNrAfu_Intranet2Pos() {return getattrvaluecount("BgwNrAfu_Intranet2Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getBgwNrAfu_Intranet2Pos() {
    int size=getattrvaluecount("BgwNrAfu_Intranet2Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("BgwNrAfu_Intranet2Pos",0);
    return value;
  }
  public void setBgwNrAfu_Intranet2Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("BgwNrAfu_Intranet2Pos")>0){
      changeattrobj("BgwNrAfu_Intranet2Pos",0, value);
    }else{
      addattrobj("BgwNrAfu_Intranet2Pos", value);
    }
  }
  public final static String tag_BgwNrAfu_Intranet5Pos="BgwNrAfu_Intranet5Pos";
  public int sizeBgwNrAfu_Intranet5Pos() {return getattrvaluecount("BgwNrAfu_Intranet5Pos");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos getBgwNrAfu_Intranet5Pos() {
    int size=getattrvaluecount("BgwNrAfu_Intranet5Pos");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value=(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos)getattrobj("BgwNrAfu_Intranet5Pos",0);
    return value;
  }
  public void setBgwNrAfu_Intranet5Pos(ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos value) {
    if(getattrvaluecount("BgwNrAfu_Intranet5Pos")>0){
      changeattrobj("BgwNrAfu_Intranet5Pos",0, value);
    }else{
      addattrobj("BgwNrAfu_Intranet5Pos", value);
    }
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
  public final static String tag_Bemerkungen="Bemerkungen";
  public String getBemerkungen() {
    if(getattrvaluecount("Bemerkungen")==0)return null;
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    if(value==null){setattrundefined("Bemerkungen");return;}
    setattrvalue("Bemerkungen", value);
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
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
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
  public final static String tag_AnlageEigentuemer="AnlageEigentuemer";
  public String getAnlageEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("AnlageEigentuemer",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setAnlageEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("AnlageEigentuemer",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("AnlageEigentuemer","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("AnlageEigentuemer",0);
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
  public final static String tag_KontakPerson="KontakPerson";
  public String getKontakPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontakPerson",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setKontakPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("KontakPerson",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("KontakPerson","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("KontakPerson",0);
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
