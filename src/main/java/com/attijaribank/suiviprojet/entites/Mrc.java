package com.attijaribank.suiviprojet.entites;

import jakarta.persistence.Column;
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
public class Mrc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMrc;
    @Column(name = "nom-mrc")
    private String nomMrc;

}
