package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.model;
import com.example.demo.repo.repo;

@Service
public class service {
	
	@Autowired
	repo r1;
	
	public List<model> getDetails()
	{
		return r1.findAll();
	}
	
	public String deleteDetails(@PathVariable("id") int id)
	{
		 r1.deleteById(id);
		 return "Id : "+id+" is deleted";
	}

	public String postDetails(@RequestBody model m1)
	{
		  r1.save(m1);
		  return "Details are saved";
	}
}
