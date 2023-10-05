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
import com.example.demo.repo.Signuprepo;
import com.example.demo.service.Signupservice;

@RestController
public class Signupcontroller {
	@Autowired
	Signuprepo sr1;
	
	@Autowired
	Signupservice ss1;
	
	@GetMapping("/signupget")
	public List<Signupmodel> getsignupDetails()
	{
		return ss1.getsignupDetails();
	}
	
	@PostMapping("/signuppost")
	public String postsignupDetails(@RequestBody Signupmodel sm1)
	{
		return ss1.postsignupDetails(sm1);
	}
	@DeleteMapping("/signupdelete/{id}")
	public String deletesignupDetails(@PathVariable("id") int id)
	{
		return ss1.deletesignupDetails(id);
	}
	
	@PutMapping("/signupput/{id}")
	public Signupmodel updatesignupDetails(@RequestBody Signupmodel sm)
	{
		return ss1.updatesignupDetails(sm);
	}

}