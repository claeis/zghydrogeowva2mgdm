package ch.interlis.models.PlanerischerGewaesserschutz_LV95_V1_1.GWSZonen;
public class SchutzarealTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected SchutzarealTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(SchutzarealTyp value) {
     return value.value;
  }
  static public SchutzarealTyp parseXmlCode(String value) {
     return (SchutzarealTyp)valuev.get(value);
  }
  static public SchutzarealTyp Areal=new SchutzarealTyp("Areal");
  public final static String tag_Areal="Areal";
  static public SchutzarealTyp ZukuenftigeZoneS1=new SchutzarealTyp("ZukuenftigeZoneS1");
  public final static String tag_ZukuenftigeZoneS1="ZukuenftigeZoneS1";
  static public SchutzarealTyp ZukuenftigeZoneS2=new SchutzarealTyp("ZukuenftigeZoneS2");
  public final static String tag_ZukuenftigeZoneS2="ZukuenftigeZoneS2";
  static public SchutzarealTyp ZukuenftigeZoneS3=new SchutzarealTyp("ZukuenftigeZoneS3");
  public final static String tag_ZukuenftigeZoneS3="ZukuenftigeZoneS3";
  static public SchutzarealTyp ZukuenftigeZoneSh=new SchutzarealTyp("ZukuenftigeZoneSh");
  public final static String tag_ZukuenftigeZoneSh="ZukuenftigeZoneSh";
  static public SchutzarealTyp ZukuenftigeZoneSm=new SchutzarealTyp("ZukuenftigeZoneSm");
  public final static String tag_ZukuenftigeZoneSm="ZukuenftigeZoneSm";
}
