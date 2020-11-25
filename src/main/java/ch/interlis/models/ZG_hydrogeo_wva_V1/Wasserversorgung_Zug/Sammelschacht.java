package ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug;
public class Sammelschacht extends ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht";
  public Sammelschacht(String oid) {
    super(oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Leitungsart="Leitungsart";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt getLeitungsart() {
    String value=getattrvalue("Leitungsart");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt.parseXmlCode(value);
  }
  public void setLeitungsart(ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt value) {
    setattrvalue("Leitungsart", ch.interlis.models.ZG_hydrogeo_wva_V1.LeitungsArt.toXmlCode(value));
  }
  public final static String tag_Betriebsart="Betriebsart";
  public ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt getBetriebsart() {
    if(getattrvaluecount("Betriebsart")==0)return null;
    String value=getattrvalue("Betriebsart");
    return ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.parseXmlCode(value);
  }
  public void setBetriebsart(ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt value) {
    if(value==null){setattrundefined("Betriebsart");return;}
    setattrvalue("Betriebsart", ch.interlis.models.ZG_hydrogeo_wva_V1.BetriebsArt.toXmlCode(value));
  }
  public final static String tag_TechData="TechData";
  public String getTechData() {
    if(getattrvaluecount("TechData")==0)return null;
    String value=getattrvalue("TechData");
    return value;
  }
  public void setTechData(String value) {
    if(value==null){setattrundefined("TechData");return;}
    setattrvalue("TechData", value);
  }
  public final static String tag_Grundlage="Grundlage";
  public String getGrundlage() {
    ch.interlis.iom.IomObject value=getattrobj("Grundlage",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGrundlage(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Grundlage","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Wasserversorgung="Wasserversorgung";
  public String getWasserversorgung() {
    ch.interlis.iom.IomObject value=getattrobj("Wasserversorgung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setWasserversorgung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Wasserversorgung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
