package com.ecommerce.controller;

import com.ecommerce.entity.Gymuser;
import com.ecommerce.repository.Gymuserrepo;
import com.ecommerce.service.Gymuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/gymuser")
public class GymuserController {


    @Autowired
    private Gymuserservice gs1;

    @GetMapping("/gymusergetall")
    public ResponseEntity<List<Gymuser>> getAllgymuserDetails() {
        List<Gymuser> gymusers = gs1.getAllgymuserDetails();
        return ResponseEntity.ok(gymusers);
    }

    @PostMapping("/gymuserpost")
    public ResponseEntity<String> postgymuserDetails(@RequestBody Gymuser gm1) {
        gs1.postgymuserDetails(gm1);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/gymuserdelete/{id}")
    public ResponseEntity<String> deletegymuserDetails(@PathVariable ("id") int id) {
        try {
            gs1.deletegymuserDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/gymuserput/{id}")
    public Gymuser updategymuserDetails(@RequestBody Gymuser gm1)
    {
        return gs1.updategymuserDetails(gm1);
    }
}
