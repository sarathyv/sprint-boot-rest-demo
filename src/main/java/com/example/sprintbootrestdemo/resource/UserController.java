package com.example.sprintbootrestdemo.resource;

import com.example.sprintbootrestdemo.model.User;
import com.example.sprintbootrestdemo.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/user")
public class UserController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping(value = "/all")
    List<User> getAllUsers() {
        return userJpaRepository.findAll();
    }

    @PostMapping(value = "/load")
    List<User> loadUser(@RequestBody User user) {
        userJpaRepository.save(user);
        return userJpaRepository.findAll();
    }
}
