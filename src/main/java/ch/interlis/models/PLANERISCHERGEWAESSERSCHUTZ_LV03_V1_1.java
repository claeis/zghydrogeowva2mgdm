package ch.interlis.models;
public class PLANERISCHERGEWAESSERSCHUTZ_LV03_V1_1{
  private PLANERISCHERGEWAESSERSCHUTZ_LV03_V1_1() {}
  public final static String MODEL= "PlanerischerGewaesserschutz_LV03_V1_1";
  public final static String GSBereiche= "PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche";
  public final static String GWSZonen= "PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen";
  public final static String TransferMetadaten= "PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("PlanerischerGewaesserschutz_LV03_V1_1","https://models.geo.admin.ch/BAFU/","2017-06-20"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Datenbestand"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Datenbestand(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_();
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Amt"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Amt(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSAreal"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSAreal(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSAreal"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSAreal(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Status"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Status(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche.GSBereich"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche.GSBereich(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Dokument"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Dokument(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.HinweisWeitereDokumente"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.HinweisWeitereDokumente(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSZone"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSZone(oid);
      if(type.equals("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Darstellungsdienst"))return new ch.interlis.models.PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Darstellungsdienst(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche","GSBereiche");
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen","GWSZonen");
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten","TransferMetadaten");
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Datenbestand", "Datenbestand");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Datenbestand", new String[]{   "BasketId"
      ,"Stand"
      ,"Lieferdatum"
      ,"Bemerkungen"
      ,"weitereMetadaten"
      ,"Darstellungsdienst"
      ,"zustaendigeStelle"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_", "Kanton_");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Kanton_", new String[]{   "Value"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Amt", "Amt");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Amt", new String[]{   "Name"
      ,"AmtImWeb"
      ,"UID"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSAreal", "GWSAreal");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSAreal", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Bemerkungen"
      ,"Typ"
      ,"istAltrechtlich"
      ,"Status"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSAreal", "RechtsvorschriftGWSAreal");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSAreal", new String[]{   "Rechtsvorschrift"
      ,"GWSAreal"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone", "RechtsvorschriftGWSZone");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.RechtsvorschriftGWSZone", new String[]{   "Rechtsvorschrift"
      ,"GWSZone"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.DarstellungsdienstDatenbestand", "DarstellungsdienstDatenbestand");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.DarstellungsdienstDatenbestand", new String[]{  });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Status", "Status");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Status", new String[]{   "Rechtsstatus"
      ,"Rechtskraftdatum"
      ,"Bemerkungen"
      ,"KantonalerStatus"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.zustaendigeStelleDatenbestand", "zustaendigeStelleDatenbestand");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.zustaendigeStelleDatenbestand", new String[]{  });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.StatusGWSAreal", "StatusGWSAreal");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.StatusGWSAreal", new String[]{  });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche.GSBereich", "GSBereich");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GSBereiche.GSBereich", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Typ"
      ,"KantonaleTypBezeichnung"
      ,"Bemerkungen"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Dokument", "Dokument");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.Dokument", new String[]{   "Art"
      ,"Titel"
      ,"OffiziellerTitel"
      ,"Abkuerzung"
      ,"OffizielleNr"
      ,"Kanton"
      ,"WeitereKantone"
      ,"Gemeinde"
      ,"publiziertAb"
      ,"Rechtsstatus"
      ,"TextImWeb"
      ,"Dokument"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.HinweisWeitereDokumente", "HinweisWeitereDokumente");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.HinweisWeitereDokumente", new String[]{   "Ursprung"
      ,"Hinweis"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.StatusGWSZone", "StatusGWSZone");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.StatusGWSZone", new String[]{  });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSZone", "GWSZone");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.GWSZonen.GWSZone", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Bemerkungen"
      ,"Typ"
      ,"KantonaleTypBezeichnung"
      ,"istAltrechtlich"
      ,"Status"
      });
    nameMap.put("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Darstellungsdienst", "Darstellungsdienst");
    mapping.defineClass("PlanerischerGewaesserschutz_LV03_V1_1.TransferMetadaten.Darstellungsdienst", new String[]{   "VerweisWMS"
      ,"LegendeImWeb"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
