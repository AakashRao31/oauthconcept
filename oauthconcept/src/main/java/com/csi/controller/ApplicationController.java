package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello()
    {
        return  ResponseEntity.ok("Welcome to CSI Pune");
    }

    @GetMapping("/service")
    public String sayService()
    {
        return "Software services Available";
    }

    @GetMapping("/user")
    public Principal getUserDetails(Principal principal)
    {
        return principal;
    }
}
