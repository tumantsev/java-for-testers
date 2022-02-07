package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;

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
}
