package com.springmvc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class TestMbatis {
	
	@Before
	public void before() throws IOException{
//		String resource = "classpath:conf/spring-mybatis.xml";
//		                   
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//	 
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testSelect(){
		System.out.println("11111");
	//	SqlSession session =  new 
	}
}
