package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Domaine;
import com.attijaribank.suiviprojet.service.DomaineService;
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
@RequestMapping(value = "/domaine")
public class DomaineController {


    private final DomaineService domaineService;

    public DomaineController(DomaineService domaineService) {
        this.domaineService = domaineService;
    }

    @PostMapping("save-domaine")
    public void saveDomaine(@RequestBody Domaine domaine) {
        domaineService.saveDomaine(domaine);

    }

    @GetMapping("list-domaine")
    public ResponseEntity<List<Domaine>> allDomaines() {

        try {
            return new ResponseEntity<>(domaineService.getDomaines(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @DeleteMapping("delete-domaine/{domaine-id}")
    public void deleteDomaine(@PathVariable("domaine-id") long idDomaine) {
        domaineService.deleteDomaine(idDomaine);
    }


    @PostMapping("update-domaine/{domaine-id}")
    public void updateDomaine(@PathVariable("domaine-id") int domaine_id,@RequestBody Domaine domaine ) {
        domaine.setIdDomaine((long) domaine_id);
        this.domaineService.updateDomaine(domaine);
    }
}
