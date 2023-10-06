package com.ecommerce.service;

import com.ecommerce.entity.Gymuser;
import com.ecommerce.repository.Gymuserrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Gymuserservice {
    @Autowired
    Gymuserrepo gr1;


    public List<Gymuser> getgymuserDetails()
    {
        return gr1.findAll();
    }

    public String postgymuserDetails(Gymuser gm1)
    {
        gr1.save(gm1);
        return "User Details are saved";
    }
    public String deletegymuserDetails(@PathVariable("id") int id)
    {
        gr1.deleteById(id);
        return "Id : "+id+" is deleted";
    }

    public Gymuser updategymuserDetails(@RequestBody Gymuser gm1)
    {
        System.out.println("Changes updated");
        return gr1.save(gm1);
    }
}
