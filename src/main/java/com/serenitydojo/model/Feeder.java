package com.serenitydojo.model;

public class Feeder {

    public String feeds(String animal, boolean isPremium) {
//        if (animal.equals("Cat")) {
//            return (isPremium) ? "Salmon": "Tuna";
//        } else if (animal.equals("Dog")){
//            return (isPremium) ? "Deluxe Food": "Dog Food";
//        } else {
//            return (isPremium) ? "Lettuce" : "Cabbage";
//        }
        switch (animal) {
            case ("Cat"):
                return (isPremium) ? "Salmon": "Tuna";
            case ("Dog"):
                return (isPremium) ? "Deluxe Food": "Dog Food";
            case ("Hamster"):
                return (isPremium) ? "Lettuce" : "Cabbage";
            default:
                return "Don't know the animal - don't know the food";
        }
    }
}
