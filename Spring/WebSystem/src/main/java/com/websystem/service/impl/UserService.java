package com.websystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystem.bean.User;
import com.websystem.controller.UserCreationDTO;
import com.websystem.dao.impl.UserDAO;
import com.websystem.service.IUserService;


@Service("userService")
@Transactional
public class UserService implements IUserService {

	@Qualifier("userDao")
    private UserDAO userDao;
	
	
	@Override
	public User loginUser(String username, String password) {
	    System.out.println(".. in loginUser()");
	    // TODO implement me!
	    return null;
	}
	
	@Override
	public User addUser(UserCreationDTO userDTO) {
		User user = buildUser(userDTO);
	    userDao.create(user);
	    return user;
	}

	@Override
	public void updateUser(User u) {
	    userDao.update(u);
	}

	@Override
	public User saveUser(UserCreationDTO userDTO) {
		User user = buildUser(userDTO);
	    userDao.saveOrUpdate(user);
	    return user;
	}
	
	@Override
	public User getUser(Long id) {
	    return userDao.find(id);
	}

	@Override
	public List<User> listUsers() {
	    return userDao.findAll();
	}

	@Override
	public void removeUser(User u) {
	    userDao.delete(u);
	}

	@Override
	public void removeUsers(List<User> u) {
	    userDao.deleteAll(u);
	}
	
//    public User findUserByEmail(String email) {
//        return userDao.findByEmail(email);
//    }
//    
//    public User findUserByUsername(String username) {
//        return userDao.findByUsername(username);
//    }
    
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }
    
    private User buildUser(UserCreationDTO userDTO) {
    	User user = new User();
    	user.setUsername(userDTO.getUsername());
    	user.setEmail(userDTO.getEmail());
//    	user.setPassword(userDTO.getPassword());
    	return user;
    }
	
}
