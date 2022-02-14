package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WhenWorkingWithMaps {

    @Test
    public void creatingMaps() {
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("red", 3);
        numberOfBallsByColor.put("green", 6);
        numberOfBallsByColor.put("blue", 5);

        Integer numberOfRedBalls = numberOfBallsByColor.get("red");

        System.out.println("There are " + numberOfRedBalls + " red balls");
    }

    @Test
    public void creatingAMapMoreConcisely() {
        Map<String, Integer> numberOfBallByColor = Map.of("red", 3, "green", 6, "blue", 5);

        Map<String, Integer> moreColors = new HashMap<>();

        moreColors.put("yellow", 10);

        moreColors.putAll(numberOfBallByColor);

        int numberOfColors = moreColors.size();
        Set<String> colors = moreColors.keySet();

        System.out.println("There are " + numberOfColors + " of diff " + colors + " colors");
        System.out.println("Number of colors for white balls " + moreColors.getOrDefault("white", 0));
        System.out.println("Purple balls are present: " + moreColors.containsKey("purple"));
    }

    @Test
    public void updatingAMaps() {

        Map<String, Integer> numberOfBallByColor = Map.of("red", 3, "green", 6, "blue", 5);

        Map<String, Integer> moreColors = new HashMap<>();

        moreColors.put("yellow", 10);
        moreColors.putAll(numberOfBallByColor);

        moreColors.put("yellow", 20);
        moreColors.replace("pink", 15);

        System.out.println("Number of yellow balls " + moreColors.getOrDefault("yellow", 0));
        System.out.println("Number of pink balls " + moreColors.getOrDefault("pink", 0));
    }

    @Test
    public void iteratingOverMapKeys() {

        Map<String, Integer> numberOfBallByColor = Map.of("red", 3, "green", 6, "blue", 5);

//        for (String color : numberOfBallByColor.keySet()) {
//            System.out.println(color);
//        }

//        for (String key : numberOfBallByColor.keySet()) {
//            int numberOfBall = numberOfBallByColor.get(key);
//            System.out.println(key + " => " + numberOfBall);
//        }

        printMap(numberOfBallByColor);

        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallByColor);

        modifiableMap.remove("red");
        System.out.println("========");
        printMap(modifiableMap);

        // clear the map
        System.out.println("========");
        modifiableMap.clear();
        printMap(modifiableMap);

    }

    private void printMap(Map<String, Integer> numberOfBallByColor) {
        for (Map.Entry<String, Integer> entry : numberOfBallByColor.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
