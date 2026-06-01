package com.example.reservationsystem.entity;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // brakowało tego!
    private Long idreservation;

    private String status;
    @Column(name = "start date")  // dokładna nazwa kolumny z bazy
    private Date startdate;

    @Column(name = "finish date")  // dokładna nazwa kolumny z bazy
    private Date finishdate;

    @ManyToOne
    @JoinColumn(name = "id_Users") // poprawiona nazwa kolumny zgodna z bazą
    private User user;

    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;

}