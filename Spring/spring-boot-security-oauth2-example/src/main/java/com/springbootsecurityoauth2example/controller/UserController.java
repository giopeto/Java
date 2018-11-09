package com.springbootsecurityoauth2example.controller;

import com.springbootsecurityoauth2example.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List listUser(){
        return Arrays.asList(new User(1L, "John", "pass", 1000, 33));
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return user;
    }

}