package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class QuellSchZsBeZu extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu";
  public QuellSchZsBeZu(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_QuellSchGUID="QuellSchGUID";
  public String getQuellSchGUID() {
    String value=getattrvalue("QuellSchGUID");
    return value;
  }
  public void setQuellSchGUID(String value) {
    setattrvalue("QuellSchGUID", value);
  }
  public final static String tag_ZsBeZuGUID="ZsBeZuGUID";
  public String getZsBeZuGUID() {
    String value=getattrvalue("ZsBeZuGUID");
    return value;
  }
  public void setZsBeZuGUID(String value) {
    setattrvalue("ZsBeZuGUID", value);
  }
}
