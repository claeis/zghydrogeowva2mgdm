package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten;
public class Datenbestand extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Datenbestand";
  public Datenbestand(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BasketId="BasketId";
  public String getBasketId() {
    String value=getattrvalue("BasketId");
    return value;
  }
  public void setBasketId(String value) {
    setattrvalue("BasketId", value);
  }
  public final static String tag_Stand="Stand";
  public String getStand() {
    String value=getattrvalue("Stand");
    return value;
  }
  public void setStand(String value) {
    setattrvalue("Stand", value);
  }
  public final static String tag_Lieferdatum="Lieferdatum";
  public String getLieferdatum() {
    String value=getattrvalue("Lieferdatum");
    return value;
  }
  public void setLieferdatum(String value) {
    setattrvalue("Lieferdatum", value);
  }
  public final static String tag_Bemerkungen="Bemerkungen";
  public String getBemerkungen() {
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    setattrvalue("Bemerkungen", value);
  }
  public final static String tag_weitereMetadaten="weitereMetadaten";
  /** Verweis auf weitere maschinenlesbare Metadaten (XML). z.B. http://www.geocat.ch/geonetwork/srv/deu/gm03.xml?id=705
   */
  public String getweitereMetadaten() {
    String value=getattrvalue("weitereMetadaten");
    return value;
  }
  /** Verweis auf weitere maschinenlesbare Metadaten (XML). z.B. http://www.geocat.ch/geonetwork/srv/deu/gm03.xml?id=705
   */
  public void setweitereMetadaten(String value) {
    setattrvalue("weitereMetadaten", value);
  }
  public final static String tag_Darstellungsdienst="Darstellungsdienst";
  public String getDarstellungsdienst() {
    ch.interlis.iom.IomObject value=getattrobj("Darstellungsdienst",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setDarstellungsdienst(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Darstellungsdienst","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_zustaendigeStelle="zustaendigeStelle";
  public String getzustaendigeStelle() {
    ch.interlis.iom.IomObject value=getattrobj("zustaendigeStelle",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setzustaendigeStelle(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("zustaendigeStelle","REF");
    structvalue.setobjectrefoid(oid);
  }
}
