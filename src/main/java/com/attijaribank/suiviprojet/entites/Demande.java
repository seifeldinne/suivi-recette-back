package com.attijaribank.suiviprojet.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDemande;
    private LocalDate dateDemande;
    private String projet;
    private String mails;
    private String observations;
    private String commentaire;
}
