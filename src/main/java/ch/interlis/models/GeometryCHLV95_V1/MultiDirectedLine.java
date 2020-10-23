package ch.interlis.models.GeometryCHLV95_V1;
public class MultiDirectedLine extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "GeometryCHLV95_V1.MultiDirectedLine";
  public MultiDirectedLine() {
    super(tag,null);
  }
  protected MultiDirectedLine(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Lines="Lines";
  public int sizeLines() {return getattrvaluecount("Lines");}
  public ch.interlis.models.GeometryCHLV95_V1.DirectedLineStructure[] getLines() {
    int size=getattrvaluecount("Lines");
    ch.interlis.models.GeometryCHLV95_V1.DirectedLineStructure value[]=new ch.interlis.models.GeometryCHLV95_V1.DirectedLineStructure[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.interlis.models.GeometryCHLV95_V1.DirectedLineStructure)getattrobj("Lines",i);
    }
    return value;
  }
  public void addLines(ch.interlis.models.GeometryCHLV95_V1.DirectedLineStructure value) {
    addattrobj("Lines", value);
  }
}
