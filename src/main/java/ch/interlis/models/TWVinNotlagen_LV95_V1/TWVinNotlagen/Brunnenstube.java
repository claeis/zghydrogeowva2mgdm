package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Brunnenstube extends ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung
{
  public final static String tag= "TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube";
  public Brunnenstube(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Ertrag_minimal="Ertrag_minimal";
  /** Attribut obligatorisch, mit der Möglichkeit -1 abzufüllen sofern der Wert nicht verfügbar ist.
   */
  public int getErtrag_minimal() {
    String value=getattrvalue("Ertrag_minimal");
    return Integer.parseInt(value);
  }
  /** Attribut obligatorisch, mit der Möglichkeit -1 abzufüllen sofern der Wert nicht verfügbar ist.
   */
  public void setErtrag_minimal(int value) {
    setattrvalue("Ertrag_minimal", Integer.toString(value));
  }
  public final static String tag_Ertrag_mittel="Ertrag_mittel";
  public Integer getErtrag_mittel() {
    if(getattrvaluecount("Ertrag_mittel")==0)return null;
    String value=getattrvalue("Ertrag_mittel");
    return Integer.parseInt(value);
  }
  public void setErtrag_mittel(Integer value) {
    if(value==null){setattrundefined("Ertrag_mittel");return;}
    setattrvalue("Ertrag_mittel", Integer.toString(value));
  }
  public final static String tag_Ertrag_maximal="Ertrag_maximal";
  public Integer getErtrag_maximal() {
    if(getattrvaluecount("Ertrag_maximal")==0)return null;
    String value=getattrvalue("Ertrag_maximal");
    return Integer.parseInt(value);
  }
  public void setErtrag_maximal(Integer value) {
    if(value==null){setattrundefined("Ertrag_maximal");return;}
    setattrvalue("Ertrag_maximal", Integer.toString(value));
  }
  public final static String tag_Fassungsart="Fassungsart";
  public Brunnenstube_Fassungsart getFassungsart() {
    String value=getattrvalue("Fassungsart");
    return Brunnenstube_Fassungsart.parseXmlCode(value);
  }
  public void setFassungsart(Brunnenstube_Fassungsart value) {
    setattrvalue("Fassungsart", Brunnenstube_Fassungsart.toXmlCode(value));
  }
}
