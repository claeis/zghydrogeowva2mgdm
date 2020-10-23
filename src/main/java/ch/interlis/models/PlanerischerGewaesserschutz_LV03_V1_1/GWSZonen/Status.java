package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class Status extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Status";
  public Status(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Rechtsstatus="Rechtsstatus";
  public ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt getRechtsstatus() {
    String value=getattrvalue("Rechtsstatus");
    return ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt.parseXmlCode(value);
  }
  public void setRechtsstatus(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt value) {
    setattrvalue("Rechtsstatus", ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt.toXmlCode(value));
  }
  public final static String tag_Rechtskraftdatum="Rechtskraftdatum";
  public String getRechtskraftdatum() {
    String value=getattrvalue("Rechtskraftdatum");
    return value;
  }
  public void setRechtskraftdatum(String value) {
    setattrvalue("Rechtskraftdatum", value);
  }
  public final static String tag_Bemerkungen="Bemerkungen";
  public ch.interlis.models.LocalisationCH_V1.LocalisedMText getBemerkungen() {
    ch.interlis.models.LocalisationCH_V1.LocalisedMText value=(ch.interlis.models.LocalisationCH_V1.LocalisedMText)getattrobj("Bemerkungen",0);
    return value;
  }
  public void setBemerkungen(ch.interlis.models.LocalisationCH_V1.LocalisedMText value) {
    if(getattrvaluecount("Bemerkungen")>0){
      changeattrobj("Bemerkungen",0, value);
    }else{
      addattrobj("Bemerkungen", value);
    }
  }
  public final static String tag_KantonalerStatus="KantonalerStatus";
  public ch.interlis.models.LocalisationCH_V1.LocalisedText getKantonalerStatus() {
    ch.interlis.models.LocalisationCH_V1.LocalisedText value=(ch.interlis.models.LocalisationCH_V1.LocalisedText)getattrobj("KantonalerStatus",0);
    return value;
  }
  public void setKantonalerStatus(ch.interlis.models.LocalisationCH_V1.LocalisedText value) {
    if(getattrvaluecount("KantonalerStatus")>0){
      changeattrobj("KantonalerStatus",0, value);
    }else{
      addattrobj("KantonalerStatus", value);
    }
  }
}
