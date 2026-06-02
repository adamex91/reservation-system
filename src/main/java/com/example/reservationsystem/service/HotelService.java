package com.example.reservationsystem.service;

import com.example.reservationsystem.entity.Hotel;
import com.example.reservationsystem.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor


public class HotelService {

    private final HotelRepository hotelRepository;


    public Hotel findById(long id) {
        if (id == 0) {
            throw new IllegalArgumentException("ID nie może być puste");
        }
        else {
            return hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel nie istnieje"));
        }

    }

    public List<Hotel> getallhotels() {
        return hotelRepository.findAll();
    }

    public void deleteById(long id) {
        if (id == 0) {
            throw new IllegalArgumentException("Id nie może być puste");
        }
        else {
            hotelRepository.deleteById(id);
        }
    }

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }



}
