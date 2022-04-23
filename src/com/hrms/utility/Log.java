package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	//Initialise log4j logs
	public static Logger Log = Logger.getLogger(Log.class.getName());
	// Need to create these methods, so that they can be called
    public static void info(String message) {
    Log.info(message);
            }
}
