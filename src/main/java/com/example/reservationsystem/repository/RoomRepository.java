package com.example.reservationsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.reservationsystem.entity.Room;


public interface RoomRepository extends JpaRepository<Room,Long> {
}
