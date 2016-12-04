package com.cloudbank.controller;

import com.cloudbank.entities.User;
import com.cloudbank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allan on 02/12/2016.
 */
@RestController
@RequestMapping("/user")
public class UserControler {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public User authUser(@RequestParam Integer regEmployee, @RequestParam String userPassword){
        return userService.authUser(regEmployee, userPassword);
    }
}
