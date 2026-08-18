package com.jfs.training.service;

import org.springframework.stereotype.Service;

@Service
public class JenkinsDemoService {

    public String getMessage() {
        return "Hello from Jenkins";
    }
}