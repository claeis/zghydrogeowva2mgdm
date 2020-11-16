package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class PlanTyp{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected PlanTyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(PlanTyp value) {
     return value.value;
  }
  static public PlanTyp parseXmlCode(String value) {
     return (PlanTyp)valuev.get(value);
  }
  static public PlanTyp M_1_1000=new PlanTyp("M_1_1000");
  public final static String tag_M_1_1000="M_1_1000";
  static public PlanTyp M_1_2000=new PlanTyp("M_1_2000");
  public final static String tag_M_1_2000="M_1_2000";
  static public PlanTyp M_1_5000=new PlanTyp("M_1_5000");
  public final static String tag_M_1_5000="M_1_5000";
  static public PlanTyp M_1_10000=new PlanTyp("M_1_10000");
  public final static String tag_M_1_10000="M_1_10000";
  static public PlanTyp M_1_25000=new PlanTyp("M_1_25000");
  public final static String tag_M_1_25000="M_1_25000";
}
