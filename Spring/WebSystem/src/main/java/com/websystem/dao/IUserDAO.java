package com.websystem.dao;

import com.websystem.bean.User;


public interface IUserDAO {
	
    User login(String username, String password);
}
