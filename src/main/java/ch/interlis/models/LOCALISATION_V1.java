package ch.interlis.models;
public class LOCALISATION_V1{
  private LOCALISATION_V1() {}
  public final static String MODEL= "Localisation_V1";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("Localisation_V1","http://www.geo.admin.ch","2011-08-30"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("Localisation_V1.MultilingualText"))return new ch.interlis.models.Localisation_V1.MultilingualText();
      if(type.equals("Localisation_V1.LocalisedText"))return new ch.interlis.models.Localisation_V1.LocalisedText();
      if(type.equals("Localisation_V1.MultilingualMText"))return new ch.interlis.models.Localisation_V1.MultilingualMText();
      if(type.equals("Localisation_V1.LocalisedMText"))return new ch.interlis.models.Localisation_V1.LocalisedMText();
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("Localisation_V1.MultilingualText", "MultilingualText");
    mapping.defineClass("Localisation_V1.MultilingualText", new String[]{   "LocalisedText"
      });
    nameMap.put("Localisation_V1.LocalisedText", "LocalisedText");
    mapping.defineClass("Localisation_V1.LocalisedText", new String[]{   "Language"
      ,"Text"
      });
    nameMap.put("Localisation_V1.MultilingualMText", "MultilingualMText");
    mapping.defineClass("Localisation_V1.MultilingualMText", new String[]{   "LocalisedText"
      });
    nameMap.put("Localisation_V1.LocalisedMText", "LocalisedMText");
    mapping.defineClass("Localisation_V1.LocalisedMText", new String[]{   "Language"
      ,"Text"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
