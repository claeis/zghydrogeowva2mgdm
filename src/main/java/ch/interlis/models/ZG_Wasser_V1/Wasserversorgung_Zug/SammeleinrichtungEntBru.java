package ch.interlis.models.ZG_Wasser_V1.Wasserversorgung_Zug;
public class SammeleinrichtungEntBru extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasser_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru";
  public SammeleinrichtungEntBru(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Sammeleinrichtung="Sammeleinrichtung";
  public String getSammeleinrichtung() {
    ch.interlis.iom.IomObject value=getattrobj("Sammeleinrichtung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setSammeleinrichtung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Sammeleinrichtung","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Entnahmebrunnen="Entnahmebrunnen";
  public String getEntnahmebrunnen() {
    ch.interlis.iom.IomObject value=getattrobj("Entnahmebrunnen",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEntnahmebrunnen(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Entnahmebrunnen","REF");
    structvalue.setobjectrefoid(oid);
  }
}
