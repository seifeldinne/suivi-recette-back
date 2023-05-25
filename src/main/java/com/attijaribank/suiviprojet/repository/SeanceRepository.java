package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
