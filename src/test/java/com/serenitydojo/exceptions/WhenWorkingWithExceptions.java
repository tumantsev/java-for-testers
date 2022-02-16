package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountTheWordsInString() {
        int numberOfWords = wordCounter.numberOfWordsIn("some string");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString() {
        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public void shouldCountWordsInAFile() throws IOException {
        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReportAnErrorIfTheFileDoesBotExist() {
        int numberOfWords = wordCounter.numberOfWordsInFile("file-that-does-not-exist");
        assertThat(numberOfWords).isEqualTo(0);
    }

    @Test
    public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws Exception {
        wordCounter.numberOfWordsInFile("src/main/resources/no_words.txt");
    }
}
