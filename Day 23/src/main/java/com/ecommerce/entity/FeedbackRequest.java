package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedbackRequest {

    @Id

    private int id;
    private String email;
    private String message;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FeedbackRequest() {
    }

    public FeedbackRequest(int id , String name, String email, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
    }
}
