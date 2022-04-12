package com.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jwt")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getHello(){
        return ResponseEntity.ok("Hello world");
    }
}
