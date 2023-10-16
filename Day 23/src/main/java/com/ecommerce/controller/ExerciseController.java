package com.ecommerce.controller;

import com.ecommerce.entity.Exercise;
import com.ecommerce.repository.Exerciserepo;
import com.ecommerce.service.Exerciseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {


    @Autowired
    private Exerciseservice es1;

    @GetMapping("/exercisegetall")
    public ResponseEntity<List<Exercise>> getAllexerciseDetails() {
        List<Exercise> exercises = es1.getAllexerciseDetails();
        return ResponseEntity.ok(exercises);
    }

    @PostMapping("/exercisepost")
    public ResponseEntity<String> postexerciseDetails(@RequestBody Exercise em1) {
        es1.postexerciseDetails(em1);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/exercisedelete/{id}")
    public ResponseEntity<String> deleteexerciseDetails(@PathVariable("id") int id) {
        try {
            es1.deleteexerciseDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
        @PutMapping("/exerciseput/{id}")
    public Exercise updateexerciseDetails(@RequestBody Exercise em1)
    {
        return es1.updateexerciseDetails(em1);
    }


}

