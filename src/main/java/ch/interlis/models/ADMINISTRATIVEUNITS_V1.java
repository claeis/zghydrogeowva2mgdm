package ch.interlis.models;
public class ADMINISTRATIVEUNITS_V1{
  private ADMINISTRATIVEUNITS_V1() {}
  public final static String MODEL= "AdministrativeUnits_V1";
  public final static String AdministrativeUnits= "AdministrativeUnits_V1.AdministrativeUnits";
  public final static String Countries= "AdministrativeUnits_V1.Countries";
  public final static String CountryNames= "AdministrativeUnits_V1.CountryNames";
  public final static String Agencies= "AdministrativeUnits_V1.Agencies";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("AdministrativeUnits_V1","http://www.geo.admin.ch","2020-08-25"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit"))return new ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit(oid);
      if(type.equals("AdministrativeUnits_V1.CountryNames.CountryName"))return new ch.interlis.models.AdministrativeUnits_V1.CountryNames.CountryName();
      if(type.equals("AdministrativeUnits_V1.Agencies.Organisation"))return new ch.interlis.models.AdministrativeUnits_V1.Agencies.Organisation(oid);
      if(type.equals("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnion"))return new ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnion(oid);
      if(type.equals("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeElement"))return new ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.AdministrativeElement(oid);
      if(type.equals("AdministrativeUnits_V1.CountryNames.CountryNamesTranslation"))return new ch.interlis.models.AdministrativeUnits_V1.CountryNames.CountryNamesTranslation(oid);
      if(type.equals("AdministrativeUnits_V1.Countries.Country"))return new ch.interlis.models.AdministrativeUnits_V1.Countries.Country(oid);
      if(type.equals("AdministrativeUnits_V1.Agencies.Agency"))return new ch.interlis.models.AdministrativeUnits_V1.Agencies.Agency(oid);
      if(type.equals("AdministrativeUnits_V1.AdministrativeUnits.UnionMembers"))return new ch.interlis.models.AdministrativeUnits_V1.AdministrativeUnits.UnionMembers(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits","AdministrativeUnits");
    nameMap.put("AdministrativeUnits_V1.Countries","Countries");
    nameMap.put("AdministrativeUnits_V1.CountryNames","CountryNames");
    nameMap.put("AdministrativeUnits_V1.Agencies","Agencies");
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit", "AdministrativeUnit");
    mapping.defineClass("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnit", new String[]{   "UpperLevelUnit"
      });
    nameMap.put("AdministrativeUnits_V1.CountryNames.CountryName", "CountryName");
    mapping.defineClass("AdministrativeUnits_V1.CountryNames.CountryName", new String[]{   "Text"
      ,"Code"
      });
    nameMap.put("AdministrativeUnits_V1.Agencies.Organisation", "Organisation");
    mapping.defineClass("AdministrativeUnits_V1.Agencies.Organisation", new String[]{   "Orderer"
      ,"Executor"
      });
    nameMap.put("AdministrativeUnits_V1.Agencies.Authority", "Authority");
    mapping.defineClass("AdministrativeUnits_V1.Agencies.Authority", new String[]{  });
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnion", "AdministrativeUnion");
    mapping.defineClass("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeUnion", new String[]{  });
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeElement", "AdministrativeElement");
    mapping.defineClass("AdministrativeUnits_V1.AdministrativeUnits.AdministrativeElement", new String[]{  });
    nameMap.put("AdministrativeUnits_V1.CountryNames.CountryNamesTranslation", "CountryNamesTranslation");
    mapping.defineClass("AdministrativeUnits_V1.CountryNames.CountryNamesTranslation", new String[]{   "Language"
      ,"Entries"
      });
    nameMap.put("AdministrativeUnits_V1.Countries.Country", "Country");
    mapping.defineClass("AdministrativeUnits_V1.Countries.Country", new String[]{   "UpperLevelUnit"
      ,"Code"
      });
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits.Hierarchy", "Hierarchy");
    mapping.defineClass("AdministrativeUnits_V1.AdministrativeUnits.Hierarchy", new String[]{  });
    nameMap.put("AdministrativeUnits_V1.Agencies.Agency", "Agency");
    mapping.defineClass("AdministrativeUnits_V1.Agencies.Agency", new String[]{   "Supervisor"
      });
    nameMap.put("AdministrativeUnits_V1.AdministrativeUnits.UnionMembers", "UnionMembers");
    mapping.defineClass("AdministrativeUnits_V1.AdministrativeUnits.UnionMembers", new String[]{   "Union"
      ,"Member"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
