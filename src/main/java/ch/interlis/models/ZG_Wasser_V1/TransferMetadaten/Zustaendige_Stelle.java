package ch.interlis.models.ZG_Wasser_V1.TransferMetadaten;
public class Zustaendige_Stelle extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.TransferMetadaten.Zustaendige_Stelle";
  public Zustaendige_Stelle(String oid) {
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
}
