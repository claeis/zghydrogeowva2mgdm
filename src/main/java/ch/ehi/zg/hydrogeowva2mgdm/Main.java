package ch.ehi.zg.hydrogeowva2mgdm;

import java.io.File;


import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.settings.Settings;
import ch.ehi.zg.hydrogeowva2mgdm.gui.MainFrame;

/** Main program and commandline interface of zgwasser2mdm.
 */
public class Main {
    
    /** name of application as shown to user.
     */
    public static final String APP_NAME="zghydrogeowva2mgdm";
    /** name of jar file.
     */
    public static final String APP_JAR="zghydrogeowva2mgdm.jar";
    /** version of application.
     */
    private static String version=null;
    /** main program entry.
     * @param args command line arguments.
     */
    static public void main(String args[]){
        Settings settings=new Settings();
        settings.setValue(Converter.SETTING_APPNAME, APP_NAME);
        settings.setValue(Converter.SETTING_ILIDIRS, Converter.SETTING_DEFAULT_ILIDIRS);
        String appHome=getAppHome();
        if(appHome!=null){
            settings.setValue(Converter.SETTING_APPHOME, appHome);
        }
        // arguments on export
        String httpProxyHost = null;
        String httpProxyPort = null;
        if(args.length==0){
            readSettings(settings);
            MainFrame.main(settings);
            return;
        }
        int argi=0;
        int function=Converter.FC_ITF2KGDM;
        boolean doGui=false;
        File wvaFile=null;
        File hydroFile=null;
        File kgdmFile=null;
        File mgdmTwvFile=null;
        File mgdmGwaFile=null;
        for(;argi<args.length;argi++){
            String arg=args[argi];
            if(arg.equals("--trace")){
                EhiLogger.getInstance().setTraceFilter(false);
            }else if(arg.equals("--itf2kgdm")){
                function=Converter.FC_ITF2KGDM;
            }else if(arg.equals("--kgdm2itf")){
                function=Converter.FC_KGDM2ITF;
            }else if(arg.equals("--kgdm2mgdm")){
                function=Converter.FC_KGDM2MGDM;
            }else if(arg.equals("--wva")){
                argi++;
                wvaFile=new File(args[argi]);
            }else if(arg.equals("--hydro")){
                argi++;
                hydroFile=new File(args[argi]);
            }else if(arg.equals("--kgdm")){
                argi++;
                kgdmFile=new File(args[argi]);
            }else if(arg.equals("--mgdmTwv")){
                argi++;
                mgdmTwvFile=new File(args[argi]);
            }else if(arg.equals("--mgdmGwa")){
                argi++;
                mgdmGwaFile=new File(args[argi]);
            }else if(arg.equals("--gui")){
                readSettings(settings);
                doGui=true;
            }else if(arg.equals("--modeldir")){
                argi++;
                settings.setValue(Converter.SETTING_ILIDIRS, args[argi]);
            }else if(arg.equals("--log")) {
                argi++;
                settings.setValue(Converter.SETTING_LOGFILE, args[argi]);
            }else if(arg.equals("--proxy")) {
                    argi++;
                    settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST, args[argi]);
            }else if(arg.equals("--proxyPort")) {
                    argi++;
                    settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT, args[argi]);
            }else if(arg.equals("--version")){
                printVersion();
                return;
            }else if(arg.equals("--help")){
                    printVersion ();
                    System.err.println();
                    printDescription ();
                    System.err.println();
                    printUsage ();
                    System.err.println();
                    System.err.println("OPTIONS");
                    System.err.println();
                    System.err.println("--gui                 start GUI.");
                    System.err.println("--log file            text file, that receives validation results.");
                    System.err.println("--modeldir "+Converter.SETTING_DEFAULT_ILIDIRS+" list of directories/repositories with ili-files.");
                    System.err.println("--proxy host          proxy server to access model repositories.");
                    System.err.println("--proxyPort port      proxy port to access model repositories.");
                    System.err.println("--trace               enable trace messages.");
                    System.err.println("--help                Display this help text.");
                    System.err.println("--version             Display the version of "+APP_NAME+".");
                    System.err.println();
                    return;
                
            }else if(arg.startsWith("-")){
                EhiLogger.logAdaption(arg+": unknown option; ignored");
            }else{
                break;
            }
        }
        if(doGui){
            MainFrame.main(settings);
        }else{
            boolean ok=false;
            ok = new Converter().convert(function,wvaFile,hydroFile,kgdmFile,mgdmTwvFile,mgdmGwaFile,settings);
            System.exit(ok ? 0 : 1);
        }
        
    }
    /** Name of file with program settings. Only used by GUI, not used by commandline version.
     */
    private final static String SETTINGS_FILE = System.getProperty("user.home") + "/.zghydrogeowva2mgdm";
    /** Reads program settings.
     * @param settings Program configuration as read from file.
     */
    public static void readSettings(Settings settings)
    {
        java.io.File file=new java.io.File(SETTINGS_FILE);
        try{
            if(file.exists()){
                settings.load(file);
            }
        }catch(java.io.IOException ex){
            EhiLogger.logError("failed to load settings from file "+SETTINGS_FILE,ex);
        }
    }
    /** Writes program settings.
     * @param settings Program configuration to write.
     */
    public static void writeSettings(Settings settings)
    {
        java.io.File file=new java.io.File(SETTINGS_FILE);
        try{
            settings.store(file,APP_NAME+" settings");
        }catch(java.io.IOException ex){
            EhiLogger.logError("failed to settings settings to file "+SETTINGS_FILE,ex);
        }
    }
    
    /** Prints program version.
     */
    protected static void printVersion ()
    {
      System.err.println(APP_NAME+", Version "+getVersion());
      System.err.println("  Developed by Eisenhut Informatik AG, CH-3400 Burgdorf");
    }

    /** Prints program description.
     */
    protected static void printDescription ()
    {
      System.err.println("DESCRIPTION");
      System.err.println("  Validates an INTERLIS transfer file.");
    }

    /** Prints program usage.
     */
    protected static void printUsage()
    {
      System.err.println ("USAGE");
      System.err.println("  java -jar "+APP_JAR+" [Options] in.xtf");
    }
    /** Gets version of program.
     * @return version e.g. "1.0.0"
     */
    public static String getVersion() {
          if(version==null){
        java.util.ResourceBundle resVersion = java.util.ResourceBundle.getBundle(ch.ehi.basics.i18n.ResourceBundle.class2qpackageName(Main.class)+".Version");
            StringBuffer ret=new StringBuffer(20);
        ret.append(resVersion.getString("version"));
            ret.append('-');
        ret.append(resVersion.getString("versionCommit"));
            version=ret.toString();
          }
          return version;
    }
    
    /** Gets main folder of program.
     * 
     * @return folder Main folder of program.
     */
    static public String getAppHome()
    {
      String[] classpaths = System.getProperty("java.class.path").split(System.getProperty("path.separator"));
      for(String classpath:classpaths) {
          if(classpath.toLowerCase().endsWith(".jar")) {
              File file = new File(classpath);
              String jarName=file.getName();
              if(jarName.toLowerCase().startsWith(APP_NAME)) {
                  file=new File(file.getAbsolutePath());
                  if(file.exists()) {
                      return file.getParent();
                  }
              }
          }
      }
      return null;
    }
    
}
