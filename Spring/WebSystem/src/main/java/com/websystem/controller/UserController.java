package com.websystem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.websystem.bean.User;
import com.websystem.service.impl.UserService;

@Controller
@RequestMapping("/users")
public class UserController extends SecuredController {
	
    @Resource(name="userService")
    private UserService userService;
    
    private transient final Logger logger = Logger.getLogger(UserController.class);
    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<User> list() {
        return userService.listUsers();
    }

    @RequestMapping(value="/{userId}", method=RequestMethod.GET)
    public @ResponseBody User getUserDetails(@PathVariable("userId") String userId) {
    	Long userIdLong = Long.valueOf(userId);
        User user = userService.getUser(userIdLong);
        return user;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody User createUser(@RequestBody UserCreationDTO userDTO) {
    	logger.info("createUser(), dto.name: " + userDTO.getUsername());
    	logger.info("createUser(), dto.email: " + userDTO.getEmail());

    	return userService.addUser(userDTO);
    }
    
//    @RequestMapping(value="/{userId}", method={RequestMethod.PUT, RequestMethod.POST})
    @RequestMapping(value="/{userId}", method=RequestMethod.PUT)
    public @ResponseBody User updateUser(@PathVariable("userId") String userId, @RequestBody UserCreationDTO dto) {
    	logger.info("updateUser(), userId: " + userId);
    	logger.info("updateUser(), dto.name: " + dto.getUsername());
    	logger.info("updateUser(), dto.email: " + dto.getEmail());
    	
        return userService.saveUser(dto);
    }
}