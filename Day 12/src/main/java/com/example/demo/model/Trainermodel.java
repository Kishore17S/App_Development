package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainerdetails")
public class Trainermodel {

	@Id
	private int trainerid;
	private String trainername;
	private String email;
	private String phonenumber;
	private int experience;
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Trainermodel(int trainerid, String trainername, String email, String phonenumber, int experience) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.email = email;
		this.phonenumber = phonenumber;
		this.experience = experience;
	}
	public Trainermodel()
	{
		
	}
}
