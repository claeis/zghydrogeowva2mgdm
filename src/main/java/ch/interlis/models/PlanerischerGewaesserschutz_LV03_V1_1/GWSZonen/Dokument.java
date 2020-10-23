package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class Dokument extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Dokument";
  public Dokument(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Art="Art";
  public ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.DokumentArt getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.DokumentArt.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.DokumentArt value) {
    setattrvalue("Art", ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.DokumentArt.toXmlCode(value));
  }
  public final static String tag_Titel="Titel";
  public String getTitel() {
    String value=getattrvalue("Titel");
    return value;
  }
  public void setTitel(String value) {
    setattrvalue("Titel", value);
  }
  public final static String tag_OffiziellerTitel="OffiziellerTitel";
  public String getOffiziellerTitel() {
    String value=getattrvalue("OffiziellerTitel");
    return value;
  }
  public void setOffiziellerTitel(String value) {
    setattrvalue("OffiziellerTitel", value);
  }
  public final static String tag_Abkuerzung="Abkuerzung";
  public String getAbkuerzung() {
    String value=getattrvalue("Abkuerzung");
    return value;
  }
  public void setAbkuerzung(String value) {
    setattrvalue("Abkuerzung", value);
  }
  public final static String tag_OffizielleNr="OffizielleNr";
  public String getOffizielleNr() {
    String value=getattrvalue("OffizielleNr");
    return value;
  }
  public void setOffizielleNr(String value) {
    setattrvalue("OffizielleNr", value);
  }
  public final static String tag_Kanton="Kanton";
  public ch.interlis.models.CHAdminCodes_V1.CHCantonCode getKanton() {
    String value=getattrvalue("Kanton");
    return ch.interlis.models.CHAdminCodes_V1.CHCantonCode.parseXmlCode(value);
  }
  public void setKanton(ch.interlis.models.CHAdminCodes_V1.CHCantonCode value) {
    setattrvalue("Kanton", ch.interlis.models.CHAdminCodes_V1.CHCantonCode.toXmlCode(value));
  }
  public final static String tag_WeitereKantone="WeitereKantone";
  public int sizeWeitereKantone() {return getattrvaluecount("WeitereKantone");}
  public ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_[] getWeitereKantone() {
    int size=getattrvaluecount("WeitereKantone");
    ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_ value[]=new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_)getattrobj("WeitereKantone",i);
    }
    return value;
  }
  public void addWeitereKantone(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_ value) {
    addattrobj("WeitereKantone", value);
  }
  public final static String tag_Gemeinde="Gemeinde";
  public int getGemeinde() {
    String value=getattrvalue("Gemeinde");
    return Integer.parseInt(value);
  }
  public void setGemeinde(int value) {
    setattrvalue("Gemeinde", Integer.toString(value));
  }
  public final static String tag_publiziertAb="publiziertAb";
  public String getpubliziertAb() {
    String value=getattrvalue("publiziertAb");
    return value;
  }
  public void setpubliziertAb(String value) {
    setattrvalue("publiziertAb", value);
  }
  public final static String tag_Rechtsstatus="Rechtsstatus";
  public ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt getRechtsstatus() {
    String value=getattrvalue("Rechtsstatus");
    return ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt.parseXmlCode(value);
  }
  public void setRechtsstatus(ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt value) {
    setattrvalue("Rechtsstatus", ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.RechtsstatusArt.toXmlCode(value));
  }
  public final static String tag_TextImWeb="TextImWeb";
  public String getTextImWeb() {
    String value=getattrvalue("TextImWeb");
    return value;
  }
  public void setTextImWeb(String value) {
    setattrvalue("TextImWeb", value);
  }
  public final static String tag_Dokument="Dokument";
  /** Das Dokument als PDF-Datei
   */
  public String getDokument() {
    String value=getattrvalue("Dokument");
    return value;
  }
  /** Das Dokument als PDF-Datei
   */
  public void setDokument(String value) {
    setattrvalue("Dokument", value);
  }
}
