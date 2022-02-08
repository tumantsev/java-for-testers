package com.serenitydojo;

import org.junit.Test;
import org.junit.Assert;


public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot", "Tuna", 3);

        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix","Tuna", 4);
        Cat spot = new Cat("Spot","Salmon", 3);

        felix.makeNoise();
        felix.feed("Tuna");
        felix.groom();

        spot.feed("Salmon");


    }
}
