package com.attijaribank.suiviprojet.service;

import com.attijaribank.suiviprojet.entites.Demande;
import com.attijaribank.suiviprojet.entites.Domaine;
import com.attijaribank.suiviprojet.repository.DemandeRepository;
import com.attijaribank.suiviprojet.repository.DomaineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeService {


    private final DemandeRepository demandeRepository;

    public DemandeService(DemandeRepository demandeRepository) {
        this.demandeRepository = demandeRepository;
    }


    public Demande saveDemande(Demande demande) {
        return demandeRepository.save(demande);
    }


    public List<Demande> getDemandes() {
        return demandeRepository.findAll();
    }


    public void deleteDemande(Demande domaine) {
        this.demandeRepository.delete(domaine);
    }




    public boolean updateDemande(Demande demande) {
        return false;
        //  projetRepository.(student);
    }


}
