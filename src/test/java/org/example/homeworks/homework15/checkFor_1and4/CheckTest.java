package org.example.homeworks.homework15.checkFor_1and4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckTest {
    private static Check check;

    @BeforeAll
    public static void init() {
        check = new Check();
    }

    @Test
    public void testNull() {
        int[] arr = {};
        boolean result = check.checkingNumbers(arr);
        assertFalse(result);
    }

    @Test
    public void testTrue() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = check.checkingNumbers(arr);
        assertTrue(result);
    }

    @Test
    public void testAvailability1() {
        int[] arr = {1, 2, 3, 5};
        boolean result = check.checkingNumbers(arr);
        assertFalse(result);
    }

    @Test
    public void testAvailability4() {
        int[] arr = {2, 3, 4, 5};
        boolean result = check.checkingNumbers(arr);
        assertFalse(result);
    }

    @Test
    public void testFalse() {
        int[] arr = {2, 3, 5};
        boolean result = check.checkingNumbers(arr);
        assertFalse(result);
    }
}