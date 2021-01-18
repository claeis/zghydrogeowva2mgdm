package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Datei extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei";
  public Datei(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Dateiname="Dateiname";
  public String getDateiname() {
    String value=getattrvalue("Dateiname");
    return value;
  }
  public void setDateiname(String value) {
    setattrvalue("Dateiname", value);
  }
  public final static String tag_Anreicherungsanlage="Anreicherungsanlage";
  public String getAnreicherungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Anreicherungsanlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setAnreicherungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Anreicherungsanlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Anreicherungsanlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Anreicherungsanlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_BautenGW="BautenGW";
  public String getBautenGW() {
    ch.interlis.iom.IomObject value=getattrobj("BautenGW",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setBautenGW(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("BautenGW",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("BautenGW","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("BautenGW",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Einleit="Einleit";
  public String getEinleit() {
    ch.interlis.iom.IomObject value=getattrobj("Einleit",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setEinleit(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Einleit",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Einleit","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Einleit",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  public String getEntnahmebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Entnahmebrunnen",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setEntnahmebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Entnahmebrunnen",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Entnahmebrunnen","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Entnahmebrunnen",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Foerderanlage="Foerderanlage";
  public String getFoerderanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Foerderanlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setFoerderanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Foerderanlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Foerderanlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Foerderanlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_OberflGewFassung="OberflGewFassung";
  public String getOberflGewFassung() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewFassung",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOberflGewFassung(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("OberflGewFassung",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("OberflGewFassung","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("OberflGewFassung",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_Quellschacht="Quellschacht";
  public String getQuellschacht() {
    ch.interlis.iom.IomObject value=getattrobj("Quellschacht",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setQuellschacht(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Quellschacht",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Quellschacht","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Quellschacht",0);
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
  public final static String tag_Versickerungsanlage="Versickerungsanlage";
  public String getVersickerungsanlage() {
    ch.interlis.iom.IomObject value=getattrobj("Versickerungsanlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setVersickerungsanlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Versickerungsanlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Versickerungsanlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Versickerungsanlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_WeitereAnlage="WeitereAnlage";
  public String getWeitereAnlage() {
    ch.interlis.iom.IomObject value=getattrobj("WeitereAnlage",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setWeitereAnlage(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("WeitereAnlage",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("WeitereAnlage","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("WeitereAnlage",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
