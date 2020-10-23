package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche;
public class GSBereichEinzugsgebiet extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet";
  public GSBereichEinzugsgebiet(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_GSBereich="GSBereich";
  public String getGSBereich() {
    ch.interlis.iom.IomObject value=getattrobj("GSBereich",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGSBereich(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GSBereich","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Einzugsgebiet="Einzugsgebiet";
  public String getEinzugsgebiet() {
    ch.interlis.iom.IomObject value=getattrobj("Einzugsgebiet",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEinzugsgebiet(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Einzugsgebiet","REF");
    structvalue.setobjectrefoid(oid);
  }
}
