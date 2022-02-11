package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Cat", false);
        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamsterCabbage() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Hamster", false);
        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogDogsFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Dog", false);
        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Cat", true);
        Assert.assertEquals("Salmon", food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood(){
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Dog", true);
        Assert.assertEquals("Deluxe Food", food);
    }

    @Test
    public void shouldFeedPremiumHamsterLettuce() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Hamster", true);
        Assert.assertEquals("Lettuce", food);
    }
}
