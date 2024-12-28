package com.example.bmsbookticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SeatTypeShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private double price;
}
