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
	   
	        logger.debug("我是logger1，debug");
			logger.info("我是logger1，info");
			logger.warn("我是logger1，warn");
			logger.error("我是logger1，error");
			logger.fatal("我是logger1，fatal");
	    } 
}
