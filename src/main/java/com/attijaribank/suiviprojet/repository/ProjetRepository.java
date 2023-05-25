package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
