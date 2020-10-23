package ch.interlis.models.CHAdminCodes_V1;
public class CHCantonCode{
  static protected java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  protected CHCantonCode(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(CHCantonCode value) {
     return value.value;
  }
  static public CHCantonCode parseXmlCode(String value) {
     return (CHCantonCode)valuev.get(value);
  }
  static public CHCantonCode ZH=new CHCantonCode("ZH");
  public final static String tag_ZH="ZH";
  static public CHCantonCode BE=new CHCantonCode("BE");
  public final static String tag_BE="BE";
  static public CHCantonCode LU=new CHCantonCode("LU");
  public final static String tag_LU="LU";
  static public CHCantonCode UR=new CHCantonCode("UR");
  public final static String tag_UR="UR";
  static public CHCantonCode SZ=new CHCantonCode("SZ");
  public final static String tag_SZ="SZ";
  static public CHCantonCode OW=new CHCantonCode("OW");
  public final static String tag_OW="OW";
  static public CHCantonCode NW=new CHCantonCode("NW");
  public final static String tag_NW="NW";
  static public CHCantonCode GL=new CHCantonCode("GL");
  public final static String tag_GL="GL";
  static public CHCantonCode ZG=new CHCantonCode("ZG");
  public final static String tag_ZG="ZG";
  static public CHCantonCode FR=new CHCantonCode("FR");
  public final static String tag_FR="FR";
  static public CHCantonCode SO=new CHCantonCode("SO");
  public final static String tag_SO="SO";
  static public CHCantonCode BS=new CHCantonCode("BS");
  public final static String tag_BS="BS";
  static public CHCantonCode BL=new CHCantonCode("BL");
  public final static String tag_BL="BL";
  static public CHCantonCode SH=new CHCantonCode("SH");
  public final static String tag_SH="SH";
  static public CHCantonCode AR=new CHCantonCode("AR");
  public final static String tag_AR="AR";
  static public CHCantonCode AI=new CHCantonCode("AI");
  public final static String tag_AI="AI";
  static public CHCantonCode SG=new CHCantonCode("SG");
  public final static String tag_SG="SG";
  static public CHCantonCode GR=new CHCantonCode("GR");
  public final static String tag_GR="GR";
  static public CHCantonCode AG=new CHCantonCode("AG");
  public final static String tag_AG="AG";
  static public CHCantonCode TG=new CHCantonCode("TG");
  public final static String tag_TG="TG";
  static public CHCantonCode TI=new CHCantonCode("TI");
  public final static String tag_TI="TI";
  static public CHCantonCode VD=new CHCantonCode("VD");
  public final static String tag_VD="VD";
  static public CHCantonCode VS=new CHCantonCode("VS");
  public final static String tag_VS="VS";
  static public CHCantonCode NE=new CHCantonCode("NE");
  public final static String tag_NE="NE";
  static public CHCantonCode GE=new CHCantonCode("GE");
  public final static String tag_GE="GE";
  static public CHCantonCode JU=new CHCantonCode("JU");
  public final static String tag_JU="JU";
  static public CHCantonCode FL=new CHCantonCode("FL");
  public final static String tag_FL="FL";
  static public CHCantonCode CH=new CHCantonCode("CH");
  public final static String tag_CH="CH";
}
