package com.serenitydojo;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter write = new HelloWorldWriter();
        write.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariable() {

        int age = 42;

        age += 1;

        System.out.println("Age = " + age);

        double wight = 15.5D;

        System.out.println("Weight = " + wight);
    }

    @Test
    public void workingWithStrings() {

        String firstName = "Sarah-Jane";
        String upperCaseFirstName = firstName.toUpperCase();

        System.out.println("Upper case first name " + upperCaseFirstName);
    }
}
