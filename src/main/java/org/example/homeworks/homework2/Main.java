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

        int[][] twoDimensionalArray = new int[5][5];
        drawDiagonal(twoDimensionalArray);
        System.out.println();
        System.out.println(Arrays.toString(arrayInit(5, 1)));
        System.out.println();
        System.out.println(searchMaxMinNum());
        System.out.println();
//        int[] ar = {5, 0, 5};
//        System.out.println(something(ar));
        System.out.println(checkBalance(new int[]{4, 4, 1, 2, 2, 2, 2, 1}));

        System.out.println(Arrays.toString(swap(new int[]{3, 5, 6, 1}, 2)));
    }

    /*
    задать массив из 1 и 0, затем поменять местами 1 на 0 и 0 на 1
     */
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

    /*
    задать пустой массив длиной 100 и проинициализировать его
     */
    public static void setValueArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    /*
    дан массив, если число меньше 6, умножить его на 2
     */
    public static void multiplicationNumberInArray() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    /*
    с помощью двумерного массива нарисовать 2 диагонали цифрами 1
     */
    public static void drawDiagonal(int[][] twoDimensionalArray) {
        for (int i = 0, j = 0; i < twoDimensionalArray.length && j < twoDimensionalArray.length; i++, j++) { //способ 1
            twoDimensionalArray[i][j] = 1;
            twoDimensionalArray[i][twoDimensionalArray.length - 1 - i] = 1;
        }
//        for (int i = 0; i < twoDimensionalArray.length; i++) {                                             //способ 2
//            for (int j = 0; j < twoDimensionalArray.length; j++) {
//                if (i == j) {
//                    twoDimensionalArray[i][j] = 1;
//                }
//                if (j == twoDimensionalArray.length - 1 - i) {
//                    twoDimensionalArray[i][j] = 1;
//                }
//            }
//        }

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j]);
            }
            System.out.println();
        }
    }

    /*
    заполнить массив длинной len значением initValue
     */
    public static int[] arrayInit(int len, int initValue) {
        int[] ar = new int[len];
        Arrays.fill(ar, initValue);
        return ar;
    }

    /*
    найти в массиве мин и макс числа
     */
    public static String searchMaxMinNum() {
        int[] ar = {10, 0, 5, -5};
        Arrays.sort(ar);
        return "min num: " + ar[0] + "\nmax num: " + ar[ar.length - 1];
    }

    /*
     Написать метод, в который передается не пустой одномерный целочисленный массив,
      метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны
      от себя добавил вывод числа которое делит массив на левую и правую равные части, при этом не включаясь ни в одну из этих половин
     */
//    public static boolean something(int[] arr) {
//        int leftSide = arr[0];
//        int rightSide = 0;
//        for (int i = 2; i < arr.length; i++) {
//            rightSide += arr[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (leftSide == rightSide){
//                System.out.println(i+1);
//                return true;
//            } else {
//                if (i == arr.length -1){ //проверка не выходит ли rightSide за пределы массива
//                    System.out.println("выход за пределы массива");
//                    return false;
//                }
//                leftSide += arr[i];
//                rightSide -= arr[i+2];
//            }
//        }
//        return false;
//    }

    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        int left = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            if (left == sum - left) {
                return true;
            }
        }
        return false;
    }

    public static int[] swap(int[] arr, int n) {
        if (n > 0) {
            return swapForward(arr, n);
        }
        return swapBack(arr, Math.abs(n));
    }

    private static int[] swapForward(int[] arr, int n) {
        while (n > 0) {
            int tmp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
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
