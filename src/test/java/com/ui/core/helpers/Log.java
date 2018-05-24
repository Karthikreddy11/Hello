package com.ui.core.helpers;
import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(com.ui.core.helpers.Log.class.getName());
	public static void info(String message) { Log.info(message);}
	public static void debug(String message) { Log.debug(message);}
	public static void trace(String message) { Log.trace(message);}
	public static void error(String message) { Log.error(message);}


}