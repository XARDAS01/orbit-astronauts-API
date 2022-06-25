package com.example.AstronautsAPI.Models;

import javax.persistence.*;

@Entity
@Table(name = "Astronauts")
public class Astronaut {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name, surname, power, location, desc;
    private int age;

    public Astronaut() {
    }

    public Astronaut(String name, String surname, String power, String location, String desc, int age) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.location = location;
        this.desc = desc;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
