package ch.interlis.models;
public class ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1{
  private ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1() {}
  public final static String MODEL= "ZG_PlanerischerGewaesserschutz_V1_1";
  public final static String GWSZonen= "ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen";
  public final static String GSBereiche= "ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche";
  public final static String TransferMetadaten= "ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("ZG_PlanerischerGewaesserschutz_V1_1","http://models.geo.zg.ch","2018_06_19"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZone"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZone(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Amt"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Amt(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZoneWasserversorgung"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZoneWasserversorgung(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereich"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereich(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Status"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Status(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Darstellungsdienst"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Darstellungsdienst(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Wasserversorgung"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Wasserversorgung(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Einzugsgebiet_GSB_Ao_Trinkwasser"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Einzugsgebiet_GSB_Ao_Trinkwasser(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Wasserversorgung"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Wasserversorgung(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSArealWasserversorgung"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSArealWasserversorgung(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSAreal"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSAreal(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Datenbestand"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Datenbestand(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichWasserversorgung"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichWasserversorgung(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet(oid);
      if(type.equals("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Status"))return new ch.interlis.models.ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Status(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen","GWSZonen");
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche","GSBereiche");
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten","TransferMetadaten");
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZone", "GWSZone");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZone", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Bemerkungen"
      ,"Typ"
      ,"KantonaleTypBezeichnung"
      ,"istAltrechtlich"
      ,"Status"
      ,"ObjName"
      ,"ObjNummer"
      ,"HydrObjArt"
      ,"DetailplanArt"
      ,"DetailplanMstab"
      ,"ErfGenauigkeit"
      ,"Rechtsverbindlichkeit"
      ,"GeometrieHerkunft"
      ,"Erlassdatum"
      ,"Mutationsdatum"
      ,"Lexlink"
      ,"GUID"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Amt", "Amt");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Amt", new String[]{   "Name"
      ,"AmtImWeb"
      ,"UID"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZoneWasserversorgung", "GWSZoneWasserversorgung");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSZoneWasserversorgung", new String[]{   "GWSZone"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereich", "GSBereich");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereich", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Typ"
      ,"KantonaleTypBezeichnung"
      ,"Bemerkungen"
      ,"ObjName"
      ,"ObjNummer"
      ,"DetailplanArt"
      ,"DetailplanMstab"
      ,"ErfGenauigkeit"
      ,"Rechtsverbindlichkeit"
      ,"GeometrieHerkunft"
      ,"Erlassdatum"
      ,"Mutationsdatum"
      ,"Lexlink"
      ,"GUID"
      ,"Status"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Status", "GWSZonen.Status");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Status", new String[]{   "Rechtsstatus"
      ,"Rechtskraftdatum"
      ,"Bemerkungen"
      ,"KantonalerStatus"
      ,"Beschlussverweis"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Darstellungsdienst", "Darstellungsdienst");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Darstellungsdienst", new String[]{   "VerweisWMS"
      ,"LegendeImWeb"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Wasserversorgung", "GSBereiche.Wasserversorgung");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Wasserversorgung", new String[]{   "WVName"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Einzugsgebiet_GSB_Ao_Trinkwasser", "Einzugsgebiet_GSB_Ao_Trinkwasser");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Einzugsgebiet_GSB_Ao_Trinkwasser", new String[]{   "ObjName"
      ,"Geometrie"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Wasserversorgung", "GWSZonen.Wasserversorgung");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.Wasserversorgung", new String[]{   "WVName"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSArealWasserversorgung", "GWSArealWasserversorgung");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSArealWasserversorgung", new String[]{   "GWSAreal"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSAreal", "GWSAreal");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GWSZonen.GWSAreal", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"Bemerkungen"
      ,"Typ"
      ,"istAltrechtlich"
      ,"Status"
      ,"ObjName"
      ,"ObjNummer"
      ,"DetailplanArt"
      ,"DetailplanMstab"
      ,"ErfGenauigkeit"
      ,"Rechtsverbindlichkeit"
      ,"GeometrieHerkunft"
      ,"Erlassdatum"
      ,"Mutationsdatum"
      ,"Lexlink"
      ,"GUID"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Datenbestand", "Datenbestand");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.TransferMetadaten.Datenbestand", new String[]{   "BasketId"
      ,"Stand"
      ,"Lieferdatum"
      ,"Bemerkungen"
      ,"weitereMetadaten"
      ,"Darstellungsdienst"
      ,"zustaendigeStelle"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichWasserversorgung", "GSBereichWasserversorgung");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichWasserversorgung", new String[]{   "GSBereich"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.StatusGSBereich", "StatusGSBereich");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.StatusGSBereich", new String[]{  });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet", "GSBereichEinzugsgebiet");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.GSBereichEinzugsgebiet", new String[]{   "GSBereich"
      ,"Einzugsgebiet"
      });
    nameMap.put("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Status", "GSBereiche.Status");
    mapping.defineClass("ZG_PlanerischerGewaesserschutz_V1_1.GSBereiche.Status", new String[]{   "Rechtsstatus"
      ,"Rechtskraftdatum"
      ,"Bemerkungen"
      ,"KantonalerStatus"
      ,"Beschlussverweis"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
