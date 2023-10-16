package com.ecommerce.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "userlist")
public class Gymuser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    private String username;



    private int age;

    private String gender;
    private float height;
    private float weight;
    private String fitnessgoals;
    private String phnumber;

    @OneToMany
    private List<Exercise> exer;


    @OneToOne
    @JoinColumn(name = "trainerid")
    private Trainerlist trainerlist;

    public Trainerlist getTrainerlist() {
        return trainerlist;
    }

    public void setTrainerlist(Trainerlist trainerlist) {
        this.trainerlist = trainerlist;
    }

    public List<Exercise> getExer() {
        return exer;
    }

    public void setExer(List<Exercise> exer) {
        this.exer = exer;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFitnessgoals() {
        return fitnessgoals;
    }

    public void setFitnessgoals(String fitnessgoals) {
        this.fitnessgoals = fitnessgoals;
    }


    public Gymuser(int userid,String username,  int age, String gender, float height, float weight, String fitnessgoals, String phnumber,List<Exercise> exer,Trainerlist trainerlist)
    {
        super();
        this.userid = userid;
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.fitnessgoals = fitnessgoals;
        this.phnumber = phnumber;
        this.exer = exer;
        this.trainerlist = trainerlist;
    }
    public Gymuser()
    {

    }
}
