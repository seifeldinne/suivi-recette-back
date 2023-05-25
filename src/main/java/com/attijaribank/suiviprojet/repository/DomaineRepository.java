package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomaineRepository extends JpaRepository<Domaine, Long> {
}
