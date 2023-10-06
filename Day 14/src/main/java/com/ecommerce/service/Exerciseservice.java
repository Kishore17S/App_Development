package com.ecommerce.service;

import com.ecommerce.entity.Exercise;
import com.ecommerce.repository.Exerciserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Exerciseservice {
    @Autowired
    Exerciserepo er1;

    public List<Exercise> getexerciseDetails()
    {
        return er1.findAll();
    }

    public String postexerciseDetails(Exercise em1)
    {
        er1.save(em1);
        return "Training Details are saved";
    }
    public String deleteexerciseDetails(@PathVariable("id") int id)
    {
        er1.deleteById(id);
        return "Id : "+id+" is deleted";
    }

    public Exercise updateexerciseDetails(@RequestBody Exercise em1)
    {
        System.out.println("Changes updated");
        return er1.save(em1);
    }
}
