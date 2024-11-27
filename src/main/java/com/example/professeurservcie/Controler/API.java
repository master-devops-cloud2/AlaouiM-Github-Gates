package com.example.professeurservcie.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

    @GetMapping("/v1/professeur/hello")
    public String hello1(){
        return "hello api 1";
    }

    @GetMapping("/v2/professeur/bonjour")
    public String Bonjour(){
        return "Bonjours api 2";
    }
}
