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

    private final UserRepository userRepository;

    @Transactional
    public User createUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Użytkownik nie może być pusty");
        }
        return userRepository.save(user);
    }

    @Transactional
    public void deleteUser(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        if (!userRepository.existsById(userId)) {
            throw new RuntimeException("Nie znaleziono użytkownika o ID: " + userId);
        }
        userRepository.deleteById(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Nie znaleziono użytkownika o ID: " + userId));
    }
}