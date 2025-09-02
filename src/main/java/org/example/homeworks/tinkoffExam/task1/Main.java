package org.example.homeworks.tinkoffExam.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] digits = new int[4];
        int temp = number;
        for (int i = 0; i < 4; i++) {
            digits[3 - i] = temp % 10;
            temp /= 10;
        }

        Arrays.sort(digits);

        List<Integer> nonZeros = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int digit : digits) {
            if (digit == 0) {
                zeros.add(digit);
            } else {
                nonZeros.add(digit);
            }
        }

        System.out.print(nonZeros.get(0));

        for (int z : zeros) {
            System.out.print(z);
        }

        for (int i = 1; i < nonZeros.size(); i++) {
            System.out.print(nonZeros.get(i));
        }

        scanner.close();
    }

}
