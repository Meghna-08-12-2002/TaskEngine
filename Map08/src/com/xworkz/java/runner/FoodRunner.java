package com.xworkz.java.runner;

import com.xworkz.java.dto.FoodDto;

import java.util.HashMap;
import java.util.Map;

public class FoodRunner {
    public static void main(String[] args) {
        Map<FoodDto, Map<String, String>> foodMap = new HashMap<>();

        Map<String, String> f1 = new HashMap<>();
        f1.put("Base", "Thin");
        f1.put("Topping", "Cheese");
        foodMap.put(new FoodDto("Pizza", "FastFood"), f1);

        Map<String, String> f2 = new HashMap<>();
        f2.put("Side", "Sambar");
        f2.put("Chutney", "Coconut");
        foodMap.put(new FoodDto("Dosa", "SouthIndian"), f2);

        Map<String, String> f3 = new HashMap<>();
        f3.put("Bun", "Sesame");
        f3.put("Fill", "Patty");
        foodMap.put(new FoodDto("Burger", "FastFood"), f3);

        Map<String, String> f4 = new HashMap<>();
        f4.put("Rice", "Basmati");
        f4.put("Spice", "Masala");
        foodMap.put(new FoodDto("Biryani", "Hyderabadi"), f4);

        Map<String, String> f5 = new HashMap<>();
        f5.put("Style", "Hakka");
        f5.put("Sauce", "Soy");
        foodMap.put(new FoodDto("Noodles", "Chinese"), f5);

        Map<String, String> f6 = new HashMap<>();
        f6.put("Serve", "Sambar");
        f6.put("Form", "Steamed");
        foodMap.put(new FoodDto("Idli", "SouthIndian"), f6);

        Map<String, String> f7 = new HashMap<>();
        f7.put("Fish", "Tuna");
        f7.put("Wrap", "Nori");
        foodMap.put(new FoodDto("Sushi", "Japanese"), f7);

        Map<String, String> f8 = new HashMap<>();
        f8.put("Grilled", "Yes");
        f8.put("Marinate", "Spicy");
        foodMap.put(new FoodDto("Paneer Tikka", "NorthIndian"), f8);

        Map<String, String> f9 = new HashMap<>();
        f9.put("Fill", "Veg");
        f9.put("Fried", "Yes");
        foodMap.put(new FoodDto("Spring Roll", "Chinese"), f9);

        Map<String, String> f10 = new HashMap<>();
        f10.put("Broth", "Miso");
        f10.put("Noodles", "Wheat");
        foodMap.put(new FoodDto("Ramen", "Japanese"), f10);

        Map<String, String> f11 = new HashMap<>();
        f11.put("Stuffing", "Potato");
        f11.put("Wrap", "Maida");
        foodMap.put(new FoodDto("Samosa", "Snack"), f11);

        Map<String, String> f12 = new HashMap<>();
        f12.put("Rice", "White");
        f12.put("Gravy", "Dal");
        foodMap.put(new FoodDto("Dal Chawal", "NorthIndian"), f12);

        Map<String, String> f13 = new HashMap<>();
        f13.put("Bread", "White");
        f13.put("Filling", "Cheese");
        foodMap.put(new FoodDto("Sandwich", "Snack"), f13);

        Map<String, String> f14 = new HashMap<>();
        f14.put("Vegetables", "Onion, Tomato");
        f14.put("Type", "Plain");
        foodMap.put(new FoodDto("Chapati", "NorthIndian"), f14);

        Map<String, String> f15 = new HashMap<>();
        f15.put("Rice", "Boiled");
        f15.put("Side", "Sambar");
        foodMap.put(new FoodDto("Curd Rice", "SouthIndian"), f15);

        Map<String, String> f16 = new HashMap<>();
        f16.put("Drink", "Coke");
        f16.put("Meal", "Combo");
        foodMap.put(new FoodDto("KFC Bucket", "FastFood"), f16);

        Map<String, String> f17 = new HashMap<>();
        f17.put("Ice Cream", "Vanilla");
        f17.put("Fruit", "Mango");
        foodMap.put(new FoodDto("Falooda", "Dessert"), f17);

        Map<String, String> f18 = new HashMap<>();
        f18.put("Cake", "Chocolate");
        f18.put("Cream", "Whipped");
        foodMap.put(new FoodDto("Pastry", "Dessert"), f18);

        Map<String, String> f19 = new HashMap<>();
        f19.put("Flavor", "Mint");
        f19.put("Style", "Crushed");
        foodMap.put(new FoodDto("Mojito", "Beverage"), f19);

        Map<String, String> f20 = new HashMap<>();
        f20.put("Milk", "Chilled");
        f20.put("Flavor", "Badam");
        foodMap.put(new FoodDto("Milkshake", "Drink"), f20);

        Map<String, String> f21 = new HashMap<>();
        f21.put("Type", "Tomato");
        f21.put("Serving", "Hot");
        foodMap.put(new FoodDto("Soup", "Starter"), f21);

        Map<String, String> f22 = new HashMap<>();
        f22.put("Base", "Coconut Milk");
        f22.put("Main", "Prawn");
        foodMap.put(new FoodDto("Thai Curry", "Thai"), f22);

        Map<String, String> f23 = new HashMap<>();
        f23.put("Main", "Paneer");
        f23.put("Gravy", "Makhani");
        foodMap.put(new FoodDto("Paneer Butter Masala", "NorthIndian"), f23);

        Map<String, String> f24 = new HashMap<>();
        f24.put("Bread", "Kulcha");
        f24.put("Stuffing", "Chole");
        foodMap.put(new FoodDto("Chole Kulche", "Punjabi"), f24);

        Map<String, String> f25 = new HashMap<>();
        f25.put("Type", "Chili");
        f25.put("Main", "Potato");
        foodMap.put(new FoodDto("Manchurian", "Chinese"), f25);

        System.out.println("----- 🍽 Food Map Entries -----");
        for (Map.Entry<FoodDto, Map<String, String>> entry : foodMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
