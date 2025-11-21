package org.example.homeworks.homework15.soutNumbersAfter_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ExtractorTest {
    private static Extractor extractor;

    @BeforeAll
    public static void init() {
        extractor = new Extractor();
    }

    @Test
    public void testLength() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ints = extractor.extractionNumbers(numbers);
        Assertions.assertEquals(4, ints.length);
    }

    @Test
    public void testEquals() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {5, 6, 7, 8};
        int[] ints = extractor.extractionNumbers(numbers);
        Assertions.assertArrayEquals(expect, ints);
    }

    @Test
    public void testFailLength() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] ints = extractor.extractionNumbers(numbers);
        Assertions.assertNotEquals(4, ints.length);
    }

    @Test
    public void testFailEquals() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {4, 5, 6, 7};
        int[] ints = extractor.extractionNumbers(numbers);
        Assertions.assertNotEquals(expect, ints);
    }
}
