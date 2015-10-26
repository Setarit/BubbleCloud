package com.setarit.bubblecloud.model.settings;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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
	protected final static String CONFIGURATIONFILENAME = "config.json";
	protected final static String LOGSFOLDERNAME = "dumps";
	
	private File configurationFile, logFile;
	
	public ApplicationFileSystem(){
		initSettingsFile();
		initLogFile();
	}

	private void initLogFile() {
		String logFileName = generateLogFileName();
		File logFile = new File(USERHOMEFOLDER + File.pathSeparator
				+ SETARITFOLDERNAME + File.pathSeparator + BUBBLECLOUDFOLDERNAME
				+ File.pathSeparator + LOGSFOLDERNAME + File.pathSeparator + logFileName);
		if(!logFile.exists()){
			logFile.mkdirs();
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.logFile = logFile;
	}

	private String generateLogFileName() {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy @ HH:mm:ss");
		String time = dateFormat.format(now.getTime());
		return time + ".log";
	}

	private void initSettingsFile() {
		File settingsFile = new File(USERHOMEFOLDER + File.pathSeparator
				+ SETARITFOLDERNAME + File.pathSeparator + BUBBLECLOUDFOLDERNAME
				+ File.pathSeparator + CONFIGURATIONFILENAME);
		if(!settingsFile.exists()){
			settingsFile.mkdirs();
			try {
				settingsFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.configurationFile = settingsFile;
	}
}
