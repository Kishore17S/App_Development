package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Trainermodel;
import com.example.demo.model.Usermodel;
import com.example.demo.repo.Userrepo;

@Service
public class Userservice {
	
	@Autowired
	Userrepo ur1;
	
	public List<Usermodel> getuserDetails()
	{
		return ur1.findAll();
	}
	
	public String postuserDetails(Usermodel um1)
	{
		ur1.save(um1);
		return "User Details are saved";
	}
	public String deleteuserDetails(@PathVariable("id") int id)
	{
		 ur1.deleteById(id);
		 return "Id : "+id+" is deleted";
	}

	public Usermodel updateuserDetails(@RequestBody Usermodel um1)
	{
		System.out.println("Changes updated");
		return ur1.save(um1);
	}

}
