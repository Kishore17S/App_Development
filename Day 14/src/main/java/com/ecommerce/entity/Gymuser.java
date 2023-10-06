package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "userlist")
public class Gymuser {
    @Id

    private int userid;
    private String username;
    private String gender;
    private String goalachieve;
    private float currentweight;
    private float goalweight;

    @ManyToOne
    @JoinColumn(name = "Trainerid")
    private Trainerlist gym;

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

    public Trainerlist getGym() {
        return gym;
    }

    public void setGym(Trainerlist gym) {
        this.gym = gym;
    }

    public Gymuser(int userid, String username, String gender, String goalachieve, float currentweight, float goalweight, Trainerlist gym)
    {
        super();
        this.userid = userid;
        this.username = username;
        this.gender = gender;
        this.goalachieve = goalachieve;
        this.currentweight = currentweight;
        this.goalweight = goalweight;
        this.gym = gym;
    }
    public Gymuser()
    {

    }
}
