package com.example.reservationsystem.service;


import com.example.reservationsystem.entity.User;
import com.example.reservationsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor

public class Userservice {

    private final  UserRepository userRepository;


    public void CreateUser(){

    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

    public  List<User> getUsers(){
        return userRepository.findAll();
    }
}
