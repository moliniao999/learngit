package com.springmvc.dao;

import com.springmvc.model.User;

public interface UserDAO {
    public int insertUser(User user);

    public int validateUser(String name, String password);

    public User selectUserById(int userId);


}