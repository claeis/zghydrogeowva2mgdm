package ch.ehi.zg.hydrogeowva2mgdm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ch.ehi.basics.logging.AbstractStdListener;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.logging.StdListener;
import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.metamodel.Model;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.ViewableProperties;
import ch.interlis.iom_j.itf.ItfReader2;
import ch.interlis.iom_j.itf.ItfWriter2;
import ch.interlis.iom_j.xtf.XtfModel;
import ch.interlis.iom_j.xtf.XtfReader;
import ch.interlis.iom_j.xtf.XtfWriterBase;
import ch.interlis.iox.EndBasketEvent;
import ch.interlis.iox.EndTransferEvent;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.IoxLogging;
import ch.interlis.iox.IoxWriter;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.iox.StartBasketEvent;
import ch.interlis.iox.StartTransferEvent;
import ch.interlis.iox_j.DefaultIoxFactoryCollection;
import ch.interlis.iox_j.PipelinePool;
import ch.interlis.iox_j.logging.FileLogger;
import ch.interlis.iox_j.logging.LogEventFactory;
import ch.interlis.iox_j.logging.StdLogger;
import ch.interlis.iox_j.statistics.IoxStatistics;
import ch.interlis.iox_j.utility.IoxUtility;
import ch.interlis.iox_j.validator.ValidationConfig;
import ch.interlis.iox_j.validator.Validator;
import ch.interlis.models.CHADMINCODES_V1;
import ch.interlis.models.GEOMETRYCHLV95_V1;
import ch.interlis.models.GRUNDWASSERAUSTRITTE_LV95_V1;
import ch.interlis.models.INTERLIS_;
import ch.interlis.models.INTERNATIONALCODES_V1;
import ch.interlis.models.LOCALISATIONCH_V1;
import ch.interlis.models.LOCALISATION_V1;
import ch.interlis.models.PLANERISCHERGEWAESSERSCHUTZ_LV95_V1_1;
import ch.interlis.models.TWVINNOTLAGEN_LV95_V1;
import ch.interlis.models.UNITS;
import ch.interlis.models.ZG_HYDROGEOLOGISCHEOBJEKTE_2_3;
import ch.interlis.models.ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1;
import ch.interlis.models.ZG_WASSERVERSORGUNGSATLAS_1_0;
import ch.interlis.models.ZG_HYDROGEO_WVA_V1;

public class Converter {

    public static final String MSG_CONVERSION_DONE = "...conversion done";
    public static final String MSG_CONVERSION_FAILED = "...conversion failed";
    /** Path with folders of Interlis model files. Multiple entries are separated by semicolon (';'). 
     * Might contain "http:" URLs which should contain model repositories. 
     * Might include placeholders ITF_DIR or JAR_DIR. 
     * @see #ITF_DIR
     * @see #JAR_DIR
     */
    public static final String SETTING_ILIDIRS="ch.ehi.zg.hydrogeowva2mgdm.ilidirs";
    /** the main folder of program.
     */
    public static final String SETTING_APPHOME="ch.ehi.zg.hydrogeowva2mgdm.appHome";
    /** the name of the program.
     */
    public static final String SETTING_APPNAME="ch.ehi.zg.hydrogeowva2mgdm.appName";
    /** Name of the log file that receives the conversion results.
     */
    public static final String SETTING_LOGFILE = "ch.ehi.zg.hydrogeowva2mgdm.log";
    /** True if the program should not validate input and output data.
     */
    public static final String SETTING_DISABLE_VALIDATION = "ch.ehi.zg.hydrogeowva2mgdm.disableValidation";
    /** Placeholder, that will be replaced by the folder of the current to be converted transfer file. 
     * @see #SETTING_ILIDIRS
     */
    public static final String XTF_DIR="%XTF_DIR";
    /** Placeholder, that will be replaced by the folder of the program. 
     * @see #SETTING_ILIDIRS
     */
    public static final String JAR_DIR="%JAR_DIR";
    /** Default path with folders of Interlis model files.
     * @see #SETTING_ILIDIRS
     */
    public static final String SETTING_DEFAULT_ILIDIRS = XTF_DIR+";http://models.interlis.ch/;"+JAR_DIR+"/ilimodels";
    public static final int FC_ITFHYDRO2KGDM=0;
    public static final int FC_ITFWVA2KGDM=1;
    public static final int FC_KGDM2ITF=2;
    public static final int FC_KGDM2MGDM=3;
    public boolean convert(int function, File wvaFile, File hydroFile, File kgdm0File,File kgdmFile, File mgdmTwvFile, File mgdmGwaFile, Settings settings) {
        if(wvaFile==null && function==FC_ITFWVA2KGDM){
            EhiLogger.logError("no WVA file given");
            return false;
        }
        if(hydroFile==null && (function==FC_ITFHYDRO2KGDM || function==FC_KGDM2ITF)){
            EhiLogger.logError("no hydro file given");
            return false;
        }
        if(kgdmFile==null){
            EhiLogger.logError("no KGDM file given");
            return false;
        }
        if(mgdmTwvFile==null && function==FC_KGDM2MGDM){
            EhiLogger.logError("no MGDM TWV file given");
            return false;
        }
        if(mgdmGwaFile==null && function==FC_KGDM2MGDM){
            EhiLogger.logError("no MGDM GWA file given");
            return false;
        }
        if(settings==null){
            settings=new Settings();
        }
        
        String logFilename=settings.getValue(SETTING_LOGFILE);
        FileLogger logfile=null;
        AbstractStdListener logStderr=null;
        boolean ret=false;
        try{
            // setup logging of conversion results
            if(logFilename!=null){
                logfile=new FileLogger(new java.io.File(logFilename));
                EhiLogger.getInstance().addListener(logfile);
            }
            logStderr=new StdLogger(logFilename);
            EhiLogger.getInstance().addListener(logStderr);
            EhiLogger.getInstance().removeListener(StdListener.getInstance());
            String appHome=settings.getValue(SETTING_APPHOME);
                        
            // give user important info (such as input files or program version)
            EhiLogger.logState(Main.APP_NAME+"-"+Main.getVersion());
            EhiLogger.logState("ili2c-"+ch.interlis.ili2c.Ili2c.getVersion());
            EhiLogger.logState("iox-ili-"+ch.interlis.iox_j.IoxUtility.getVersion());
            EhiLogger.logState("maxMemory "+java.lang.Runtime.getRuntime().maxMemory()/1024L+" KB");
            if(function==FC_ITFWVA2KGDM) {
                EhiLogger.logState("wvaFile <"+wvaFile.getPath()+">");
            }
            if(function==FC_ITFHYDRO2KGDM || function==FC_KGDM2ITF) {
                EhiLogger.logState("hydroFile <"+hydroFile.getPath()+">");
            }
            if(function==FC_ITFHYDRO2KGDM && kgdm0File!=null) {
                EhiLogger.logState("kgdm0File <"+kgdm0File.getPath()+">");
            }
            EhiLogger.logState("kgdmFile <"+kgdmFile.getPath()+">");
            if(function==FC_KGDM2MGDM) {
                EhiLogger.logState("mgdmTwvFile <"+mgdmTwvFile.getPath()+">");
                EhiLogger.logState("mgdmGwaFile <"+mgdmGwaFile.getPath()+">");
            }
        
            TransferDescription td_ili1=null;
            TransferDescription td_ili2=null;
            
            // read ili models
            {
                settings.setValue(ch.interlis.ili2c.gui.UserSettings.ILIDIRS,settings.getValue(SETTING_ILIDIRS));
                java.util.HashMap<String,String> pathMap=new java.util.HashMap<String,String>();
                pathMap.put(XTF_DIR,kgdmFile.getAbsoluteFile().getParent());
                pathMap.put(JAR_DIR,appHome);
                settings.setTransientObject(ch.interlis.ili2c.gui.UserSettings.ILIDIRS_PATHMAP,pathMap);
                // compile required ili files
                EhiLogger.logState("compile models...");
                ch.interlis.ili2c.config.Configuration modelv=new ch.interlis.ili2c.config.Configuration();
                modelv.addFileEntry(new ch.interlis.ili2c.config.FileEntry(ZG_WASSERVERSORGUNGSATLAS_1_0.MODEL,ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));             
                modelv.addFileEntry(new ch.interlis.ili2c.config.FileEntry(ZG_HYDROGEOLOGISCHEOBJEKTE_2_3.MODEL,ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));             
               modelv.setAutoCompleteModelList(true);
                modelv.setGenerateWarnings(false);
                td_ili1 = ch.interlis.ili2c.Main.runCompiler(modelv,
                        settings);
                if (td_ili1 == null) {
                    EhiLogger.logError("compiler failed");
                    return false;
                }
                modelv=new ch.interlis.ili2c.config.Configuration();
                modelv.addFileEntry(new ch.interlis.ili2c.config.FileEntry(ZG_HYDROGEO_WVA_V1.MODEL,ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));             
                modelv.addFileEntry(new ch.interlis.ili2c.config.FileEntry(GRUNDWASSERAUSTRITTE_LV95_V1.MODEL,ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));             
               modelv.setAutoCompleteModelList(true);
                modelv.setGenerateWarnings(false);
                td_ili2 = ch.interlis.ili2c.Main.runCompiler(modelv,
                        settings);
                if (td_ili2 == null) {
                    EhiLogger.logError("compiler failed");
                    return false;
                }
            }
            
            // process data files
            EhiLogger.logState("convert data...");
            try{
                
                
                if(function==FC_ITFHYDRO2KGDM) {
                    itfHydro2kgdm(kgdm0File, hydroFile, kgdmFile, settings, td_ili1,td_ili2);
                }else if(function==FC_ITFWVA2KGDM) {
                    itfWva2kgdm(wvaFile, kgdmFile, settings, td_ili1,td_ili2);
                }else if(function==FC_KGDM2ITF){
                    kgdm2itf(kgdmFile, hydroFile,settings, td_ili1,td_ili2);
                }else if(function==FC_KGDM2MGDM){
                    kgdm2mgdm(kgdmFile, mgdmTwvFile,mgdmGwaFile,settings, td_ili2);
                }else {
                    throw new IllegalArgumentException();
                }
                
                // check for errors
                if(logStderr.hasSeenErrors()){
                    EhiLogger.logState(MSG_CONVERSION_FAILED);
                }else{
                    EhiLogger.logState(MSG_CONVERSION_DONE);
                    ret=true;
                }
            }catch(Throwable ex){
                EhiLogger.logError(ex);
                EhiLogger.logState(MSG_CONVERSION_FAILED);
            }finally {
                
            }
        }finally{
            if(logfile!=null){
                logfile.close();
                EhiLogger.getInstance().removeListener(logfile);
                logfile=null;
            }
            if(logStderr!=null){
                EhiLogger.getInstance().addListener(StdListener.getInstance());
                EhiLogger.getInstance().removeListener(logStderr);
                logStderr=null;
            }
        }
        return ret;
    }
    private void kgdm2mgdm(File kgdmFile, File mgdmTwvFile, File mgdmGwaFile, Settings settings, TransferDescription td) 
    throws IoxException
    {
        IoxStatistics readerStat=null;
        IoxStatistics mgdmTwvStat=null;
        IoxStatistics mgdmGwaStat=null;
        XtfWriterBase mgdmTwvWriter=null;
        XtfWriterBase mgdmGwaWriter=null;
        Validator twvWriterValidator=null;
        Validator gwaWriterValidator=null;
        Validator ioxReaderValidator=null;
        try{
            readerStat=new IoxStatistics(td,settings);
            mgdmTwvStat=new IoxStatistics(td,settings);
            mgdmGwaStat=new IoxStatistics(td,settings);
            // setup data reader
            XtfReader ioxReader=new XtfReader(kgdmFile);
            DefaultIoxFactoryCollection factories=new DefaultIoxFactoryCollection();
            factories.registerFactory(ZG_HYDROGEO_WVA_V1.getIoxFactory());
            ioxReader.setFactory(factories);
            readerStat.setFilename(kgdmFile.getPath());
            PipelinePool pipelinePool=new PipelinePool();
            IoxLogging errHandler=new ch.interlis.iox_j.logging.Log2EhiLogger();
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(kgdmFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxReaderValidator=new Validator(td,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            
            Kgdm2MgdmGwa gwaFilter=new Kgdm2MgdmGwa(settings);
            Kgdm2MgdmTwv twvFilter=new Kgdm2MgdmTwv(td,settings);
            
            mgdmTwvWriter = new XtfWriterBase( mgdmTwvFile,  getIoxMapping(),"2.3");
            mgdmTwvWriter.setModels(new XtfModel[]{
                    TWVINNOTLAGEN_LV95_V1.getXtfModel(),
                    GEOMETRYCHLV95_V1.getXtfModel(),
                    UNITS.getXtfModel(),
                    });
            mgdmTwvStat.setFilename(mgdmTwvFile.getPath());
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(mgdmTwvFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    twvWriterValidator=new Validator(td,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            
            mgdmGwaWriter = new XtfWriterBase( mgdmGwaFile,  getIoxMapping(),"2.3");
            mgdmGwaWriter.setModels(new XtfModel[]{
                    GRUNDWASSERAUSTRITTE_LV95_V1.getXtfModel(),
                    GEOMETRYCHLV95_V1.getXtfModel(),
                    UNITS.getXtfModel(),
                    });
            mgdmGwaStat.setFilename(mgdmGwaFile.getPath());
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(mgdmGwaFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    gwaWriterValidator=new Validator(td,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            
            IoxEvent kgdmEvent=null;
            IoxEvent twvEvent=null;
            IoxEvent gwaEvent=null;
            try{
                do{
                    kgdmEvent=ioxReader.read();
                    if(ioxReaderValidator!=null)ioxReaderValidator.validate(kgdmEvent);
                    readerStat.add(kgdmEvent);
                    {
                        twvEvent=IoxUtility.cloneIoxEvent(kgdmEvent);
                        twvEvent=twvFilter.filter(twvEvent);
                    }
                    writeIoxEvent(twvEvent,mgdmTwvWriter,mgdmTwvStat,twvWriterValidator);
                    gwaFilter.addInput(kgdmEvent);
                    gwaEvent=gwaFilter.getMappedEvent();
                    while(gwaEvent!=null) {
                        writeIoxEvent(gwaEvent, mgdmGwaWriter, mgdmGwaStat,gwaWriterValidator);
                        gwaEvent=gwaFilter.getMappedEvent();
                    }
                }while(!(kgdmEvent instanceof EndTransferEvent));
                gwaEvent=gwaFilter.getMappedEvent();
                while(gwaEvent!=null) {
                    writeIoxEvent(gwaEvent, mgdmGwaWriter, mgdmGwaStat,gwaWriterValidator);
                    gwaEvent=gwaFilter.getMappedEvent();
                }
                readerStat.write2logger();
                mgdmTwvStat.write2logger();
                mgdmGwaStat.write2logger();
            }finally{
                if(ioxReaderValidator!=null){
                    ioxReaderValidator.close();
                    ioxReaderValidator=null;
                }
                if(ioxReader!=null){
                    try {
                        ioxReader.close();
                    } catch (IoxException e) {
                        EhiLogger.logError(e);
                    }
                    ioxReader=null;
                }
            }
        }finally{
            if(twvWriterValidator!=null){
                twvWriterValidator.close();
                twvWriterValidator=null;
            }
            if(mgdmTwvWriter!=null){
                try {
                    mgdmTwvWriter.close();
                } catch (IoxException e) {
                    EhiLogger.logError(e);
                }
                mgdmTwvWriter=null;
            }
            if(gwaWriterValidator!=null){
                gwaWriterValidator.close();
                gwaWriterValidator=null;
            }
            if(mgdmGwaWriter!=null){
                try {
                    mgdmGwaWriter.close();
                } catch (IoxException e) {
                    EhiLogger.logError(e);
                }
                mgdmGwaWriter=null;
            }
        }
        
    }
    private void kgdm2itf(File kgdmFile, File hydroFile, Settings settings, TransferDescription td_ili1, TransferDescription td_ili2) 
    throws IoxException
    {
        IoxStatistics readerStat=null;
        IoxStatistics hydroStat=null;
        ItfWriter2 hydroWriter=null;
        Validator ioxWriterValidator=null;
        Validator ioxReaderValidator=null;
        try{
            readerStat=new IoxStatistics(td_ili2,settings);
            hydroStat=new IoxStatistics(td_ili1,settings);
            PipelinePool pipelinePool=new PipelinePool();
            IoxLogging errHandler=new ch.interlis.iox_j.logging.Log2EhiLogger();
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(kgdmFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxReaderValidator=new Validator(td_ili2,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            {
                LogEventFactory errFactory=new LogEventFactory();
                errFactory.setDataSource(hydroFile.getPath());
                ValidationConfig validationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                validatorSettings.setValue(ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE, ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE_DO);
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxWriterValidator=new Validator(td_ili1,validationConfig,errHandler,errFactory,pipelinePool,validatorSettings);
                }
                
            }
            // setup data reader
            XtfReader ioxReader=new XtfReader(kgdmFile);
            DefaultIoxFactoryCollection factories=new DefaultIoxFactoryCollection();
            factories.registerFactory(ZG_HYDROGEO_WVA_V1.getIoxFactory());
            ioxReader.setFactory(factories);
            readerStat.setFilename(kgdmFile.getPath());
            Kgdm2LegacyHydro gwaFilter=new Kgdm2LegacyHydro(settings);
            
            hydroWriter = new ItfWriter2( hydroFile, td_ili1);
            hydroStat.setFilename(hydroFile.getPath());
            
            
            IoxEvent kgdmEvent=null;
            IoxEvent hydroEvent=null;
            try{
                do{
                    kgdmEvent=ioxReader.read();
                    if(ioxReaderValidator!=null)ioxReaderValidator.validate(kgdmEvent);
                    readerStat.add(kgdmEvent);
                    gwaFilter.addInput(kgdmEvent);
                    hydroEvent=gwaFilter.getMappedEvent();
                    while(hydroEvent!=null) {
                        writeIoxEvent(hydroEvent, hydroWriter, hydroStat,ioxWriterValidator);
                        hydroEvent=gwaFilter.getMappedEvent();
                    }
                }while(!(kgdmEvent instanceof EndTransferEvent));
                hydroEvent=gwaFilter.getMappedEvent();
                while(hydroEvent!=null) {
                    writeIoxEvent(hydroEvent, hydroWriter, hydroStat,ioxWriterValidator);
                    hydroEvent=gwaFilter.getMappedEvent();
                }
                readerStat.write2logger();
                hydroStat.write2logger();
            }finally{
                if(ioxReaderValidator!=null) {
                    ioxReaderValidator.close();
                    ioxReaderValidator=null;
                }
                if(ioxReader!=null){
                    try {
                        ioxReader.close();
                    } catch (IoxException e) {
                        EhiLogger.logError(e);
                    }
                    ioxReader=null;
                }
            }
        }finally{
            if(ioxWriterValidator!=null) {
                ioxWriterValidator.close();
                ioxWriterValidator=null;
            }
            if(hydroWriter!=null){
                try {
                    hydroWriter.close();
                } catch (IoxException e) {
                    EhiLogger.logError(e);
                }
                hydroWriter=null;
            }
        }
        
    }
    private void itfHydro2kgdm(File kgdm0File, File hydroFile, File kgdmFile, Settings settings,TransferDescription td_ili1, TransferDescription td_ili2) throws IoxException {
        IoxStatistics reader1Stat=null;
        IoxStatistics reader2Stat=null;
        IoxStatistics writerStat=null;
        XtfWriterBase kgdmWriter=null;
        try{
            reader1Stat=new IoxStatistics(td_ili1,settings);
            reader2Stat=new IoxStatistics(td_ili2,settings);
            writerStat=new IoxStatistics(td_ili2,settings);
            LegacyHydro2kgdm mapper=new LegacyHydro2kgdm();

            DefaultIoxFactoryCollection factories=new DefaultIoxFactoryCollection();
            factories.registerFactory(ZG_WASSERVERSORGUNGSATLAS_1_0.getIoxFactory());
            factories.registerFactory(ZG_HYDROGEOLOGISCHEOBJEKTE_2_3.getIoxFactory());
            factories.registerFactory(ZG_HYDROGEO_WVA_V1.getIoxFactory());
            
            kgdmWriter = new XtfWriterBase( kgdmFile,  getIoxMapping(),"2.3");
            kgdmWriter.setModels(new XtfModel[]{
                    ZG_HYDROGEO_WVA_V1.getXtfModel(),
                    TWVINNOTLAGEN_LV95_V1.getXtfModel(),
                    LOCALISATIONCH_V1.getXtfModel(),
                    GEOMETRYCHLV95_V1.getXtfModel(),
                    UNITS.getXtfModel(),
                    ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1.getXtfModel(),
                    PLANERISCHERGEWAESSERSCHUTZ_LV95_V1_1.getXtfModel(),
                    LOCALISATION_V1.getXtfModel(),
                    INTERNATIONALCODES_V1.getXtfModel(),
                    CHADMINCODES_V1.getXtfModel()
                    });
            PipelinePool pipelinePool=new PipelinePool();
            IoxLogging errHandler=new ch.interlis.iox_j.logging.Log2EhiLogger();
            Validator ioxWriterValidator=null;
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(kgdmFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxWriterValidator=new Validator(td_ili2,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            IoxEvent event=null;
            event=new ch.interlis.iox_j.StartTransferEvent(settings.getValue(SETTING_APPNAME));
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            event=new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEO_WVA_V1.Wasserversorgung_Zug,"b1");
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            if(kgdm0File!=null) {
                // setup data reader
                XtfReader ioxReader=new XtfReader(kgdm0File);
                ioxReader.setModel(td_ili2);
                ioxReader.setFactory(factories);
                reader2Stat.setFilename(kgdm0File.getPath());
                LogEventFactory errFactory=new LogEventFactory();
                errFactory.setDataSource(kgdm0File.getPath());
                ValidationConfig validationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                Validator ioxReaderValidator=null;
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxReaderValidator=new Validator(td_ili2,validationConfig,errHandler,errFactory,pipelinePool,validatorSettings);
                }
                try{
                    do{
                        event=ioxReader.read();
                        reader2Stat.add(event);
                        if(ioxReaderValidator!=null)ioxReaderValidator.validate(event);
                        mapper.addInput(event);
                        if(event instanceof ObjectEvent) {
                            IomObject mappedObj=mapper.getMappedObject();
                            while(mappedObj!=null) {
                                writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                                mappedObj=mapper.getMappedObject();
                            }
                        }
                    }while(!(event instanceof EndTransferEvent));
                    IomObject mappedObj=mapper.getMappedObject();
                    while(mappedObj!=null) {
                        writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                        mappedObj=mapper.getMappedObject();
                    }
                }finally{
                    if(ioxReaderValidator!=null){
                        ioxReaderValidator.close();
                        ioxReaderValidator=null;
                    }
                    if(ioxReader!=null){
                        try {
                            ioxReader.close();
                        } catch (IoxException e) {
                            EhiLogger.logError(e);
                        }
                        ioxReader=null;
                    }
                }
            }
            {
                // setup data reader
                ItfReader2 ioxReader=new ItfReader2(hydroFile,true);
                ioxReader.setModel(td_ili1);
                ioxReader.setFactory(factories);
                ioxReader.setIoxDataPool(pipelinePool);
                reader1Stat.setFilename(hydroFile.getPath());
                LogEventFactory errFactory=new LogEventFactory();
                errFactory.setDataSource(hydroFile.getPath());
                ValidationConfig validationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                validatorSettings.setValue(ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE, ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE_DO);
                Validator ioxReaderValidator=null;
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxReaderValidator=new Validator(td_ili1,validationConfig,errHandler,errFactory,pipelinePool,validatorSettings);
                }
                try{
                    do{
                        event=ioxReader.read();
                        reader1Stat.add(event);
                        if(ioxReaderValidator!=null)ioxReaderValidator.validate(event);
                        mapper.addInput(event);
                        if(event instanceof ObjectEvent) {
                            IomObject mappedObj=mapper.getMappedObject();
                            while(mappedObj!=null) {
                                writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                                mappedObj=mapper.getMappedObject();
                            }
                        }
                    }while(!(event instanceof EndTransferEvent));
                    IomObject mappedObj=mapper.getMappedObject();
                    while(mappedObj!=null) {
                        writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                        mappedObj=mapper.getMappedObject();
                    }
                }finally{
                    if(ioxReaderValidator!=null){
                        ioxReaderValidator.close();
                        ioxReaderValidator=null;
                    }
                    if(ioxReader!=null){
                        try {
                            ioxReader.close();
                        } catch (IoxException e) {
                            EhiLogger.logError(e);
                        }
                        ioxReader=null;
                    }
                }
            }
            event=new ch.interlis.iox_j.EndBasketEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            event=new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEO_WVA_V1.TransferMetadaten,"b2");
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            // TODO TransferMetadaten
            event=new ch.interlis.iox_j.EndBasketEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);

            event=new ch.interlis.iox_j.EndTransferEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            reader1Stat.write2logger();
            reader2Stat.write2logger();
            writerStat.write2logger();
        }finally{
            if(kgdmWriter!=null){
                try {
                    kgdmWriter.close();
                } catch (IoxException e) {
                    EhiLogger.logError(e);
                }
                kgdmWriter=null;
            }
        }
    }
    private void itfWva2kgdm(File wvaFile, File kgdmFile, Settings settings,TransferDescription td_ili1, TransferDescription td_ili2) throws IoxException {
        IoxStatistics readerStat=null;
        IoxStatistics writerStat=null;
        XtfWriterBase kgdmWriter=null;
        Validator ioxWriterValidator=null;
        try{
            readerStat=new IoxStatistics(td_ili1,settings);
            writerStat=new IoxStatistics(td_ili2,settings);
            PipelinePool pipelinePool=new PipelinePool();
            IoxLogging errHandler=new ch.interlis.iox_j.logging.Log2EhiLogger();
            {
                LogEventFactory errWriterFactory=new LogEventFactory();
                errWriterFactory.setDataSource(kgdmFile.getPath());
                ValidationConfig writerValidationConfig=new ValidationConfig();
                Settings validatorSettings=new Settings();
                if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                    ioxWriterValidator=new Validator(td_ili2,writerValidationConfig,errHandler,errWriterFactory,pipelinePool,validatorSettings);
                }
            }
            // setup data reader
            ItfReader2 ioxReader=new ItfReader2(wvaFile,true);
            ioxReader.setModel(td_ili1);
            DefaultIoxFactoryCollection factories=new DefaultIoxFactoryCollection();
            factories.registerFactory(ZG_WASSERVERSORGUNGSATLAS_1_0.getIoxFactory());
            ioxReader.setFactory(factories);
            readerStat.setFilename(wvaFile.getPath());
            ioxReader.setIoxDataPool(pipelinePool);
            LogEventFactory errFactory=new LogEventFactory();
            errFactory.setDataSource(wvaFile.getPath());
            ValidationConfig validationConfig=new ValidationConfig();
            Settings validatorSettings=new Settings();
            validatorSettings.setValue(ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE, ch.interlis.iox_j.validator.Validator.CONFIG_DO_ITF_OIDPERTABLE_DO);
            Validator ioxReaderValidator=null;
            if(!Boolean.TRUE.toString().equals(settings.getValue(SETTING_DISABLE_VALIDATION))) {
                ioxReaderValidator=new Validator(td_ili1,validationConfig,errHandler,errFactory,pipelinePool,validatorSettings);
            }
            
            LegacyWva2kgdm mapper=new LegacyWva2kgdm();

            kgdmWriter = new XtfWriterBase( kgdmFile,  getIoxMapping(),"2.3");
            kgdmWriter.setModels(new XtfModel[]{
                    ZG_HYDROGEO_WVA_V1.getXtfModel(),
                    TWVINNOTLAGEN_LV95_V1.getXtfModel(),
                    LOCALISATIONCH_V1.getXtfModel(),
                    GEOMETRYCHLV95_V1.getXtfModel(),
                    UNITS.getXtfModel(),
                    ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1.getXtfModel(),
                    PLANERISCHERGEWAESSERSCHUTZ_LV95_V1_1.getXtfModel(),
                    LOCALISATION_V1.getXtfModel(),
                    INTERNATIONALCODES_V1.getXtfModel(),
                    CHADMINCODES_V1.getXtfModel()
                    });
            IoxEvent event=null;
            event=new ch.interlis.iox_j.StartTransferEvent(settings.getValue(SETTING_APPNAME));
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            event=new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEO_WVA_V1.Wasserversorgung_Zug,"b1");
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            try{
                do{
                    event=ioxReader.read();
                    readerStat.add(event);
                    if(ioxReaderValidator!=null)ioxReaderValidator.validate(event);
                    mapper.addInput(event);
                    if(event instanceof ObjectEvent) {
                        IomObject mappedObj=mapper.getMappedObject();
                        while(mappedObj!=null) {
                            writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                            mappedObj=mapper.getMappedObject();
                        }
                    }
                }while(!(event instanceof EndTransferEvent));
                IomObject mappedObj=mapper.getMappedObject();
                while(mappedObj!=null) {
                    writeIoxEvent(new ch.interlis.iox_j.ObjectEvent(mappedObj), kgdmWriter, writerStat,ioxWriterValidator);
                    mappedObj=mapper.getMappedObject();
                }
            }finally{
                if(ioxReaderValidator!=null){
                    ioxReaderValidator.close();
                    ioxReaderValidator=null;
                }
                if(ioxReader!=null){
                    try {
                        ioxReader.close();
                    } catch (IoxException e) {
                        EhiLogger.logError(e);
                    }
                    ioxReader=null;
                }
            }
            event=new ch.interlis.iox_j.EndBasketEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            event=new ch.interlis.iox_j.StartBasketEvent(ZG_HYDROGEO_WVA_V1.TransferMetadaten,"b2");
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            // TODO TransferMetadaten
            event=new ch.interlis.iox_j.EndBasketEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);

            event=new ch.interlis.iox_j.EndTransferEvent();
            writeIoxEvent(event, kgdmWriter, writerStat,ioxWriterValidator);
            readerStat.write2logger();
            writerStat.write2logger();
        }finally{
            if(ioxWriterValidator!=null) {
                ioxWriterValidator.close();
                ioxWriterValidator=null;
            }
            if(kgdmWriter!=null){
                try {
                    kgdmWriter.close();
                } catch (IoxException e) {
                    EhiLogger.logError(e);
                }
                kgdmWriter=null;
            }
        }
    }
    private void writeIoxEvent(IoxEvent event, IoxWriter ioxWriter, IoxStatistics stat,Validator validator) throws IoxException {
        if(event!=null) {
            stat.add(event);
            if(validator!=null) {
                validator.validate(event);
            }
            if(ioxWriter!=null) {
                ioxWriter.write(event);
            }
        }
    }
    @Deprecated
    private void writeIoxEvent(IoxEvent event, IoxWriter ioxWriter, IoxStatistics stat) throws IoxException {
        writeIoxEvent(event, ioxWriter, stat, null);
    }
    public static ViewableProperties getIoxMapping()
    {
       ViewableProperties mapping=INTERLIS_.getIoxMapping();
       mapping.addAll(ZG_HYDROGEO_WVA_V1.getIoxMapping());
       mapping.addAll(TWVINNOTLAGEN_LV95_V1.getIoxMapping());
       mapping.addAll(GRUNDWASSERAUSTRITTE_LV95_V1.getIoxMapping());
       mapping.addAll(LOCALISATIONCH_V1.getIoxMapping());
       mapping.addAll(GEOMETRYCHLV95_V1.getIoxMapping());
       mapping.addAll(UNITS.getIoxMapping());
       mapping.addAll(ZG_PLANERISCHERGEWAESSERSCHUTZ_V1_1.getIoxMapping());
       mapping.addAll(PLANERISCHERGEWAESSERSCHUTZ_LV95_V1_1.getIoxMapping());
       mapping.addAll(LOCALISATION_V1.getIoxMapping());
       mapping.addAll(INTERNATIONALCODES_V1.getIoxMapping());
       mapping.addAll(CHADMINCODES_V1.getIoxMapping());
    
          return mapping;
    }

}
