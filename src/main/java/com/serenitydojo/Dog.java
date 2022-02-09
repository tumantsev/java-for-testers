package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;

    public static final String DOG_NOISE = "Woof";


    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String makeNoise() {
        return DOG_NOISE;
    }
}
