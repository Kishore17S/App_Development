package com.ecommerce.controller;

import com.ecommerce.entity.Processtracker;
import com.ecommerce.service.Processtrackerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/processtracker")
public class ProcesstrackerController {


    @Autowired
    private Processtrackerservice ps1;

    @GetMapping("/processtrackergetall")
    public ResponseEntity<List<Processtracker>> getAllprocesstrackerDetails() {
        List<Processtracker> processtrackers = ps1.getAllprocesstrackerDetails();
        return ResponseEntity.ok(processtrackers);
    }

    @PostMapping("/processtrackerpost")
    public ResponseEntity<String> postprocesstrackerDetails(@RequestBody Processtracker pm1) {
        ps1.postprocesstrackerDetails(pm1);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/processtrackerdelete/{id}")
    public ResponseEntity<String> deleteprocesstrackerDetails(@PathVariable ("id") int id) {
        try {
            ps1.deleteprocesstrackerDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/processtrackerput/{id}")
    public Processtracker updateprocesstrackerDetails(@RequestBody Processtracker pm1)
    {
        return ps1.updateprocesstrackerDetails(pm1);
    }

}

