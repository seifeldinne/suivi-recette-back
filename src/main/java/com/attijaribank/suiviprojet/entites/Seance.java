package com.attijaribank.suiviprojet.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSeance;
    @OneToOne
    private Projet projet;
    private String nomSeance;
    private String description;
    private int numPoste;
    private LocalDate date;
    private int heureDebut;
    private int heureFin;

}
