package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.Reservation;
import com.example.reservationsystem.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Reservation findById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nie znaleziono rezerwacji o ID: " + id));
    }

    @Transactional
    public Reservation create(Reservation reservation) {
        if (reservation == null) {
            throw new IllegalArgumentException("Rezerwacja nie może być pusta");
        }
        reservation.setStatus("AKTYWNA");
        return reservationRepository.save(reservation);
    }


    @Transactional
    public void delete(Long id) {
        if (!reservationRepository.existsById(id)) {
            throw new RuntimeException("Nie znaleziono rezerwacji o ID: " + id);
        }
        reservationRepository.deleteById(id);
    }

    public List<Reservation> findByHotelId(Long hotelId) {
        if (hotelId == null) {
            throw new IllegalArgumentException("ID hotelu nie może być puste");
        }
        return reservationRepository.findByHotelIdHotel(hotelId);
    }

    public List<Reservation> findByUserId(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("ID usera nie może być puste");
        }
        return reservationRepository.findByUserIdUsers(userId);
    }
}