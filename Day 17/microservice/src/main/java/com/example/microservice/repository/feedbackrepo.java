package com.example.microservice.repository;


import com.example.microservice.entity.feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface feedbackrepo extends JpaRepository<feedback ,Integer> {

}
