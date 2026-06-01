package com.example.reservationsystem.controller;


import com.example.reservationsystem.entity.User;
import com.example.reservationsystem.repository.UserRepository;
import com.example.reservationsystem.service.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor


public class UserController {

    private final Userservice userservice;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userservice.getAllUsers();
    }

    @DeleteMapping("/users/{userid}")
    public void deleteUser(@PathVariable Long userid) {
        userservice.deleteUser(userid);
    }

    @GetMapping("users/{userid}")
    public User getUser(@PathVariable Long userid) {
        return userservice.getUserById(userid);
    }

    @PostMapping("users")
    public User createUser(@RequestBody  User user) {
        return userservice.createUser(user);
    }
}
