package org.example.homeworks.homework15.soutNumbersAfter_4;

public class Extractor {
    public int[] extractionNumbers(int[] numbers) throws RuntimeException {
        int temp = -1;

        if (numbers.length == 0) {
            throw new RuntimeException("Некорректный (пустой) массив");
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 4) {
                temp = i;
                break;
            }
        }

        if (temp == -1) {
            throw new RuntimeException("Входной массив должен содержать хотя бы одну четверку");
        }

        int[] outputArr = new int[numbers.length - temp - 1];
        int index = 0;

        for (int i = temp + 1; i < numbers.length; i++) {
            outputArr[index] = numbers[i];
            index++;
        }

        return outputArr;
    }
}