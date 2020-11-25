package ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen;
public class Quelle extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle";
  public Quelle(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Bemerkung="Bemerkung";
  public String getBemerkung() {
    if(getattrvaluecount("Bemerkung")==0)return null;
    String value=getattrvalue("Bemerkung");
    return value;
  }
  public void setBemerkung(String value) {
    if(value==null){setattrundefined("Bemerkung");return;}
    setattrvalue("Bemerkung", value);
  }
  public final static String tag_Fassungsart="Fassungsart";
  public Quelle_Fassungsart getFassungsart() {
    String value=getattrvalue("Fassungsart");
    return Quelle_Fassungsart.parseXmlCode(value);
  }
  public void setFassungsart(Quelle_Fassungsart value) {
    setattrvalue("Fassungsart", Quelle_Fassungsart.toXmlCode(value));
  }
  public final static String tag_Geometrie="Geometrie";
  public int sizeGeometrie() {return getattrvaluecount("Geometrie");}
  public ch.interlis.iom.IomObject getGeometrie() {
    int size=getattrvaluecount("Geometrie");
    if(size==0)return null;
    ch.interlis.iom.IomObject value=(ch.interlis.iom.IomObject)getattrobj("Geometrie",0);
    return value;
  }
  public void setGeometrie(ch.interlis.iom.IomObject value) {
    if(getattrvaluecount("Geometrie")>0){
      changeattrobj("Geometrie",0, value);
    }else{
      addattrobj("Geometrie", value);
    }
  }
  public final static String tag_Grundwasserleiter_Typ="Grundwasserleiter_Typ";
  public Quelle_Grundwasserleiter_Typ getGrundwasserleiter_Typ() {
    if(getattrvaluecount("Grundwasserleiter_Typ")==0)return null;
    String value=getattrvalue("Grundwasserleiter_Typ");
    return Quelle_Grundwasserleiter_Typ.parseXmlCode(value);
  }
  public void setGrundwasserleiter_Typ(Quelle_Grundwasserleiter_Typ value) {
    if(value==null){setattrundefined("Grundwasserleiter_Typ");return;}
    setattrvalue("Grundwasserleiter_Typ", Quelle_Grundwasserleiter_Typ.toXmlCode(value));
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
  }
  public final static String tag_Name="Name";
  public String getName() {
    if(getattrvaluecount("Name")==0)return null;
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    if(value==null){setattrundefined("Name");return;}
    setattrvalue("Name", value);
  }
  public final static String tag_Netzteilident="Netzteilident";
  /** Ergänzung zu MGDM "Grundwasseraustritte, -fassungen, -anreicherungsanlagen"
   */
  public String getNetzteilident() {
    if(getattrvaluecount("Netzteilident")==0)return null;
    String value=getattrvalue("Netzteilident");
    return value;
  }
  /** Ergänzung zu MGDM "Grundwasseraustritte, -fassungen, -anreicherungsanlagen"
   */
  public void setNetzteilident(String value) {
    if(value==null){setattrundefined("Netzteilident");return;}
    setattrvalue("Netzteilident", value);
  }
  public final static String tag_Notwasserversorgung="Notwasserversorgung";
  public ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt getNotwasserversorgung() {
    if(getattrvaluecount("Notwasserversorgung")==0)return null;
    String value=getattrvalue("Notwasserversorgung");
    return ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setNotwasserversorgung(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt value) {
    if(value==null){setattrundefined("Notwasserversorgung");return;}
    setattrvalue("Notwasserversorgung", ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Nutzungszustand="Nutzungszustand";
  public Quelle_Nutzungszustand getNutzungszustand() {
    if(getattrvaluecount("Nutzungszustand")==0)return null;
    String value=getattrvalue("Nutzungszustand");
    return Quelle_Nutzungszustand.parseXmlCode(value);
  }
  public void setNutzungszustand(Quelle_Nutzungszustand value) {
    if(value==null){setattrundefined("Nutzungszustand");return;}
    setattrvalue("Nutzungszustand", Quelle_Nutzungszustand.toXmlCode(value));
  }
  public final static String tag_Oeffentliches_Interesse="Oeffentliches_Interesse";
  public ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt getOeffentliches_Interesse() {
    if(getattrvaluecount("Oeffentliches_Interesse")==0)return null;
    String value=getattrvalue("Oeffentliches_Interesse");
    return ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.parseXmlCode(value);
  }
  public void setOeffentliches_Interesse(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt value) {
    if(value==null){setattrundefined("Oeffentliches_Interesse");return;}
    setattrvalue("Oeffentliches_Interesse", ch.interlis.models.TWVinNotlagen_LV95_V1.JaNeinUnbestimmt.toXmlCode(value));
  }
  public final static String tag_Quelltyp="Quelltyp";
  public String getQuelltyp() {
    if(getattrvaluecount("Quelltyp")==0)return null;
    String value=getattrvalue("Quelltyp");
    return value;
  }
  public void setQuelltyp(String value) {
    if(value==null){setattrundefined("Quelltyp");return;}
    setattrvalue("Quelltyp", value);
  }
  public final static String tag_Schuettung_minimal="Schuettung_minimal";
  /** Attribut obligatorisch, mit der Möglichkeit -1 abzufüllen sofern der Wert nicht verfügbar ist.
   */
  public int getSchuettung_minimal() {
    String value=getattrvalue("Schuettung_minimal");
    return Integer.parseInt(value);
  }
  /** Attribut obligatorisch, mit der Möglichkeit -1 abzufüllen sofern der Wert nicht verfügbar ist.
   */
  public void setSchuettung_minimal(int value) {
    setattrvalue("Schuettung_minimal", Integer.toString(value));
  }
  public final static String tag_Schuettung_mittel="Schuettung_mittel";
  public Integer getSchuettung_mittel() {
    if(getattrvaluecount("Schuettung_mittel")==0)return null;
    String value=getattrvalue("Schuettung_mittel");
    return Integer.parseInt(value);
  }
  public void setSchuettung_mittel(Integer value) {
    if(value==null){setattrundefined("Schuettung_mittel");return;}
    setattrvalue("Schuettung_mittel", Integer.toString(value));
  }
  public final static String tag_Schuettung_maximal="Schuettung_maximal";
  public Integer getSchuettung_maximal() {
    if(getattrvaluecount("Schuettung_maximal")==0)return null;
    String value=getattrvalue("Schuettung_maximal");
    return Integer.parseInt(value);
  }
  public void setSchuettung_maximal(Integer value) {
    if(value==null){setattrundefined("Schuettung_maximal");return;}
    setattrvalue("Schuettung_maximal", Integer.toString(value));
  }
  public final static String tag_Trinkwasser="Trinkwasser";
  public ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein getTrinkwasser() {
    if(getattrvaluecount("Trinkwasser")==0)return null;
    String value=getattrvalue("Trinkwasser");
    return ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.parseXmlCode(value);
  }
  public void setTrinkwasser(ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein value) {
    if(value==null){setattrundefined("Trinkwasser");return;}
    setattrvalue("Trinkwasser", ch.interlis.models.TWVinNotlagen_LV95_V1.JaNein.toXmlCode(value));
  }
  public final static String tag_Zweck="Zweck";
  public String getZweck() {
    if(getattrvaluecount("Zweck")==0)return null;
    String value=getattrvalue("Zweck");
    return value;
  }
  public void setZweck(String value) {
    if(value==null){setattrundefined("Zweck");return;}
    setattrvalue("Zweck", value);
  }
}
