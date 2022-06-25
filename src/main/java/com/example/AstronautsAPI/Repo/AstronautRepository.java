package com.example.AstronautsAPI.Repo;

import com.example.AstronautsAPI.Models.Astronaut;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AstronautRepository extends CrudRepository<Astronaut, Long> {

//    @Query("SELECT * FROM astronauts p WHERE p.id = :id")
//    List<Astronaut> findAstronautByID(@Param("id") Long id);

    Astronaut findById (long id);

    Astronaut findByName (String name);

    ArrayList<Astronaut> findAll();

}
