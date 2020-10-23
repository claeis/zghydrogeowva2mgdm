package ch.interlis.models;
public class ADMINISTRATIVEUNITSCH_V1{
  private ADMINISTRATIVEUNITSCH_V1() {}
  public final static String MODEL= "AdministrativeUnitsCH_V1";
  public final static String CHCantons= "AdministrativeUnitsCH_V1.CHCantons";
  public final static String CHDistricts= "AdministrativeUnitsCH_V1.CHDistricts";
  public final static String CHMunicipalities= "AdministrativeUnitsCH_V1.CHMunicipalities";
  public final static String CHAdministrativeUnions= "AdministrativeUnitsCH_V1.CHAdministrativeUnions";
  public final static String CHAgencies= "AdministrativeUnitsCH_V1.CHAgencies";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("AdministrativeUnitsCH_V1","http://www.geo.admin.ch","2020-04-24"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("AdministrativeUnitsCH_V1.CHCantons.CHCanton"))return new ch.interlis.models.AdministrativeUnitsCH_V1.CHCantons.CHCanton(oid);
      if(type.equals("AdministrativeUnitsCH_V1.CHDistricts.CHDistrict"))return new ch.interlis.models.AdministrativeUnitsCH_V1.CHDistricts.CHDistrict(oid);
      if(type.equals("AdministrativeUnitsCH_V1.CHAgencies.Agency"))return new ch.interlis.models.AdministrativeUnitsCH_V1.CHAgencies.Agency(oid);
      if(type.equals("AdministrativeUnitsCH_V1.CHMunicipalities.CHMunicipality"))return new ch.interlis.models.AdministrativeUnitsCH_V1.CHMunicipalities.CHMunicipality(oid);
      if(type.equals("AdministrativeUnitsCH_V1.CHAdministrativeUnions.AdministrativeUnion"))return new ch.interlis.models.AdministrativeUnitsCH_V1.CHAdministrativeUnions.AdministrativeUnion(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("AdministrativeUnitsCH_V1.CHCantons","CHCantons");
    nameMap.put("AdministrativeUnitsCH_V1.CHDistricts","CHDistricts");
    nameMap.put("AdministrativeUnitsCH_V1.CHMunicipalities","CHMunicipalities");
    nameMap.put("AdministrativeUnitsCH_V1.CHAdministrativeUnions","CHAdministrativeUnions");
    nameMap.put("AdministrativeUnitsCH_V1.CHAgencies","CHAgencies");
    nameMap.put("AdministrativeUnitsCH_V1.CHCantons.CHCanton", "CHCanton");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHCantons.CHCanton", new String[]{   "UpperLevelUnit"
      ,"Code"
      ,"Name"
      ,"Web"
      });
    nameMap.put("AdministrativeUnitsCH_V1.CHDistricts.CHDistrict", "CHDistrict");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHDistricts.CHDistrict", new String[]{   "UpperLevelUnit"
      ,"ShortName"
      ,"Name"
      ,"Web"
      });
    nameMap.put("AdministrativeUnitsCH_V1.CHAgencies.Agency", "Agency");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHAgencies.Agency", new String[]{   "Supervisor"
      ,"Name"
      ,"Web"
      ,"Description"
      });
    nameMap.put("AdministrativeUnitsCH_V1.CHCantons.Hierarchy", "CHCantons.Hierarchy");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHCantons.Hierarchy", new String[]{  });
    nameMap.put("AdministrativeUnitsCH_V1.CHMunicipalities.CHMunicipality", "CHMunicipality");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHMunicipalities.CHMunicipality", new String[]{   "UpperLevelUnit"
      ,"Code"
      ,"Name"
      ,"Web"
      });
    nameMap.put("AdministrativeUnitsCH_V1.CHAdministrativeUnions.AdministrativeUnion", "AdministrativeUnion");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHAdministrativeUnions.AdministrativeUnion", new String[]{   "Name"
      ,"Web"
      ,"Description"
      });
    nameMap.put("AdministrativeUnitsCH_V1.CHDistricts.Hierarchy", "CHDistricts.Hierarchy");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHDistricts.Hierarchy", new String[]{  });
    nameMap.put("AdministrativeUnitsCH_V1.CHMunicipalities.Hierarchy", "CHMunicipalities.Hierarchy");
    mapping.defineClass("AdministrativeUnitsCH_V1.CHMunicipalities.Hierarchy", new String[]{  });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
