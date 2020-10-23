package ch.interlis.models.AdministrativeUnits_V1.CountryNames;
public class CountryName extends ch.interlis.models.Dictionaries_V1.Dictionaries.Entry
{
  public final static String tag= "AdministrativeUnits_V1.CountryNames.CountryName";
  public CountryName() {
    super();
  }
  protected CountryName(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Code="Code";
  public ch.interlis.models.InternationalCodes_V1.CountryCode_ISO3166_1 getCode() {
    String value=getattrvalue("Code");
    return ch.interlis.models.InternationalCodes_V1.CountryCode_ISO3166_1.parseXmlCode(value);
  }
  public void setCode(ch.interlis.models.InternationalCodes_V1.CountryCode_ISO3166_1 value) {
    setattrvalue("Code", ch.interlis.models.InternationalCodes_V1.CountryCode_ISO3166_1.toXmlCode(value));
  }
}
