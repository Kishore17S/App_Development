package com.ecommerce.repository;

import com.ecommerce.entity.Gymuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Gymuserrepo extends JpaRepository<Gymuser, Integer> {
}
