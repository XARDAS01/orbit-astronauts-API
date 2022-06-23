package com.example.AstronautsAPI.Controller;

import com.example.AstronautsAPI.Entity.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstronautCreate {

    @GetMapping ("/")
    public Response responseEntity() {
        Response response = new Response();
        return response;
    }

}
