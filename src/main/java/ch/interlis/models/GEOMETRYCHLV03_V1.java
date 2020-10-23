package ch.interlis.models;
public class GEOMETRYCHLV03_V1{
  private GEOMETRYCHLV03_V1() {}
  public final static String MODEL= "GeometryCHLV03_V1";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("GeometryCHLV03_V1","http://www.geo.admin.ch","2017-12-04"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("GeometryCHLV03_V1.MultiDirectedLine"))return new ch.interlis.models.GeometryCHLV03_V1.MultiDirectedLine();
      if(type.equals("GeometryCHLV03_V1.SurfaceStructure"))return new ch.interlis.models.GeometryCHLV03_V1.SurfaceStructure();
      if(type.equals("GeometryCHLV03_V1.MultiSurface"))return new ch.interlis.models.GeometryCHLV03_V1.MultiSurface();
      if(type.equals("GeometryCHLV03_V1.DirectedLineStructure"))return new ch.interlis.models.GeometryCHLV03_V1.DirectedLineStructure();
      if(type.equals("GeometryCHLV03_V1.MultiLine"))return new ch.interlis.models.GeometryCHLV03_V1.MultiLine();
      if(type.equals("GeometryCHLV03_V1.LineStructure"))return new ch.interlis.models.GeometryCHLV03_V1.LineStructure();
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("GeometryCHLV03_V1.MultiDirectedLine", "MultiDirectedLine");
    mapping.defineClass("GeometryCHLV03_V1.MultiDirectedLine", new String[]{   "Lines"
      });
    nameMap.put("GeometryCHLV03_V1.SurfaceStructure", "SurfaceStructure");
    mapping.defineClass("GeometryCHLV03_V1.SurfaceStructure", new String[]{   "Surface"
      });
    nameMap.put("GeometryCHLV03_V1.MultiSurface", "MultiSurface");
    mapping.defineClass("GeometryCHLV03_V1.MultiSurface", new String[]{   "Surfaces"
      });
    nameMap.put("GeometryCHLV03_V1.DirectedLineStructure", "DirectedLineStructure");
    mapping.defineClass("GeometryCHLV03_V1.DirectedLineStructure", new String[]{   "Line"
      });
    nameMap.put("GeometryCHLV03_V1.MultiLine", "MultiLine");
    mapping.defineClass("GeometryCHLV03_V1.MultiLine", new String[]{   "Lines"
      });
    nameMap.put("GeometryCHLV03_V1.LineStructure", "LineStructure");
    mapping.defineClass("GeometryCHLV03_V1.LineStructure", new String[]{   "Line"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
