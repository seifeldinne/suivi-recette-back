package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Seance;
import com.attijaribank.suiviprojet.service.SeanceService;
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
@RequestMapping(value = "/seance")
public class SeanceController {


    private final SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @PostMapping("save-seance")
    public Seance saveSeance(@RequestBody Seance seance) {
        return seanceService.saveSeance(seance);

    }

    @GetMapping("list-seance")
    public List<Seance> allseances() {
        return seanceService.getSeances();
    }


    @DeleteMapping("delete-seance/{seance_id}")
    public void deleteStudent(@PathVariable("seance_id") long idSeance, Seance seance) {
        seance.setIdSeance(idSeance);
        seanceService.deleteSeance(seance);
    }


    @PostMapping("update-seance/{student_id}")
    public boolean updateStudent(@RequestBody Seance seance, @PathVariable("seance_id") int seance_id) {
      /*  student.setStudent_id(seance_id);
        return studentservice.updateStudent(student);
		*/
        return false;
    }
}
