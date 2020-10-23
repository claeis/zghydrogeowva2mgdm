package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class GWSZone extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSZone";
  public GWSZone(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
  }
  public final static String tag_Geometrie="Geometrie";
  public ch.interlis.iom.IomObject getGeometrie() {
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
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
  public final static String tag_Typ="Typ";
  public ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.SchutzzoneTyp getTyp() {
    String value=getattrvalue("Typ");
    return ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.SchutzzoneTyp.parseXmlCode(value);
  }
  public void setTyp(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.SchutzzoneTyp value) {
    setattrvalue("Typ", ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.SchutzzoneTyp.toXmlCode(value));
  }
  public final static String tag_KantonaleTypBezeichnung="KantonaleTypBezeichnung";
  public ch.interlis.models.LocalisationCH_V1.LocalisedText getKantonaleTypBezeichnung() {
    ch.interlis.models.LocalisationCH_V1.LocalisedText value=(ch.interlis.models.LocalisationCH_V1.LocalisedText)getattrobj("KantonaleTypBezeichnung",0);
    return value;
  }
  public void setKantonaleTypBezeichnung(ch.interlis.models.LocalisationCH_V1.LocalisedText value) {
    if(getattrvaluecount("KantonaleTypBezeichnung")>0){
      changeattrobj("KantonaleTypBezeichnung",0, value);
    }else{
      addattrobj("KantonaleTypBezeichnung", value);
    }
  }
  public final static String tag_istAltrechtlich="istAltrechtlich";
  public boolean getistAltrechtlich() {
    String value=getattrvalue("istAltrechtlich");
    return value!=null && value.equals("true");
  }
  public void setistAltrechtlich(boolean value) {
    setattrvalue("istAltrechtlich", value?"true":"false");
  }
  public final static String tag_Status="Status";
  public String getStatus() {
    ch.interlis.iom.IomObject value=getattrobj("Status",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setStatus(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Status","REF");
    structvalue.setobjectrefoid(oid);
  }
}
