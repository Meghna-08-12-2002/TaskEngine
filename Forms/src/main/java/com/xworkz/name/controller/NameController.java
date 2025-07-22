package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NameController {
    public NameController(){
        System.out.println("running in NameController");
    }
    @RequestMapping("/save")
    public String onSave(@RequestParam String firstName, @RequestParam String middleName, @RequestParam String lastName, Model model){
        System.out.println("onSave in NameController");
        System.out.println("running on onSave");
        model.addAttribute("firstName", firstName);
        model.addAttribute("middleName", middleName);
        model.addAttribute("lastName", lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        return "NameResult.jsp";
    }
}
