package com.xworkz.name.controller;

import com.xworkz.name.dto.NameDTO;
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
    public String onSave(NameDTO nameDTO,Model model){
        System.out.println("onSave in NameController");
        System.out.println("running on onSave");
        System.out.println(nameDTO);
        model.addAttribute("nameDTo",nameDTO);
        return "NameResult.jsp";
    }
}
