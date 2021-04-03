package com.jimmy.serviceplus.generator;

import com.jimmy.serviceplus.model.Personne;
import com.jimmy.serviceplus.service.PersonneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class GeneratorPersonne implements CommandLineRunner {

    @Autowired
    PersonneRepository personneService;

    @Override
    public void run(String... args) throws Exception {
        personneService.deleteAll();
        personneService.save(new Personne("LOKO","Cyr Jim Loris",new Date(),"jimbower95@hotmail.fr"));
        personneService.save(new Personne("SARDAIN","Paul",new Date(),"jimbower95820@hotmail.fr"));
        personneService.save(new Personne("LOKO","Cyr Jim Loris",new Date(),"jimbower9@hotmail.fr"));
        personneService.save(new Personne("LOKO","Cyr Jim Loris",new Date(),"jimbower95@gmail.com"));
        personneService.save(new Personne("LOKO","Cyr Jim Loris",new Date(),"cyr.akpo@yahoo.fr"));
        personneService.save(new Personne("LOKO","Cyr Jim Loris",new Date(),"cyr.loko@yahoo.fr"));
        log.info("Nombre d'éléments dans la base :"+personneService.count());
    }
}
