package ch.ehi.zg.hydrogeowva2mgdm.gui;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.ActionEvent;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.view.*;
import ch.ehi.basics.settings.Settings;
import ch.ehi.basics.swing.SwingWorker;
import ch.ehi.basics.tools.StringUtility;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.filechooser.FileNameExtensionFilter;

import ch.ehi.zg.hydrogeowva2mgdm.Converter;
import ch.ehi.zg.hydrogeowva2mgdm.Main;

/** GUI of zghydrogeowva2mgdm.
 */
public class MainFrame extends JFrame {
	private static final String WINDOW_HEIGHT = "ch.ehi.zg.hydrogeowva2mgdm.gui.MainFrame.windowHeight";
	private static final String WINDOW_WIDTH = "ch.ehi.zg.hydrogeowva2mgdm.gui.MainFrame.windowWidth";
	private static final String WINDOW_X = "ch.ehi.zg.hydrogeowva2mgdm.gui.MainFrame.windowX";
	private static final String WINDOW_Y = "ch.ehi.zg.hydrogeowva2mgdm.gui.MainFrame.windowY";

	private java.util.ResourceBundle rsrc=java.util.ResourceBundle.getBundle("ch.ehi.zg.hydrogeowva2mgdm.gui.Texts");
	private Settings settings=null;
	private javax.swing.JPanel jContentPane = null;

    private javax.swing.JLabel functionLabel = null;
    private JComboBox functionUi;
    private int function;
    
	private javax.swing.JLabel kgdmFileLabel = null;
	private javax.swing.JTextField kgdmFileUi = null;
    private javax.swing.JButton doKgdmFileSelBtn = null;
    
    private javax.swing.JLabel kgdm0FileLabel = null;
    private javax.swing.JTextField kgdm0FileUi = null;
    private javax.swing.JButton doKgdm0FileSelBtn = null;
        
    private javax.swing.JLabel mgdmTwvFileLabel = null;
    private javax.swing.JTextField mgdmTwvFileUi = null;
    private javax.swing.JButton doMgdmTwvFileSelBtn = null;
    
    private javax.swing.JLabel mgdmGwaFileLabel = null;
    private javax.swing.JTextField mgdmGwaFileUi = null;
    private javax.swing.JButton doMgdmGwaFileSelBtn = null;
    
    private javax.swing.JLabel wvaFileLabel = null;
    private javax.swing.JTextField wvaFileUi = null;
    private javax.swing.JButton doWvaFileSelBtn = null;
    
    private javax.swing.JLabel hydroFileLabel = null;
    private javax.swing.JTextField hydroFileUi = null;
    private javax.swing.JButton doHydroFileSelBtn = null;
    
	private javax.swing.JCheckBox disableValidationUi = null;
	
	private javax.swing.JLabel logFileLabel = null;
	private javax.swing.JTextField logFileUi = null;
	private javax.swing.JButton doLogFileSelBtn = null;
	
	private javax.swing.JTextArea logUi = null;
	private javax.swing.JButton clearlogBtn = null;
	
	private JCheckBoxMenuItem optionsTraceItem = null;
	
	
	public MainFrame() {
		super();
		initialize();
	}
	private void initialize() {
		this.setSize(500, 361);
		this.setLocationByPlatform(true);
		this.setContentPane(getJContentPane());
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setName(Main.APP_NAME);
		this.setTitle(rsrc.getString("MainFrame.Title"));
		
        switchFunction(function);
		
	    //Create the menu bar.
		JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);

	    JMenu menu = new JMenu(rsrc.getString("MainFrame.ToolsMenu"));
	    menu.setMnemonic(KeyEvent.VK_T);
	    menuBar.add(menu);
	    JMenuItem menuItem = new JMenuItem(rsrc.getString("MainFrame.ModelRepositoriesMenuItem"));
		menuItem.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				ch.interlis.ili2c.gui.RepositoriesDialog dlg=new ch.interlis.ili2c.gui.RepositoriesDialog(MainFrame.this);
				dlg.setIlidirs(settings.getValue(Converter.SETTING_ILIDIRS));
				dlg.setHttpProxyHost(settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST));
				dlg.setHttpProxyPort(settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT));
				dlg.setLocationRelativeTo(getJContentPane());
				if(dlg.showDialog()==ch.interlis.ili2c.gui.RepositoriesDialog.OK_OPTION){
					String ilidirs=dlg.getIlidirs();
					if(ilidirs==null){
						ilidirs=Converter.SETTING_DEFAULT_ILIDIRS;
					}
					settings.setValue(Converter.SETTING_ILIDIRS,ilidirs);
					settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST,dlg.getHttpProxyHost());
					settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT,dlg.getHttpProxyPort());
					saveSettings(settings);
				}
			}

		});
		menu.add(menuItem);
		
		// Add Options Menu in the Menu Bar
        JMenu optionsMenu = new JMenu(rsrc.getString("MainFrame.OptionsMenu"));
        optionsMenu.setMnemonic(KeyEvent.VK_T);
        menuBar.add(optionsMenu);
        
        // Add Checkboxes to Options Menu
        optionsTraceItem = new JCheckBoxMenuItem(rsrc.getString("MainFrame.OptionsTraceItem"));
        optionsMenu.add(optionsTraceItem);

        // Add Help Menu in the Menu Bar
		JMenu helpMenu = new JMenu(rsrc.getString("MainFrame.HelpMenu"));
		menuBar.add(helpMenu);

		JMenuItem onlineDocumentation = new JMenuItem(rsrc.getString("MainFrame.OnlineHelpMenuItem"));
		helpMenu.add(onlineDocumentation);
		onlineDocumentation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					Desktop currentDesktop = Desktop.getDesktop();
					if (Desktop.isDesktopSupported() && currentDesktop.isSupported(Desktop.Action.BROWSE)) {
						URI docUri = URI.create("https://github.com/claeis/zghydrogeowva2mgdm");
						currentDesktop.browse(docUri);
					}
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
			}
		});

		final JDialog aboutDialog = new AboutDialog(this);
		JMenuItem aboutMenuItem = new JMenuItem(rsrc.getString("MainFrame.AboutMenuItem"));
		helpMenu.add(aboutMenuItem);
		aboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutDialog.setLocationRelativeTo(getJContentPane());
				aboutDialog.setVisible(true);
			}
		});

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              saveSettings(getSettings());
  	    	System.exit(0);
            }
          });
	    
	}
	private void saveSettings(Settings settings) {
        // save not all, but only some values 
		Settings toSave=new Settings();
		toSave.setValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY,settings.getValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY));
		toSave.setValue(Converter.SETTING_ILIDIRS,settings.getValue(Converter.SETTING_ILIDIRS));
		toSave.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST,settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST));
		toSave.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT,settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT));
		toSave.setValue(WINDOW_WIDTH, settings.getValue(WINDOW_WIDTH));
		toSave.setValue(WINDOW_HEIGHT, settings.getValue(WINDOW_HEIGHT));
		toSave.setValue(WINDOW_X, settings.getValue(WINDOW_X));
		toSave.setValue(WINDOW_Y, settings.getValue(WINDOW_Y));

		Main.writeSettings(toSave);
	}
	private javax.swing.JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new javax.swing.JPanel();
            java.awt.GridBagConstraints functionLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints functionUiConstraints = new java.awt.GridBagConstraints();
            
			java.awt.GridBagConstraints kgdmFileLabelConstraints = new java.awt.GridBagConstraints();
			java.awt.GridBagConstraints kgdmFileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doKgdmFileSelBtnConstraints = new java.awt.GridBagConstraints();
            
            java.awt.GridBagConstraints kgdm0FileLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints kgdm0FileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doKgdm0FileSelBtnConstraints = new java.awt.GridBagConstraints();
            
            java.awt.GridBagConstraints mgdmTwvFileLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints mgdmTwvFileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doMgdmTwvFileSelBtnConstraints = new java.awt.GridBagConstraints();
            
            java.awt.GridBagConstraints mgdmGwaFileLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints mgdmGwaFileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doMgdmGwaFileSelBtnConstraints = new java.awt.GridBagConstraints();
            
            java.awt.GridBagConstraints wvaFileLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints wvaFileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doWvaFileSelBtnConstraints = new java.awt.GridBagConstraints();
            
            java.awt.GridBagConstraints hydroFileLabelConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints hydroFileUiConstraints = new java.awt.GridBagConstraints();
            java.awt.GridBagConstraints doHydroFileSelBtnConstraints = new java.awt.GridBagConstraints();
            
			java.awt.GridBagConstraints disableValidationConstraints = new java.awt.GridBagConstraints();
			
			java.awt.GridBagConstraints logFileLabelConstraints = new java.awt.GridBagConstraints();
			java.awt.GridBagConstraints logFileUiConstraints = new java.awt.GridBagConstraints();
			java.awt.GridBagConstraints doLogFileSelBtnConstraints = new java.awt.GridBagConstraints();
			
			java.awt.GridBagConstraints clearlogBtnConstraints = new java.awt.GridBagConstraints();
			java.awt.GridBagConstraints logPaneConstraints = new java.awt.GridBagConstraints();
			java.awt.GridBagConstraints doConvertConstraints = new java.awt.GridBagConstraints();
			
			int row=0;
            functionLabelConstraints.gridx = 0;
            functionLabelConstraints.gridy = row;
            functionLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            functionUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            functionUiConstraints.weightx = 1.0;
            functionUiConstraints.gridx = 1;
            functionUiConstraints.gridy = row;
            functionUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            row++;
            
			// row 0
			kgdmFileLabelConstraints.gridx = 0;
			kgdmFileLabelConstraints.gridy = row;
			kgdmFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			kgdmFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			kgdmFileUiConstraints.weightx = 1.0;
			kgdmFileUiConstraints.gridx = 1;
			kgdmFileUiConstraints.gridy = row;
			kgdmFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			doKgdmFileSelBtnConstraints.gridx = 2;
			doKgdmFileSelBtnConstraints.gridy = row;
			doKgdmFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
			row++;

            kgdm0FileLabelConstraints.gridx = 0;
            kgdm0FileLabelConstraints.gridy = row;
            kgdm0FileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            kgdm0FileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            kgdm0FileUiConstraints.weightx = 1.0;
            kgdm0FileUiConstraints.gridx = 1;
            kgdm0FileUiConstraints.gridy = row;
            kgdm0FileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            doKgdm0FileSelBtnConstraints.gridx = 2;
            doKgdm0FileSelBtnConstraints.gridy = row;
            doKgdm0FileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
            row++;
            
            mgdmTwvFileLabelConstraints.gridx = 0;
            mgdmTwvFileLabelConstraints.gridy = row;
            mgdmTwvFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            mgdmTwvFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            mgdmTwvFileUiConstraints.weightx = 1.0;
            mgdmTwvFileUiConstraints.gridx = 1;
            mgdmTwvFileUiConstraints.gridy = row;
            mgdmTwvFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            doMgdmTwvFileSelBtnConstraints.gridx = 2;
            doMgdmTwvFileSelBtnConstraints.gridy = row;
            doMgdmTwvFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
            row++;
			
            mgdmGwaFileLabelConstraints.gridx = 0;
            mgdmGwaFileLabelConstraints.gridy = row;
            mgdmGwaFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            mgdmGwaFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            mgdmGwaFileUiConstraints.weightx = 1.0;
            mgdmGwaFileUiConstraints.gridx = 1;
            mgdmGwaFileUiConstraints.gridy = row;
            mgdmGwaFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            doMgdmGwaFileSelBtnConstraints.gridx = 2;
            doMgdmGwaFileSelBtnConstraints.gridy = row;
            doMgdmGwaFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
            row++;
            
            wvaFileLabelConstraints.gridx = 0;
            wvaFileLabelConstraints.gridy = row;
            wvaFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            wvaFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            wvaFileUiConstraints.weightx = 1.0;
            wvaFileUiConstraints.gridx = 1;
            wvaFileUiConstraints.gridy = row;
            wvaFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            doWvaFileSelBtnConstraints.gridx = 2;
            doWvaFileSelBtnConstraints.gridy = row;
            doWvaFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
            row++;

            hydroFileLabelConstraints.gridx = 0;
            hydroFileLabelConstraints.gridy = row;
            hydroFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            hydroFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            hydroFileUiConstraints.weightx = 1.0;
            hydroFileUiConstraints.gridx = 1;
            hydroFileUiConstraints.gridy = row;
            hydroFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            doHydroFileSelBtnConstraints.gridx = 2;
            doHydroFileSelBtnConstraints.gridy = row;
            doHydroFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
            row++;

			// row 1
			disableValidationConstraints.gridx = 1;
			disableValidationConstraints.gridy = row;
			disableValidationConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			row++;
			
			// row 3
			logFileLabelConstraints.gridx = 0;
			logFileLabelConstraints.gridy = row;
			logFileLabelConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			logFileUiConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			logFileUiConstraints.weightx = 1.0;
			logFileUiConstraints.gridx = 1;
			logFileUiConstraints.gridy = row;
			logFileUiConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			doLogFileSelBtnConstraints.gridx = 2;
			doLogFileSelBtnConstraints.gridy = row;
			doLogFileSelBtnConstraints.anchor = java.awt.GridBagConstraints.WEST;
			row++;
			
			// row 6
			logPaneConstraints.fill = java.awt.GridBagConstraints.BOTH;
			logPaneConstraints.weightx = 1.0;
			logPaneConstraints.weighty = 1.0;
			logPaneConstraints.gridx = 0;
			logPaneConstraints.gridy = row;
			logPaneConstraints.gridheight = 2;
			logPaneConstraints.gridwidth = 2;
			doConvertConstraints.gridy = row;
			doConvertConstraints.gridx = 2;
			doConvertConstraints.gridwidth = 2;
			doConvertConstraints.anchor = java.awt.GridBagConstraints.WEST;
			row++;
			
			// row 7
			clearlogBtnConstraints.gridx = 2;//2
			clearlogBtnConstraints.gridy = row;
			clearlogBtnConstraints.gridwidth = 2;
			clearlogBtnConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
			
			jContentPane.setLayout(new java.awt.GridBagLayout());

            jContentPane.add(getFunctionLabel(), functionLabelConstraints);
            jContentPane.add(getFunctionUi(), functionUiConstraints);
			
			jContentPane.add(getKgdmFileLabel(), kgdmFileLabelConstraints);
			jContentPane.add(getKgdmFileUi(), kgdmFileUiConstraints);
			jContentPane.add(getDoKgdmFileSelBtn(), doKgdmFileSelBtnConstraints);
			
            jContentPane.add(getKgdm0FileLabel(), kgdm0FileLabelConstraints);
            jContentPane.add(getKgdm0FileUi(), kgdm0FileUiConstraints);
            jContentPane.add(getDoKgdm0FileSelBtn(), doKgdm0FileSelBtnConstraints);
            
            jContentPane.add(getMgdmTwvFileLabel(), mgdmTwvFileLabelConstraints);
            jContentPane.add(getMgdmTwvFileUi(), mgdmTwvFileUiConstraints);
            jContentPane.add(getDoMgdmTwvFileSelBtn(), doMgdmTwvFileSelBtnConstraints);
            
            jContentPane.add(getMgdmGwaFileLabel(), mgdmGwaFileLabelConstraints);
            jContentPane.add(getMgdmGwaFileUi(), mgdmGwaFileUiConstraints);
            jContentPane.add(getDoMgdmGwaFileSelBtn(), doMgdmGwaFileSelBtnConstraints);
            
            jContentPane.add(getWvaFileLabel(), wvaFileLabelConstraints);
            jContentPane.add(getWvaFileUi(), wvaFileUiConstraints);
            jContentPane.add(getDoWvaFileSelBtn(), doWvaFileSelBtnConstraints);
            
            jContentPane.add(getHydroFileLabel(), hydroFileLabelConstraints);
            jContentPane.add(getHydroFileUi(), hydroFileUiConstraints);
            jContentPane.add(getDoHydroFileSelBtn(), doHydroFileSelBtnConstraints);
            
			jContentPane.add(getLogFileLabel(), logFileLabelConstraints);
			jContentPane.add(getLogFileUi(), logFileUiConstraints);
			jContentPane.add(getDoLogFileSelBtn(), doLogFileSelBtnConstraints);

			
			jContentPane.add(getJScrollPane(), logPaneConstraints);
			jContentPane.add(getClearlogBtn(), clearlogBtnConstraints);
			jContentPane.add(getDisableValidationUi(), disableValidationConstraints);
			jContentPane.add(getDoConvertBtn(), doConvertConstraints);
		}
		return jContentPane;
	}
    private javax.swing.JLabel getFunctionLabel() {
        if(functionLabel == null) {
            functionLabel = new javax.swing.JLabel();
            functionLabel.setText(rsrc.getString("MainFrame.functionLabel"));
        }
        return functionLabel;
    }
	private javax.swing.JLabel getKgdmFileLabel() {
		if(kgdmFileLabel == null) {
			kgdmFileLabel = new javax.swing.JLabel();
			kgdmFileLabel.setText(rsrc.getString("MainFrame.kgdmFileLabel"));
		}
		return kgdmFileLabel;
	}
    private javax.swing.JLabel getKgdm0FileLabel() {
        if(kgdm0FileLabel == null) {
            kgdm0FileLabel = new javax.swing.JLabel();
            kgdm0FileLabel.setText(rsrc.getString("MainFrame.kgdm0FileLabel"));
        }
        return kgdm0FileLabel;
    }
    private javax.swing.JLabel getMgdmTwvFileLabel() {
        if(mgdmTwvFileLabel == null) {
            mgdmTwvFileLabel = new javax.swing.JLabel();
            mgdmTwvFileLabel.setText(rsrc.getString("MainFrame.mgdmTwvFileLabel"));
        }
        return mgdmTwvFileLabel;
    }
    private javax.swing.JLabel getMgdmGwaFileLabel() {
        if(mgdmGwaFileLabel == null) {
            mgdmGwaFileLabel = new javax.swing.JLabel();
            mgdmGwaFileLabel.setText(rsrc.getString("MainFrame.mgdmGwaFileLabel"));
        }
        return mgdmGwaFileLabel;
    }
    private javax.swing.JLabel getWvaFileLabel() {
        if(wvaFileLabel == null) {
            wvaFileLabel = new javax.swing.JLabel();
            wvaFileLabel.setText(rsrc.getString("MainFrame.wvaFileLabel"));
        }
        return wvaFileLabel;
    }
    private javax.swing.JLabel getHydroFileLabel() {
        if(hydroFileLabel == null) {
            hydroFileLabel = new javax.swing.JLabel();
            hydroFileLabel.setText(rsrc.getString("MainFrame.hydroFileLabel"));
        }
        return hydroFileLabel;
    }
	private javax.swing.JLabel getLogFileLabel() {
		if(logFileLabel == null) {
			logFileLabel = new javax.swing.JLabel();
			logFileLabel.setText(rsrc.getString("MainFrame.logFileLabel"));
		}
		return logFileLabel;
	}
	private javax.swing.JTextField getKgdmFileUi() {
		if(kgdmFileUi == null) {
			kgdmFileUi = new javax.swing.JTextField();
			new DropTarget(kgdmFileUi, getKgdmDragAndDropHandler());
		}
		return kgdmFileUi;
	}
    private javax.swing.JTextField getKgdm0FileUi() {
        if(kgdm0FileUi == null) {
            kgdm0FileUi = new javax.swing.JTextField();
        }
        return kgdm0FileUi;
    }
    private javax.swing.JTextField getMgdmTwvFileUi() {
        if(mgdmTwvFileUi == null) {
            mgdmTwvFileUi = new javax.swing.JTextField();
        }
        return mgdmTwvFileUi;
    }
    private javax.swing.JTextField getMgdmGwaFileUi() {
        if(mgdmGwaFileUi == null) {
            mgdmGwaFileUi = new javax.swing.JTextField();
        }
        return mgdmGwaFileUi;
    }
    private javax.swing.JTextField getWvaFileUi() {
        if(wvaFileUi == null) {
            wvaFileUi = new javax.swing.JTextField();
        }
        return wvaFileUi;
    }
    private javax.swing.JTextField getHydroFileUi() {
        if(hydroFileUi == null) {
            hydroFileUi = new javax.swing.JTextField();
        }
        return hydroFileUi;
    }
	private javax.swing.JTextField getLogFileUi() {
		if(logFileUi == null) {
			logFileUi = new javax.swing.JTextField();
		}
		return logFileUi;
	}
	private javax.swing.JTextArea getLogUi() {
		if(logUi == null) {
			logUi = new javax.swing.JTextArea();
			logUi.setEditable(false);
		}
		return logUi;
	}
    Integer functionItems[] = new Integer[]{
       new Integer(Converter.FC_ITFHYDRO2KGDM)
     , new Integer(Converter.FC_ITFWVA2KGDM)
     , new Integer(Converter.FC_KGDM2MGDM)
     , new Integer(Converter.FC_KGDM2ITF)
     };
    private class KindListCellRenderer extends JLabel implements ListCellRenderer{
        public Component getListCellRendererComponent(JList arg0, Object obj,
                int arg2, boolean arg3, boolean arg4) {
            int kind=((Integer)obj).intValue();
            String text=null;
            if(kind==Converter.FC_ITFHYDRO2KGDM) {
                text=rsrc.getString("MainFrame.FC_ITFHYDRO2KGDM");
            }else if(kind==Converter.FC_ITFWVA2KGDM) {
                text=rsrc.getString("MainFrame.FC_ITFWVA2KGDM");
            }else if(kind==Converter.FC_KGDM2MGDM) {
                text=rsrc.getString("MainFrame.FC_KGDM2MGDM");
            }else if(kind==Converter.FC_KGDM2ITF) {
                text=rsrc.getString("MainFrame.FC_KGDM2ITF");
            }else {
                throw new IllegalStateException("kind "+kind);
            }
            setText(text);
            return this;
        }
  };
	
	private JComboBox getFunctionUi() {
	    functionUi = new JComboBox(functionItems);
	    functionUi.setRenderer(new KindListCellRenderer());
	    functionUi.setEditable(false);
	        functionUi.addActionListener(new ActionListener(){
	          public void actionPerformed(java.awt.event.ActionEvent e){
	            int kind=((Integer)functionUi.getSelectedItem()).intValue();
                switchFunction(kind);
	            function=kind;
	          }
	        });
	    return functionUi;
	}
	private javax.swing.JButton getClearlogBtn() {
		if(clearlogBtn == null) {
			clearlogBtn = new javax.swing.JButton();
			clearlogBtn.setText(rsrc.getString("MainFrame.clearLogButton"));
			clearlogBtn.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					logClear();
				}
			});
		}
		return clearlogBtn;
	}
	private javax.swing.JCheckBox getDisableValidationUi() {
		if(disableValidationUi == null) {
			disableValidationUi = new javax.swing.JCheckBox();
			disableValidationUi.setText(rsrc.getString("MainFrame.disableValidation"));
		}
		return disableValidationUi;
	}
	private DropTargetListener getKgdmDragAndDropHandler() {
		return new DropTargetListener() {
			public void dragEnter(DropTargetDragEvent evt) {}
			public void dragOver(DropTargetDragEvent evt) {}
			public void dropActionChanged(DropTargetDragEvent evt) {}
			public void dragExit(DropTargetEvent dte) {}
			public void drop(DropTargetDropEvent evt) {
				try {
					Transferable tr = evt.getTransferable();
					for (DataFlavor flavor : tr.getTransferDataFlavors()) {
						if (flavor.isFlavorJavaFileListType()){
							evt.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
							List<File> files = (List<File>)tr.getTransferData(flavor);
							if(files.size()==1){
								String absolutePath = files.get(0).getAbsolutePath();
	                            setKgdmFile(absolutePath);
							}
						}
					}
				} catch (IOException e) {
				    EhiLogger.logError(e);
				} catch (UnsupportedFlavorException e) {
                    EhiLogger.logError(e);
				}
			}
		};
	}
	public File getKgdmFile(){
		String fileTextInUi=getKgdmFileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
		return new File(fileTextInUi);
	}
	public void setKgdmFile(String kgdmfile){
		getKgdmFileUi().setText(kgdmfile);
	}
    public File getKgdm0File(){
        String fileTextInUi=getKgdm0FileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
        return new File(fileTextInUi);
    }
    public void setKgdm0File(String kgdmfile){
        getKgdm0FileUi().setText(kgdmfile);
    }	
    public File getMgdmTwvFile(){
        String fileTextInUi=getMgdmTwvFileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
        return new File(fileTextInUi);
    }
    public void setMgdmTwvFile(String kgdmfile){
        getMgdmTwvFileUi().setText(kgdmfile);
    }
    public File getMgdmGwaFile(){
        String fileTextInUi=getMgdmGwaFileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
        return new File(fileTextInUi);
    }
    public void setMgdmGwaFile(String kgdmfile){
        getMgdmGwaFileUi().setText(kgdmfile);
    }
    public File getWvaFile(){
        String fileTextInUi=getWvaFileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
        return new File(fileTextInUi);
    }
    public void setWvaFile(String kgdmfile){
        getWvaFileUi().setText(kgdmfile);
    }
    public File getHydroFile(){
        String fileTextInUi=getHydroFileUi().getText().trim();
        if(fileTextInUi.length()==0)return null;
        return new File(fileTextInUi);
    }
    public void setHydroFile(String kgdmfile){
        getHydroFileUi().setText(kgdmfile);
    }
	public boolean getDisableValidation(){
		boolean disableValidation=getDisableValidationUi().isSelected();
		return disableValidation;
	}
	public void setDisableValidation(boolean disableValidation){
		getDisableValidationUi().setSelected(disableValidation);
	}
	public String getLogFile(){
		return StringUtility.purge(getLogFileUi().getText());
	}
	public void setLogFile(String logfile){
		getLogFileUi().setText(logfile);
	}
	public Settings getSettings()
	{
		// get values from UI
		String logFile=getLogFile();
		String disableValidation=getDisableValidation()?Boolean.TRUE.toString():Boolean.FALSE.toString();
		
		// keep some values from current settings
		String workingDir=settings.getValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY);
		String proxyHost=settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST);
		String proxyPort=settings.getValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT);
		String ilidirs=settings.getValue(Converter.SETTING_ILIDIRS);
        String appHome=settings.getValue(Converter.SETTING_APPHOME);

		// save window location and size
		Dimension dimension = getSize();
		String windowWidth = Integer.toString((int) dimension.getWidth());
		String windowHeight = Integer.toString((int) dimension.getHeight());
		Point origin = getLocation();
		String windowX = Integer.toString((int) origin.getX());
		String windowY = Integer.toString((int) origin.getY());

		
		Settings newSettings=new Settings();
		
		newSettings.setValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY,workingDir);
		newSettings.setValue(Converter.SETTING_LOGFILE,logFile);
		newSettings.setValue(Converter.SETTING_DISABLE_VALIDATION,disableValidation);
		newSettings.setValue(Converter.SETTING_ILIDIRS,ilidirs);
		newSettings.setValue(Converter.SETTING_APPHOME, appHome);
		newSettings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST,proxyHost);
		newSettings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT,proxyPort);
		newSettings.setValue(WINDOW_WIDTH, windowWidth);
		newSettings.setValue(WINDOW_HEIGHT, windowHeight);
		newSettings.setValue(WINDOW_X, windowX);
		newSettings.setValue(WINDOW_Y, windowY);
		
		if (optionsTraceItem.isSelected()) {
		    EhiLogger.getInstance().setTraceFilter(false);
		} else {
		    EhiLogger.getInstance().setTraceFilter(true);
		}
		
		return newSettings;
	}
	public void setSettings(Settings settings)
	{
		this.settings=settings;
	}
	private StringBuffer body=new StringBuffer();
	private javax.swing.JScrollPane jScrollPane = null;
	private javax.swing.JButton doConvertBtn = null;
	public void logAppend(String msg){
		body.append(msg);
		if(!msg.endsWith("\n")){
			body.append("\n");
		}
		getLogUi().setText(body.toString());
	}
	public void logClear(){
		body=new StringBuffer();
		getLogUi().setText(body.toString());
	}
	private javax.swing.JScrollPane getJScrollPane() {
		if(jScrollPane == null) {
			jScrollPane = new javax.swing.JScrollPane();
			jScrollPane.setViewportView(getLogUi());
		}
		return jScrollPane;
	}
	public static void main(Settings settings) {
			MainFrame frame=new MainFrame();
			frame.setSettings(settings);
			String logFile=settings.getValue(Converter.SETTING_LOGFILE);
			frame.setLogFile(logFile);
			EhiLogger.getInstance().addListener(new LogListener(frame,logFile));
			frame.setDisableValidation(Boolean.TRUE.equals(settings.getValue(Converter.SETTING_DISABLE_VALIDATION)));
			restoreWindowSizeAndLocation(frame, settings);
			frame.show();
	}
	private static void restoreWindowSizeAndLocation(JFrame frame, Settings settings) {
		try {
			int width = Integer.parseInt(settings.getValue(WINDOW_WIDTH));
			int height = Integer.parseInt(settings.getValue(WINDOW_HEIGHT));
			int x = Integer.parseInt(settings.getValue(WINDOW_X));
			int y = Integer.parseInt(settings.getValue(WINDOW_Y));

			frame.setSize(width, height);
			if (isLocationOnScreen(x, y)) {
				frame.setLocation(x, y);
			}
		} catch (NumberFormatException ex) {
			// ignore settings, use the default size and location
		}
	}
	private static boolean isLocationOnScreen(int x, int y) {
		for (GraphicsDevice screen : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
			Rectangle bounds = screen.getDefaultConfiguration().getBounds();
			if (bounds.contains(x, y)) {
				return true;
			}
		}
		return false;
	}
	private javax.swing.JButton getDoConvertBtn() {
		if(doConvertBtn == null) {
			doConvertBtn = new javax.swing.JButton();
			doConvertBtn.setText(rsrc.getString("MainFrame.doConvertButton"));
			doConvertBtn.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					SwingWorker worker = new SwingWorker() {
						public Object construct() {
							try {
								boolean ret=new Converter().convert(Converter.FC_ITFHYDRO2KGDM,getWvaFile(),getHydroFile(),getKgdm0File(),getKgdmFile(),getMgdmTwvFile(),getMgdmGwaFile(), getSettings());
                                getLogUi().setCaretPosition(getLogUi().getDocument().getLength());
								Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(MainFrame.this, ret?Converter.MSG_CONVERSION_DONE:Converter.MSG_CONVERSION_FAILED);                                   
							} catch (Exception ex) {
								EhiLogger.logError(rsrc.getString("MainFrame.generalError"),ex);
							}
							return null;
						}
					};
					worker.start();
				}
			});
		}
		return doConvertBtn;
	}
	private javax.swing.JButton getDoKgdmFileSelBtn() {
		if(doKgdmFileSelBtn == null) {
			doKgdmFileSelBtn = new javax.swing.JButton();
			doKgdmFileSelBtn.setText("...");
			doKgdmFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.kgdmFileChooserTitle"));
                    fileDialog.setFileFilter(createXtfFilter());
					if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
						setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
						setKgdmFile(selectedFile);
					}				
				}
			});
		}
		return doKgdmFileSelBtn;
	}
    private javax.swing.JButton getDoKgdm0FileSelBtn() {
        if(doKgdm0FileSelBtn == null) {
            doKgdm0FileSelBtn = new javax.swing.JButton();
            doKgdm0FileSelBtn.setText("...");
            doKgdm0FileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
                public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.kgdmFileChooserTitle"));
                    fileDialog.setFileFilter(createXtfFilter());
                    if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
                        setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
                        setKgdm0File(selectedFile);
                    }               
                }
            });
        }
        return doKgdm0FileSelBtn;
    }
    private javax.swing.JButton getDoMgdmTwvFileSelBtn() {
        if(doMgdmTwvFileSelBtn == null) {
            doMgdmTwvFileSelBtn = new javax.swing.JButton();
            doMgdmTwvFileSelBtn.setText("...");
            doMgdmTwvFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
                public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.mgdmTwvFileChooserTitle"));
                    fileDialog.setFileFilter(createXtfFilter());
                    if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
                        setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
                        setMgdmTwvFile(selectedFile);
                    }               
                }
            });
        }
        return doMgdmTwvFileSelBtn;
    }
    private javax.swing.JButton getDoMgdmGwaFileSelBtn() {
        if(doMgdmGwaFileSelBtn == null) {
            doMgdmGwaFileSelBtn = new javax.swing.JButton();
            doMgdmGwaFileSelBtn.setText("...");
            doMgdmGwaFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
                public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.mgdmGwaFileChooserTitle"));
                    fileDialog.setFileFilter(createXtfFilter());
                    if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
                        setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
                        setMgdmGwaFile(selectedFile);
                    }               
                }
            });
        }
        return doMgdmGwaFileSelBtn;
    }
    private javax.swing.JButton getDoWvaFileSelBtn() {
        if(doWvaFileSelBtn == null) {
            doWvaFileSelBtn = new javax.swing.JButton();
            doWvaFileSelBtn.setText("...");
            doWvaFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
                public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.wvaFileChooserTitle"));
                    fileDialog.setFileFilter(createItfFilter());
                    if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
                        setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
                        setWvaFile(selectedFile);
                    }               
                }
            });
        }
        return doWvaFileSelBtn;
    }
    private javax.swing.JButton getDoHydroFileSelBtn() {
        if(doHydroFileSelBtn == null) {
            doHydroFileSelBtn = new javax.swing.JButton();
            doHydroFileSelBtn.setText("...");
            doHydroFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
                public void actionPerformed(java.awt.event.ActionEvent e) {    
                    FileChooser fileDialog =  new FileChooser();
                    fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
                    fileDialog.setDialogTitle(rsrc.getString("MainFrame.hydroFileChooserTitle"));
                    fileDialog.setFileFilter(createItfFilter());
                    if (fileDialog.showOpenDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
                        setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
                        String selectedFile=fileDialog.getSelectedFile().getAbsolutePath();
                        setHydroFile(selectedFile);
                    }               
                }

            });
        }
        return doHydroFileSelBtn;
    }
	private javax.swing.JButton getDoLogFileSelBtn() {
		if(doLogFileSelBtn == null) {
			doLogFileSelBtn = new javax.swing.JButton();
			doLogFileSelBtn.setText("...");
			doLogFileSelBtn.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					String file=getLogFile();
					FileChooser fileDialog =  new FileChooser(file);
					fileDialog.setCurrentDirectory(new File(getWorkingDirectory()));
					fileDialog.setDialogTitle(rsrc.getString("MainFrame.logFileChooserTitle"));
					fileDialog.setFileFilter(new GenericFileFilter(rsrc.getString("MainFrame.logFileFilter"),"log"));
					fileDialog.addChoosableFileFilter(new GenericFileFilter(rsrc.getString("MainFrame.txtFileFilter"),"txt"));
					if (fileDialog.showSaveDialog(MainFrame.this) == FileChooser.APPROVE_OPTION) {
						setWorkingDirectory(fileDialog.getCurrentDirectory().getAbsolutePath());
						file=fileDialog.getSelectedFile().getAbsolutePath();
						setLogFile(file);
					}					
				}
			});
		}
		return doLogFileSelBtn;
	}
    
	private java.lang.String getWorkingDirectory() {
		String wd=settings.getValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY);
		if(wd==null){
			wd=new File(".").getAbsolutePath();
		}
		return wd;
	}
	private void setWorkingDirectory(java.lang.String workingDirectory) {
		settings.setValue(ch.interlis.ili2c.gui.UserSettings.WORKING_DIRECTORY, workingDirectory);
	}
    private GenericFileFilter createItfFilter() {
        return new GenericFileFilter(rsrc.getString("MainFrame.itfFileFilter"),"itf");
    }
    private FileNameExtensionFilter createXtfFilter() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter(rsrc.getString("MainFrame.xtfFileFilter"), "xtf", "xml");
        return filter;
    }
    private void switchFunction(int kind) {
        if(kind==Converter.FC_ITFHYDRO2KGDM) {
            kgdmFileUi.setEditable(true);
            kgdm0FileUi.setEditable(true);
            mgdmTwvFileUi.setEditable(false);
            mgdmGwaFileUi.setEditable(false);
            wvaFileUi.setEditable(false);
            hydroFileUi.setEditable(true);
        }else if(kind==Converter.FC_ITFWVA2KGDM) {
            kgdmFileUi.setEditable(true);
            kgdm0FileUi.setEditable(false);
            mgdmTwvFileUi.setEditable(false);
            mgdmGwaFileUi.setEditable(false);
            wvaFileUi.setEditable(true);
            hydroFileUi.setEditable(false);
        }else if(kind==Converter.FC_KGDM2MGDM) {
            kgdmFileUi.setEditable(true);
            kgdm0FileUi.setEditable(false);
            mgdmTwvFileUi.setEditable(true);
            mgdmGwaFileUi.setEditable(true);
            wvaFileUi.setEditable(false);
            hydroFileUi.setEditable(false);
        }else if(kind==Converter.FC_KGDM2ITF) {
            kgdmFileUi.setEditable(true);
            kgdm0FileUi.setEditable(false);
            mgdmTwvFileUi.setEditable(false);
            mgdmGwaFileUi.setEditable(false);
            wvaFileUi.setEditable(false);
            hydroFileUi.setEditable(true);
        }else {
            throw new IllegalStateException("kind "+kind);
        }
    }
}
