package com.birdgelabz.javapractice;

/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOG.info("Bye");
	    LOG.info("Hi");
    	LOG.info("Hello World");
    	LOG.info("Final commit");
    }
}
