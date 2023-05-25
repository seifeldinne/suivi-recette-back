package com.attijaribank.suiviprojet.service;

import com.attijaribank.suiviprojet.entites.Feedback;
import com.attijaribank.suiviprojet.repository.FeedBackRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService {

    @Autowired
    FeedBackRespository feedBackRespository;


    public List<Feedback> getAllFeedBack()
    {
        return feedBackRespository.findAll();
    }

    public Feedback saveFeedBack(Feedback feedback)
    {
        return feedBackRespository.save(feedback);
    }

    public void deleteFeedBack(long id)
    {
        feedBackRespository.deleteById(id);
    }
}
