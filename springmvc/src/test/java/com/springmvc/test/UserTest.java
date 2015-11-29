package com.springmvc.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import com.springmvc.model.User;
import com.springmvc.service.UserService;


import org.junit.Test;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-bean.xml", "classpath:conf/spring-mybatis.xml" })
//@ContextConfiguration(locations ="classpath:conf/spring-bean.xml")
public class UserTest extends AbstractJUnit4SpringContextTests {
	 
	@Autowired 
	UserService userService;
	
	   static {  
	        try {  
	            Log4jConfigurer.initLogging("classpath:conf/log4j.properties");  
	        } catch (FileNotFoundException ex) {  
	            System.err.println("Cannot Initialize log4j");  
	        }  
	    } 
    
    @Before
    public void before(){       
    	//System.out.println("1111111");
//        @SuppressWarnings("resource")
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring-bean.xml"
//                ,"classpath:conf/spring-mybatis.xml"});
//        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test 
    public void addUser(){
    	System.out.println("sdfsdfsdfsd/////////////////////");
    
    //	userService.validateUser("", "") ;
    	
    //   System.out.println(islogined);
    }
    
    @Test
    public void selectUserById(){
    	System.out.println("selectUserById---------------");
    	User user = userService.selectUserById(1);
    //	Assert.assertEquals(user.getUserName(), "wesley");
    	
    	assertEquals(user.getUserName(),"wesley");
    }
}