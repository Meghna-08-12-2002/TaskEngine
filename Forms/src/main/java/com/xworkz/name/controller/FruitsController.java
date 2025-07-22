package com.xworkz.name.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FruitsController {
    public FruitsController(){
        System.out.println("running in FruitsController");
    }
@RequestMapping("/submit")
    public String onSubmit(@RequestParam String fruitName,@RequestParam String color, @RequestParam int quantity,
                           @RequestParam String origin, @RequestParam double price, @RequestParam String vitamin,
                           @RequestParam String season, @RequestParam int shelfLife, @RequestParam String organic,
                           @RequestParam String supplier,Model model){
    System.out.println("onSubmit in FruitController");
    System.out.println("Fruit Name: " + fruitName);
    System.out.println("Color: " + color);
    System.out.println("Quantity: " + quantity);
    System.out.println("Origin Country: " + origin);
    System.out.println("Price per Kg: " + price);
    System.out.println("Vitamin Content: " + vitamin);
    System.out.println("Season: " + season);
    System.out.println("Shelf Life: " + shelfLife);
    System.out.println("Is Organic?: " + organic);
    System.out.println("Supplier Name: " + supplier);

    model.addAttribute("fruitName", fruitName);
    model.addAttribute("color", color);
    model.addAttribute("quantity", quantity);
    model.addAttribute("origin", origin);
    model.addAttribute("price", price);
    model.addAttribute("vitamin", vitamin);
    model.addAttribute("season", season);
    model.addAttribute("shelfLife", shelfLife);
    model.addAttribute("organic", organic);
    model.addAttribute("supplier", supplier);
        return "FruitsResult.jsp";
    }
}
