package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0;
public class DetailplanMstab{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private DetailplanMstab(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(DetailplanMstab value) {
     return value.value;
  }
  static public DetailplanMstab parseXmlCode(String value) {
     return (DetailplanMstab)valuev.get(value);
  }
  static public DetailplanMstab M_1_200=new DetailplanMstab("M_1_200");
  public final static String tag_M_1_200="M_1_200";
  static public DetailplanMstab M_1_500=new DetailplanMstab("M_1_500");
  public final static String tag_M_1_500="M_1_500";
  static public DetailplanMstab M_1_1000=new DetailplanMstab("M_1_1000");
  public final static String tag_M_1_1000="M_1_1000";
  static public DetailplanMstab M_1_2000=new DetailplanMstab("M_1_2000");
  public final static String tag_M_1_2000="M_1_2000";
  static public DetailplanMstab M_1_5000=new DetailplanMstab("M_1_5000");
  public final static String tag_M_1_5000="M_1_5000";
  static public DetailplanMstab M_1_10000=new DetailplanMstab("M_1_10000");
  public final static String tag_M_1_10000="M_1_10000";
  static public DetailplanMstab M_1_25000=new DetailplanMstab("M_1_25000");
  public final static String tag_M_1_25000="M_1_25000";
  static public DetailplanMstab andere=new DetailplanMstab("andere");
  public final static String tag_andere="andere";
  static public DetailplanMstab unbekannt=new DetailplanMstab("unbekannt");
  public final static String tag_unbekannt="unbekannt";
}
