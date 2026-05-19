package com.example.reservationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;

    private int number;

    private int capacity;

    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;

}