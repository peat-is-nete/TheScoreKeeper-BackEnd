package com.thescorekeeper.sk.controller;

import com.thescorekeeper.sk.model.Request.LoginRequest;
import com.thescorekeeper.sk.model.User;
import com.thescorekeeper.sk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth/users")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    // Registers a user
    @PostMapping("/register")
    public User createUser(@RequestBody User userObject){
        System.out.println("calling createUser() ==>");
        return userService.createUser(userObject);
    }

    // Logs a user in
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest){
        System.out.println("calling loginUser() ==>");
        return userService.loginUser(loginRequest);
    }





} // END CLASS
