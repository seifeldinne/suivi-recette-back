package com.attijaribank.suiviprojet.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
public class Domaine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDomaine;
    private String nomDomaine;
    private String mrc;
    private String vEtude;
    private String vOrganisation;
    private String vMetier;

}
