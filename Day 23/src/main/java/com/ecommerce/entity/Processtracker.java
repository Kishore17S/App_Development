package com.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "processtrackerlist")
public class Processtracker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackerid;

    private String workoutname;
    private String exercisename;
    private String setscompleted;
    private String repscompleted;
    private float weightused;

    public int getTrackerid() {
        return trackerid;
    }

    public void setTrackerid(int trackerid) {
        this.trackerid = trackerid;
    }

    public String getSetscompleted() {
        return setscompleted;
    }

    public void setSetscompleted(String setscompleted) {
        this.setscompleted = setscompleted;
    }

    public String getRepscompleted() {
        return repscompleted;
    }

    public void setRepscompleted(String repscompleted) {
        this.repscompleted = repscompleted;
    }

    public float getWeightused() {
        return weightused;
    }

    public void setWeightused(float weightused) {
        this.weightused = weightused;
    }

    public String getWorkoutname() {
        return workoutname;
    }

    public void setWorkoutname(String workoutname) {
        this.workoutname = workoutname;
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public Processtracker(int trackerid, String setscompleted, String repscompleted, float weightused ,String workoutname,String exercisename) {
        this.trackerid = trackerid;
        this.setscompleted = setscompleted;
        this.repscompleted = repscompleted;
        this.weightused = weightused;
        this.workoutname = workoutname;
        this.exercisename = exercisename;
    }
    public Processtracker()
    {

    }
}
