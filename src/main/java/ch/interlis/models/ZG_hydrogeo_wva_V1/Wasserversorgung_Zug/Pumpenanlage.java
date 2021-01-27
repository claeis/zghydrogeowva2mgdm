package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Pumpenanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage";
  public Pumpenanlage(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_AnzahlPumpen="AnzahlPumpen";
  public Integer getAnzahlPumpen() {
    if(getattrvaluecount("AnzahlPumpen")==0)return null;
    String value=getattrvalue("AnzahlPumpen");
    return Integer.parseInt(value);
  }
  public void setAnzahlPumpen(Integer value) {
    if(value==null){setattrundefined("AnzahlPumpen");return;}
    setattrvalue("AnzahlPumpen", Integer.toString(value));
  }
  public final static String tag_Pumpmenge="Pumpmenge";
  public Integer getPumpmenge() {
    if(getattrvaluecount("Pumpmenge")==0)return null;
    String value=getattrvalue("Pumpmenge");
    return Integer.parseInt(value);
  }
  public void setPumpmenge(Integer value) {
    if(value==null){setattrundefined("Pumpmenge");return;}
    setattrvalue("Pumpmenge", Integer.toString(value));
  }
  public final static String tag_PumpenBetrieb="PumpenBetrieb";
  public String getPumpenBetrieb() {
    if(getattrvaluecount("PumpenBetrieb")==0)return null;
    String value=getattrvalue("PumpenBetrieb");
    return value;
  }
  public void setPumpenBetrieb(String value) {
    if(value==null){setattrundefined("PumpenBetrieb");return;}
    setattrvalue("PumpenBetrieb", value);
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
  public final static String tag_OberflGewRohwaPW="OberflGewRohwaPW";
  public String getOberflGewRohwaPW() {
    ch.interlis.iom.IomObject value=getattrobj("OberflGewRohwaPW",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setOberflGewRohwaPW(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("OberflGewRohwaPW",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("OberflGewRohwaPW","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("OberflGewRohwaPW",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
