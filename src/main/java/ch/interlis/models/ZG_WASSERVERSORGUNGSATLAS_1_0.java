package ch.interlis.models;
public class ZG_WASSERVERSORGUNGSATLAS_1_0{
  private ZG_WASSERVERSORGUNGSATLAS_1_0() {}
  public final static String MODEL= "ZG_Wasserversorgungsatlas_1_0";
  public final static String WVAObjekte= "ZG_Wasserversorgungsatlas_1_0.WVAObjekte";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("ZG_Wasserversorgungsatlas_1_0","null","null"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDatei"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDatei(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg(oid);
      if(type.equals("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg"))return new ch.interlis.models.ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte","WVAObjekte");
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameTextOberflGewRohwaPW", "OGRohwaPWNameTextOberflGewRohwaPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameTextOberflGewRohwaPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter", "Versorgungsperimeter");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Versorgungsperimeter", new String[]{   "Geometrie"
      ,"GUID"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4Text", "ReinwaPWTechData4Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText", "OGRohwaPWTechDataText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"OberflGewRohwaPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text", "EntbruTechData3Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantGrundlage", "HydrantGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtLaufBrunnen", "QuellschachtLaufBrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtLaufBrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstTextQuellschacht", "QueSchaErtragBrstTextQuellschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstTextQuellschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameTextPumpwerk", "PWNameTextPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameTextPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsgWasserversorgung", "LaufBruWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleGrundlage", "AbgabestelleGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDateiPumpwerk", "PWDateiPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDateiPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText", "AufbWkrFilterLeistText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Aufbereitungswerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtHydWidder", "QuellschachtHydWidder");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtHydWidder", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenMutatPerson", "EntnahmebrunnenMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntnahmebrunnenMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen", "LaufBrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnen", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkGrundlage", "AufbereitungswerkGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson", "MutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.MutatPerson", new String[]{   "MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataTextOberflGewRohwaPW", "OGRohwaPWTechDataTextOberflGewRohwaPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWTechDataTextOberflGewRohwaPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtMutatPerson", "QuellschachtMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText", "ResNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Reservoir"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDatei", "ResDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Reservoir"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsgTWTurbine", "TWTurbineWasservsgTWTurbine");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsgTWTurbine", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitTextWVAFassungsleitung", "WVAFsgLeitTextWVAFassungsleitung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitTextWVAFassungsleitung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnenMutatPerson", "LaufBrunnenMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnenMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkReservoir", "AufbereitungswerkReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsgWasserversorgung", "RWZistWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2TextReinwasserPW", "ReinwaPWTechData2TextReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2TextReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameTextVersorgungsperimeter", "VerPerNameTextVersorgungsperimeter");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameTextVersorgungsperimeter", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText", "SaSchaTechDataText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Sammelschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtPumpwerk", "QuellschachtPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchieberschachtMutatPerson", "SchieberschachtMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchieberschachtMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleHydrant", "AbgabestelleHydrant");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleHydrant", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText", "QueSchaErtragBrstText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragBrstText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Quellschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDateiTWTurbine", "TWTurbineDateiTWTurbine");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDateiTWTurbine", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW", "ReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPW", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"TotFoerdermenge"
      ,"TechData1"
      ,"TechData2"
      ,"TechData3"
      ,"TechData4"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Aufbereitungswerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg", "SchiSchaWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsg", new String[]{   "Schieberschacht"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataTextReservoir", "ResTechDataTextReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataTextReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkMutatPerson", "AufbereitungswerkMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbereitungswerkMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitungMutatPerson", "WVAFassungsleitungMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitungMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsgRWZisterne", "RWZistWasservsgRWZisterne");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsgRWZisterne", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDatei", "ReinwaPWDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDateiSammelschacht", "SaSchaDateiSammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDateiSammelschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText", "AufbWkrNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Aufbereitungswerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameTextTWTurbine", "TWTurbnineNameTextTWTurbine");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameTextTWTurbine", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text", "PWTechData4Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText", "ResTechDataText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResTechDataText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Reservoir"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsgPumpwerk", "PWWasservsgPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsgPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine", "TWTurbine");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbine", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Name"
      ,"Betriebsart"
      ,"Baujahr"
      ,"Turbine"
      ,"Durchfluss"
      ,"Bruttofallhoehe"
      ,"Nettofallhoehe"
      ,"Turbinenleistung"
      ,"Jahresproduktion"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge", "ReinwaPWFoeMenge");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMenge", new String[]{   "Foerdermenge"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDateiRWZisterne", "RWZistDateiRWZisterne");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDateiRWZisterne", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterMutatPerson", "VersorgungsperimeterMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchieberschachtGrundlage", "SchieberschachtGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchieberschachtGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText", "TWTurbnineNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbnineNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"TWTurbine"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text", "EntbruTechData1Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg", "TWTurbineWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsg", new String[]{   "TWTurbine"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PumpwerkMutatPerson", "PumpwerkMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PumpwerkMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterWasserversorgung", "VersorgungsperimeterWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterneGrundlage", "RWZisterneGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterneGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText", "QueSchaErtragGrpText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Quellschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsgWasserversorgung", "AufbWkrWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDatei", "SchiSchaDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Schieberschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirStufenpumpwerk", "ReservoirStufenpumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirStufenpumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWVGrundlage", "LeitungsnetzWVGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWVGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeTextOberflGewFsg", "ObflGewFsgTiefeTextOberflGewFsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeTextOberflGewFsg", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameTextReservoir", "ResNameTextReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResNameTextReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text", "EntbruTechData4Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel", "Kaliberwechsel");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Kaliberwechsel", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"GUID"
      ,"Farbe"
      ,"SymbolTyp"
      ,"Leitungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg", "HydWidderWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsg", new String[]{   "HydWidder"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung", "OberflGewFassung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassung", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Tiefe"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsgKaliberwechsel", "KalweWasservsgKaliberwechsel");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsgKaliberwechsel", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsgReinwasserPW", "ReinwaPWWasservsgReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsgReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnenGrundlage", "LaufBrunnenGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBrunnenGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText", "EntbruNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMengePumpwerk", "PWFoeMengePumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMengePumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4TextPumpwerk", "PWTechData4TextPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData4TextPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3TextPumpwerk", "PWTechData3TextPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3TextPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleMutatPerson", "UebergabestelleMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg", "VerLeitWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsg", new String[]{   "LeitungsnetzWV"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsgWasserversorgung", "VerLeitWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtReservoir", "QuellschachtReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberwechselMutatPerson", "KaliberwechselMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberwechselMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungMutatPerson", "NotLeitungMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk", "Aufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Aufbereitungswerk", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"FilterLeist"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Reservoir"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameTextAufbereitungswerk", "AufbWkrNameTextAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrNameTextAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtSammelschacht", "QuellschachtSammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QuellschachtSammelschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungLieferungVon", "NotLeitungLieferungVon");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungLieferungVon", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle2LieferungNach", "Uebergabestelle2LieferungNach");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle2LieferungNach", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text", "EntbruTechData2Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsgWasserversorgung", "SaSchaWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht", "Schieberschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Schieberschacht", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Leitungsart"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2TextEntnahmebrunnen", "EntbruTechData2TextEntnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData2TextEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPWAufbereitungswerk", "OberflGewRohwaPWAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPWAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText", "OGFsgLeitungText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"OberflGewFsgLeitung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir", "Reservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Reservoir", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"SymbolTyp"
      ,"Name"
      ,"WspHoehe"
      ,"Brauchreserve"
      ,"Loeschreserve"
      ,"Gesamtinhalt"
      ,"Techdata"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Stufenpumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle", "Uebergabestelle");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Uebergabestelle", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Name"
      ,"UebergabeOrt"
      ,"VerbundNr"
      ,"VerbundArt"
      ,"AusloesungVon"
      ,"PumpeVon"
      ,"VerbindungsleitungVon"
      ,"AusloesungNach"
      ,"PumpeNach"
      ,"VerbindungsleitungNach"
      ,"Bemerkung"
      ,"Objekt"
      ,"ObjektArt"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"LieferungNach"
      ,"LieferungVon"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleWasserversorgung", "AbgabestelleWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung", "WVAFassungsleitung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFassungsleitung", new String[]{   "SymbolGeo"
      ,"GUID"
      ,"Farbe"
      ,"LeitText"
      ,"Genauigkeit"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsgSammelschacht", "SaSchaWasservsgSammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsgSammelschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDatei", "AufbWkrDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Aufbereitungswerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsgDruckreduktion", "DruckreWasservsgDruckreduktion");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsgDruckreduktion", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPWMutatPerson", "OberflGewRohwaPWMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPWMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung", "NotLeitung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung", new String[]{   "Geometrie"
      ,"GUID"
      ,"Name"
      ,"UebergabeOrt"
      ,"VerbundNr"
      ,"AusloesungVon"
      ,"PumpeVon"
      ,"VerbindungsleitungVon"
      ,"AusloesungNach"
      ,"PumpeNach"
      ,"VerbindungsleitungNach"
      ,"Bemerkung"
      ,"Objekt"
      ,"ObjektArt"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"LieferungNach"
      ,"LieferungVon"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4TextEntnahmebrunnen", "EntbruTechData4TextEntnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData4TextEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsgLeitungsnetzWV", "VerLeitWasservsgLeitungsnetzWV");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitWasservsgLeitungsnetzWV", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SammelschachtGrundlage", "SammelschachtGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SammelschachtGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text", "PWTechData2Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3TextEntnahmebrunnen", "EntbruTechData3TextEntnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData3TextEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung", "Wasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Wasserversorgung", new String[]{   "WVName"
      ,"Nummer"
      ,"EigentumArt"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsgWasserversorgung", "DruckreWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantMutatPerson", "HydrantMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpTextQuellschacht", "QueSchaErtragGrpTextQuellschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.QueSchaErtragGrpTextQuellschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberwechselGrundlage", "KaliberwechselGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KaliberwechselGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderGrundlage", "HydWidderGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsgSchieberschacht", "SchiSchaWasservsgSchieberschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsgSchieberschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameTextRWZisterne", "RWZistNameTextRWZisterne");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameTextRWZisterne", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistTextAufbereitungswerk", "AufbWkrFilterLeistTextAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrFilterLeistTextAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsgWasserversorgung", "ResWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWMutatPerson", "ReinwasserPWMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDatei", "RWZistDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"RWZisterne"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung", "OberflGewFsgLeitung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitung", new String[]{   "SymbolGeo"
      ,"GUID"
      ,"Farbe"
      ,"LeitText"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDateiAufbereitungswerk", "AufbWkrDateiAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrDateiAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirMutatPerson", "ReservoirMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText", "OGRohwaPWNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGRohwaPWNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"OberflGewRohwaPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDatei", "LaufBruDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"LaufBrunnen"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1TextReinwasserPW", "ReinwaPWTechData1TextReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1TextReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4TextReinwasserPW", "ReinwaPWTechData4TextReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData4TextReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDatei", "DruckreDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Druckreduktion"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineGrundlage", "TWTurbineGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText", "PWNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage", "Grundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Grundlage", new String[]{   "DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanBz"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"KontaktDatum"
      ,"KontaktPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWVMutatPerson", "LeitungsnetzWVMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWVMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantWasserversorgung", "HydrantWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydrantWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion", "Druckreduktion");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Druckreduktion", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Leitungsart"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Druckeingang"
      ,"Druckausgang"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDateiLaufBrunnen", "LaufBruDateiLaufBrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruDateiLaufBrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWGrundlage", "ReinwasserPWGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV", "LeitungsnetzWV");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LeitungsnetzWV", new String[]{   "Geometrie"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Nutzungsart"
      ,"Dimension"
      ,"LeitText"
      ,"Betriebsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDatei", "TWTurbineDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"TWTurbine"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDatei", "PWDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameTextSammelschacht", "SaSchaNameTextSammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameTextSammelschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDateiHydWidder", "HydWidderDateiHydWidder");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDateiHydWidder", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleMutatPerson", "AbgabestelleMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AbgabestelleMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassungMutatPerson", "OberflGewFassungMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFassungMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text", "PWTechData3Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData3Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataTextSammelschacht", "SaSchaTechDataTextSammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaTechDataTextSammelschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen", "Entnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Entnahmebrunnen", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Name"
      ,"Techdata1"
      ,"Techdata2"
      ,"Techdata3"
      ,"Techdata4"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameText", "ReinwaPWNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsg", "RWZistWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistWasservsg", new String[]{   "RWZisterne"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsgHydWidder", "HydWidderWasservsgHydWidder");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsgHydWidder", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText", "ObflGewFsgTiefeText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ObflGewFsgTiefeText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"OberflGewFsg"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.GrundlageKontaktPerson", "GrundlageKontaktPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.GrundlageKontaktPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge", "PWFoeMenge");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWFoeMenge", new String[]{   "Foerdermenge"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsgWasserversorgung", "HydWidderWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDatei", "HydWidderDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"HydWidder"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht", "Quellschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Quellschacht", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"EtragBrst"
      ,"ErtragGrp"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"HydWidder"
      ,"LaufBrunnen"
      ,"MutatPerson"
      ,"Pumpwerk"
      ,"Reservoir"
      ,"Sammelschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text", "ReinwaPWTechData1Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData1Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterneMutatPerson", "RWZisterneMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterneMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsgWasserversorgung", "TWTurbineWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWAufbereitungswerk", "ReinwasserPWAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwasserPWAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder", "HydWidder");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidder", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsgAufbereitungswerk", "AufbWkrWasservsgAufbereitungswerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsgAufbereitungswerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDateiSchieberschacht", "SchiSchaDateiSchieberschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaDateiSchieberschacht", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg", "AufbWkrWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AufbWkrWasservsg", new String[]{   "Aufbereitungswerk"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMengeReinwasserPW", "ReinwaPWFoeMengeReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWFoeMengeReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDatei", "SaSchaDatei");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaDatei", new String[]{   "Name"
      ,"Dateiname"
      ,"Sammelschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleGrundlage", "UebergabestelleGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne", "RWZisterne");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZisterne", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Name"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg", "DruckreWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreWasservsg", new String[]{   "Druckreduktion"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreduktionMutatPerson", "DruckreduktionMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreduktionMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsgWasserversorgung", "ReinwaPWWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungTextOberflGewFsgLeitung", "OGFsgLeitungTextOberflGewFsgLeitung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OGFsgLeitungTextOberflGewFsgLeitung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text", "ReinwaPWTechData2Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData2Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitText", "WVAFsgLeitText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.WVAFsgLeitText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"WVAFassungsleitung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText", "SaSchaNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Sammelschacht"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk", "Pumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Pumpwerk", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Typ"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"TotFoerdermenge"
      ,"Techdata1"
      ,"Techdata2"
      ,"Techdata3"
      ,"Techdata4"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsgWasserversorgung", "PWWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleLieferungVon", "UebergabestelleLieferungVon");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.UebergabestelleLieferungVon", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg", "KalweWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsg", new String[]{   "Kaliberwechsel"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg", "ResWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsg", new String[]{   "Reservoir"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie", "Hilfslinie");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hilfslinie", new String[]{   "SymbolGeo"
      ,"Farbe"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameText", "VerPerNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerPerNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Versorgungsperimeter"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterGrundlage", "VersorgungsperimeterGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VersorgungsperimeterGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDateiReservoir", "ResDateiReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResDateiReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle", "Abgabestelle");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Abgabestelle", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"StrassePlatz"
      ,"NaehereBezeichnung"
      ,"Schlauchlaenge"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"Hydrant"
      ,"MutatPerson"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineMutatPerson", "TWTurbineMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.TWTurbineMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameTextEntnahmebrunnen", "EntbruNameTextEntnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruNameTextEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitTextLeitungsnetzWV", "VerLeitTextLeitungsnetzWV");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitTextLeitungsnetzWV", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant", "Hydrant");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Hydrant", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Nummer"
      ,"Notversorgung"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameText", "RWZistNameText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.RWZistNameText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"RWZisterne"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2TextPumpwerk", "PWTechData2TextPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData2TextPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse", "Adresse");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Adresse", new String[]{   "Name"
      ,"Vorname"
      ,"Adresse"
      ,"PLZ"
      ,"Ort"
      ,"TelefonP"
      ,"TelefonG"
      ,"Email"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1TextPumpwerk", "PWTechData1TextPumpwerk");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1TextPumpwerk", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg", "LaufBruWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsg", new String[]{   "LaufBrunnen"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsgWasserversorgung", "SchiSchaWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SchiSchaWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsgWasserversorgung", "KalweWasservsgWasserversorgung");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.KalweWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderMutatPerson", "HydWidderMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.HydWidderMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1TextEntnahmebrunnen", "EntbruTechData1TextEntnahmebrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.EntbruTechData1TextEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameTextReinwasserPW", "ReinwaPWNameTextReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWNameTextReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PumpwerkGrundlage", "PumpwerkGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PumpwerkGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitungMutatPerson", "OberflGewFsgLeitungMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewFsgLeitungMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3Text", "ReinwaPWTechData3Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"ReinwasserPW"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsgLaufBrunnen", "LaufBruWasservsgLaufBrunnen");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.LaufBruWasservsgLaufBrunnen", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirGrundlage", "ReservoirGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReservoirGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungGrundlage", "NotLeitungGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitungGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW", "OberflGewRohwaPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.OberflGewRohwaPW", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"GUID"
      ,"Farbe"
      ,"Name"
      ,"TechData"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Aufbereitungswerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDateiReinwasserPW", "ReinwaPWDateiReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWDateiReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsgReservoir", "ResWasservsgReservoir");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ResWasservsgReservoir", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text", "PWTechData1Text");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWTechData1Text", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Pumpwerk"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg", "PWWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.PWWasservsg", new String[]{   "Pumpwerk"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreduktionGrundlage", "DruckreduktionGrundlage");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreduktionGrundlage", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText", "VerLeitText");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.VerLeitText", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"LeitungsnetzWV"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer", "AnschriftNummer");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.AnschriftNummer", new String[]{   "Pos"
      ,"Nummer"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht", "Sammelschacht");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.Sammelschacht", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"RealY"
      ,"RealX"
      ,"GUID"
      ,"Farbe"
      ,"Leitungsart"
      ,"Name"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"TechData"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg", "ReinwaPWWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWWasservsg", new String[]{   "ReinwasserPW"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung2LieferungNach", "NotLeitung2LieferungNach");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.NotLeitung2LieferungNach", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SammelschachtMutatPerson", "SammelschachtMutatPerson");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SammelschachtMutatPerson", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3TextReinwasserPW", "ReinwaPWTechData3TextReinwasserPW");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.ReinwaPWTechData3TextReinwasserPW", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDateiDruckreduktion", "DruckreDateiDruckreduktion");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.DruckreDateiDruckreduktion", new String[]{  });
    nameMap.put("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg", "SaSchaWasservsg");
    mapping.defineClass("ZG_Wasserversorgungsatlas_1_0.WVAObjekte.SaSchaWasservsg", new String[]{   "Sammelschacht"
      ,"Wasserversorgung"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
