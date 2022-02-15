package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenUsingAssertions {

    @Test
    public void shouldAddTwoIntegersCorrectly() {

        int a, b;
        a = 1;
        b = 2;

        int sum = a + b;

//        Assert.assertEquals(3, sum);
        assertThat(sum).isEqualTo(3);
        assertThat(sum).isBetween(1, 5);
    }

    @Test
    public void shouldCompareCollections() {

        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red", "green", "blue");
        assertThat(colors).containsExactlyInAnyOrder("blue", "red", "green");
        assertThat(colors).doesNotContain("yellow");
    }
}
