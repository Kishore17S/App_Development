package com.ecommerce.repository;

import com.ecommerce.entity.Trainerlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Trainerrepo extends JpaRepository<Trainerlist, Integer> {
}
