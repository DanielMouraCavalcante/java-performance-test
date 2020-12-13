package br.com.dnkt.javaperformance.codingperformance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

	Logger logger = Logger.getLogger(LoggingExample.class.getName());
		
	public void exampleMethod() {

		try {
			//some code
		}
		catch (NumberFormatException e) {
			if (logger.isLoggable(Level.INFO)) {
			logger.log(Level.INFO, "NFE in exampleMethod. " 
				+ "error was : " + e.getMessage());
				/*+
				" user was : " + currentUser.getId() + " " + currentUser.getName() +
				" system was : " + currentTerminal.getId() + " "  + currentTerminal.getLocationName());*/
			}
		}
	}
	
}
