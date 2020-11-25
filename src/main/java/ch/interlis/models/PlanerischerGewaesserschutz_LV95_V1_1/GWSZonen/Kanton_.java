package ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen;
public class Kanton_ extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen.Kanton_";
  public Kanton_() {
    super(tag,null);
  }
  protected Kanton_(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Value="Value";
  public ch.interlis.models.CHAdminCodes_V1.CHCantonCode getValue() {
    if(getattrvaluecount("Value")==0)return null;
    String value=getattrvalue("Value");
    return ch.interlis.models.CHAdminCodes_V1.CHCantonCode.parseXmlCode(value);
  }
  public void setValue(ch.interlis.models.CHAdminCodes_V1.CHCantonCode value) {
    if(value==null){setattrundefined("Value");return;}
    setattrvalue("Value", ch.interlis.models.CHAdminCodes_V1.CHCantonCode.toXmlCode(value));
  }
}
