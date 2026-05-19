package com.example.touch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Touch!";
    }

    @GetMapping("/api/status")
    public Map<String, Object> status() {
        return Map.of(
                "status", "UP",
                "service", "touch",
                "message", "Application is running"
        );
    }
}
