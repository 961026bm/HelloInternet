package com.careerdevs.HelloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// localhost -> 127.0.0.1
@RestController
@RequestMapping ("/api/apod")
public class ApodController {

    //URL / endpoint: GET http://localhost:3500/api/apod/test
    @GetMapping ("/test")
    private String testRoute () {
        return "testing, request receiver";
    }
}
