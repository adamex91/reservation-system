package com.example.reservationsystem.repository;

import com.example.reservationsystem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByHotelIdHotel(Long hotelId);

    List<Reservation> findByUserIdUsers(Long userId);
}