package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class Grundlage extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage";
  public Grundlage(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_DetailplanArt="DetailplanArt";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt getDetailplanArt() {
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt value) {
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanDatum="DetailplanDatum";
  public String getDetailplanDatum() {
    String value=getattrvalue("DetailplanDatum");
    return value;
  }
  public void setDetailplanDatum(String value) {
    setattrvalue("DetailplanDatum", value);
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab getDetailplanMstab() {
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab value) {
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft getDetailplanHerkunft() {
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft value) {
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.toXmlCode(value));
  }
  public final static String tag_DetailplanBz="DetailplanBz";
  public String getDetailplanBz() {
    String value=getattrvalue("DetailplanBz");
    return value;
  }
  public void setDetailplanBz(String value) {
    setattrvalue("DetailplanBz", value);
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit getErfGenauigkeit() {
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit value) {
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart getGeometrieHerkunft() {
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart value) {
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk getErfVorlBemerk() {
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk value) {
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.toXmlCode(value));
  }
  public final static String tag_KontaktDatum="KontaktDatum";
  public String getKontaktDatum() {
    String value=getattrvalue("KontaktDatum");
    return value;
  }
  public void setKontaktDatum(String value) {
    setattrvalue("KontaktDatum", value);
  }
  public final static String tag_KontaktPerson="KontaktPerson";
  public String getKontaktPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontaktPerson",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setKontaktPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("KontaktPerson","REF");
    structvalue.setobjectrefoid(oid);
  }
}
