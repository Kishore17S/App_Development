package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.model;

public interface repo extends JpaRepository<model, Integer>{

}
