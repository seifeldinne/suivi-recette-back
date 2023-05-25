package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Demande;
import com.attijaribank.suiviprojet.service.DemandeService;
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
@RequestMapping(value = "/demande")
public class DomandeController {


    private final DemandeService demandeService;

    public DomandeController(DemandeService demandeService) {
        this.demandeService = demandeService;
    }

    @PostMapping("save-demande")
    public Demande saveDemande(@RequestBody Demande demande) {
        return demandeService.saveDemande(demande);

    }

    @GetMapping("list-demande")
    public ResponseEntity<List<Demande>> alldemandes() {
        try {
            return new ResponseEntity<>(demandeService.getDemandes(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


    @DeleteMapping("delete-demande/{demande_id}")
    public void deleteDemande(@PathVariable("demande_id") long idDemande, Demande demande) {
        demande.setIdDemande(idDemande);
        demandeService.deleteDemande(demande);
    }


    @PostMapping("update-demande/{demande_id}")
    public void updateStudent(@RequestBody Demande demande, @PathVariable("demande_id") int demandeId) {
        demande.setIdDemande((long) demandeId);
        demandeService.updateDemande(demande);
    }
}
