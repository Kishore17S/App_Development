package com.ecommerce.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trainerlist")
public class Trainerlist {
    @Id
    private int trainerid;
    private String trainername;
    private String email;
    private String phonenumber;
    private int age;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Trainerlist(int trainerid, String trainername,String email,String phonenumber,int age,int experience)
    {
        super();
        this.trainerid = trainerid;
        this.trainername = trainername;
        this.email = email;
        this.phonenumber = phonenumber;
        this.age = age;
        this.experience = experience;

    }

    public Trainerlist() {
    }
}
