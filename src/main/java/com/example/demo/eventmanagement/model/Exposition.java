package com.example.demo.eventmanagement.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Exposition extends Event {


    public Exposition() {}

    public Exposition(LocalDate date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }
}
