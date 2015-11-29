package com.springmvc.service;

import com.springmvc.model.User;


public interface UserService {
 
    public int insertUser(User user);

	public boolean validateUser(String name, String password);
	
	public User selectUserById(int userId);
}