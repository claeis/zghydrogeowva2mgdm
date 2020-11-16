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
  public int getBaujahr() {
    String value=getattrvalue("Baujahr");
    return Integer.parseInt(value);
  }
  public void setBaujahr(int value) {
    setattrvalue("Baujahr", Integer.toString(value));
  }
  public final static String tag_Turbine="Turbine";
  public String getTurbine() {
    String value=getattrvalue("Turbine");
    return value;
  }
  public void setTurbine(String value) {
    setattrvalue("Turbine", value);
  }
  public final static String tag_Durchfluss="Durchfluss";
  public int getDurchfluss() {
    String value=getattrvalue("Durchfluss");
    return Integer.parseInt(value);
  }
  public void setDurchfluss(int value) {
    setattrvalue("Durchfluss", Integer.toString(value));
  }
  public final static String tag_Bruttofallhoehe="Bruttofallhoehe";
  public int getBruttofallhoehe() {
    String value=getattrvalue("Bruttofallhoehe");
    return Integer.parseInt(value);
  }
  public void setBruttofallhoehe(int value) {
    setattrvalue("Bruttofallhoehe", Integer.toString(value));
  }
  public final static String tag_Nettofallhoehe="Nettofallhoehe";
  public int getNettofallhoehe() {
    String value=getattrvalue("Nettofallhoehe");
    return Integer.parseInt(value);
  }
  public void setNettofallhoehe(int value) {
    setattrvalue("Nettofallhoehe", Integer.toString(value));
  }
  public final static String tag_Turbinenleistung="Turbinenleistung";
  public double getTurbinenleistung() {
    String value=getattrvalue("Turbinenleistung");
    return Double.parseDouble(value);
  }
  public void setTurbinenleistung(double value) {
    setattrvalue("Turbinenleistung", Double.toString(value));
  }
  public final static String tag_Jahresproduktion="Jahresproduktion";
  public int getJahresproduktion() {
    String value=getattrvalue("Jahresproduktion");
    return Integer.parseInt(value);
  }
  public void setJahresproduktion(int value) {
    setattrvalue("Jahresproduktion", Integer.toString(value));
  }
}
