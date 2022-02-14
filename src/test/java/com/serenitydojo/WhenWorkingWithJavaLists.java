package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaLists {

    @Test
    public void creatingASimpleList() {

        List simpleList = new ArrayList(); // can not use List, because List is just an Interface and contains methods and need to be provided type of List

        simpleList.add("a string value");
        simpleList.add(123);

        assertThat(simpleList).contains("a string value", 123);


    }

    @Test
    public void createATypedList() {

//        List<String> names = new ArrayList<>();
//        List<Integer> ages = new ArrayList<>();

        List<String> names = Arrays.asList("joe", "sally", "pete");
        List<Integer> ages = Arrays.asList(10, 30, 50);

//        names.add("joe");
//        names.add("sally");
//        names.add("pete");

//        ages.add(10);
//        ages.add(30);
//        ages.add(50);

        for (Integer x : ages) {
            System.out.println(x);
        }

        assertThat(names).contains("joe", "sally", "pete");
        assertThat(ages).contains(10, 30, 50);

    }

    @Test
    public void removingStuff() {

        List<String> names = new ArrayList<>();

        names.add("joe");
        names.add("sally");
        names.add("pete");

        names.remove("sally");

        assertThat(names).contains("joe", "pete");

        names.clear();

        assertThat(names).isEmpty();
    }

    @Test
    public void combiningLists() {

        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        List<String> moreNames = new ArrayList<>();
        names.add("paul");
        names.add("petra");

        names.addAll(moreNames);

        assertThat(names).contains("joe", "sally", "pete", "paul", "petra");

        names.removeAll(moreNames);

        assertThat(names).contains("joe", "sally", "pete");
    }

    @Test
    public void immutableLists() {

        List<String> names = Arrays.asList("joe", "sally", "pete");

//        names.remove("sally"); // removing is not supported in immutable List defined as Array.asLits
    }

    @Test
    public void findElementInAlist() {
        List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");

        int indexOfSally = names.indexOf("sally");
        int lastIndexOfSally = names.lastIndexOf("sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);
    }

    @Test
    public void findingASublist() {

        List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");

        List<String> middleList = names.subList(1, 4);
        assertThat(middleList).contains("sally", "pete", "sally"); // video contains mistake because wrong list name in asssertions
    }

    @Test
    public void findingTheSize() {

        List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");

        assertThat(names.size()).isEqualTo(5);
    }

    @Test
    public void convertingAListToASet() {

        List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");

        Set<String> setNames = new HashSet<>(names);

        assertThat(setNames).containsExactlyInAnyOrder("joe", "sally", "pete", "paul");
    }

    @Test
    public void soringAList() {

        List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");

        Collections.sort(names);

        assertThat(names).containsExactly("joe", "paul", "pete", "sally", "sally");
    }

    @Test
    public void findingMaxAndMin() {

        List<Integer> ages = Arrays.asList(10, 30, 50, 20, 15);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);
    }
}
