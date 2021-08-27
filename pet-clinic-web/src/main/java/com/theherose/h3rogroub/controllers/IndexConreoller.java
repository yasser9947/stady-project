package com.theherose.h3rogroub.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexConreoller {


    @GetMapping("/")
    public String index(){

        return "index";
    }
}
