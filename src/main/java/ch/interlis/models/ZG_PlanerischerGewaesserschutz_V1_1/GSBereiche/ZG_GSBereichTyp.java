package ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche;
public class ZG_GSBereichTyp extends ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GSBereiche.GSBereichTyp
{
  private String value=null;
  protected ZG_GSBereichTyp(String value) {
    super(value);
  }
  static public String toXmlCode(ZG_GSBereichTyp value) {
     return value.value;
  }
  static public ZG_GSBereichTyp parseXmlCode(String value) {
     return (ZG_GSBereichTyp)valuev.get(value);
  }
  static public ZG_GSBereichTyp Ao_Ao=new ZG_GSBereichTyp("Ao.Ao");
  public final static String tag_Ao_Ao="Ao.Ao";
  static public ZG_GSBereichTyp Ao_AoT=new ZG_GSBereichTyp("Ao.AoT");
  public final static String tag_Ao_AoT="Ao.AoT";
  static public ZG_GSBereichTyp Ao_AoB=new ZG_GSBereichTyp("Ao.AoB");
  public final static String tag_Ao_AoB="Ao.AoB";
}
