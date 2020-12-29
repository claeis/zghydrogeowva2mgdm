package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Pumpe extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe";
  public Pumpe(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_PumpeNummer="PumpeNummer";
  public Integer getPumpeNummer() {
    if(getattrvaluecount("PumpeNummer")==0)return null;
    String value=getattrvalue("PumpeNummer");
    return Integer.parseInt(value);
  }
  public void setPumpeNummer(Integer value) {
    if(value==null){setattrundefined("PumpeNummer");return;}
    setattrvalue("PumpeNummer", Integer.toString(value));
  }
  public final static String tag_Foerdermenge="Foerdermenge";
  public Integer getFoerdermenge() {
    if(getattrvaluecount("Foerdermenge")==0)return null;
    String value=getattrvalue("Foerdermenge");
    return Integer.parseInt(value);
  }
  public void setFoerdermenge(Integer value) {
    if(value==null){setattrundefined("Foerdermenge");return;}
    setattrvalue("Foerdermenge", Integer.toString(value));
  }
  public final static String tag_MotorLeistung="MotorLeistung";
  public Double getMotorLeistung() {
    if(getattrvaluecount("MotorLeistung")==0)return null;
    String value=getattrvalue("MotorLeistung");
    return Double.parseDouble(value);
  }
  public void setMotorLeistung(Double value) {
    if(value==null){setattrundefined("MotorLeistung");return;}
    setattrvalue("MotorLeistung", Double.toString(value));
  }
}
