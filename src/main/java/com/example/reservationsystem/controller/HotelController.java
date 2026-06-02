package com.example.reservationsystem.controller;



import com.example.reservationsystem.entity.Hotel;
import com.example.reservationsystem.service.HotelService;
import com.example.reservationsystem.service.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class HotelController {

    private final HotelService hotelService;


    @GetMapping ("/hotel")
    public List<Hotel> getaHotels() {
        return hotelService.getallhotels();
    }

    @GetMapping ("/hotel/{id}")
    public Hotel getaHotel(@PathVariable int id) {
        return hotelService.findById(id);
    }


    @PostMapping ("/hotel")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @DeleteMapping("/hotel/{id}")
    public void deleteHotel(@PathVariable int id) {
        hotelService.deleteById(id);
    }

}
