package com.ecommerce.controller;

import com.ecommerce.entity.feedbacklist;
import com.ecommerce.service.feedbackser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class feedbackController {
    @Autowired
    private feedbackser ss;

    public feedbackController(feedbackser feedbackservice)
    {
        this.ss=feedbackservice;
    }

    @PostMapping("/post")
    public ResponseEntity<String> addFeedback(@RequestBody feedbacklist feedbacklist) {
        ss.addFeedback(feedbacklist);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<List<feedbacklist>> getAllFeedback() {
        List<feedbacklist> feedbacks = ss.getAllFeedback();
        return ResponseEntity.ok(feedbacks);
    }
}









