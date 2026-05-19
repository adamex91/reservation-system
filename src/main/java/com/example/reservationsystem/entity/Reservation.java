package com.example.reservationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.sql.Date;
@Entity

public class Reservation {

    @Id
    long idreservation;
    String status;
    Date startdate;
    Date finishdate;
    @ManyToOne
    @JoinColumn(name = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "idhotel")
    private Hotel hotel;
}
