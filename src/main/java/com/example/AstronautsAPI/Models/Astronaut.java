package com.example.AstronautsAPI.Models;

import javax.persistence.*;

@Entity
public class Astronaut {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;

    public Astronaut() {
    }

    public Astronaut(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
