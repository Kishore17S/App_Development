package com.ecommerce.repository;

import com.ecommerce.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Exerciserepo extends JpaRepository<Exercise, Integer> {
}
