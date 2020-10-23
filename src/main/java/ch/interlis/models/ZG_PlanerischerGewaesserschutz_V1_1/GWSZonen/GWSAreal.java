package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class GWSAreal extends ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.GWSAreal
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSAreal";
  public GWSAreal(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObjName="ObjName";
  public String getObjName() {
    String value=getattrvalue("ObjName");
    return value;
  }
  public void setObjName(String value) {
    setattrvalue("ObjName", value);
  }
  public final static String tag_ObjNummer="ObjNummer";
  public int getObjNummer() {
    String value=getattrvalue("ObjNummer");
    return Integer.parseInt(value);
  }
  public void setObjNummer(int value) {
    setattrvalue("ObjNummer", Integer.toString(value));
  }
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt getDetailplanArt() {
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt value) {
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab getDetailplanMstab() {
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab value) {
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit getErfGenauigkeit() {
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit value) {
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_Rechtsverbindlichkeit="Rechtsverbindlichkeit";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit getRechtsverbindlichkeit() {
    String value=getattrvalue("Rechtsverbindlichkeit");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit.parseXmlCode(value);
  }
  public void setRechtsverbindlichkeit(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit value) {
    setattrvalue("Rechtsverbindlichkeit", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_Erlassdatum="Erlassdatum";
  public String getErlassdatum() {
    String value=getattrvalue("Erlassdatum");
    return value;
  }
  public void setErlassdatum(String value) {
    setattrvalue("Erlassdatum", value);
  }
  public final static String tag_Mutationsdatum="Mutationsdatum";
  public String getMutationsdatum() {
    String value=getattrvalue("Mutationsdatum");
    return value;
  }
  public void setMutationsdatum(String value) {
    setattrvalue("Mutationsdatum", value);
  }
  public final static String tag_Lexlink="Lexlink";
  public int getLexlink() {
    String value=getattrvalue("Lexlink");
    return Integer.parseInt(value);
  }
  public void setLexlink(int value) {
    setattrvalue("Lexlink", Integer.toString(value));
  }
  public final static String tag_GUID="GUID";
  public String getGUID() {
    String value=getattrvalue("GUID");
    return value;
  }
  public void setGUID(String value) {
    setattrvalue("GUID", value);
  }
}
