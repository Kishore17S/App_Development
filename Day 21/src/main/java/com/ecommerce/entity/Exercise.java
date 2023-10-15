package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exerciselist")
public class Exercise {
    @Id
    private int exerciseid;
    private String exercisename;
    private int sets;
    private int reps;

    public int getExerciseid() {
        return exerciseid;
    }

    public void setExerciseid(int exerciseid) {
        this.exerciseid = exerciseid;
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
    public Exercise(int exerciseid,String exercisename,int sets,int reps)
    {
        super();
        this.exerciseid = exerciseid;
        this.exercisename = exercisename;
        this.sets = sets;
        this.reps = reps;
    }
    public Exercise()
    {

    }
}
