package com.ecommerce.repository;

import com.ecommerce.entity.FeedbackRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface feedbackrepo extends JpaRepository<FeedbackRequest,Integer> {
}

