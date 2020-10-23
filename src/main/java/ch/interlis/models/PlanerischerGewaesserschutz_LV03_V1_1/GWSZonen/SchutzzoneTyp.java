package ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen;
public class SchutzzoneTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected SchutzzoneTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(SchutzzoneTyp value) {
     return value.value;
  }
  static public SchutzzoneTyp parseXmlCode(String value) {
     return (SchutzzoneTyp)valuev.get(value);
  }
  static public SchutzzoneTyp S1=new SchutzzoneTyp("S1");
  public final static String tag_S1="S1";
  static public SchutzzoneTyp S2=new SchutzzoneTyp("S2");
  public final static String tag_S2="S2";
  static public SchutzzoneTyp S3=new SchutzzoneTyp("S3");
  public final static String tag_S3="S3";
  static public SchutzzoneTyp S3Zu=new SchutzzoneTyp("S3Zu");
  public final static String tag_S3Zu="S3Zu";
  static public SchutzzoneTyp S_kantonaleArt=new SchutzzoneTyp("S_kantonaleArt");
  public final static String tag_S_kantonaleArt="S_kantonaleArt";
  static public SchutzzoneTyp Sh=new SchutzzoneTyp("Sh");
  public final static String tag_Sh="Sh";
  static public SchutzzoneTyp Sm=new SchutzzoneTyp("Sm");
  public final static String tag_Sm="Sm";
}
