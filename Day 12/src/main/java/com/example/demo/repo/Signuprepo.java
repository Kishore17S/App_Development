package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Signupmodel;

public interface Signuprepo extends JpaRepository<Signupmodel, Integer>{

}
