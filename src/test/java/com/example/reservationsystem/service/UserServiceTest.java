package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.User;
import com.example.reservationsystem.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;



public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    private Userservice userservice;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createuser_shouldsaveuser(){
        User user = new User();
        when(userRepository.save(user)).thenReturn(user);
        User result = userservice.createUser(user);
        assertNotNull(result);
        verify(userRepository).save(user);

    }

    @Test
    void getUserById_shouldgetuser(){
        User user = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        User result = userservice.getUserById(1L);
        assertNotNull(result);
        verify(userRepository).findById(1L);

    }


}
