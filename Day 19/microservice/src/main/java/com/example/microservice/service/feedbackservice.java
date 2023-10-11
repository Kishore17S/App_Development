package com.example.microservice.service;

import com.example.microservice.entity.feedback;
import com.example.microservice.repository.feedbackrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class feedbackservice {
    @Autowired
    feedbackrepo fr1;

    public List<feedback> getAllFeedback()
    {
        return fr1.findAll();
    }

    public String addFeedback(feedback fm1)
    {
        fr1.save(fm1);
        return "Training Details are saved";
    }
}
