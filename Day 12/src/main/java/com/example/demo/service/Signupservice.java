package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Signupmodel;
import com.example.demo.repo.Signuprepo;

@Service
public class Signupservice {
	@Autowired
	Signuprepo sr1;

	public List<Signupmodel> getsignupDetails()
	{
		return sr1.findAll();
	}
	
	public String postsignupDetails(Signupmodel sm1)
	{
		sr1.save(sm1);
		return "Signup Details are saved";
	}
	public String deletesignupDetails(@PathVariable("id") int id)
	{
		 sr1.deleteById(id);
		 return "Id : "+id+" is deleted";
	}

	public Signupmodel updatesignupDetails(@RequestBody Signupmodel sm)
	{
		System.out.println("Changes updated");
		return sr1.save(sm);
	}
}