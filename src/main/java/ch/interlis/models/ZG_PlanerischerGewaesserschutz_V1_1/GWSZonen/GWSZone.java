package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen;
public class GWSZone extends ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.GWSZone
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZone";
  public GWSZone(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_ObjName="ObjName";
  public String getObjName() {
    if(getattrvaluecount("ObjName")==0)return null;
    String value=getattrvalue("ObjName");
    return value;
  }
  public void setObjName(String value) {
    if(value==null){setattrundefined("ObjName");return;}
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
  public final static String tag_HydrObjArt="HydrObjArt";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.FassungsTyp getHydrObjArt() {
    String value=getattrvalue("HydrObjArt");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.FassungsTyp.parseXmlCode(value);
  }
  public void setHydrObjArt(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.FassungsTyp value) {
    setattrvalue("HydrObjArt", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.FassungsTyp.toXmlCode(value));
  }
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt getDetailplanArt() {
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_Rechtsverbindlichkeit="Rechtsverbindlichkeit";
  public ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit getRechtsverbindlichkeit() {
    if(getattrvaluecount("Rechtsverbindlichkeit")==0)return null;
    String value=getattrvalue("Rechtsverbindlichkeit");
    return ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit.parseXmlCode(value);
  }
  public void setRechtsverbindlichkeit(ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.Rechtsverbindlichkeit value) {
    if(value==null){setattrundefined("Rechtsverbindlichkeit");return;}
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
    if(getattrvaluecount("Erlassdatum")==0)return null;
    String value=getattrvalue("Erlassdatum");
    return value;
  }
  public void setErlassdatum(String value) {
    if(value==null){setattrundefined("Erlassdatum");return;}
    setattrvalue("Erlassdatum", value);
  }
  public final static String tag_Mutationsdatum="Mutationsdatum";
  public String getMutationsdatum() {
    if(getattrvaluecount("Mutationsdatum")==0)return null;
    String value=getattrvalue("Mutationsdatum");
    return value;
  }
  public void setMutationsdatum(String value) {
    if(value==null){setattrundefined("Mutationsdatum");return;}
    setattrvalue("Mutationsdatum", value);
  }
  public final static String tag_Lexlink="Lexlink";
  public Integer getLexlink() {
    if(getattrvaluecount("Lexlink")==0)return null;
    String value=getattrvalue("Lexlink");
    return Integer.parseInt(value);
  }
  public void setLexlink(Integer value) {
    if(value==null){setattrundefined("Lexlink");return;}
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
