package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetails")
public class Usermodel {

	@Id
	private int userid;
	private String username;
	private String gender;
	private String phonenumber;
	private String goalachieve;
	private float currentweight;
	private float goalweight;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGoalachieve() {
		return goalachieve;
	}
	public void setGoalachieve(String goalachieve) {
		this.goalachieve = goalachieve;
	}
	public float getCurrentweight() {
		return currentweight;
	}
	public void setCurrentweight(float currentweight) {
		this.currentweight = currentweight;
	}
	public float getGoalweight() {
		return goalweight;
	}
	public void setGoalweight(float goalweight) {
		this.goalweight = goalweight;
	}
	public Usermodel(int userid, String username, String gender, String phonenumber, String goalachieve,
			float currentweight, float goalweight) {
		super();
		this.userid = userid;
		this.username = username;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.goalachieve = goalachieve;
		this.currentweight = currentweight;
		this.goalweight = goalweight;
	}
	public Usermodel()
	{
		
	}
}
