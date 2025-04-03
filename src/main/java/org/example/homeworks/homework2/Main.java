package org.example.homeworks.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        replacementNumberInArray();
        System.out.println();
        setValueArray();
        System.out.println();
        multiplicationNumberInArray();
        System.out.println();

        int[][] twoDimensionalArray = {{5}, {5}};
        drawDiagonal(twoDimensionalArray);

        System.out.println(Arrays.toString(swap(new int[]{ 3, 5, 6, 1}, 2)));
    }

    public static void replacementNumberInArray() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void setValueArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void multiplicationNumberInArray() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void drawDiagonal(int[][] twoDimensionalArray) {
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                twoDimensionalArray[i][j] = 1;
                twoDimensionalArray[i][twoDimensionalArray.length - i] = 1;
            }
        }
        System.out.println(Arrays.toString(twoDimensionalArray));
    }

    public static int[] swap(int[] arr, int n) {
        if (n > 0) {
            return swapForward(arr, n);
        }
        return swapBack(arr, Math.abs(n));
    }

    private static int[] swapForward(int[] arr, int n) {
        while (n > 0) {
            int tmp = arr[arr.length-1];
            for (int i = arr.length - 1; i > 0 ; i--) {
                System.out.println(Arrays.toString(arr));
                arr[i] = arr[i - 1];
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
            arr[0] = tmp;
            n--;
        }
        return arr;
    }

    private static int[] swapBack(int[] arr, int n) {
        while (n > 0) {
            int tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = tmp;
            n--;
        }
        return arr;
    }
}
