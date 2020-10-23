package ch.interlis.models;
public class ZG_HYDROGEOLOGISCHEOBJEKTE_2_3{
  private ZG_HYDROGEOLOGISCHEOBJEKTE_2_3() {}
  public final static String MODEL= "ZG_HydrogeologischeObjekte_2_3";
  public final static String HydrogeologischeObjekte= "ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("ZG_HydrogeologischeObjekte_2_3","null","null"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDatei"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDatei(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos(oid);
      if(type.equals("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos"))return new ch.interlis.models.ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte","HydrogeologischeObjekte");
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen", "Rueckgabebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"EigentumArt"
      ,"BetriebArt"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos", "AweNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"AbWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW2GrundEigentuemer", "OberflGewRohwaPW2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellschachtMutatPerson", "QuellschachtMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellschachtMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDatei", "AbWaEinleitDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"AbWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg", "QuellSchWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsg", new String[]{   "Quellschacht"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenPumpenanlage", "EntnahmebrunnenPumpenanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenPumpenanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5PosEntnahmebrunnen", "GwfNrAfu_Intranet5PosEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5PosEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenFassgEigentuemer", "EntnahmebrunnenFassgEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenFassgEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu", "EntbruZsBeZu");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruZsBeZu", new String[]{   "EntbruGUID"
      ,"ZsBeZuGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung2GrundEigentuemer", "OberflaechenGewFassung2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit", "SaubWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"BetriebArt"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweckVerwendungszweck", "EntbruVerZweckVerwendungszweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweckVerwendungszweck", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungsanlageMutatPerson", "VersickerungsanlageMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungsanlageMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg", "BautenGWBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"BautenGW"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck", "EntbruVerZweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweck", new String[]{   "Entnahmebrunnen"
      ,"Verwendungszweck"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwfEntnahmebrunnen", "SammeleinrichtungGwfEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwfEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktQuellschacht", "QwFsgEndpunktQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage", "Pumpenanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpenanlage", new String[]{   "AnzahlPumpen"
      ,"Pumpmenge"
      ,"PumpenBetrieb"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDateiQuellschacht", "QuellSchDateiQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDateiQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDatei", "EntbruDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenMutatPerson", "EntnahmebrunnenMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntnahmebrunnenMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25PosQuellschacht", "QwfMenge_Karte25PosQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25PosQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2PosAnreicherungsanlage", "AnrNrAfu_Intranet2PosAnreicherungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2PosAnreicherungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaecheBautenGW", "BautenGWFlaecheBautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaecheBautenGW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassungFassgEigentuemer", "OberflaechenGewFassungFassgEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassungFassgEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu", "QuellSchZsBeZu");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchZsBeZu", new String[]{   "QuellSchGUID"
      ,"ZsBeZuGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDateiVersickerungsanlage", "VersiDateiVersickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDateiVersickerungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf", "SammeleinrichtungGwf");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwf", new String[]{   "Geometrie"
      ,"Typ"
      ,"FsgHorizont"
      ,"FsgStrangNr"
      ,"FsgHorizontKote"
      ,"LtgDimension"
      ,"FsgLeitungRichtung"
      ,"FsgLeitungLaenge"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GUID"
      ,"Entnahmebrunnen"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDatei", "RuebruuDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"Rueckgabebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw", "QuellSchGSBAoTw");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGSBAoTw", new String[]{   "QuellSchGUID"
      ,"GSBAoTwGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5PosAbWaEinleit", "AweNrAfu_Intranet5PosAbWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet5PosAbWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitMutatPerson", "AbWaEinleitMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5Pos", "AnrNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Anreicherungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche", "BautenGWFlaeche");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWFlaeche", new String[]{   "Geometrie"
      ,"BautenGW"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungRueckgabebrunnen", "RueckgabeLeitungRueckgabebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungRueckgabebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage3KontaktPerson", "Versickerungsanlage3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5PosBautenGW", "BgwNrAfu_Intranet5PosBautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5PosBautenGW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos", "GwfNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht3KontaktPerson", "Quellschacht3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWPumpenanlage", "OberflGewRohwaPWPumpenanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWPumpenanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsgWasserversorgung", "RuebruWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos", "OwfNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"OberflaechenGewFassung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos", "SweNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"SaubWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassungMutatPerson", "OberflaechenGewFassungMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassungMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2PosEntnahmebrunnen", "GwfNrAfu_Intranet2PosEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet2PosEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDateiAnreicherungsanlage", "AnranlDateiAnreicherungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDateiAnreicherungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsgWasserversorgung", "VersiWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsgWasserversorgung", "EntbruWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw", "ObFasGSBAoTw");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGSBAoTw", new String[]{   "ObGewFasGUID"
      ,"GSBAoTwGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2PosVersickerungsanlage", "VerNrAfu_Intranet2PosVersickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2PosVersickerungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit2GrundEigentuemer", "SaubWaEinleit2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiRegVersickerungsanlage", "VersiBewiRegVersickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiRegVersickerungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitMutatPerson", "SaubWaEinleitMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiRegAbWaEinleit", "AbWaEinleitBewiRegAbWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiRegAbWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsgVersickerungsanlage", "VersiWasservsgVersickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsgVersickerungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweckEntnahmebrunnen", "EntbruVerZweckEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruVerZweckEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiRegOberflaechenGewFassung", "ObFasBewiRegOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiRegOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg", "AbWaEinleitBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"AbWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweckVerwendungszweck", "ObFasVerZweckVerwendungszweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweckVerwendungszweck", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung", "OberflGewFsgLeitung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitung", new String[]{   "Geometrie"
      ,"Typ"
      ,"Nachfuehrungsstand"
      ,"LtgDimension"
      ,"Bemerkungen"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GUID"
      ,"MutatPerson"
      ,"OberflGewRohwPW"
      ,"OberflaechenGewFassung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwfQuellschacht", "SammeleinrichtungQwfQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwfQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen3KontaktPerson", "Rueckgabebrunnen3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5PosOberflaechenGewFassung", "OwfNrAfu_Intranet5PosOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet5PosOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet", "Fassungseinzugsgebiet");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Fassungseinzugsgebiet", new String[]{   "Geometrie"
      ,"DetailplanArt"
      ,"DetailplanMstab"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"Bewilligungsdatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"GUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck", "ObFasVerZweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweck", new String[]{   "OberflaechenGewFassung"
      ,"Verwendungszweck"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDateiBautenGW", "BautenGWDateiBautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDateiBautenGW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos", "QwfNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen2GrundEigentuemer", "Entnahmebrunnen2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg", "EntbruBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiReg", new String[]{   "BewiNummer"
      ,"Entnahmemenge"
      ,"Pumpmenge"
      ,"Datum"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse", "Adresse");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Adresse", new String[]{   "Name"
      ,"Vorname"
      ,"Adresse"
      ,"PLZ"
      ,"Ort"
      ,"TelefonP"
      ,"TelefonG"
      ,"Email"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW2GrundEigentuemer", "BautenGW2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDatei", "QwFsgEndpktDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"QwFsgEndpunkt"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDateiEntnahmebrunnen", "EntbruDateiEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruDateiEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage", "Anreicherungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Anreicherungsanlage", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"Bewilligungsdatum"
      ,"BetriebArt"
      ,"Anreicherungsmenge"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GUID"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsgWasserversorgung", "ObFasWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2PosBautenGW", "BgwNrAfu_Intranet2PosBautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2PosBautenGW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2PosQuellschacht", "QwfNrAfu_Intranet2PosQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2PosQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktFassgEigentuemer", "QwFsgEndpunktFassgEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktFassgEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsg", "AnranlWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsg", new String[]{   "Anreicherungsanlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone", "EntbruGWSZone");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGWSZone", new String[]{   "EntbruGUID"
      ,"GWSZoneGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck", "QuellSchVerZweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweck", new String[]{   "Quellschacht"
      ,"Verwendungszweck"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellschachtFassgEigentuemer", "QuellschachtFassgEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellschachtFassgEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDatei", "SaubWaEinleitDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"SaubWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2Pos", "AnrNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Anreicherungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos", "SweNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"SaubWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungOberflGewRohwPW", "OberflGewFsgLeitungOberflGewRohwPW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungOberflGewRohwPW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabebrunnenMutatPerson", "RueckgabebrunnenMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabebrunnenMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDateiQwFsgEndpunkt", "QwFsgEndpktDateiQwFsgEndpunkt");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpktDateiQwFsgEndpunkt", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW3KontaktPerson", "OberflGewRohwaPW3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf", "SammeleinrichtungQwf");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwf", new String[]{   "Geometrie"
      ,"Typ"
      ,"FsgHorizont"
      ,"FsgStrangNr"
      ,"FsgHorizontKote"
      ,"LtgDimension"
      ,"FsgLeitungRichtung"
      ,"FsgLeitungLaenge"
      ,"BetriebArt"
      ,"SchuettmengeMin"
      ,"ErtragMinAng"
      ,"SchuettmengeMax"
      ,"ErtragMaxAng"
      ,"SchuettmengeMittl"
      ,"ErtragMittlAng"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GUID"
      ,"MutatPerson"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungMutatPerson", "RueckgabeLeitungMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu", "ObFasZsBeZu");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasZsBeZu", new String[]{   "ObGewFasGUID"
      ,"ZsBeZuGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabebrunnenAnlageEigentuemer", "RueckgabebrunnenAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabebrunnenAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsgAnreicherungsanlage", "AnranlWasservsgAnreicherungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsgAnreicherungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW", "OberflGewRohwaPW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPW", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"EigentumArt"
      ,"BetriebArt"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"Pumpenanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitAnlageEigentuemer", "AbWaEinleitAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage2GrundEigentuemer", "Versickerungsanlage2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiRegSaubWaEinleit", "SaubWaEinleitBewiRegSaubWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiRegSaubWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWAnlageEigentuemer", "OberflGewRohwaPWAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsgFassungseinzugsgebiet", "FassgebWasservsgFassungseinzugsgebiet");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsgFassungseinzugsgebiet", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWMutatPerson", "OberflGewRohwaPWMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewRohwaPWMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung3KontaktPerson", "OberflaechenGewFassung3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson", "MutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.MutatPerson", new String[]{   "MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung", "OberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflaechenGewFassung", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"EigentumArt"
      ,"PrivaterNutzer"
      ,"BetriebArt"
      ,"Notversorgung"
      ,"Tiefe"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GewAbschnittCode"
      ,"GewAbschnittKm"
      ,"GUID"
      ,"FassgEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiRegBautenGW", "BautenGWBewiRegBautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWBewiRegBautenGW", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweckQuellschacht", "QuellSchVerZweckQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweckQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit", "AbWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"BetriebArt"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos", "VerNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Versickerungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt", "QwFsgEndpunkt");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt", new String[]{   "Lage"
      ,"Typ"
      ,"Fassungsart"
      ,"Name"
      ,"ObjektNummer"
      ,"EigentumArt"
      ,"PrivaterNutzer"
      ,"BetriebArt"
      ,"Notversorgung"
      ,"SchuettmengeMin"
      ,"ErtragMinAng"
      ,"SchuettmengeMax"
      ,"ErtragMaxAng"
      ,"SchuettmengeMittl"
      ,"ErtragMittlAng"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"HoeheTerrain"
      ,"HoeheAuslauf"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"FassgEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweckVerwendungszweck", "QuellSchVerZweckVerwendungszweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchVerZweckVerwendungszweck", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg", "VersiBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"Versickerungsmenge"
      ,"Versickerungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDatei", "VersiDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"Versickerungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnreicherungsanlageMutatPerson", "AnreicherungsanlageMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnreicherungsanlageMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw", "EntbruGSBAoTw");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruGSBAoTw", new String[]{   "EntbruGUID"
      ,"GSBAoTwGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg", "EntbruWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsg", new String[]{   "Entnahmebrunnen"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDateiAbWaEinleit", "AbWaEinleitDateiAbWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleitDateiAbWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg", "ObFasWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsg", new String[]{   "OberflaechenGewFassung"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungMutatPerson", "OberflGewFsgLeitungMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit3KontaktPerson", "AbWaEinleit3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDatei", "QuellSchDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsgWasserversorgung", "FassgebWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungEntnahmebrunnen", "RueckgabeLeitungEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitungEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos", "QwfMenge_Karte25Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfMenge_Karte25Pos", new String[]{   "Pos"
      ,"PlatzhalterBeschriftung"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsgRueckgabebrunnen", "RuebruWasservsgRueckgabebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsgRueckgabebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiRegRueckgabebrunnen", "RuebruBewiRegRueckgabebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiRegRueckgabebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5PosAnreicherungsanlage", "AnrNrAfu_Intranet5PosAnreicherungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnrNrAfu_Intranet5PosAnreicherungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung", "RueckgabeLeitung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RueckgabeLeitung", new String[]{   "Geometrie"
      ,"Typ"
      ,"Nachfuehrungsstand"
      ,"LtgDimension"
      ,"Bemerkungen"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GUID"
      ,"Entnahmebrunnen"
      ,"MutatPerson"
      ,"Rueckgabebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos", "BgwNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"BautenGW"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen", "Entnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"EigentumArt"
      ,"PrivaterNutzer"
      ,"BetriebArt"
      ,"Notversorgung"
      ,"FilterrohrDimension"
      ,"TiefeTerrAbstich"
      ,"WspHoeheTiefst"
      ,"K_Wert"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"HoeheTerrAbstich"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"FassgEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"Pumpenanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDatei", "BautenGWDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"BautenGW"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsgOberflaechenGewFassung", "ObFasWasservsgOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasWasservsgOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktMutatPerson", "QwFsgEndpunktMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunktMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage", "Versickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Versickerungsanlage", new String[]{   "Lage"
      ,"Typ"
      ,"Art"
      ,"Name"
      ,"ObjNrAfu"
      ,"BetriebArt"
      ,"Qualitaet"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW3KontaktPerson", "BautenGW3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsgQuellschacht", "QuellSchWasservsgQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsgQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2PosAbWaEinleit", "AweNrAfu_Intranet2PosAbWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2PosAbWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDatei", "AnranlDatei");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlDatei", new String[]{   "Name"
      ,"Datum"
      ,"Dateiname"
      ,"Anreicherungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsgEntnahmebrunnen", "EntbruWasservsgEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruWasservsgEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5PosVersickerungsanlage", "VerNrAfu_Intranet5PosVersickerungsanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5PosVersickerungsanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungOberflaechenGewFassung", "OberflGewFsgLeitungOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OberflGewFsgLeitungOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwfMutatPerson", "SammeleinrichtungGwfMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungGwfMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos", "VerNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VerNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Versickerungsanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe", "Pumpe");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Pumpe", new String[]{   "PumpeNummer"
      ,"Foerdermenge"
      ,"MotorLeistung"
      ,"Pumpenanlage"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5PosSaubWaEinleit", "SweNrAfu_Intranet5PosSaubWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet5PosSaubWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg", "FassgebWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.FassgebWasservsg", new String[]{   "Fassungseinzugsgebiet"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitAnlageEigentuemer", "SaubWaEinleitAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2PosSaubWaEinleit", "SweNrAfu_Intranet2PosSaubWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SweNrAfu_Intranet2PosSaubWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit2GrundEigentuemer", "AbWaEinleit2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AbWaEinleit2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungsanlageAnlageEigentuemer", "VersickerungsanlageAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersickerungsanlageAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsgWasserversorgung", "QuellSchWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt3KontaktPerson", "QwFsgEndpunkt3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg", "SaubWaEinleitBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"SaubWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsg", "VersiWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.VersiWasservsg", new String[]{   "Versickerungsanlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht", "Quellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht", new String[]{   "Lage"
      ,"Typ"
      ,"Fassungsart"
      ,"Name"
      ,"ObjNrAfu"
      ,"EigentumArt"
      ,"PrivaterNutzer"
      ,"BetriebArt"
      ,"Notversorgung"
      ,"SchuettmengeMin"
      ,"ErtragMinAng"
      ,"SchuettmengeMax"
      ,"ErtragMaxAng"
      ,"SchuettmengeMittl"
      ,"ErtragMittlAng"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"HoeheTerrain"
      ,"HoeheAuslauf"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"FassgEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsg", "RuebruWasservsg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruWasservsg", new String[]{   "Rueckgabebrunnen"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone", "QuellSchGWSZone");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QuellSchGWSZone", new String[]{   "QuellSchGUID"
      ,"GWSZoneGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos", "AweNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AweNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"AbWaEinleit"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg", "RuebruBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"Versickerungsmenge"
      ,"Rueckgabebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck", "Verwendungszweck");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Verwendungszweck", new String[]{   "Zweck"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWMutatPerson", "BautenGWMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2PosOberflaechenGewFassung", "OwfNrAfu_Intranet2PosOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2PosOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsgWasserversorgung", "AnranlWasservsgWasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.AnranlWasservsgWasserversorgung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos", "QwfNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Quellschacht"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW", "BautenGW");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGW", new String[]{   "Lage"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"GUID"
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos", "GwfNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.GwfNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone", "ObFasGWSZone");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasGWSZone", new String[]{   "ObGewFasGUID"
      ,"GWSZoneGUID"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt2GrundEigentuemer", "QwFsgEndpunkt2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwFsgEndpunkt2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen2GrundEigentuemer", "Rueckgabebrunnen2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Rueckgabebrunnen2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg", "ObFasBewiReg");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasBewiReg", new String[]{   "BewiNummer"
      ,"Datum"
      ,"Entnahmemenge"
      ,"OberflaechenGewFassung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5PosQuellschacht", "QwfNrAfu_Intranet5PosQuellschacht");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.QwfNrAfu_Intranet5PosQuellschacht", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWAnlageEigentuemer", "BautenGWAnlageEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BautenGWAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.PumpePumpenanlage", "PumpePumpenanlage");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.PumpePumpenanlage", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung", "Wasserversorgung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Wasserversorgung", new String[]{   "WVName"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht2GrundEigentuemer", "Quellschacht2GrundEigentuemer");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Quellschacht2GrundEigentuemer", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos", "OwfNrAfu_Intranet2Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.OwfNrAfu_Intranet2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"OberflaechenGewFassung"
      });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit3KontaktPerson", "SaubWaEinleit3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleit3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwfMutatPerson", "SammeleinrichtungQwfMutatPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SammeleinrichtungQwfMutatPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDateiSaubWaEinleit", "SaubWaEinleitDateiSaubWaEinleit");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.SaubWaEinleitDateiSaubWaEinleit", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiRegEntnahmebrunnen", "EntbruBewiRegEntnahmebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.EntbruBewiRegEntnahmebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen3KontaktPerson", "Entnahmebrunnen3KontaktPerson");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.Entnahmebrunnen3KontaktPerson", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweckOberflaechenGewFassung", "ObFasVerZweckOberflaechenGewFassung");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.ObFasVerZweckOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDateiRueckgabebrunnen", "RuebruuDateiRueckgabebrunnen");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.RuebruuDateiRueckgabebrunnen", new String[]{  });
    nameMap.put("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos", "BgwNrAfu_Intranet5Pos");
    mapping.defineClass("ZG_HydrogeologischeObjekte_2_3.HydrogeologischeObjekte.BgwNrAfu_Intranet5Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Size"
      ,"Plantyp"
      ,"BautenGW"
      });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
