package com.dish.clfy.app1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/app1")
    public ResponseEntity<String> getApp() {
        return ResponseEntity.ok("Testing Application 1");
    }

    @GetMapping()
    public ResponseEntity<String> getDefaultApp() {
        return ResponseEntity.ok("Default get");
    }

    @GetMapping("/health")
    public ResponseEntity<String> getHealthStatus() {
        return ResponseEntity.ok("Health is ok");
    }


}
