package com.example.reservationsystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
@Entity


public class Hotel {
    @Id
    @GeneratedValue
    int idHotel;
    String Name;
    String location;
}
