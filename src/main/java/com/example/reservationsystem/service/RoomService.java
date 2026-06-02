package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.Room;
import com.example.reservationsystem.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    @Transactional
    public Room createRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Pokój nie może być pusty");
        }
        return roomRepository.save(room);
    }

    @Transactional
    public void deleteRoom(Long roomId) {
        if (roomId == null) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        if (!roomRepository.existsById(roomId)) {
            throw new RuntimeException("Nie znaleziono pokoju o ID: " + roomId);
        }
        roomRepository.deleteById(roomId);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long roomId) {
        if (roomId == null) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        return roomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Nie znaleziono pokoju o ID: " + roomId));
    }
}