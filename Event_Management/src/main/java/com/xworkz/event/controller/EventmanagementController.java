package com.xworkz.event.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class EventmanagementController {
    public EventmanagementController(){
        System.out.println("EventmanagementController created");
    }
    @RequestMapping("/send")
    public String onSend(){
        System.out.println("onSend method in EventmanagementController");
        return "/index.jsp";
    }
}
