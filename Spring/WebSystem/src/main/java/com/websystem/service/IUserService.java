package com.websystem.service;

import java.util.List;

import com.websystem.bean.User;
import com.websystem.controller.UserCreationDTO;


public interface IUserService {
	
    User loginUser(String username, String password);
    
    User addUser(UserCreationDTO userDTO);
    
    void updateUser(User u);
    
    User getUser(Long id);
    
    List<User> listUsers();
    
    void removeUser(User u);

    void removeUsers(List<User> u);

	User saveUser(UserCreationDTO userDTO);
}
