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
    if(getattrvaluecount("Lieferdatum")==0)return null;
    String value=getattrvalue("Lieferdatum");
    return value;
  }
  public void setLieferdatum(String value) {
    if(value==null){setattrundefined("Lieferdatum");return;}
    setattrvalue("Lieferdatum", value);
  }
  public final static String tag_Bemerkungen="Bemerkungen";
  public String getBemerkungen() {
    if(getattrvaluecount("Bemerkungen")==0)return null;
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    if(value==null){setattrundefined("Bemerkungen");return;}
    setattrvalue("Bemerkungen", value);
  }
  public final static String tag_weitereMetadaten="weitereMetadaten";
  /** Verweis auf weitere maschinenlesbare Metadaten (XML). z.B. http://www.geocat.ch/geonetwork/srv/deu/gm03.xml?id=705
   */
  public String getweitereMetadaten() {
    if(getattrvaluecount("weitereMetadaten")==0)return null;
    String value=getattrvalue("weitereMetadaten");
    return value;
  }
  /** Verweis auf weitere maschinenlesbare Metadaten (XML). z.B. http://www.geocat.ch/geonetwork/srv/deu/gm03.xml?id=705
   */
  public void setweitereMetadaten(String value) {
    if(value==null){setattrundefined("weitereMetadaten");return;}
    setattrvalue("weitereMetadaten", value);
  }
  public final static String tag_Darstellungsdienst="Darstellungsdienst";
  public String getDarstellungsdienst() {
    ch.interlis.iom.IomObject value=getattrobj("Darstellungsdienst",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setDarstellungsdienst(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("Darstellungsdienst",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("Darstellungsdienst","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("Darstellungsdienst",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
  public final static String tag_zustaendigeStelle="zustaendigeStelle";
  public String getzustaendigeStelle() {
    ch.interlis.iom.IomObject value=getattrobj("zustaendigeStelle",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setzustaendigeStelle(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("zustaendigeStelle",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("zustaendigeStelle","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("zustaendigeStelle",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
