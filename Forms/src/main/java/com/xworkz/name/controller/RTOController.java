package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RTOController {
    public RTOController(){
        System.out.println("running in RTOController");
    }
    @RequestMapping("/given")
    public String onGiven(){
        System.out.println("onGiven in RTOController");
        return "RTOResult";
    }
}
