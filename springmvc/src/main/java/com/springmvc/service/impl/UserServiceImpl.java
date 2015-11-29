package com.springmvc.service.impl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDAO;
import com.springmvc.model.User;
import com.springmvc.service.UserService; 
 
 
@Service
public class UserServiceImpl implements UserService{
 
	public static Logger logger=Logger.getLogger(UserServiceImpl.class);
//	public static Log log=LogFactory.getLog(UserServiceImpl.class);
	@Autowired
    private UserDAO userDAO ;
     
	public int insertUser(User user) {
        // TODO Auto-generated method stub
    	System.out.println("UserServiceImpl:    username: "+ user.getUserName());
    //	userDao.insertUser(user);
    	return 0;
    }

	public boolean validateUser(String name, String password) {
		System.out.println("hasMatchUser........... ");
		logger.info("hasMatchUser  is  starting............  name="+name);
		logger.debug("我是logger1，debug");
		logger.info("我是logger1，info");
		logger.warn("我是logger1，warn");
		logger.error("我是logger1，error");
		logger.fatal("我是logger1，fatal");
		System.out.println(userDAO);
		User user = userDAO.selectUserById(1);
		System.out.println(user);
		System.out.println("username     :   "   + user.getUserName());
		
		 
		
		
//		if("wesley".equals(name)&&"111111".equals(password)){
//			return true;
//		}else{
//			return false;
//		}
//		int matchCount =userDao.validateUser(name, password);
		
		return true;
		 
	}

	@Override
	public User selectUserById(int userId) {
		// TODO Auto-generated method stub
		User user = userDAO.selectUserById(userId);
		return user;
	}
 
}