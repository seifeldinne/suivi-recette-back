package com.attijaribank.suiviprojet.service;

import com.attijaribank.suiviprojet.entites.Domaine;
import com.attijaribank.suiviprojet.repository.DomaineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomaineService {


    private final DomaineRepository domaineRepository;

    public DomaineService(DomaineRepository domaineRepository) {
        this.domaineRepository = domaineRepository;
    }


    public Domaine saveDomaine(Domaine domaine) {

        return domaineRepository.save(domaine);
    }


    public List<Domaine> getDomaines() {
        return domaineRepository.findAll();
    }


    public void deleteDomaine(Long idDomaine) {
        this.domaineRepository.deleteById(idDomaine);
    }


    public Optional<Domaine> getDomaineByName(Domaine domaine) {

        return this.domaineRepository.findById(domaine.getIdDomaine());
    }


    public boolean updateDomaine(Domaine domaine) {
        return false;
        //  projetRepository.(student);
    }


}
