package ch.interlis.models;
public class ZG_HYDROGEO_WVA_V1{
  private ZG_HYDROGEO_WVA_V1() {}
  public final static String MODEL= "ZG_hydrogeo_wva_V1";
  public final static String Wasserversorgung_Zug= "ZG_hydrogeo_wva_V1.Wasserversorgung_Zug";
  public final static String TransferMetadaten= "ZG_hydrogeo_wva_V1.TransferMetadaten";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("ZG_hydrogeo_wva_V1","http://models.geo.zg.ch","2021-07-15"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Zahl"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Zahl();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Texte"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Texte();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerPerNameText"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerPerNameText(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Oberflaechengewaesserfassung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Oberflaechengewaesserfassung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.SurfaceStructure"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.SurfaceStructure();
      if(type.equals("ZG_hydrogeo_wva_V1.Zahlen"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Zahlen();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.HilfsText"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.HilfsText();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Einleit"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Einleit(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundwasserfassung"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundwasserfassung(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.TransferMetadaten.Zustaendige_Stelle"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.TransferMetadaten.Zustaendige_Stelle(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.MultiSurface"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.MultiSurface();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.TransferMetadaten.Datenbestand"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.TransferMetadaten.Datenbestand(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos();
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf(oid);
      if(type.equals("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei"))return new ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug","Wasserversorgung_Zug");
    nameMap.put("ZG_hydrogeo_wva_V1.TransferMetadaten","TransferMetadaten");
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg", "VersorgungsperimeterWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterWasservsg", new String[]{   "Versorgungsperimeter"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos", "IntranetPos");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.IntranetPos", new String[]{   "Pos"
      ,"Ori"
      ,"Hali"
      ,"Vali"
      ,"Size"
      ,"Plantyp"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes", "QueSchaRes");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaRes", new String[]{   "Quellschacht"
      ,"Reservoir"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg", "BautenGWBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWBewiReg", new String[]{   "BautenGW"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtFassEigentuemer", "QuellschachtFassEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtFassEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru", "SammeleinrichtungEntBru");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungEntBru", new String[]{   "Sammeleinrichtung"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe_PumpenAnlage", "Pumpe_PumpenAnlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe_PumpenAnlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwfQuellschacht", "SammeleinrichtungQwfQuellschacht");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwfQuellschacht", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW", "BautenGW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGW", new String[]{   "Lage_Punkt"
      ,"Lage_Flaeche"
      ,"Typ"
      ,"Name"
      ,"ObjNrAfu"
      ,"BgwNrAfu_Intranet2Pos"
      ,"BgwNrAfu_Intranet5Pos"
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
      ,"KontakPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt", "QwFsgEndpunkt");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunkt", new String[]{   "Bemerkung"
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
      ,"QWFassungsArt"
      ,"ObjektNummer"
      ,"EigentumArt"
      ,"Notversorgung"
      ,"PrivatNutzer"
      ,"ErtragMinAng"
      ,"ErtragMaxAng"
      ,"ErtragMittlAng"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
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
      ,"FassungsEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"Quellschacht"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResGrundlage", "ResGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg", "WeitereAnlageWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageWasservsg", new String[]{   "WeitereAnlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri", "UebergabestelleNachVersPeri");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleNachVersPeri", new String[]{   "Uebergabestelle1"
      ,"LieferungNach"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant", "Hydrant");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hydrant", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"Geometrie"
      ,"Identifikator"
      ,"Nummer"
      ,"Notversorgung"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.PumpenAnlage_OberflGewRohwaPW", "PumpenAnlage_OberflGewRohwaPW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.PumpenAnlage_OberflGewRohwaPW", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungFassEigentuemer", "OberflGewFassungFassEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungFassEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitOberflaechenGewFassung", "LeitOberflaechenGewFassung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitOberflaechenGewFassung", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage", "WeitereAnlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlage", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"WeitereAnlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"NameTextPos"
      ,"Leitungsart"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Quellschacht"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung", "Wasserversorgung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Wasserversorgung", new String[]{   "WVName"
      ,"Nummer"
      ,"EigentumArt"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie", "Hilfslinie");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Hilfslinie", new String[]{   "SymbolGeo"
      ,"Farbe"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Zahl", "Zahl");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Zahl", new String[]{   "Zahl"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitMutatPerson", "LeitMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes", "AufbWrkRes");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AufbWrkRes", new String[]{   "Aufbereitungswerk"
      ,"Reservoir"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageMutatPerson", "VersickerungsanlageMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg", "EinleitBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitBewiReg", new String[]{   "Einleit"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktGrundEigentuemer", "QwFsgEndpunktGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet", "Fassungseinzugsgebiet");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Fassungseinzugsgebiet", new String[]{   "Geometrie"
      ,"DetailplanArt"
      ,"DetailplanMstab"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"Bewilligungsdatum"
      ,"Nachfuehrungsstand"
      ,"Bemerkungen"
      ,"GUID"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruKontaktPerson", "RueBruKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung", "Sammeleinrichtung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammeleinrichtung", new String[]{   "Identifikator"
      ,"Typ"
      ,"Geometrie"
      ,"ArtSammeleinrichtung"
      ,"SammeleinrichtungTyp"
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
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitAnlageEigentuemer", "EinleitAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruMutatPerson", "RueBruMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse", "Adresse");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse", new String[]{   "Name"
      ,"Vorname"
      ,"Adresse"
      ,"PLZ"
      ,"Ort"
      ,"TelefonP"
      ,"TelefonG"
      ,"Email"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Texte", "Texte");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Texte", new String[]{   "Texte"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleHydrant", "AbgabestelleHydrant");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleHydrant", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg", "QuellSchaWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaWasservsg", new String[]{   "Quellschacht"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht", "Schieberschacht");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Schieberschacht", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"WeitereAnlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"NameTextPos"
      ,"Leitungsart"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Quellschacht"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungKontaktPerson", "OberflGewFassungKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitDatei", "EinleitDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung", "NotLeitung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitung", new String[]{   "Geometrie"
      ,"Identifikator"
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
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruDatei", "EntbruDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle", "Abgabestelle");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Abgabestelle", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"Geometrie"
      ,"Identifikator"
      ,"StrassePlatz"
      ,"NaehereBezeichnung"
      ,"Schlauchlaenge"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"Hydrant"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungMutatPerson", "NotLeitungMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage", "Grundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundlage", new String[]{   "DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanBz"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"KontaktDatum"
      ,"Adresse"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg", "BewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BewiReg", new String[]{   "BewiNummer"
      ,"Entnahmemenge"
      ,"Pumpmenge"
      ,"Vesickerungsmenge"
      ,"Datum"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit", "AbWaEinleit");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbWaEinleit", new String[]{   "Lage"
      ,"Name"
      ,"ObjNrAfu"
      ,"EinlNrAfu_Intranet2Pos"
      ,"EinlNrAfu_Intranet5Pos"
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
      ,"Typ"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg", "EntbruBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruBewiReg", new String[]{   "Entnahmebrunnen"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson", "MutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.MutatPerson", new String[]{   "MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerPerNameText", "VerPerNameText");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VerPerNameText", new String[]{   "Geometrie"
      ,"Farbe"
      ,"Ori"
      ,"Hali"
      ,"Vali"
      ,"Size"
      ,"Versorgungsperimeter"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage", "Anreicherungsanlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Anreicherungsanlage", new String[]{   "Identifikator"
      ,"Name"
      ,"Typ"
      ,"Typ_Bemerkung"
      ,"Max_Versickerung"
      ,"Bezugsgewaesser"
      ,"Zweck"
      ,"GeometriePunkt"
      ,"ObjNrAfu"
      ,"AnrNrAfu_Intranet2Pos"
      ,"AnrNrAfu_Intranet5Pos"
      ,"Bewilligungsdatum"
      ,"Betriebsart"
      ,"Nachfuehrungsstand"
      ,"AuskunftsStelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"MutatBemerk"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWKontaktPerson", "BautenGWKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruGrundEigentuemer", "RueBruGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg", "ResWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResWasservsg", new String[]{   "Reservoir"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu", "EntbruGSBAoTw_ZsBeZu");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGSBAoTw_ZsBeZu", new String[]{   "Entbru"
      ,"GSBAoTw_ZsBeZu"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantGrundlage", "HydrantGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageKontaktPerson", "VersickerungsanlageKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaSchaGrundlage", "SaSchaGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaSchaGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg", "ObFasWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasWasservsg", new String[]{   "OberflGewFassung"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit", "SaubWaEinleit");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SaubWaEinleit", new String[]{   "Lage"
      ,"Name"
      ,"ObjNrAfu"
      ,"EinlNrAfu_Intranet2Pos"
      ,"EinlNrAfu_Intranet5Pos"
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
      ,"Typ"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage", "QueSchaFoerderanlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaFoerderanlage", new String[]{   "Quellschacht"
      ,"Foerderanlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri", "NotLeitungVonVersPeri");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungVonVersPeri", new String[]{   "NotLeitung"
      ,"LieferungVon"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos", "TextPos");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TextPos", new String[]{   "Pos"
      ,"Farbe"
      ,"Ori"
      ,"Hali"
      ,"Vali"
      ,"Size"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitGrundEigentuemer", "EinleitGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantMutatPerson", "HydrantMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruMutatPerson", "EntbruMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht", "Sammelschacht");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Sammelschacht", new String[]{   "Bemerkung"
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
      ,"Typ"
      ,"QWFassungsArt"
      ,"ObjNrAfu"
      ,"QwfNrAfu_Intranet2Pos"
      ,"QwfNrAfu_Intranet5Pos"
      ,"QwfMenge_Karte25Pos"
      ,"EigentumArt"
      ,"PrivatNutzer"
      ,"Betriebsart"
      ,"Notversorgung"
      ,"ErtragMinAng"
      ,"ErtragMaxAng"
      ,"ErtragMittlAng"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"HoeheTerrain"
      ,"HoeheAuslauf"
      ,"ErtragBrst"
      ,"ErtragBrstTextPos"
      ,"ErtragGrp"
      ,"ErtragGrpTextPos"
      ,"NameTextPos"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"MaxDarst"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"Verwendungszweck"
      ,"FassungsEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"Leitungsart"
      ,"TechData"
      ,"TechDataTextPos"
      ,"Grundlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGrundEigentuemer", "EntbruGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha", "QueSchaSaScha");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaSaScha", new String[]{   "Sammelschacht"
      ,"Quellschacht"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage", "Foerderanlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Foerderanlage", new String[]{   "Bemerkung"
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
      ,"FoerderanlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"TotFoerdermenge"
      ,"NameTextPos"
      ,"Techdata"
      ,"TechdataTextPos"
      ,"Techdata1"
      ,"Techdata1TextPos"
      ,"Techdata2"
      ,"Techdata2TextPos"
      ,"Techdata3"
      ,"Techdata3TextPos"
      ,"Techdata4"
      ,"Techdata4TextPos"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"EinzelFoerdermenge"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Reservoir"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu", "QuellSchGSBAoTw_ZsBeZu");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGSBAoTw_ZsBeZu", new String[]{   "QuellSch"
      ,"GSBAoTw_ZsBeZu"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg", "EntbruWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruWasservsg", new String[]{   "Entnahmebrunnen"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.TransferMetadaten.zustStelle_Daten", "zustStelle_Daten");
    mapping.defineClass("ZG_hydrogeo_wva_V1.TransferMetadaten.zustStelle_Daten", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageMutatPerson", "FoerderanlageMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung", "Leitung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Leitung", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Geometrie"
      ,"Nennweite"
      ,"LeitArt"
      ,"Nachfuehrungsstand"
      ,"Typ"
      ,"SymbolGeo"
      ,"LeitText"
      ,"LeitTextPos"
      ,"Farbe"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"MaxDarst"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"OberflGewRohwaPW"
      ,"OberflaechenGewFassung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg", "LeitWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitWasservsg", new String[]{   "Leitung"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Oberflaechengewaesserfassung", "Oberflaechengewaesserfassung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Oberflaechengewaesserfassung", new String[]{   "Bemerkung"
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
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWDatei", "BautenGWDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruAnlageEigentuemer", "RueBruAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageAnlageEigentuemer", "VersickerungsanlageAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg", "AbgabestelleWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleWasservsg", new String[]{   "Abgabestelle"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe", "Pumpe");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpe", new String[]{   "PumpeNummer"
      ,"Foerdermenge"
      ,"MotorLeistung"
      ,"PumpenAnlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.SurfaceStructure", "SurfaceStructure");
    mapping.defineClass("ZG_hydrogeo_wva_V1.SurfaceStructure", new String[]{   "Surface"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageGrundlage", "FoerderanlageGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Zahlen", "Zahlen");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Zahlen", new String[]{   "Zahlen"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg", "VersiWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiWasservsg", new String[]{   "Versickerungsanlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW", "OberflGewRohwaPW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPW", new String[]{   "Bemerkung"
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
      ,"FoerderanlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"TotFoerdermenge"
      ,"NameTextPos"
      ,"Techdata"
      ,"TechdataTextPos"
      ,"Techdata1"
      ,"Techdata1TextPos"
      ,"Techdata2"
      ,"Techdata2TextPos"
      ,"Techdata3"
      ,"Techdata3TextPos"
      ,"Techdata4"
      ,"Techdata4TextPos"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"EinzelFoerdermenge"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Reservoir"
      ,"EigentumArt"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
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
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"PumpenAnlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.HilfsText", "HilfsText");
    mapping.defineClass("ZG_hydrogeo_wva_V1.HilfsText", new String[]{   "Text"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.PumpenAnlage_EntBru", "PumpenAnlage_EntBru");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.PumpenAnlage_EntBru", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtGrundEigentuemer", "QuellschachtGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW", "ReinwasserPWOberflGewRohwaPW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ReinwasserPWOberflGewRohwaPW", new String[]{   "ReinwasserPW"
      ,"OberflGewRohwaPW"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitKontaktPerson", "EinleitKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaLaufbrunnen", "QueSchaLaufbrunnen");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QueSchaLaufbrunnen", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg", "HydrantWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.HydrantWasservsg", new String[]{   "Hydrant"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone", "QuellSchGWSZone");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchGWSZone", new String[]{   "QuellSch"
      ,"GWSZone"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitMutatPerson", "EinleitMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EinleitMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWAnlageEigentuemer", "OberflGewRohwaPWAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageDatei", "WeitereAnlageDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageGrundlage", "WeitereAnlageGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage", "Versickerungsanlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versickerungsanlage", new String[]{   "Lage"
      ,"Typ"
      ,"Art"
      ,"Name"
      ,"ObjNrAfu"
      ,"VerNrAfu_Intranet2Pos"
      ,"VerNrAfu_Intranet5Pos"
      ,"BetriebsArt"
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
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Einleit", "Einleit");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Einleit", new String[]{   "Lage"
      ,"Name"
      ,"ObjNrAfu"
      ,"EinlNrAfu_Intranet2Pos"
      ,"EinlNrAfu_Intranet5Pos"
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
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungGrundEigentuemer", "OberflGewFassungGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage", "Pumpenanlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Pumpenanlage", new String[]{   "AnzahlPumpen"
      ,"Pumpmenge"
      ,"PumpenBetrieb"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterGrundlage", "VersorgungsperimeterGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterMutatPerson", "VersorgungsperimeterMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen", "Entnahmebrunnen");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Entnahmebrunnen", new String[]{   "Bemerkung"
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
      ,"EntnahmebrunnenTyp"
      ,"Notbrunnen"
      ,"Notversorgung"
      ,"Oeffentliches_Interesse"
      ,"Foerdermethode"
      ,"ObjNrAfu"
      ,"GwfNrAfu_Intranet2Pos"
      ,"GwfNrAfu_Intranet5Pos"
      ,"EigentumArt"
      ,"PrivatNutzer"
      ,"BetriebArt"
      ,"TiefeTerrAbstich"
      ,"HoeheTerrAbstich"
      ,"WspHoeheTiefst"
      ,"K_Wert"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"NameTextPos"
      ,"Techdata1"
      ,"Techdata1TextPos"
      ,"Techdata2"
      ,"Techdata2TextPos"
      ,"Techdata3"
      ,"Techdata3TextPos"
      ,"Techdata4"
      ,"Techdata4TextPos"
      ,"MaxDarst"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"Verwendungszweck"
      ,"FassungsEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"PumpenAnlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung", "OberflaechenGewFassung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflaechenGewFassung", new String[]{   "Bemerkung"
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
      ,"ObjNrAfu"
      ,"OwfNrAfu_Intranet2Pos"
      ,"OwfNrAfu_Intranet5Pos"
      ,"EigentumArt"
      ,"PrivatNutzer"
      ,"Betriebsart"
      ,"Notversorgung"
      ,"Tiefe"
      ,"GewAbschnittCode"
      ,"GewAbschnittKm"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"MaxDarst"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"Verwendungszweck"
      ,"ObflGewFsgTiefeText"
      ,"FassungsEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      ,"OberflGewRohwaPW"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungOberflGewRohwaPW", "OberflGewFassungOberflGewRohwaPW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewFassungOberflGewRohwaPW", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasMutatPerson", "ObFasMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResMutatPerson", "ResMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru", "RuebruEntBru");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RuebruEntBru", new String[]{   "Rueckgabebrunnen"
      ,"Entnahmebrunnen"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg", "VersiBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiBewiReg", new String[]{   "Versickerungsanlage"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundwasserfassung", "Grundwasserfassung");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Grundwasserfassung", new String[]{   "Bemerkung"
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
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtKontaktPerson", "QuellschachtKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellschachtKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir", "Reservoir");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Reservoir", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Alternative_Stromversorgung"
      ,"Aufbereitung"
      ,"Brauchreserve"
      ,"Geometrie"
      ,"Loeschreserve"
      ,"Wasserspiegel_max"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"Gesamtinhalt"
      ,"NameTextPos"
      ,"Techdata"
      ,"TechdataTextPos"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg", "ObFasBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasBewiReg", new String[]{   "OberflGewFassung"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruFassEigentuemer", "EntbruFassEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruFassEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen", "Rueckgabebrunnen");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Rueckgabebrunnen", new String[]{   "Identifikator"
      ,"Name"
      ,"Nutzungszustand"
      ,"Zweck"
      ,"Geometrie"
      ,"Typ"
      ,"Art"
      ,"ObjNrAfu"
      ,"EigentumArt"
      ,"BetriebsArt"
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
      ,"AnlageEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageDatei", "FoerderanlageDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitOberflGewRohwaPW", "LeitOberflGewRohwaPW");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitOberflGewRohwaPW", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWKontaktPerson", "OberflGewRohwaPWKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageMutatPerson", "WeitereAnlageMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.WeitereAnlageMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktMutatPerson", "QwFsgEndpunktMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.TransferMetadaten.Zustaendige_Stelle", "Zustaendige_Stelle");
    mapping.defineClass("ZG_hydrogeo_wva_V1.TransferMetadaten.Zustaendige_Stelle", new String[]{   "Name"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchDatei", "QuellSchDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine", "TWTurbine");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.TWTurbine", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"WeitereAnlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"NameTextPos"
      ,"Leitungsart"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Quellschacht"
      ,"Baujahr"
      ,"Turbine"
      ,"Durchfluss"
      ,"Bruttofallhoehe"
      ,"Nettofallhoehe"
      ,"Turbinenleistung"
      ,"Jahresproduktion"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter", "Versorgungsperimeter");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Versorgungsperimeter", new String[]{   "Geometrie"
      ,"Identifikator"
      ,"MaxDarst"
      ,"MutatDatum"
      ,"MutatBemerk"
      ,"Grundlage"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.MultiSurface", "MultiSurface");
    mapping.defineClass("ZG_hydrogeo_wva_V1.MultiSurface", new String[]{   "Surfaces"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungMutatPerson", "SammeleinrichtungMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleMutatPerson", "UebergabestelleMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktKontaktPerson", "QwFsgEndpunktKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer", "AnschriftNummer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnschriftNummer", new String[]{   "Pos"
      ,"Nummer"
      ,"Ori"
      ,"Hali"
      ,"Vali"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleMutatPerson", "AbgabestelleMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.TransferMetadaten.Datenbestand", "Datenbestand");
    mapping.defineClass("ZG_hydrogeo_wva_V1.TransferMetadaten.Datenbestand", new String[]{   "BehaelterID"
      ,"Stand"
      ,"Lieferdatum"
      ,"Bemerkungen"
      ,"zustaendigeStelle"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg", "AnranlWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlWasservsg", new String[]{   "Anreicherungsanlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruKontaktPerson", "EntbruKontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruKontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungGrundlage", "NotLeitungGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWGrundEigentuemer", "OberflGewRohwaPWGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.OberflGewRohwaPWGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri", "NotLeitungNachVersPeri");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.NotLeitungNachVersPeri", new String[]{   "NotLeitung1"
      ,"LieferungNach"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg", "FassgebWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FassgebWasservsg", new String[]{   "Fassungseinzugsgebiet"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResDatei", "ResDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ResDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht", "Quellschacht");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Quellschacht", new String[]{   "Bemerkung"
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
      ,"Typ"
      ,"QWFassungsArt"
      ,"ObjNrAfu"
      ,"QwfNrAfu_Intranet2Pos"
      ,"QwfNrAfu_Intranet5Pos"
      ,"QwfMenge_Karte25Pos"
      ,"EigentumArt"
      ,"PrivatNutzer"
      ,"Betriebsart"
      ,"Notversorgung"
      ,"ErtragMinAng"
      ,"ErtragMaxAng"
      ,"ErtragMittlAng"
      ,"WqualiBemerkung"
      ,"SchzNr"
      ,"SchzPflicht"
      ,"SchzGutachten"
      ,"SchzGutAutor"
      ,"SchzGutDatum"
      ,"Nachfuehrungsstand"
      ,"Auskunftsstelle"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"HoeheTerrain"
      ,"HoeheAuslauf"
      ,"ErtragBrst"
      ,"ErtragBrstTextPos"
      ,"ErtragGrp"
      ,"ErtragGrpTextPos"
      ,"NameTextPos"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"DetailplanArt"
      ,"DetailplanDatum"
      ,"DetailplanMstab"
      ,"DetailplanHerkunft"
      ,"DetailplanNr"
      ,"MaxDarst"
      ,"ErfGenauigkeit"
      ,"GeometrieHerkunft"
      ,"ErfVorlBemerk"
      ,"QkatPlanNr"
      ,"GrundstNr"
      ,"KontaktDatum"
      ,"Verwendungszweck"
      ,"FassungsEigentuemer"
      ,"GrundEigentuemer"
      ,"KontaktPerson"
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone", "EntbruGWSZone");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.EntbruGWSZone", new String[]{   "Entbru"
      ,"GWSZone"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaSaSchaMutatPerson", "QuellSchaSaSchaMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QuellSchaSaSchaMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion", "Druckreduktion");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Druckreduktion", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"WeitereAnlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"NameTextPos"
      ,"Leitungsart"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Quellschacht"
      ,"Typ"
      ,"Druckeingang"
      ,"Druckausgang"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg", "RueBruBewiReg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.RueBruBewiReg", new String[]{   "RueBru"
      ,"BewiReg"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiDatei", "VersiDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersiDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterVerPerNameText", "VersorgungsperimeterVerPerNameText");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersorgungsperimeterVerPerNameText", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleGrundlage", "AbgabestelleGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AbgabestelleGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle", "Uebergabestelle");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Uebergabestelle", new String[]{   "SymbolGeo"
      ,"SymbolRot"
      ,"Geometrie"
      ,"Identifikator"
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
      ,"MutatPerson"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktQuellschacht", "QwFsgEndpunktQuellschacht");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktQuellschacht", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone", "ObFasGWSZone");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGWSZone", new String[]{   "ObFas"
      ,"GWSZone"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.KontaktPerson", "KontaktPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.KontaktPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk", "FoerderanlageAufbereitungswerk");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageAufbereitungswerk", new String[]{   "Foerderanlage"
      ,"Aufbereitungswerk"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu", "ObFasGSBAoTw_ZsBeZu");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasGSBAoTw_ZsBeZu", new String[]{   "ObFas"
      ,"GSBAoTw_ZsBeZu"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk", "Aufbereitungswerk");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Aufbereitungswerk", new String[]{   "Bemerkung"
      ,"Identifikator"
      ,"Name"
      ,"Netzteilident"
      ,"Art"
      ,"Aufbereitung"
      ,"Geometrie"
      ,"WeitereAnlageArt"
      ,"SymbolGeo"
      ,"SymbolRot"
      ,"Farbe"
      ,"SymbolTyp"
      ,"NameTextPos"
      ,"Leitungsart"
      ,"Betriebsart"
      ,"Nutzungsart"
      ,"Notversorgung"
      ,"Kanton"
      ,"GdeNrBFS"
      ,"Lokalitaet"
      ,"MaxDarst"
      ,"MutatBemerk"
      ,"MutatDatum"
      ,"Grundlage"
      ,"MutatPerson"
      ,"Quellschacht"
      ,"FilterLeist"
      ,"FilterLeistTextPos"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktAnlageEigentuemer", "QwFsgEndpunktAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwFsgEndpunktAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg", "FoerderanlageWasservsg");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.FoerderanlageWasservsg", new String[]{   "Foerderanlage"
      ,"Wasserversorgung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnreicherungsanlageMutatPerson", "AnreicherungsanlageMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnreicherungsanlageMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWMutatPerson", "BautenGWMutatPerson");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWMutatPerson", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWGrundEigentuemer", "BautenGWGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos", "QwfMenge_Karte25Pos");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.QwfMenge_Karte25Pos", new String[]{   "Pos"
      ,"Ori"
      ,"Hali"
      ,"Vali"
      ,"Size"
      ,"Plantyp"
      ,"PlatzhalterBeschriftung"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri", "UebergabestelleVonVersPeri");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleVonVersPeri", new String[]{   "Uebergabestelle"
      ,"LieferungVon"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWAnlageEigentuemer", "BautenGWAnlageEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.BautenGWAnlageEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasDatei", "ObFasDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.ObFasDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlDatei", "AnranlDatei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.AnranlDatei", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitGrundlage", "LeitGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.LeitGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf", "SammeleinrichtungQwf");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.SammeleinrichtungQwf", new String[]{   "Identifikator"
      ,"Typ"
      ,"Geometrie"
      ,"ArtSammeleinrichtung"
      ,"SammeleinrichtungTyp"
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
      ,"MutatPerson"
      ,"BetriebsArt"
      ,"SchuettmengeMin"
      ,"ErtragMinAng"
      ,"SchuettmengeMax"
      ,"ErtragMaxAng"
      ,"SchuettmengeMittl"
      ,"ErtragMittlAng"
      ,"Quellschacht"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei", "Datei");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Datei", new String[]{   "Name"
      ,"Dateiname"
      ,"Anreicherungsanlage"
      ,"BautenGW"
      ,"Einleit"
      ,"Entnahmebrunnen"
      ,"Foerderanlage"
      ,"OberflGewFassung"
      ,"Quellschacht"
      ,"Reservoir"
      ,"Versickerungsanlage"
      ,"WeitereAnlage"
      });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageGrundEigentuemer", "VersickerungsanlageGrundEigentuemer");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.VersickerungsanlageGrundEigentuemer", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleGrundlage", "UebergabestelleGrundlage");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.UebergabestelleGrundlage", new String[]{  });
    nameMap.put("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Stufenpumpwerk", "Stufenpumpwerk");
    mapping.defineClass("ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Stufenpumpwerk", new String[]{  });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
