package com.websystem.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.websystem.service.impl.UserService;


@Controller
@SessionAttributes("currentUser")
public class LoginController {

    @Resource(name = "userService")
    private UserService userService;

    private transient final Logger logger = Logger.getLogger(LoginController.class);
    
}
