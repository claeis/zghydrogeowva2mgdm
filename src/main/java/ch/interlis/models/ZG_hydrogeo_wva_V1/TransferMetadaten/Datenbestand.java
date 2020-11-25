package ch.interlis.models.ZG_hydrogeo_wva_V1.TransferMetadaten;
public class Datenbestand extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.TransferMetadaten.Datenbestand";
  public Datenbestand(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_BehaelterID="BehaelterID";
  public String getBehaelterID() {
    if(getattrvaluecount("BehaelterID")==0)return null;
    String value=getattrvalue("BehaelterID");
    return value;
  }
  public void setBehaelterID(String value) {
    if(value==null){setattrundefined("BehaelterID");return;}
    setattrvalue("BehaelterID", value);
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
    if(getattrvaluecount("Bemerkungen")==0)return null;
    String value=getattrvalue("Bemerkungen");
    return value;
  }
  public void setBemerkungen(String value) {
    if(value==null){setattrundefined("Bemerkungen");return;}
    setattrvalue("Bemerkungen", value);
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
