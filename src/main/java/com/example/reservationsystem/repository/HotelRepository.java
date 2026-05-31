package com.example.reservationsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.reservationsystem.entity.Hotel;


public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
