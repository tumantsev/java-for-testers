package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        return Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public Boolean fileContainsText(String filename, String expectedText) throws IOException {
        try {
            String path = "src/main/resources/" + filename;
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (NoSuchFileException noSuchFile) {
            return false;
        }
    }

    public Boolean fileHasText(String filename, String expectedText) throws IOException {
        try {
            String path = "src/main/resources/" + filename;
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (NoSuchFileException noSuchFile) {
            throw new MissingWelcomeFileException("No welcome message in non-existent file " + filename, noSuchFile);
        }
    }
}
