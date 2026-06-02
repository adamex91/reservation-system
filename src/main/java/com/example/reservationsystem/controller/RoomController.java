package com.example.reservationsystem.controller;


import com.example.reservationsystem.entity.Room;
import com.example.reservationsystem.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor


public class RoomController {


    private final RoomService roomService;

    @GetMapping ("/rooms")
    public List<Room> getallrooms() {
        return  roomService.getAllRooms() ;
    }

    @GetMapping("/rooms/{id}")
    public Room getroom(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    @DeleteMapping("/rooms/{id}")
    public void deleteroom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }

    @PostMapping("/rooms")
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }
}
