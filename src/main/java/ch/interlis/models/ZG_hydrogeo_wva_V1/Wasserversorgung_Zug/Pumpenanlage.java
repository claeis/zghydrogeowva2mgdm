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
}
