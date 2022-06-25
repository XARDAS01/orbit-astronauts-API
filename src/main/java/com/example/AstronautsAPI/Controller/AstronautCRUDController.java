package com.example.AstronautsAPI.Controller;

import com.example.AstronautsAPI.Models.Astronaut;
import com.example.AstronautsAPI.Repo.AstronautRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AstronautCRUDController {

    @Autowired(required = false)
    private AstronautRepository astronautRepository;

    @PostMapping("/astronautCreate")
    private long astronautCreate(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname,
            @RequestParam(value = "age") int age,
            @RequestParam(value = "power") String power,
            @RequestParam(value = "location") String location
    ) {

        Astronaut astronaut = new Astronaut(name, surname, power, location, age);
        astronautRepository.save(astronaut);

        return astronaut.getId();
    }

    @GetMapping("/astronautGetByID")
    private String astronautGetByID(
            @RequestParam(value = "id") Long id
    ) throws JsonProcessingException {
        String astronautJSON = null;
        Astronaut astronaut = astronautRepository.findById(id).get();
        ObjectMapper objectMapper = new ObjectMapper();
        astronautJSON = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(astronaut);

        return astronautJSON;
    }

    @GetMapping("/astronautsGetAll")
    private String astronautsGetAll() throws IOException {
        String astronautJSON;
        ArrayList<Astronaut> astronautArrayList = astronautRepository.findAll();
        final StringWriter sw = new StringWriter();
        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(sw, astronautArrayList);
        astronautJSON = sw.toString();
        sw.close();

        return astronautJSON;
    }

    @PostMapping("/astronautUpdate")
    private String astronautCreate(
            @RequestParam(value = "id") Long id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname,
            @RequestParam(value = "age") int age,
            @RequestParam(value = "power") String power,
            @RequestParam(value = "location") String location
    ) {
        Astronaut astronaut = astronautRepository.findById(id).get();
        astronaut.setName(name);
        astronaut.setSurname(surname);
        astronaut.setAge(age);
        astronaut.setPower(power);
        astronaut.setLocation(location);
        astronautRepository.save(astronaut);

        return "Update success";
    }

    @PostMapping("/astronautDeleteByID")
    private String astronautDeleteByID(
            @RequestParam(value = "id") Long id
    ) {
        Astronaut astronaut = astronautRepository.findById(id).get();
        astronautRepository.delete(astronaut);

        return "Delete success";
    }

}
