package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Signupmodel;
import com.example.demo.model.Trainermodel;
import com.example.demo.repo.Trainerrepo;

@Service
public class Trainerservice {

	@Autowired
	Trainerrepo tr1;
	
	public List<Trainermodel> gettrainerDetails()
	{
		return tr1.findAll();
	}
	
	public String posttrainerDetails(Trainermodel tm1)
	{
		tr1.save(tm1);
		return "Trainer Details are saved";
	}
	public String deletetrainerDetails(@PathVariable("id") int id)
	{
		 tr1.deleteById(id);
		 return "Id : "+id+" is deleted";
	}

	public Trainermodel updatetrainerDetails(@RequestBody Trainermodel tm1)
	{
		System.out.println("Changes updated");
		return tr1.save(tm1);
	}
	
}
