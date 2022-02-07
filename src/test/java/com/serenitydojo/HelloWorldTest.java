package com.serenitydojo;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter write = new HelloWorldWriter();
        write.writeHelloWorld();
    }
}
