package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.favoriteFood = usualFood();
        this.age = age;
    }

    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }
}

