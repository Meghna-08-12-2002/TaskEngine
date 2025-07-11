package com.xworkz.java.dto;

import java.util.Arrays;
import java.util.Objects;

public class SweetDto {
    private String name;
    private double price;
    private String[] ingredients;
    private int quantity;
    private String pack;

    @Override
    public String toString() {
        return "SweetDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", quantity=" + quantity +
                ", pack='" + pack + '\'' +
                '}';
    }

    public SweetDto(String name, double price, String[] ingredients, int quantity, String pack) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.pack = pack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SweetDto sweetDto = (SweetDto) o;
        return Double.compare(price, sweetDto.price) == 0 && quantity == sweetDto.quantity && Objects.equals(name, sweetDto.name) && Objects.deepEquals(ingredients, sweetDto.ingredients) && Objects.equals(pack, sweetDto.pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, Arrays.hashCode(ingredients), quantity, pack);
    }
}
