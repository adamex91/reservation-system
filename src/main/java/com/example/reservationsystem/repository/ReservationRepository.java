package com.example.reservationsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.reservationsystem.entity.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
