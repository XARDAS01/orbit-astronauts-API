package com.example.AstronautsAPI.Models;

import javax.persistence.*;

@Entity
@Table(name = "Astronauts")
public class Astronaut {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name, surname, power, location, avatar;
    private int age;

    public Astronaut() {
    }

    public Astronaut(String name, String surname, String power, String location, int age) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.location = location;
        this.age = age;
        this.avatar = generateAvatar();
    }

    private String generateAvatar() {
        String[] avatars = new String[] {
                "avatar1",
                "avatar2",
                "avatar3",
                "avatar4"
        };
        int min = 1;
        int max = avatars.length;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return avatars[random_int];
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
