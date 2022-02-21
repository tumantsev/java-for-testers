package com.serenitydojo.exceptions;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsIn(String value) {
        if (value == null) {
            return 0;
        }
        return value.split("\\W").length;
    }

    public int numberOfWordsInFile(String fileName) throws IOException {
        try {
            String fileContent = Files.readString(Paths.get(fileName));
            int wordCount = numberOfWordsIn(fileContent);
            if (wordCount == 0) {
                throw new FileHasNoWordsException("No words found in the file " + fileName);
            }
            return numberOfWordsIn(fileContent);
        } catch (NoSuchFileException nuSuchFile) {
            throw new FileHasNoWordsException("No words found in non-existent file " + fileName);

        }
    }
}
