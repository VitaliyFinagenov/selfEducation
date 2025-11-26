package org.example.homeworks.homework15.soutNumbersAfter_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(4, ints.length);
    }

    @Test
    public void testEquals() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {5, 6, 7, 8};
        int[] ints = extractor.extractionNumbers(numbers);
        assertArrayEquals(expect, ints);
    }

    @Test
    public void testFailLength() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] ints = extractor.extractionNumbers(numbers);
        assertNotEquals(4, ints.length);
    }

    @Test
    public void testFailEquals() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {4, 5, 6, 7};
        int[] ints = extractor.extractionNumbers(numbers);
        assertNotEquals(expect, ints);
    }
}