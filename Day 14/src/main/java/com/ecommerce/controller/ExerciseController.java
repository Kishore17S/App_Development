package com.ecommerce.controller;

import com.ecommerce.entity.Exercise;
import com.ecommerce.repository.Exerciserepo;
import com.ecommerce.service.Exerciseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExerciseController {
    @Autowired
    Exerciserepo er1;

    @Autowired
    Exerciseservice es1;

    @GetMapping("/exerciseget")
    public List<Exercise> getexerciseDetails()
    {
        return es1.getexerciseDetails();
    }

    @PostMapping("/exercisepost")
    public String postexerciseDetails(@RequestBody Exercise em1)
    {
        return es1.postexerciseDetails(em1);
    }
    @DeleteMapping("/exercisedelete/{id}")
    public String deleteexerciseDetails(@PathVariable("id") int id)
    {
        return es1.deleteexerciseDetails(id);
    }

    @PutMapping("/exerciseput/{id}")
    public Exercise updateexerciseDetails(@RequestBody Exercise em1)
    {
        return es1.updateexerciseDetails(em1);
    }
}
