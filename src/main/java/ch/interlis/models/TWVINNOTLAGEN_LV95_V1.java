package ch.interlis.models;
public class TWVINNOTLAGEN_LV95_V1{
  private TWVINNOTLAGEN_LV95_V1() {}
  public final static String MODEL= "TWVinNotlagen_LV95_V1";
  public final static String TWVinNotlagen= "TWVinNotlagen_LV95_V1.TWVinNotlagen";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("TWVinNotlagen_LV95_V1","https://models.geo.admin.ch/BAFU","2016-11-08"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Reservoir"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Reservoir(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Leitung"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Leitung(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage(oid);
      if(type.equals("TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle"))return new ch.interlis.models.TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen","TWVinNotlagen");
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Reservoir", "Reservoir");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Reservoir", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Alternative_Stromversorgung"
      ,"Aufbereitung"
      ,"Brauchreserve"
      ,"Geometrie"
      ,"Loeschreserve"
      ,"Wasserspiegel_max"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute", "Basisattribute");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Basisattribute", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung", "Oberflaechengewaesserfassung");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Oberflaechengewaesserfassung", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"Notwasserversorgung"
      ,"Trinkwasser"
      ,"Fassungsart"
      ,"Nutzungszustand"
      ,"Pkonz"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube", "Brunnenstube");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Brunnenstube", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"Notwasserversorgung"
      ,"Trinkwasser"
      ,"Ertrag_minimal"
      ,"Ertrag_mittel"
      ,"Ertrag_maximal"
      ,"Fassungsart"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Leitung", "Leitung");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Leitung", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Geometrie"
      ,"Nennweite"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung", "Grundwasserfassung");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Grundwasserfassung", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"Notwasserversorgung"
      ,"Trinkwasser"
      ,"Durchmesser"
      ,"Fassungsart"
      ,"Nutzungszustand"
      ,"Pkonz"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung", "Fassung");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Fassung", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"Notwasserversorgung"
      ,"Trinkwasser"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage", "WeitereAnlage");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.WeitereAnlage", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage", "Foerderanlage");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Foerderanlage", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Alternative_Stromversorgung"
      ,"Art"
      ,"Aufbereitung"
      ,"Dauerleistung"
      ,"Foerdermenge"
      ,"Geometrie"
      ,"Leistung_max"
      ,"Pumpen_Anz"
      ,"Pumpen_Text"
      });
    nameMap.put("TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle", "Quelle");
    mapping.defineClass("TWVinNotlagen_LV95_V1.TWVinNotlagen.Quelle", new String[]{   "Bemerkung"
      ,"Fassungsart"
      ,"Geometrie"
      ,"Grundwasserleiter_Typ"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Notwasserversorgung"
      ,"Nutzungszustand"
      ,"Oeffentliches_Interesse"
      ,"Quelltyp"
      ,"Schuettung_minimal"
      ,"Schuettung_mittel"
      ,"Schuettung_maximal"
      ,"Trinkwasser"
      ,"Zweck"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
