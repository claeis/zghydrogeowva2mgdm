package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class Zahlen extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Zahlen";
  public Zahlen() {
    super(tag,null);
  }
  protected Zahlen(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Zahlen="Zahlen";
  public int sizeZahlen() {return getattrvaluecount("Zahlen");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl[] getZahlen() {
    int size=getattrvaluecount("Zahlen");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl value[]=new ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl)getattrobj("Zahlen",i);
    }
    return value;
  }
  public void addZahlen(ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl value) {
    addattrobj("Zahlen", value);
  }
}
