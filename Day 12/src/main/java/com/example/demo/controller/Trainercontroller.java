package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signupmodel;
import com.example.demo.model.Trainermodel;
import com.example.demo.repo.Trainerrepo;
import com.example.demo.service.Trainerservice;

@RestController
public class Trainercontroller {
	@Autowired
	Trainerrepo tr1;
	
	@Autowired
	Trainerservice ts1;
	
	@GetMapping("/trainerget")
	public List<Trainermodel> gettrainerDetails()
	{
		return ts1.gettrainerDetails();
	}
	
	@PostMapping("/trainerpost")
	public String posttrainerDetails(@RequestBody Trainermodel tm1)
	{
		return ts1.posttrainerDetails(tm1);
	}
	@DeleteMapping("/trainerdelete/{id}")
	public String deletetrainerDetails(@PathVariable("id") int id)
	{
		return ts1.deletetrainerDetails(id);
	}
	
	@PutMapping("/trainerput/{id}")
	public Trainermodel updatetrainerDetails(@RequestBody Trainermodel tm1)
	{
		return ts1.updatetrainerDetails(tm1);
	}

	

}
