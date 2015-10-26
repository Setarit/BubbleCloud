package com.setarit.bubblecloud.model.settings;

import java.io.File;
import java.io.IOException;


/**
 * Interface to the filesystem
 * for log and configuration files
 * @author Setarit
 *
 */
public abstract class ApplicationFileSystem {
	protected final static String USERHOMEFOLDER = System.getProperty("user.home");
	protected final static String SETARITFOLDERNAME = ".setarit";
	protected final static String BUBBLECLOUDFOLDERNAME = "bubblecloud";
	protected final static String SETTINGSFILENAME = "config.json";
	protected final static String LOGSFOLDERNAME = "dumps";
	
	private File settingsFile, logFile;
	
	public ApplicationFileSystem(){
		initSettingsFile();
	}

	private void initSettingsFile() {
		File settingsFile = new File(SETTINGSFILELOCATION + File.pathSeparator +
				SETARITFOLDERLOCATION + File.pathSeparator + SETTINGSFOLDERLOCATION);
		if(!settingsFile.exists()){
			settingsFile.mkdirs();
			try {
				settingsFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.settingsFile = settingsFile;
	}
}
