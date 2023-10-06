package com.ecommerce.service;

import com.ecommerce.entity.Trainerlist;
import com.ecommerce.repository.Trainerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Trainerservice {
    @Autowired
    Trainerrepo tr1;

    public List<Trainerlist> gettrainerDetails()
    {
        return tr1.findAll();
    }

    public String posttrainerDetails(Trainerlist tm1)
    {
        tr1.save(tm1);
        return "Trainer Details are saved";
    }
    public String deletetrainerDetails(@PathVariable("id") int id)
    {
        tr1.deleteById(id);
        return "Id : "+id+" is deleted";
    }

    public Trainerlist updatetrainerDetails(@RequestBody Trainerlist tm1)
    {
        System.out.println("Changes updated");
        return tr1.save(tm1);
    }
}
