package com.example.AstronautsAPI.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "astronaut")
public class Astronaut {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Astronaut() {
    }
}
