package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.repo.repo;
import com.example.demo.service.service;


@RestController
public class controller {
	@Autowired
	repo r1;
	
	@Autowired
	service s1;
	
	@GetMapping("/get")
	public List<model> getDetails()
	{
		return s1.getDetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		return s1.deleteDetails(id);
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody model m1)
	{
		return s1.postDetails(m1);
	}

}
