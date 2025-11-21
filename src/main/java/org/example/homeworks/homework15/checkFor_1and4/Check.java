package org.example.homeworks.homework15.checkFor_1and4;

public class Check {
    public boolean checkingNumbers(int[] numbers) {
        boolean result = false;
        boolean availability1 = false;
        boolean availability4 = false;

        if (numbers.length == 0) {
            return result;
        }

        for (int number : numbers) {
            if (number == 1) {
                availability1 = true;
            } else if (number == 4) {
                availability4 = true;
            }

            if (availability1 && availability4) {
                result = true;
            }
        }

        return result;
    }
}
