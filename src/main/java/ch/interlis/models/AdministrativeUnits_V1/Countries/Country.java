package ch.interlis.models.AdministrativeUnits_V1.Countries;
public class Country extends ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit
{
  public final static String tag= "AdministrativeUnits_V1.Countries.Country";
  public Country(String oid) {
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
