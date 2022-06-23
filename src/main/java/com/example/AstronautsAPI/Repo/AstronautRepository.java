package com.example.AstronautsAPI.Repo;

import com.example.AstronautsAPI.Models.Astronaut;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AstronautRepository extends CrudRepository<Astronaut, Long> {

//    @Query("select p from Password p where p.id = :id")
//    Astronaut findByID(@Param("id") long id);

    List<Astronaut> findByLastName(String lastName);

    Astronaut findById(long id);

}
