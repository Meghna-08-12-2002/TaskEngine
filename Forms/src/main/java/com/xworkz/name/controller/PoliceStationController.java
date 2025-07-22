package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController(){
        System.out.println(" running in PoliceStationController");
    }
    @RequestMapping("/filled")
    public String onFilled(@RequestParam String stationName, @RequestParam String location, @RequestParam String areaCode,
                           @RequestParam String inspector, @RequestParam String contact, @RequestParam int officers,
                           @RequestParam String jurisdiction, @RequestParam int vehicles, @RequestParam String open24x7,
                           @RequestParam String email, Model model){
        System.out.println("onFilled in PoliceStationController");
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Area Code: " + areaCode);
        System.out.println("Inspector Name: " + inspector);
        System.out.println("Contact Number: " + contact);
        System.out.println("Number of Officers: " + officers);
        System.out.println("Jurisdiction Area: " + jurisdiction);
        System.out.println("Patrol Vehicles: " + vehicles);
        System.out.println("Open 24x7?: " + open24x7);
        System.out.println("Email ID: " + email);

        model.addAttribute("stationName", stationName);
        model.addAttribute("location", location);
        model.addAttribute("areaCode", areaCode);
        model.addAttribute("inspector", inspector);
        model.addAttribute("contact", contact);
        model.addAttribute("officers", officers);
        model.addAttribute("jurisdiction", jurisdiction);
        model.addAttribute("vehicles", vehicles);
        model.addAttribute("open24x7", open24x7);
        model.addAttribute("email", email);
        return "PoliceStationResult.jsp";
    }
}
