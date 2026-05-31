package com.example.reservationsystem.service;


import com.example.reservationsystem.entity.Hotel;
import com.example.reservationsystem.repository.HotelRepository;
import com.example.reservationsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor


public class HotelService {

    private final HotelRepository hotelRepository;


}
