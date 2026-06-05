package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.Hotel;
import com.example.reservationsystem.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HotelServiceTest {

    @Mock
    private HotelRepository hotelRepository;

    @InjectMocks
    private HotelService hotelService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findById_ShouldReturnHotel_WhenHotelExists() {

        Hotel hotel = new Hotel();

        when(hotelRepository.findById(1L))
                .thenReturn(Optional.of(hotel));

        Hotel result = hotelService.findById(1L);

        assertNotNull(result);

        verify(hotelRepository).findById(1L);
    }

    @Test
    void deleteById_ShouldCallRepositoryDeleteById() {

        hotelService.deleteById(1L);

        verify(hotelRepository).deleteById(1L);
    }

}