package ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte;
public class WVAFassungsleitung_Genauigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private WVAFassungsleitung_Genauigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(WVAFassungsleitung_Genauigkeit value) {
     return value.value;
  }
  static public WVAFassungsleitung_Genauigkeit parseXmlCode(String value) {
     return (WVAFassungsleitung_Genauigkeit)valuev.get(value);
  }
  static public WVAFassungsleitung_Genauigkeit stark_generalisiert=new WVAFassungsleitung_Genauigkeit("stark_generalisiert");
  public final static String tag_stark_generalisiert="stark_generalisiert";
}
