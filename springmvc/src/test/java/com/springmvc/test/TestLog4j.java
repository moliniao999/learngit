package com.springmvc.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:conf/spring-baen.xml")
public class TestLog4j extends AbstractJUnit4SpringContextTests{
	
	
	   @Test
	   public void sayHello(){
		   System.out.println("hahahahahhaaha ");
	   }
	
	   public   static   void  main(String[] args)  {
	        PropertyConfigurator.configure("D:/workspace/springmvc/src/main/resources/conf/log4j.properties" );
	        Logger logger  =  Logger.getLogger("log");
	   
	        logger.debug("����logger1��debug");
			logger.info("����logger1��info");
			logger.warn("����logger1��warn");
			logger.error("����logger1��error");
			logger.fatal("����logger1��fatal");
	    } 
}
