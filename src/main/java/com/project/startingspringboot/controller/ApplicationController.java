package com.project.startingspringboot.controller;

import com.project.startingspringboot.entity.User;
import com.project.startingspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApplicationController
{
    @Autowired
    private UserService userService;

    @GetMapping(path = "/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") String userId)
    {
        User user =  userService.getUserByUserId(userId);
        return ResponseEntity.of(Optional.of(user));
    }

    @GetMapping(path = "/user")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> userList = userService.getUserList();
        return ResponseEntity.of(Optional.of(userList));
    }

    @PostMapping(path = "/user")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping(path = "/user/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable("userId") String userId)
    {
        userService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping(path = "/user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable("userId") String userId, @RequestBody User user)
    {
        userService.updateUser(userId,user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
