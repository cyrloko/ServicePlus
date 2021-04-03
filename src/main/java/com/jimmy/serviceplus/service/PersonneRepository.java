package com.jimmy.serviceplus.service;

import com.jimmy.serviceplus.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
