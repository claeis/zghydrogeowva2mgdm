package ch.interlis.models.ZG_Wasser_V1;
public class Zahl extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Zahl";
  public Zahl() {
    super(tag,null);
  }
  protected Zahl(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Zahl="Zahl";
  public int getZahl() {
    String value=getattrvalue("Zahl");
    return Integer.parseInt(value);
  }
  public void setZahl(int value) {
    setattrvalue("Zahl", Integer.toString(value));
  }
}
