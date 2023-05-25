package com.attijaribank.suiviprojet.controller;

import com.attijaribank.suiviprojet.entites.Feedback;
import com.attijaribank.suiviprojet.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/feedback")
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;

    @PostMapping("/save-feedback")
    public Feedback saveFeedBack(@RequestBody Feedback feedback) {
        return feedBackService.saveFeedBack(feedback);

    }

    @GetMapping("/list-feedback")
    public List<Feedback> findAll()
    {
        return feedBackService.getAllFeedBack();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFeddback(@PathVariable long id)
    {
         feedBackService.deleteFeedBack(id);
    }


}
