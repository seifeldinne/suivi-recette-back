package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Mrc;
import com.attijaribank.suiviprojet.repository.MrcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/mrc")
public class MrcController {


    private final MrcRepository mrcRepository;

    public MrcController(MrcRepository mrcRepository) {
        this.mrcRepository = mrcRepository;
    }

    @GetMapping("list-mrc")
    public ResponseEntity<List<Mrc>> getAllMrcs(@RequestParam(required = false) String title) {
        try {

            return new ResponseEntity<>(mrcRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("add-mrc")
    public ResponseEntity<Mrc> addMrc(@RequestBody Mrc mrc) {
        try {
            mrcRepository.save(mrc);
            return new ResponseEntity<>(mrc, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("mrc/{id}")
    public ResponseEntity<Mrc> getMrcById(@PathVariable("id") long id) {
        Optional<Mrc> mrcData = mrcRepository.findById(id);

        return mrcData.map(mrc -> new ResponseEntity<>(mrc, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("update-mrc/{id}")
    public ResponseEntity<Mrc> updateMrc(@PathVariable("id") long id, @RequestBody Mrc mrc) {
        Optional<Mrc> mrcData = mrcRepository.findById(id);

        if (mrcData.isPresent()) {
            return new ResponseEntity<>(mrcRepository.save(mrc), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("delete-mrc/{id}")
    public ResponseEntity<HttpStatus> deleteMrc(@PathVariable("id") long id) {
        try {
            mrcRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}