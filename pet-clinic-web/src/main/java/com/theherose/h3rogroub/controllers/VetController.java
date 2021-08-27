package com.theherose.h3rogroub.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping("/vets")
    public String listOfVets(){

        return "vets/index";
    }
}
