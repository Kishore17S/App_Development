package com.ecommerce.service;

import com.ecommerce.entity.feedbacklist;
import com.ecommerce.repository.feedbackrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class feedbackser {
    @Autowired
    feedbackrepo feedbackrepo;

    private final RestTemplate restTemplate;

    public feedbackser() {
        this.restTemplate = new RestTemplate();
    }

    public List<feedbacklist> getAllFeedback() {
        ResponseEntity<List<feedbacklist>> response = restTemplate.exchange(
                "http://localhost:8081/feedback/get",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<feedbacklist>>() {}
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Handle error or return an empty list
            return Collections.emptyList();
        }
    }

    public feedbacklist addFeedback(feedbacklist review) {
        ResponseEntity<feedbacklist> response = restTemplate.exchange(
                "http://localhost:8081/feedback/post",
                HttpMethod.POST,
                new HttpEntity<>(review),
                feedbacklist.class
        );

        if (response.getStatusCode() == HttpStatus.CREATED) {
            return response.getBody();
        } else {
            // Handle error or return null
            return null;
        }
    }

}


