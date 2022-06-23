package com.example.AstronautsAPI.Controller;

import com.example.AstronautsAPI.Entity.Response;
import com.example.AstronautsAPI.Models.Astronaut;
import com.example.AstronautsAPI.Repo.AstronautRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstronautCreate {

    @Autowired(required = false)
    private AstronautRepository astronautRepository;

    @GetMapping ("/")
    public Response responseEntity() {

        try {
            Astronaut astronaut = new Astronaut("Yuri");
            astronautRepository.save(astronaut);
            Response response = new Response("Yes", 200);
            return response;
        } catch (Exception e) {
            Response response = new Response("No", 200);
            return response;
        }
    }

}
