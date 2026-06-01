package com.example.reservationsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;

    private int number;
    private int capacity;
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;
}