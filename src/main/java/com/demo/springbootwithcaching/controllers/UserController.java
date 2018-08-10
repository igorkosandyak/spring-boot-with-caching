package com.demo.springbootwithcaching.controllers;

import com.demo.springbootwithcaching.models.User;
import com.demo.springbootwithcaching.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping(value = "/update")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
