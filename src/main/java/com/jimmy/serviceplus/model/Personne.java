package com.jimmy.serviceplus.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nom;
    String prenom;
    @Column(name = "dateNaissance")
    Date dateNaissance;
    @Column(name = "adresseMail",
            nullable = false,
            unique = true)
    String adresseMail;

    public Personne(String nom, String prenom, Date dateNaissance, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
    }
}
