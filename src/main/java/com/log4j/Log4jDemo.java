package com.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		logger.info("INFO message");
		logger.error("Error message");
		logger.warn("Warning message");
		logger.fatal("Fatal message");
		logger.trace("Trace message");
	}
}
