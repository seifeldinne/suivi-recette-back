package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Mrc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MrcRepository extends JpaRepository<Mrc, Long> {
}
