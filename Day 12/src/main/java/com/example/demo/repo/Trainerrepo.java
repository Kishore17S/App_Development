package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trainermodel;

public interface Trainerrepo extends JpaRepository<Trainermodel, Integer>{

}
