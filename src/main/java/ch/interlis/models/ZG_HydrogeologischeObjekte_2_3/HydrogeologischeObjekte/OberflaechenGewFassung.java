package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class OberflaechenGewFassung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung";
  public OberflaechenGewFassung(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lage="Lage";
  public int sizeLage() {return getattrvaluecount("Lage");}
  public ch.interlis.iom.IomObject getLage() {
    int size=getattrvaluecount("Lage");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Lage",0);
    return value;
  }
  public void setLage(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Lage")>0){
      changeattrobj("Lage",0, value);
    }else{
      addattrobj("Lage", value);
    }
  }
  public final static String tag_Typ="Typ";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp value) {
    setattrvalue("Typ", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaeGewFassungTyp.toXmlCode(value));
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
  public final static String tag_EigentumArt="EigentumArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt getEigentumArt() {
    if(getattrvaluecount("EigentumArt")==0)return null;
    String value=getattrvalue("EigentumArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt.parseXmlCode(value);
  }
  public void setEigentumArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt value) {
    if(value==null){setattrundefined("EigentumArt");return;}
    setattrvalue("EigentumArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.EigentumArt.toXmlCode(value));
  }
  public final static String tag_PrivaterNutzer="PrivaterNutzer";
  public String getPrivaterNutzer() {
    if(getattrvaluecount("PrivaterNutzer")==0)return null;
    String value=getattrvalue("PrivaterNutzer");
    return value;
  }
  public void setPrivaterNutzer(String value) {
    if(value==null){setattrundefined("PrivaterNutzer");return;}
    setattrvalue("PrivaterNutzer", value);
  }
  public final static String tag_BetriebArt="BetriebArt";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt getBetriebArt() {
    if(getattrvaluecount("BetriebArt")==0)return null;
    String value=getattrvalue("BetriebArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.parseXmlCode(value);
  }
  public void setBetriebArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt value) {
    if(value==null){setattrundefined("BetriebArt");return;}
    setattrvalue("BetriebArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BetriebArt.toXmlCode(value));
  }
  public final static String tag_Notversorgung="Notversorgung";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung getNotversorgung() {
    if(getattrvaluecount("Notversorgung")==0)return null;
    String value=getattrvalue("Notversorgung");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.parseXmlCode(value);
  }
  public void setNotversorgung(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung value) {
    if(value==null){setattrundefined("Notversorgung");return;}
    setattrvalue("Notversorgung", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Notversorgung.toXmlCode(value));
  }
  public final static String tag_Tiefe="Tiefe";
  public Integer getTiefe() {
    if(getattrvaluecount("Tiefe")==0)return null;
    String value=getattrvalue("Tiefe");
    return Integer.parseInt(value);
  }
  public void setTiefe(Integer value) {
    if(value==null){setattrundefined("Tiefe");return;}
    setattrvalue("Tiefe", Integer.toString(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ getSchzPflicht() {
    if(getattrvaluecount("SchzPflicht")==0)return null;
    String value=getattrvalue("SchzPflicht");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.parseXmlCode(value);
  }
  public void setSchzPflicht(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ value) {
    if(value==null){setattrundefined("SchzPflicht");return;}
    setattrvalue("SchzPflicht", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.toXmlCode(value));
  }
  public final static String tag_SchzGutachten="SchzGutachten";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ getSchzGutachten() {
    if(getattrvaluecount("SchzGutachten")==0)return null;
    String value=getattrvalue("SchzGutachten");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.parseXmlCode(value);
  }
  public void setSchzGutachten(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ value) {
    if(value==null){setattrundefined("SchzGutachten");return;}
    setattrvalue("SchzGutachten", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.BOOLEAN_Typ.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton getKanton() {
    if(getattrvaluecount("Kanton")==0)return null;
    String value=getattrvalue("Kanton");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton value) {
    if(value==null){setattrundefined("Kanton");return;}
    setattrvalue("Kanton", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Kanton.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt getDetailplanArt() {
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanArt.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft getDetailplanHerkunft() {
    if(getattrvaluecount("DetailplanHerkunft")==0)return null;
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft value) {
    if(value==null){setattrundefined("DetailplanHerkunft");return;}
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlHerkunft.toXmlCode(value));
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
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk getErfVorlBemerk() {
    if(getattrvaluecount("ErfVorlBemerk")==0)return null;
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk value) {
    if(value==null){setattrundefined("ErfVorlBemerk");return;}
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ErfVorlBemerk.toXmlCode(value));
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
  public final static String tag_GewAbschnittCode="GewAbschnittCode";
  public Integer getGewAbschnittCode() {
    if(getattrvaluecount("GewAbschnittCode")==0)return null;
    String value=getattrvalue("GewAbschnittCode");
    return Integer.parseInt(value);
  }
  public void setGewAbschnittCode(Integer value) {
    if(value==null){setattrundefined("GewAbschnittCode");return;}
    setattrvalue("GewAbschnittCode", Integer.toString(value));
  }
  public final static String tag_GewAbschnittKm="GewAbschnittKm";
  public Integer getGewAbschnittKm() {
    if(getattrvaluecount("GewAbschnittKm")==0)return null;
    String value=getattrvalue("GewAbschnittKm");
    return Integer.parseInt(value);
  }
  public void setGewAbschnittKm(Integer value) {
    if(value==null){setattrundefined("GewAbschnittKm");return;}
    setattrvalue("GewAbschnittKm", Integer.toString(value));
  }
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
  public final static String tag_FassgEigentuemer="FassgEigentuemer";
  public String getFassgEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("FassgEigentuemer",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFassgEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("FassgEigentuemer","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_GrundEigentuemer="GrundEigentuemer";
  public String getGrundEigentuemer() {
    ch.interlis.iom.IomObject value=getattrobj("GrundEigentuemer",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGrundEigentuemer(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GrundEigentuemer","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_KontaktPerson="KontaktPerson";
  public String getKontaktPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontaktPerson",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setKontaktPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("KontaktPerson","REF");
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
