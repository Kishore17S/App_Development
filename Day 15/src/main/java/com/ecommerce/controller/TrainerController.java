package com.ecommerce.controller;

import com.ecommerce.entity.Trainerlist;
import com.ecommerce.repository.Trainerrepo;
import com.ecommerce.service.Trainerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {
    @Autowired
    Trainerrepo tr1;

    @Autowired
    Trainerservice ts1;


    @GetMapping ("/trainerget")
    public List<Trainerlist> gettrainerDetails()
    {
        return ts1.gettrainerDetails();
    }

    @PostMapping ("/trainerpost")
    public String posttrainerDetails(@RequestBody Trainerlist tm1)
    {
        return ts1.posttrainerDetails(tm1);
    }
    @DeleteMapping("/trainerdelete/{id}")
    public String deletetrainerDetails(@PathVariable("id") int id)
    {
        return ts1.deletetrainerDetails(id);
    }

    @PutMapping("/trainerput/{id}")
    public Trainerlist updatetrainerDetails(@RequestBody Trainerlist tm1)
    {
        return ts1.updatetrainerDetails(tm1);
    }
}
