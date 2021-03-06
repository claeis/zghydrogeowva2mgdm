package ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.TransferMetadaten;
public class Darstellungsdienst extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV95_V1_1.TransferMetadaten.Darstellungsdienst";
  public Darstellungsdienst(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_VerweisWMS="VerweisWMS";
  /** WMS GetMap-Request (für Maschine-Maschine-Kommunikation) inkl. alle benötigten Parameter, z.B. "http://ecogis.admin.ch/de/wms?version=1.1.1&service=WMS&request=GetMap&LAYERS=invent_leit&srs=EPSG:21781&WIDTH=500&HEIGHT=500&bbox=500000,100000,700000,300000&FORMAT=image/png&TRANSPARENT=TRUE"
   */
  public String getVerweisWMS() {
    if(getattrvaluecount("VerweisWMS")==0)return null;
    String value=getattrvalue("VerweisWMS");
    return value;
  }
  /** WMS GetMap-Request (für Maschine-Maschine-Kommunikation) inkl. alle benötigten Parameter, z.B. "http://ecogis.admin.ch/de/wms?version=1.1.1&service=WMS&request=GetMap&LAYERS=invent_leit&srs=EPSG:21781&WIDTH=500&HEIGHT=500&bbox=500000,100000,700000,300000&FORMAT=image/png&TRANSPARENT=TRUE"
   */
  public void setVerweisWMS(String value) {
    if(value==null){setattrundefined("VerweisWMS");return;}
    setattrvalue("VerweisWMS", value);
  }
  public final static String tag_LegendeImWeb="LegendeImWeb";
  /** Verweis auf ein Dokument das die Karte beschreibt; z.B. "http://www.apps.be.ch/geoportal/output/gdp_adm_x3012app0081524772611.png"
   */
  public String getLegendeImWeb() {
    if(getattrvaluecount("LegendeImWeb")==0)return null;
    String value=getattrvalue("LegendeImWeb");
    return value;
  }
  /** Verweis auf ein Dokument das die Karte beschreibt; z.B. "http://www.apps.be.ch/geoportal/output/gdp_adm_x3012app0081524772611.png"
   */
  public void setLegendeImWeb(String value) {
    if(value==null){setattrundefined("LegendeImWeb");return;}
    setattrvalue("LegendeImWeb", value);
  }
}
