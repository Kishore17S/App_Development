package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com"}) 
@EnableJpaRepositories(basePackages = "com.example.demo.repo")
@EntityScan({ "com.example.demo.model" })
public class GymtablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymtablesApplication.class, args);
	}

}
