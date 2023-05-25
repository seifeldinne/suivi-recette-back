package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Projet;
import com.attijaribank.suiviprojet.service.ProjetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/projet")
public class ProjetController {


    private final ProjetService projetService;

    public ProjetController(ProjetService projetService) {
        this.projetService = projetService;
    }

    @PostMapping("save-projet")
    public void saveProjet(@RequestBody Projet projet) {
        projetService.saveProjet(projet);

    }

    @GetMapping("list-projet")
    public ResponseEntity<List<Projet>> allprojets() {
        try {
            return new ResponseEntity<>(projetService.getProjets(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("delete-projet/{projet_id}")
    public void deleteProjet(@PathVariable("projet_id") long idProjet) {

        projetService.deleteProjet(idProjet);
    }


    @PostMapping("update-projet/{projet_id}")
    public void updateProjet(@PathVariable("projet_id") int projetId, @RequestBody Projet projet) {
        projet.setIdProjet((long) projetId);
        projetService.updateProjet(projet);
    }
}
