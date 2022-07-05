package com.example.springdatajpaauditing.controller;

import com.example.springdatajpaauditing.entity.User;
import com.example.springdatajpaauditing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
}
















