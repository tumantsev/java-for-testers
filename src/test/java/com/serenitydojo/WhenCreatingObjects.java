package com.serenitydojo;

import org.junit.Test;

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

    }
}
