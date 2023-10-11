package com.example.microservice.controller;

import com.example.microservice.entity.feedback;
import com.example.microservice.service.feedbackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class feedbackController {
    @Autowired
    feedbackservice fs1;


    @GetMapping("/get")
    public ResponseEntity<List<feedback>> getAllFeedback() {
        List<feedback> feedbacks = fs1.getAllFeedback();
        return ResponseEntity.ok(feedbacks);
    }

    @PostMapping("/post")
    public ResponseEntity<String> addFeedback(@RequestBody feedback fm1) {
        fs1.addFeedback(fm1);
        return ResponseEntity.ok().build();
    }

}
