package com.ecommerce.service;

import com.ecommerce.entity.Processtracker;
import com.ecommerce.repository.Processtrackerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Processtrackerservice {
    @Autowired
    Processtrackerrepo pr1;


    public List<Processtracker> getAllprocesstrackerDetails()
    {
        return pr1.findAll();
    }

    public String postprocesstrackerDetails(Processtracker pm1)
    {
        pr1.save(pm1);
        return "Details are saved";
    }
    public String deleteprocesstrackerDetails(@PathVariable("id") int id)
    {
        pr1.deleteById(id);
        return "Id : "+id+" is deleted";
    }

    public Processtracker updateprocesstrackerDetails(@RequestBody Processtracker pm1)
    {
        System.out.println("Changes updated");
        return pr1.save(pm1);
    }
}
