package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class HospitalController {
    public HospitalController(){
        System.out.println("running in HospitalController");
    }
    @RequestMapping("/entered")
    public String onEntered(@RequestParam String hospitalName, @RequestParam String location, @RequestParam String type,
                            @RequestParam int bedCount, @RequestParam String speciality, @RequestParam String contact, Model model){
        System.out.println("onEntered in HospitalController");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Number of Beds: " + bedCount);
        System.out.println("Speciality: " + speciality);
        System.out.println("Contact Number: " + contact);

        model.addAttribute("hospitalName", hospitalName);
        model.addAttribute("location", location);
        model.addAttribute("type", type);
        model.addAttribute("bedCount", bedCount);
        model.addAttribute("speciality", speciality);
        model.addAttribute("contact", contact);
        return "/HospitalResult.jsp";
    }
}
