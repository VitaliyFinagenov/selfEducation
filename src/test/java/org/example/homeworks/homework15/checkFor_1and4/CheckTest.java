package org.example.homeworks.homework15.checkFor_1and4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        Assertions.assertFalse(result);
    }

    @Test
    public void testTrue() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = check.checkingNumbers(arr);
        Assertions.assertTrue(result);
    }

    @Test
    public void testAvailability1() {
        int[] arr = {1, 2, 3, 5};
        boolean result = check.checkingNumbers(arr);
        Assertions.assertFalse(result);
    }

    @Test
    public void testAvailability4() {
        int[] arr = {2, 3, 4, 5};
        boolean result = check.checkingNumbers(arr);
        Assertions.assertFalse(result);
    }

    @Test
    public void testFalse() {
        int[] arr = {2, 3, 5};
        boolean result = check.checkingNumbers(arr);
        Assertions.assertFalse(result);
    }
}
