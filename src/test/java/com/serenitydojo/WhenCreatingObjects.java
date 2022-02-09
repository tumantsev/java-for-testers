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

        System.out.println("Felix goes " + felix.makeNoise());
        felix.feed("Tuna");
        felix.groom();

        spot.feed("Salmon");
    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "bone", 5);

        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public void creating_a_hamster() {
        String name = "Rusty";
        String favoriteGame = "wheel";
        int age = 2;

        Hamster rusty = new Hamster(name, favoriteGame, age);

        System.out.println(name + " favorite game is " + rusty.getFavoriteGame());
    }

    @Test
    public void pets_make_noise() {

        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hamster("Rusty", "wheel", 1);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Felix goes " + felix.goForWalks());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Fido goes " + fido.goForWalks());
        System.out.println("Rusty goes " + fido.makeNoise());
        System.out.println("Rusty goes " + fido.goForWalks());
    }
}
