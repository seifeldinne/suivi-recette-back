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
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProjet;
    private String nomProjet;
    private String phaseProjet;
    private String statutProjet;
    private String statutPrerequis;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @OneToOne
    private Domaine domaine;

}
