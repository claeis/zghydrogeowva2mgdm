package ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte;
public class FassgebWasservsg extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg";
  public FassgebWasservsg(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Fassungseinzugsgebiet="Fassungseinzugsgebiet";
  public String getFassungseinzugsgebiet() {
    ch.interlis.iom.IomObject value=getattrobj("Fassungseinzugsgebiet",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFassungseinzugsgebiet(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Fassungseinzugsgebiet","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Wasserversorgung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
