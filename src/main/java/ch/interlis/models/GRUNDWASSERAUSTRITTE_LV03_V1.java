package ch.interlis.models;
public class GRUNDWASSERAUSTRITTE_LV03_V1{
  private GRUNDWASSERAUSTRITTE_LV03_V1() {}
  public final static String MODEL= "Grundwasseraustritte_LV03_V1";
  public final static String Grundwasseraustritte= "Grundwasseraustritte_LV03_V1.Grundwasseraustritte";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("Grundwasseraustritte_LV03_V1","https://models.geo.admin.ch/BAFU/","2018-05-08"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Anreicherungsanlage"))return new ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Anreicherungsanlage(oid);
      if(type.equals("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsbrunnen"))return new ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsbrunnen(oid);
      if(type.equals("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Quelle"))return new ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Quelle(oid);
      if(type.equals("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Rueckgabebrunnen"))return new ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Rueckgabebrunnen(oid);
      if(type.equals("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsstrang_Stollen"))return new ch.interlis.models.Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsstrang_Stollen(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte","Grundwasseraustritte");
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Anreicherungsanlage", "Anreicherungsanlage");
    mapping.defineClass("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Anreicherungsanlage", new String[]{   "Identifikator"
      ,"Name"
      ,"Typ"
      ,"Typ_Bemerkung"
      ,"Max_Versickerung"
      ,"Bezugsgewaesser"
      ,"Zweck"
      ,"GeometriePunkt"
      ,"GeometrieLinie"
      ,"GeometrieFlaeche"
      });
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsbrunnen", "Fassungsbrunnen");
    mapping.defineClass("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsbrunnen", new String[]{   "Identifikator"
      ,"Name"
      ,"Brunnenart"
      ,"Foerdermethode"
      ,"Nutzungszustand"
      ,"Trinkwasser"
      ,"Zweck"
      ,"Notwasserversorgung"
      ,"Oeffentliches_Interesse"
      ,"Pkonz"
      ,"Geometrie"
      });
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Quelle", "Quelle");
    mapping.defineClass("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Quelle", new String[]{   "Identifikator"
      ,"Name"
      ,"Grundwasserleiter_Typ"
      ,"Quelltyp"
      ,"Fassungsart"
      ,"Nutzungszustand"
      ,"Trinkwasser"
      ,"Zweck"
      ,"Notwasserversorgung"
      ,"Oeffentliches_Interesse"
      ,"Schuettung_minimal"
      ,"Schuettung_mittel"
      ,"Schuettung_maximal"
      ,"Geometrie"
      });
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Rueckgabebrunnen", "Rueckgabebrunnen");
    mapping.defineClass("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Rueckgabebrunnen", new String[]{   "Identifikator"
      ,"Name"
      ,"Nutzungszustand"
      ,"Zweck"
      ,"Geometrie"
      });
    nameMap.put("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsstrang_Stollen", "Fassungsstrang_Stollen");
    mapping.defineClass("Grundwasseraustritte_LV03_V1.Grundwasseraustritte.Fassungsstrang_Stollen", new String[]{   "Identifikator"
      ,"Typ"
      ,"Geometrie"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
