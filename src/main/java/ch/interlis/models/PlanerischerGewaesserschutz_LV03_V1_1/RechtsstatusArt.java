package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1;
public class RechtsstatusArt{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected RechtsstatusArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(RechtsstatusArt value) {
     return value.value;
  }
  static public RechtsstatusArt parseXmlCode(String value) {
     return (RechtsstatusArt)valuev.get(value);
  }
  static public RechtsstatusArt inKraft=new RechtsstatusArt("inKraft");
  public final static String tag_inKraft="inKraft";
  static public RechtsstatusArt provisorisch=new RechtsstatusArt("provisorisch");
  public final static String tag_provisorisch="provisorisch";
}
