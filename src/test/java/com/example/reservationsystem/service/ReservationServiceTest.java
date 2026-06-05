package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.Reservation;
import com.example.reservationsystem.repository.ReservationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ReservationServiceTest {

    @Mock
    private ReservationRepository reservationRepository;

    @InjectMocks
    private ReservationService reservationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void delete_shouldcallid() {

        when(reservationRepository.existsById(1L))
                .thenReturn(true);

        reservationService.delete(1L);

        verify(reservationRepository).deleteById(1L);
    }

    @Test
    void findById_ShouldThrowException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> reservationService.findById(null)
        );
    }
}