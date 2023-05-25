package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, Long> {
}
