package ru.geekbrains.oop.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }

    public KinderSurprise getKinderSurprise(String name, double price){
        for (Product product : products){
            if (product instanceof KinderSurprise){
                KinderSurprise kinderSurprise = (KinderSurprise)product;
                if (kinderSurprise.getName().equals(name) && kinderSurprise.getPrice() == price)
                    return kinderSurprise;
            }
        }
        return null;
    }



}
