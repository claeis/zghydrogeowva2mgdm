package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class Pumpenanlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage";
  public Pumpenanlage(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_AnzahlPumpen="AnzahlPumpen";
  public int getAnzahlPumpen() {
    String value=getattrvalue("AnzahlPumpen");
    return Integer.parseInt(value);
  }
  public void setAnzahlPumpen(int value) {
    setattrvalue("AnzahlPumpen", Integer.toString(value));
  }
  public final static String tag_Pumpmenge="Pumpmenge";
  public int getPumpmenge() {
    String value=getattrvalue("Pumpmenge");
    return Integer.parseInt(value);
  }
  public void setPumpmenge(int value) {
    setattrvalue("Pumpmenge", Integer.toString(value));
  }
  public final static String tag_PumpenBetrieb="PumpenBetrieb";
  public String getPumpenBetrieb() {
    String value=getattrvalue("PumpenBetrieb");
    return value;
  }
  public void setPumpenBetrieb(String value) {
    setattrvalue("PumpenBetrieb", value);
  }
}
