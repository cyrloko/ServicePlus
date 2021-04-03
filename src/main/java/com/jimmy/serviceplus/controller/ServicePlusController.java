package com.jimmy.serviceplus.controller;

import com.jimmy.serviceplus.model.Personne;
import com.jimmy.serviceplus.service.PersonneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class ServicePlusController {

    @Autowired
    PersonneRepository personneService;

    @GetMapping(path = "/personnes",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Personne> getAllPersonnes(){
        return personneService.findAll(Sort.by("id"));
    }

    @GetMapping(path = "/personne/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Personne> getPersonne(@PathVariable Long id){
        return personneService.findById(id);
    }

    @PostMapping(path = "/personne",
                 consumes = {MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE})
    public Personne savePersonne(@RequestBody Personne personne){
        return personneService.save(personne);
    }

    @PostMapping(path = "/personnes",
                 consumes = {MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Personne> saveAllPersonnes(@RequestBody List<Personne> personnes){
        return personneService.saveAll(personnes);
    }

    @PutMapping(path = "/personne",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Personne updatePersonne(@RequestBody Personne personne){
        return personneService.save(personne);
    }
}
