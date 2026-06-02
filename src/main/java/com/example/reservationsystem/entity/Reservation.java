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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreservation;

    private String status;
    @Column(name = "start date")
    private Date startdate;

    @Column(name = "finish date")
    private Date finishdate;

    @ManyToOne
    @JoinColumn(name = "id_Users")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;

}