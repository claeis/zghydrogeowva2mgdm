package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class TWTurbine extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine";
  public TWTurbine(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Baujahr="Baujahr";
  public Integer getBaujahr() {
    if(getattrvaluecount("Baujahr")==0)return null;
    String value=getattrvalue("Baujahr");
    return Integer.parseInt(value);
  }
  public void setBaujahr(Integer value) {
    if(value==null){setattrundefined("Baujahr");return;}
    setattrvalue("Baujahr", Integer.toString(value));
  }
  public final static String tag_Turbine="Turbine";
  public String getTurbine() {
    if(getattrvaluecount("Turbine")==0)return null;
    String value=getattrvalue("Turbine");
    return value;
  }
  public void setTurbine(String value) {
    if(value==null){setattrundefined("Turbine");return;}
    setattrvalue("Turbine", value);
  }
  public final static String tag_Durchfluss="Durchfluss";
  public Integer getDurchfluss() {
    if(getattrvaluecount("Durchfluss")==0)return null;
    String value=getattrvalue("Durchfluss");
    return Integer.parseInt(value);
  }
  public void setDurchfluss(Integer value) {
    if(value==null){setattrundefined("Durchfluss");return;}
    setattrvalue("Durchfluss", Integer.toString(value));
  }
  public final static String tag_Bruttofallhoehe="Bruttofallhoehe";
  public Integer getBruttofallhoehe() {
    if(getattrvaluecount("Bruttofallhoehe")==0)return null;
    String value=getattrvalue("Bruttofallhoehe");
    return Integer.parseInt(value);
  }
  public void setBruttofallhoehe(Integer value) {
    if(value==null){setattrundefined("Bruttofallhoehe");return;}
    setattrvalue("Bruttofallhoehe", Integer.toString(value));
  }
  public final static String tag_Nettofallhoehe="Nettofallhoehe";
  public Integer getNettofallhoehe() {
    if(getattrvaluecount("Nettofallhoehe")==0)return null;
    String value=getattrvalue("Nettofallhoehe");
    return Integer.parseInt(value);
  }
  public void setNettofallhoehe(Integer value) {
    if(value==null){setattrundefined("Nettofallhoehe");return;}
    setattrvalue("Nettofallhoehe", Integer.toString(value));
  }
  public final static String tag_Turbinenleistung="Turbinenleistung";
  public Double getTurbinenleistung() {
    if(getattrvaluecount("Turbinenleistung")==0)return null;
    String value=getattrvalue("Turbinenleistung");
    return Double.parseDouble(value);
  }
  public void setTurbinenleistung(Double value) {
    if(value==null){setattrundefined("Turbinenleistung");return;}
    setattrvalue("Turbinenleistung", Double.toString(value));
  }
  public final static String tag_Jahresproduktion="Jahresproduktion";
  public Integer getJahresproduktion() {
    if(getattrvaluecount("Jahresproduktion")==0)return null;
    String value=getattrvalue("Jahresproduktion");
    return Integer.parseInt(value);
  }
  public void setJahresproduktion(Integer value) {
    if(value==null){setattrundefined("Jahresproduktion");return;}
    setattrvalue("Jahresproduktion", Integer.toString(value));
  }
}
