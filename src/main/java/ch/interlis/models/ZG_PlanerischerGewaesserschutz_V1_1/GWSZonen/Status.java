package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class Status extends ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.Status
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Status";
  public Status(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Beschlussverweis="Beschlussverweis";
  public String getBeschlussverweis() {
    if(getattrvaluecount("Beschlussverweis")==0)return null;
    String value=getattrvalue("Beschlussverweis");
    return value;
  }
  public void setBeschlussverweis(String value) {
    if(value==null){setattrundefined("Beschlussverweis");return;}
    setattrvalue("Beschlussverweis", value);
  }
}
