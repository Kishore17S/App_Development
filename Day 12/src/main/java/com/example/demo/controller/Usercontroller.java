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

import com.example.demo.model.Trainermodel;
import com.example.demo.model.Usermodel;
import com.example.demo.repo.Userrepo;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {

	@Autowired
	Userrepo ur1;
	
	@Autowired
	Userservice us1;
	
	@GetMapping("/userget")
	public List<Usermodel> getuserDetails()
	{
		return us1.getuserDetails();
	}
	
	@PostMapping("/userpost")
	public String postuserDetails(@RequestBody Usermodel um1)
	{
		return us1.postuserDetails(um1);
	}
	@DeleteMapping("/userdelete/{id}")
	public String deleteuserDetails(@PathVariable("id") int id)
	{
		return us1.deleteuserDetails(id);
	}
	
	@PutMapping("/userput/{id}")
	public Usermodel updateuserDetails(@RequestBody Usermodel tm1)
	{
		return us1.updateuserDetails(tm1);
	}

	
}
