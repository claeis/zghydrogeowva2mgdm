package ch.interlis.models.GeometryCHLV95_V1;
public class MultiLine extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV95_V1.MultiLine";
  public MultiLine() {
    super(tag,null);
  }
  protected MultiLine(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lines="Lines";
  public int sizeLines() {return getattrvaluecount("Lines");}
  public ch.interlis.models.GeometryCHLV95_V1.LineStructure[] getLines() {
    int size=getattrvaluecount("Lines");
    ch.interlis.models.GeometryCHLV95_V1.LineStructure value[]=new ch.interlis.models.GeometryCHLV95_V1.LineStructure[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.GeometryCHLV95_V1.LineStructure)getattrobj("Lines",i);
    }
    return value;
  }
  public void addLines(ch.interlis.models.GeometryCHLV95_V1.LineStructure value) {
    addattrobj("Lines", value);
  }
}
