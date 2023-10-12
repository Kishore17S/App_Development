package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "processtrackerlist")
public class Processtracker {

    @Id
    private int trackerid;
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

    public Processtracker(int trackerid, String setscompleted, String repscompleted, float weightused) {
        this.trackerid = trackerid;
        this.setscompleted = setscompleted;
        this.repscompleted = repscompleted;
        this.weightused = weightused;
    }
    public Processtracker()
    {

    }
}
