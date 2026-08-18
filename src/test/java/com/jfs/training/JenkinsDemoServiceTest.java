package com.jfs.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jfs.training.service.JenkinsDemoService;

public class JenkinsDemoServiceTest {

    @Test
    void testGetMessage() {

        JenkinsDemoService service = new JenkinsDemoService();

        assertEquals(
        	    "Wrong message",
        	    service.getMessage()
        	);
    }
}