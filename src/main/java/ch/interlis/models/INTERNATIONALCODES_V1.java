package ch.interlis.models;
public class INTERNATIONALCODES_V1{
  private INTERNATIONALCODES_V1() {}
  public final static String MODEL= "InternationalCodes_V1";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("InternationalCodes_V1","http://www.geo.admin.ch","2011-08-30"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
