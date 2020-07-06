package com.motoclub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotoController {

    @GetMapping("/testing")
    public String hello(){
        return "hellooooo!";
    }
}
