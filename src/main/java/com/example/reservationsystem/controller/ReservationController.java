package com.example.reservationsystem.controller;



import com.example.reservationsystem.entity.Reservation;
import com.example.reservationsystem.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor


public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping ("/reservation")
    public List<Reservation> reservation() {
        return reservationService.findAll();
    }

    @GetMapping("/reservation/{id}")
    public Reservation reservation(@PathVariable Long id) {
        return reservationService.findById(id);
    }

    @DeleteMapping("/reservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.delete(id);
    }

    @PostMapping("/reservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.create(reservation);
    }

    @GetMapping("/reservation/hotel{id}")
    public List<Reservation> findByHotelId(Long hotelId) {
        return reservationService.findByHotelId(hotelId);
    }

    @GetMapping("/reservation/user/{id}")
    public List<Reservation>   findByUserId(Long userId) {
        return reservationService.findByUserId(userId);
    }
}
