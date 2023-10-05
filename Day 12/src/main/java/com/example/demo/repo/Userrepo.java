package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usermodel;

public interface Userrepo extends JpaRepository<Usermodel, Integer>{

}
