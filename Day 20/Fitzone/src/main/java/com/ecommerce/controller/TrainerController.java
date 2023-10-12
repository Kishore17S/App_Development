package com.ecommerce.controller;

import com.ecommerce.entity.Gymuser;
import com.ecommerce.entity.Trainerlist;
import com.ecommerce.repository.Trainerrepo;
import com.ecommerce.service.Trainerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private Trainerservice ts1;


    @GetMapping("/trainergetall")
    public ResponseEntity<List<Trainerlist>> getAlltrainerDetails() {
        System.out.println("insode get");
        List<Trainerlist> trainers = ts1.getAlltrainerDetails();
        return ResponseEntity.ok(trainers);
    }

    @PostMapping("/trainerpost")
    public ResponseEntity<String> posttrainerDetails(@RequestBody Trainerlist tm1) {
        ts1.posttrainerDetails(tm1);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/trainerdelete/{id}")
    public ResponseEntity<String> deletetrainerDetails(@PathVariable ("id") int id) {
        try {
            ts1.deletetrainerDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/trainerput/{id}")
    public Trainerlist updatetrainerDetails(@RequestBody Trainerlist tm1)
    {
        return ts1.updatetrainerDetails(tm1);
    }
}
