package ch.interlis.models.ZG_hydrogeo_wva_V1;
public class Texte extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "ZG_hydrogeo_wva_V1.Texte";
  public Texte() {
    super(tag,null);
  }
  protected Texte(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Texte="Texte";
  public int sizeTexte() {return getattrvaluecount("Texte");}
  public ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText[] getTexte() {
    int size=getattrvaluecount("Texte");
    if(size==0)return null;
    ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText value[]=new ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText)getattrobj("Texte",i);
    }
    return value;
  }
  public void addTexte(ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText value) {
    addattrobj("Texte", value);
  }
}
