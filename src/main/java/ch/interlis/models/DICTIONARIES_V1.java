package ch.interlis.models;
public class DICTIONARIES_V1{
  private DICTIONARIES_V1() {}
  public final static String MODEL= "Dictionaries_V1";
  public final static String Dictionaries= "Dictionaries_V1.Dictionaries";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("Dictionaries_V1","http://www.geo.admin.ch","2011-08-30"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("Dictionaries_V1.Dictionaries.Entry"))return new ch.interlis.models.Dictionaries_V1.Dictionaries.Entry();
      if(type.equals("Dictionaries_V1.Dictionaries.Dictionary"))return new ch.interlis.models.Dictionaries_V1.Dictionaries.Dictionary(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("Dictionaries_V1.Dictionaries","Dictionaries");
    nameMap.put("Dictionaries_V1.Dictionaries.Entry", "Entry");
    mapping.defineClass("Dictionaries_V1.Dictionaries.Entry", new String[]{   "Text"
      });
    nameMap.put("Dictionaries_V1.Dictionaries.Dictionary", "Dictionary");
    mapping.defineClass("Dictionaries_V1.Dictionaries.Dictionary", new String[]{   "Language"
      ,"Entries"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
