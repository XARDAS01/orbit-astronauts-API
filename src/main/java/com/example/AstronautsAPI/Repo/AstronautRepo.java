package com.example.AstronautsAPI.Repo;

import com.example.AstronautsAPI.Models.Astronaut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AstronautRepo extends CrudRepository<Astronaut, Long> {
}
