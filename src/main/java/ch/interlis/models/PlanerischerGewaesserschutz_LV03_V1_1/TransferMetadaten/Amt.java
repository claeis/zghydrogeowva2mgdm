package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten;
public class Amt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Amt";
  public Amt(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  /** Name des Amtes z.B. "Amt für Gemeinden und Raumordnung des Kantons Bern".
   */
  public int sizeName() {return getattrvaluecount("Name");}
  public ch.interlis.models.LocalisationCH_V1.MultilingualText getName() {
    int size=getattrvaluecount("Name");
    if(size==0)return null;
    ch.interlis.models.LocalisationCH_V1.MultilingualText value=(ch.interlis.models.LocalisationCH_V1.MultilingualText)getattrobj("Name",0);
    return value;
  }
  /** Name des Amtes z.B. "Amt für Gemeinden und Raumordnung des Kantons Bern".
   */
  public void setName(ch.interlis.models.LocalisationCH_V1.MultilingualText value) {
    if(getattrvaluecount("Name")>0){
      changeattrobj("Name",0, value);
    }else{
      addattrobj("Name", value);
    }
  }
  public final static String tag_AmtImWeb="AmtImWeb";
  /** Verweis auf die Website des Amtes z.B. "http://www.jgk.be.ch/site/agr/".
   */
  public String getAmtImWeb() {
    if(getattrvaluecount("AmtImWeb")==0)return null;
    String value=getattrvalue("AmtImWeb");
    return value;
  }
  /** Verweis auf die Website des Amtes z.B. "http://www.jgk.be.ch/site/agr/".
   */
  public void setAmtImWeb(String value) {
    if(value==null){setattrundefined("AmtImWeb");return;}
    setattrvalue("AmtImWeb", value);
  }
  public final static String tag_UID="UID";
  public String getUID() {
    if(getattrvaluecount("UID")==0)return null;
    String value=getattrvalue("UID");
    return value;
  }
  public void setUID(String value) {
    if(value==null){setattrundefined("UID");return;}
    setattrvalue("UID", value);
  }
}
