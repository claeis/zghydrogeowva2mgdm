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
    if(getattrvaluecount("DetailplanArt")==0)return null;
    String value=getattrvalue("DetailplanArt");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.parseXmlCode(value);
  }
  public void setDetailplanArt(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt value) {
    if(value==null){setattrundefined("DetailplanArt");return;}
    setattrvalue("DetailplanArt", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanArt.toXmlCode(value));
  }
  public final static String tag_DetailplanDatum="DetailplanDatum";
  public String getDetailplanDatum() {
    if(getattrvaluecount("DetailplanDatum")==0)return null;
    String value=getattrvalue("DetailplanDatum");
    return value;
  }
  public void setDetailplanDatum(String value) {
    if(value==null){setattrundefined("DetailplanDatum");return;}
    setattrvalue("DetailplanDatum", value);
  }
  public final static String tag_DetailplanMstab="DetailplanMstab";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab getDetailplanMstab() {
    if(getattrvaluecount("DetailplanMstab")==0)return null;
    String value=getattrvalue("DetailplanMstab");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.parseXmlCode(value);
  }
  public void setDetailplanMstab(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab value) {
    if(value==null){setattrundefined("DetailplanMstab");return;}
    setattrvalue("DetailplanMstab", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.DetailplanMstab.toXmlCode(value));
  }
  public final static String tag_DetailplanHerkunft="DetailplanHerkunft";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft getDetailplanHerkunft() {
    if(getattrvaluecount("DetailplanHerkunft")==0)return null;
    String value=getattrvalue("DetailplanHerkunft");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.parseXmlCode(value);
  }
  public void setDetailplanHerkunft(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft value) {
    if(value==null){setattrundefined("DetailplanHerkunft");return;}
    setattrvalue("DetailplanHerkunft", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlHerkunft.toXmlCode(value));
  }
  public final static String tag_DetailplanBz="DetailplanBz";
  public String getDetailplanBz() {
    if(getattrvaluecount("DetailplanBz")==0)return null;
    String value=getattrvalue("DetailplanBz");
    return value;
  }
  public void setDetailplanBz(String value) {
    if(value==null){setattrundefined("DetailplanBz");return;}
    setattrvalue("DetailplanBz", value);
  }
  public final static String tag_ErfGenauigkeit="ErfGenauigkeit";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit getErfGenauigkeit() {
    if(getattrvaluecount("ErfGenauigkeit")==0)return null;
    String value=getattrvalue("ErfGenauigkeit");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.parseXmlCode(value);
  }
  public void setErfGenauigkeit(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit value) {
    if(value==null){setattrundefined("ErfGenauigkeit");return;}
    setattrvalue("ErfGenauigkeit", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.ErfGenauigkeit.toXmlCode(value));
  }
  public final static String tag_GeometrieHerkunft="GeometrieHerkunft";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart getGeometrieHerkunft() {
    if(getattrvaluecount("GeometrieHerkunft")==0)return null;
    String value=getattrvalue("GeometrieHerkunft");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.parseXmlCode(value);
  }
  public void setGeometrieHerkunft(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart value) {
    if(value==null){setattrundefined("GeometrieHerkunft");return;}
    setattrvalue("GeometrieHerkunft", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.Herkunftsart.toXmlCode(value));
  }
  public final static String tag_ErfVorlBemerk="ErfVorlBemerk";
  public ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk getErfVorlBemerk() {
    if(getattrvaluecount("ErfVorlBemerk")==0)return null;
    String value=getattrvalue("ErfVorlBemerk");
    return ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.parseXmlCode(value);
  }
  public void setErfVorlBemerk(ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk value) {
    if(value==null){setattrundefined("ErfVorlBemerk");return;}
    setattrvalue("ErfVorlBemerk", ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ErfVorlBemerk.toXmlCode(value));
  }
  public final static String tag_KontaktDatum="KontaktDatum";
  public String getKontaktDatum() {
    if(getattrvaluecount("KontaktDatum")==0)return null;
    String value=getattrvalue("KontaktDatum");
    return value;
  }
  public void setKontaktDatum(String value) {
    if(value==null){setattrundefined("KontaktDatum");return;}
    setattrvalue("KontaktDatum", value);
  }
  public final static String tag_KontaktPerson="KontaktPerson";
  public String getKontaktPerson() {
    ch.interlis.iom.IomObject value=getattrobj("KontaktPerson",0);
    if(value==null)return null;
    String oid=value.getobjectrefoid();
    if(oid==null)return null;
    return oid;
  }
  public String setKontaktPerson(String oid) {
    ch.interlis.iom.IomObject structvalue=getattrobj("KontaktPerson",0);
    if(structvalue==null){
      if(oid==null)return null;
      structvalue=addattrobj("KontaktPerson","REF");
    }else{
      if(oid==null){
        String oldoid=structvalue.getobjectrefoid();
        deleteattrobj("KontaktPerson",0);
        return oldoid;
      }
    }
    String oldoid=structvalue.getobjectrefoid();
    structvalue.setobjectrefoid(oid);
    return oldoid;
  }
}
