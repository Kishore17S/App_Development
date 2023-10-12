package com.ecommerce.repository;

import com.ecommerce.entity.feedbacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface feedbackrepo extends JpaRepository<feedbacklist,Integer> {
}

