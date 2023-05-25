package com.attijaribank.suiviprojet.service;

import com.attijaribank.suiviprojet.entites.Seance;
import com.attijaribank.suiviprojet.repository.SeanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeanceService {


    private final SeanceRepository seanceRepository;

    public SeanceService(SeanceRepository domaineRepository) {
        this.seanceRepository = domaineRepository;
    }


    public Seance saveSeance(Seance seance) {
        return seanceRepository.save(seance);
    }


    public List<Seance> getSeances() {
        return seanceRepository.findAll();
    }


    public void deleteSeance(Seance seance) {
        this.seanceRepository.delete(seance);
    }


    public Optional<Seance> getSeanceByName(Seance seance) {

        return this.seanceRepository.findById(seance.getIdSeance());
    }
    public boolean updateSeance(Seance seance) {
        return false;
        //  projetRepository.(student);
    }


}
