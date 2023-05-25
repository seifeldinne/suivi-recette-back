package com.attijaribank.suiviprojet.repository;

import com.attijaribank.suiviprojet.entites.Domaine;
import com.attijaribank.suiviprojet.entites.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRespository extends JpaRepository<Feedback, Long> {
}
