package com.attijaribank.suiviprojet.service;

import com.attijaribank.suiviprojet.entites.Projet;
import com.attijaribank.suiviprojet.repository.ProjetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjetService {


    private final ProjetRepository projetRepository;

    public ProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }


    public Projet saveProjet(Projet projet) {
        return projetRepository.save(projet);
    }


    public List<Projet> getProjets() {
        return projetRepository.findAll();
    }


    public void deleteProjet(long idPorjet) {
        this.projetRepository.deleteById(idPorjet);
    }


    public Optional<Projet> getProjetByName(Projet projet) {

        return projetRepository.findById(projet.getIdProjet());
    }


    public void updateProjet(Projet projet) {

        projetRepository.save(projet);

    }

}  