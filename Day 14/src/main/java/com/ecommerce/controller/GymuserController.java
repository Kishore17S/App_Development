package com.ecommerce.controller;

import com.ecommerce.entity.Gymuser;
import com.ecommerce.repository.Gymuserrepo;
import com.ecommerce.service.Gymuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GymuserController {
    @Autowired
    Gymuserrepo gr1;

    @Autowired
    Gymuserservice gs1;


    @GetMapping("/gymuserget")
    public List<Gymuser> getgymuserDetails()
    {
        return gs1.getgymuserDetails();
    }

    @PostMapping("/gymuserpost")
    public String postgymuserDetails(@RequestBody Gymuser gm1)
    {
        return gs1.postgymuserDetails(gm1);
    }
    @DeleteMapping("/gymuserdelete/{id}")
    public String deletegymuserDetails(@PathVariable("id") int id)
    {
        return gs1.deletegymuserDetails(id);
    }

    @PutMapping("/gymuserput/{id}")
    public Gymuser updategymuserDetails(@RequestBody Gymuser gm1)
    {
        return gs1.updategymuserDetails(gm1);
    }
}
