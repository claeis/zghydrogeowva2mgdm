package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class BewiReg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg";
  public BewiReg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BewiNummer="BewiNummer";
  public int getBewiNummer() {
    String value=getattrvalue("BewiNummer");
    return Integer.parseInt(value);
  }
  public void setBewiNummer(int value) {
    setattrvalue("BewiNummer", Integer.toString(value));
  }
  public final static String tag_Entnahmemenge="Entnahmemenge";
  public Integer getEntnahmemenge() {
    if(getattrvaluecount("Entnahmemenge")==0)return null;
    String value=getattrvalue("Entnahmemenge");
    return Integer.parseInt(value);
  }
  public void setEntnahmemenge(Integer value) {
    if(value==null){setattrundefined("Entnahmemenge");return;}
    setattrvalue("Entnahmemenge", Integer.toString(value));
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
  public final static String tag_Vesickerungsmenge="Vesickerungsmenge";
  public Integer getVesickerungsmenge() {
    if(getattrvaluecount("Vesickerungsmenge")==0)return null;
    String value=getattrvalue("Vesickerungsmenge");
    return Integer.parseInt(value);
  }
  public void setVesickerungsmenge(Integer value) {
    if(value==null){setattrundefined("Vesickerungsmenge");return;}
    setattrvalue("Vesickerungsmenge", Integer.toString(value));
  }
  public final static String tag_Datum="Datum";
  public String getDatum() {
    if(getattrvaluecount("Datum")==0)return null;
    String value=getattrvalue("Datum");
    return value;
  }
  public void setDatum(String value) {
    if(value==null){setattrundefined("Datum");return;}
    setattrvalue("Datum", value);
  }
}
